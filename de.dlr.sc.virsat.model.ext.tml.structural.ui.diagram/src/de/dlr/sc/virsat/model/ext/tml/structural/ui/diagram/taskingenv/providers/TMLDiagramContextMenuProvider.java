/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.context.impl.DeleteContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditorContextMenuProvider;
import org.eclipse.graphiti.ui.internal.action.CustomAction;
import org.eclipse.graphiti.ui.internal.action.DeleteAction;
import org.eclipse.graphiti.ui.internal.action.SaveImageAction;
import org.eclipse.graphiti.ui.internal.action.UpdateAction;
import org.eclipse.graphiti.ui.platform.IConfigurationProvider;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.actions.ActionFactory;

import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.CommonOpenVirSatEditorFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.IMenuActionFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.CommonChangeNameFeature;


/**
 * 
 * @author nepa_ay
 *
 */
@SuppressWarnings("restriction")
public class TMLDiagramContextMenuProvider extends DiagramEditorContextMenuProvider {

	private IConfigurationProvider configurationProvider;
	private ActionRegistry actionRegistry;
	
	private static final String CUSTOM_GROUP_EDITOR = "de.dlr.sc.virsat.quantus.sequencegraph.ui.contextmenu.group.custom.editor";
	private static final String CUSTOM_GROUP_EDIT = "de.dlr.sc.virsat.quantus.sequencegraph.ui.contextmenu.group.custom.edit";
	private static final String CUSTOM_GROUP_PRINT = "de.dlr.sc.virsat.quantus.sequencegraph.ui.contextmenu.group.custom.print";
	private static final String CUSTOM_GROUP_EXPORT = "de.dlr.sc.virsat.quantus.sequencegraph.ui.contextmenu.group.custom.export";
	
	public TMLDiagramContextMenuProvider(EditPartViewer viewer, ActionRegistry registry,
			IConfigurationProvider configurationProvider) {
		super(viewer, registry, configurationProvider);
		this.configurationProvider = configurationProvider;
		this.actionRegistry = registry;
	}

	@Override
	public void buildContextMenu(IMenuManager manager) {
		PictogramElement pe = getFirstSelectedPictogram();
		
		if (pe != null) {
			addMenuGroupEditor(manager, pe);
			addMenuGroupEdit(manager, pe);
		}
		
		addMenuGroupPrint(manager);
		addMenuGroupSave(manager);
	}
	
	/**
	 * Get first selected pictogram
	 * @return PE
	 */
	private PictogramElement getFirstSelectedPictogram() {
		DiagramBehavior diagramBehavior = configurationProvider.getDiagramBehavior();
		PictogramElement[] pes = diagramBehavior.getSelectedPictogramElements();
		if (pes != null && pes.length > 0) {
			return pes[0];
		}
		return null;
	}
	
	/**
	 * Add menu group editor
	 * @param manager Menu manager
	 * @param pe Pictogram element
	 */
	private void addMenuGroupEditor(IMenuManager manager, PictogramElement pe) {
		IFeatureProvider fp = configurationProvider.getFeatureProvider();
		manager.add(new Separator(CUSTOM_GROUP_EDITOR));
		
		getOpenVirsatEditorAction(manager, fp, pe);
	}
	
	/**
	 * 
	 * @param manager
	 * @param pe
	 */
	private void addMenuGroupEdit(IMenuManager manager, PictogramElement pe) {
		IFeatureProvider fp = configurationProvider.getFeatureProvider();
		manager.add(new Separator(CUSTOM_GROUP_EDIT));
		
		getRenameAction(manager, fp, pe);
		getUpdateAction(manager, fp, pe);
		getDeleteAction(manager, fp, pe);
	}
	
	private void addMenuGroupPrint(IMenuManager manager) {
		manager.add(new Separator(CUSTOM_GROUP_PRINT));
		addActionToMenu(manager, ActionFactory.PRINT.getId(), CUSTOM_GROUP_PRINT);
	}
	
