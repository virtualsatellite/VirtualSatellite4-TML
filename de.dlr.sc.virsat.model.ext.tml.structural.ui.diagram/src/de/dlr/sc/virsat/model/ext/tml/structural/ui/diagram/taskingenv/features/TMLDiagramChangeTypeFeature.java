/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.APropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryAssignmentHelper;
import de.dlr.sc.virsat.model.ext.tml.structural.model.AChannel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ATaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;
import de.dlr.sc.virsat.uiengine.ui.dialog.ReferenceSelectionDialog;

/**
 * TML Structural Change Name Feature
 * @author nepa_ay
 *
 */
public class TMLDiagramChangeTypeFeature extends AbstractCustomFeature {

	private boolean change;
	
	/**
	 * Constructor
	 * @param fp Feature provider.
	 */
	public TMLDiagramChangeTypeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canExecute(ICustomContext context) {
		PictogramElement pe = context.getInnerPictogramElement() != null ? context.getInnerPictogramElement() : context.getPictogramElements()[0];
		Object obj = getBusinessObjectForPictogramElement(pe);
		return obj instanceof TaskInstance || obj instanceof Channel;
	}

	@Override
	public void execute(ICustomContext context) {
		change = false;
		PictogramElement pe = context.getInnerPictogramElement() != null ? context.getInnerPictogramElement() : context.getPictogramElements()[0];
		IBeanCategoryAssignment bean = (IBeanCategoryAssignment) getBusinessObjectForPictogramElement(pe);
		IBeanCategoryAssignment type = bean instanceof TaskInstance ? ((TaskInstance) bean).getTypeOf() : ((Channel) bean).getDataType();
		
		ElementTreeSelectionDialog dialog = createSelectionDialog(bean, type);
		if (dialog.open() == Dialog.OK) {
			CategoryAssignment selectedType = (CategoryAssignment) dialog.getFirstResult();
			if (!selectedType.equals(type.getATypeInstance())) {
				VirSatTransactionalEditingDomain ed = VirSatEditingDomainRegistry.INSTANCE.getEd(bean.getTypeInstance());
				Command command;
				if (bean instanceof TaskInstance) {
					command = ((TaskInstance) bean).setTypeOf(ed, new TaskDefinition(selectedType));
				} else {
					command = ((Channel) bean).setDataType(ed, new DataType(selectedType));
				}
				ed.getCommandStack().execute(command);
				updatePictogramElement(bean instanceof TaskInstance ? ((Shape) pe).getContainer() : pe);
				change = true;
			}
		}
	}
	
	/**
	 * Open virsat reference selection dialog.
	 * @param bean Bean Category Assignment.
	 * @param type 
	 * @return dialog 
	 */
	private ElementTreeSelectionDialog createSelectionDialog(IBeanCategoryAssignment bean, IBeanCategoryAssignment type) {
		String propertyName = bean instanceof TaskInstance ? ATaskInstance.PROPERTY_TYPEOF : AChannel.PROPERTY_DATATYPE;
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		APropertyInstance property = new CategoryAssignmentHelper(bean.getTypeInstance()).getPropertyInstance(propertyName);
		ElementTreeSelectionDialog dialog = ReferenceSelectionDialog.createRefernceSelectionDialog(Display.getCurrent().getActiveShell(), 
				type.getATypeInstance().getType(), adapterFactory);
		dialog.setAllowMultiple(false);
		dialog.setDoubleClickSelects(true);
		dialog.setInitialSelection(type);
		dialog.setInput(property.eResource());
		return dialog;
	}

	@Override
	public boolean hasDoneChanges() {
		return change;
	}

	@Override
	public String getName() {
		return "Change Type";
	}
	
	@Override
	public String getDescription() {
		return "Change the Type of this object.";
	}
}
