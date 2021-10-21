/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.ISingleClickContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.func.ICreateInfo;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextEntryHelper;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;

import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.APropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ComposedPropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ReferencePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ValuePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLDiagramUtil;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.CommonChangeNameFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.CommonDoubleClickFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.CommonSingleClickFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links.LinkDiagramCreateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks.TaskDiagramCreateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.triggers.TriggerDiagramCreateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.validator.Problem;

/**
 * 
 * @author nepa_ay
 *
 */
public class TMLDiagramToolBehaviorProvider extends DefaultToolBehaviorProvider {

	public static final String TASK_COMPARTMENT = "Task Definitions";
	public static final String CHANNEL_COMPARTMENT = "Channels";
	public static final String TIMING_COMPARTMENT = "Time Events";
	public static final String LINK_COMPARTMENT = "Connections";

	private static final IDecorator[] RENDERING_DECORATORS = new IDecorator[1];
	private static final int PROBLEM_MARKER_OFFSET = 10;
			
	private Map<String, List<IFeature>> compartmentMap = null;
	
	/**
	 * 
	 * @param diagramTypeProvider diagramTypeProvider
	 */
	public TMLDiagramToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}
	
	/**
	 * Initializes compartment map
	 */
	private void initializePalette() {
		if (compartmentMap == null) {
			compartmentMap = new HashMap<String, List<IFeature>>();
		} else {
			compartmentMap.clear();
		}
		compartmentMap.put(TASK_COMPARTMENT, new ArrayList<IFeature>());
		compartmentMap.put(CHANNEL_COMPARTMENT, new ArrayList<IFeature>());
		compartmentMap.put(TIMING_COMPARTMENT, new ArrayList<IFeature>());
		compartmentMap.put(LINK_COMPARTMENT, new ArrayList<IFeature>());
	}
	
	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		// Initialize compartment map
		initializePalette();
				
		for (IFeature feature : getFeatureProvider().getCreateFeatures()) {
			if (feature instanceof TaskDiagramCreateFeature) {
				addNew(TASK_COMPARTMENT, feature);
			} else if (feature instanceof TriggerDiagramCreateFeature) {
				TriggerDiagramCreateFeature triggerDiagramCreateFeature = (TriggerDiagramCreateFeature) feature;
				if (triggerDiagramCreateFeature.isChannel()) {
					addNew(CHANNEL_COMPARTMENT, feature);
				} else {
					addNew(TIMING_COMPARTMENT, feature);
				}
			} 
		}
		for (IFeature feature : getFeatureProvider().getCreateConnectionFeatures()) {
			if (feature instanceof LinkDiagramCreateFeature) {
				addNew(LINK_COMPARTMENT, feature);
			}
		}
		List<IPaletteCompartmentEntry> palette = new ArrayList<>();
		for (String key : compartmentMap.keySet()) {
			palette.add(createCompartment(key, compartmentMap.get(key)));
		}
		return palette.stream().toArray(IPaletteCompartmentEntry[]::new);
	}

	/**
	 * Add feature only when not already existing.
	 * Necessary when the palette is refreshed to include newly created tasks, channels, etc.
	 * @param key Key for the compartment.
	 * @param feature Feature object.
	 */
	private void addNew(String key, IFeature feature) {
		if (!compartmentMap.get(key).contains(feature)) {
			compartmentMap.get(key).add(feature);
		}
	}
	
	/**
	 * 
	 * @param label label
	 * @param features features
	 * @return PaletteCompartmentEntry
	 */
	private PaletteCompartmentEntry createCompartment(String label, List<IFeature> features) {
		PaletteCompartmentEntry compartment = new PaletteCompartmentEntry(label, null);
		compartment.setInitiallyOpen(true);
		
		//Sort list by name.
		features.sort(Comparator.comparing(IFeature::getName));
		
		features.stream().forEach(feature -> {
			String name = ((ICreateInfo) feature).getCreateName();
			String description = ((ICreateInfo) feature).getCreateDescription();
			if (feature instanceof ICreateFeature) {
				ICreateFeature cf = (ICreateFeature) feature;
				compartment.addToolEntry(new ObjectCreationToolEntry(name, description, cf.getCreateImageId(), cf.getCreateLargeImageId(), cf));
			} else if (feature instanceof ICreateConnectionFeature)  { 			
				ICreateConnectionFeature cf = (ICreateConnectionFeature) feature;
				ConnectionCreationToolEntry toolEntry = new ConnectionCreationToolEntry(name, description, cf.getCreateImageId(), cf.getCreateLargeImageId()); 			
				toolEntry.addCreateConnectionFeature((ICreateConnectionFeature) feature);
				compartment.addToolEntry(toolEntry);
			}
		});
		
		return compartment;
	}
	
	@Override
	public IContextButtonPadData getContextButtonPad(IPictogramElementContext context) {
		return super.getContextButtonPad(context);
	}

	@Override
	protected void setGenericContextButtons(IContextButtonPadData data, PictogramElement pe, int identifiers) {
		data.getGenericContextButtons().clear();

		IFeatureProvider fp = getFeatureProvider();
		
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
		
		// show delete button if deletable object is selected
		if (TMLDiagramUtil.isDeletableFromDiagram(bo)) {
			IContextButtonEntry deleteButton = ContextEntryHelper.createDefaultDeleteContextButton(getFeatureProvider(), pe);
			if (deleteButton != null) {
				data.getGenericContextButtons().add(deleteButton);
			}
		}
		
		// show update button if updatebale object is selected
		if (TMLDiagramUtil.isUpdateableFromDiagram(bo)) {
			IUpdateContext updateContext = new UpdateContext(pe);
			IUpdateFeature updateFeature = fp.getUpdateFeature(updateContext);
			ContextButtonEntry updateButton = new ContextButtonEntry(updateFeature, updateContext);
			ContextEntryHelper.markAsUpdateContextEntry(updateButton);
			data.getGenericContextButtons().add(updateButton);
		}
		
		// show update button if updatebale object is selected
		if (TMLDiagramUtil.isRenameableFromDiagram(bo)) {
			CustomContext renameContext = new CustomContext();
			renameContext.setInnerPictogramElement(pe);
			CommonChangeNameFeature renameFeature = new CommonChangeNameFeature(fp);
			ContextButtonEntry renameButton = new ContextButtonEntry(renameFeature, renameContext);
			renameButton.setIconId(renameFeature.getImageId());
			data.getGenericContextButtons().add(renameButton);
		}
	}
	
	@Override
	public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
		ICustomFeature customFeature = new CommonDoubleClickFeature(getFeatureProvider());
		if (customFeature.canExecute(context)) {
			return customFeature;
		}
		return super.getDoubleClickFeature(context);
	}

	@Override
	public ICustomFeature getSingleClickFeature(ISingleClickContext context) {
		ICustomFeature customFeature = new CommonSingleClickFeature(getFeatureProvider());
		if (customFeature.canExecute(context)) {
			return customFeature;
		}
		return super.getSingleClickFeature(context);
	}
	
	@Override
	public Object getToolTip(GraphicsAlgorithm ga) {
		Object obj = getFeatureProvider().getBusinessObjectForPictogramElement(ga.getPictogramElement());
		return getToolTipForObject(obj);
	}

	/**
	 * Get tool-tip for object.
	 * @param obj Object.
	 * @return tool-tip string.
	 */
	public Object getToolTipForObject(Object obj) {
		String tooltipString = "";
		if (obj instanceof IBeanCategoryAssignment) {
			IBeanCategoryAssignment ca = (IBeanCategoryAssignment) obj;
			tooltipString = getProblemToolTipString(ca);
			if (tooltipString.isEmpty()) {
				tooltipString = getPropertyToolTipString(ca);
			}
		}
		return tooltipString;
	}

	/**
	 * Get problem message to show in the tool-tip
	 * @param ca Bean
	 * @return String
	 */
	private String getProblemToolTipString(IBeanCategoryAssignment bean) {
		String problemString = "";
		List<IMarker> errorMarkers = Problem.getMarkers(bean.getTypeInstance(), IMarker.SEVERITY_ERROR);
		if (!errorMarkers.isEmpty()) {
			problemString = Problem.getMessage(errorMarkers.get(0));
		} else {
			List<IMarker> warnings = Problem.getMarkers(bean.getTypeInstance(), IMarker.SEVERITY_WARNING);
			if (!warnings.isEmpty()) {
				problemString = Problem.getMessage(warnings.get(0));
			}
		}
		return problemString;
	}
	
	/**
	 * Get property string to show in the tool-tip
	 * @param ca Bean
	 * @return String
	 */
	private String getPropertyToolTipString(IBeanCategoryAssignment ca) {
		List<APropertyInstance> properties = ca.getTypeInstance().getPropertyInstances();
		List<String> tooltip = new ArrayList<>();
		tooltip.add("name: " + ca.getName());
		for (APropertyInstance property : properties) {
			String values = getPropertyValues(property);
			if (!values.isEmpty()) {
				tooltip.add(property.getType().getName() + ": " + values);
			}
		}
		return String.join(System.lineSeparator(), tooltip);
	}
	
	/**
	 * Get property value.
	 * @param property Property instance.
	 * @return Property string.
	 */
	private String getPropertyValues(APropertyInstance property) {
		List<String> values = new ArrayList<>();
		if (property instanceof ReferencePropertyInstance) {
			ReferencePropertyInstance refPI = (ReferencePropertyInstance) property;
			if (refPI.getReference() != null) {
				IName ca = (IName) refPI.getReference();
				values.add(ca == null ? "" : ca.getName());
			}
		} else if (property instanceof ComposedPropertyInstance) {
			ComposedPropertyInstance composedPI = (ComposedPropertyInstance) property;
			CategoryAssignment ca = composedPI.getTypeInstance();
			values.add(ca == null ? "" : ca.getName());
		} else if (property instanceof ValuePropertyInstance) {
			ValuePropertyInstance valuePI = (ValuePropertyInstance) property;
			values.add(valuePI == null ? "" : valuePI.getValue());
		}		
		return String.join(", ", values);
	}
	
	/**
	 * Get decorators
	 * @param Pictogram element
	 * @return Array of decorators
	 */
	public IDecorator[] getDecorators(PictogramElement pe) {
		Object obj = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
		if (obj instanceof IBeanCategoryAssignment) {
			IBeanCategoryAssignment bean = (IBeanCategoryAssignment) obj;
			ImageDecorator problemMarker = null;
			
			List<IMarker> errorMarkers = Problem.getMarkers(bean.getTypeInstance(), IMarker.SEVERITY_ERROR);
			if (!errorMarkers.isEmpty()) {
				problemMarker = new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_ERROR);
			} else {
				List<IMarker> warnings = Problem.getMarkers(bean.getTypeInstance(), IMarker.SEVERITY_WARNING);
				if (!warnings.isEmpty()) {
					problemMarker = new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_WARNING);
				}
			} 
			
			if (problemMarker != null) {
				problemMarker.setX(-PROBLEM_MARKER_OFFSET);
				problemMarker.setY(-PROBLEM_MARKER_OFFSET);
			}
			
			RENDERING_DECORATORS[0] = problemMarker;
		}
		
		return RENDERING_DECORATORS;
	}
}