	private void addMenuGroupSave(IMenuManager manager) {
		manager.add(new Separator(CUSTOM_GROUP_EXPORT));
		addActionToMenu(manager, SaveImageAction.ACTION_ID, CUSTOM_GROUP_EXPORT);
	}
	
	/**
	 * 
	 * @param manager
	 * @param groupID
	 * @param action
	 */
	private void appendAction(IMenuManager manager, String groupID, IAction action) {
		if (action != null) {
			if (groupID != null) {
				manager.appendToGroup(groupID, action);
			} else {
				manager.add(action);
			}
		}
	}
	
	private void getOpenVirsatEditorAction(IMenuManager manager, IFeatureProvider fp, PictogramElement pe) {
		ICustomFeature feature = new CommonOpenVirSatEditorFeature(fp);
		IAction action = createCustomAction(feature, pe);
		appendAction(manager, CUSTOM_GROUP_EDITOR, action);
	}
	
	private void getRenameAction(IMenuManager manager, IFeatureProvider fp, PictogramElement pe) {
		ICustomFeature feature = new CommonChangeNameFeature(fp);
		IAction action = createCustomAction(feature, pe);
		appendAction(manager, CUSTOM_GROUP_EDIT, action);
	}
		
	private void getUpdateAction(IMenuManager manager, IFeatureProvider fp, PictogramElement pe) {
		IUpdateContext context = new UpdateContext(pe);
		IUpdateFeature feature = fp.getUpdateFeature(context);
		IAction action = getAction(feature, UpdateAction.ACTION_ID);
		appendAction(manager, CUSTOM_GROUP_EDIT, action);
	}
	
	private void getDeleteAction(IMenuManager manager, IFeatureProvider fp, PictogramElement pe) {
		IDeleteContext context = new DeleteContext(pe);
		IDeleteFeature feature = fp.getDeleteFeature(context);
		IAction action = getAction(feature, DeleteAction.ACTION_ID);
		appendAction(manager, CUSTOM_GROUP_EDIT, action);
	}
	
	/**
	 * Get action
	 * @param feature
	 * @param actionId
	 * @return
	 */
	private IAction getAction(IFeature feature, String actionId) {
		if (feature != null) {
			IAction action = this.actionRegistry.getAction(actionId);
			action.setText(feature.getName());
			action.setDescription(feature.getDescription());
			ImageDescriptor image = getImage(feature);
			action.setImageDescriptor(image);
			// For Update Actions we have to trigger a refresh of the
			// enablement, also if no selection change occurred:
			//e.g. update was triggered, then update has to be disabled.
			if (action instanceof UpdateAction) {
				UpdateAction updateAction = (UpdateAction) action;
				updateAction.setEnabled(updateAction.isEnabled());
			}
			return action;
		}
		return null;
	}
	
	/**
	 * Get custom action
	 * @param feature
	 * @param actionId
	 * @return
	 */
	private IAction createCustomAction(ICustomFeature feature, PictogramElement pe) {
		CustomContext context = new CustomContext();
		context.setInnerPictogramElement(pe);
		IAction action = new CustomAction(feature, context, configurationProvider.getDiagramBehavior());
		action.setText(feature.getName());
		action.setDescription(feature.getDescription());
		ImageDescriptor image = getImage(feature);
		action.setImageDescriptor(image);
		return action;
	}
	
	/**
	 * Get image description
	 * @param feature
	 * @return
	 */
	private ImageDescriptor getImage(IFeature feature) {
		if (feature instanceof IMenuActionFeature) {
			return getImage(((IMenuActionFeature) feature).getImageId());
		
		} else if (feature instanceof ICustomFeature) {
			return getImage(((ICustomFeature) feature).getImageId());
		}
		return null;
	}
	
	private ImageDescriptor getImage(String imageId) {
		return GraphitiUi.getImageService().getImageDescriptorForId(
				configurationProvider.getDiagramTypeProvider().getProviderId(), imageId);
	}
}
