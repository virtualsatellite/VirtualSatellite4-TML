/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks;

import org.eclipse.emf.common.command.Command;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.editingDomain.VirSatTransactionalEditingDomain;

/**
 * 
 * @author nepa_ay
 *
 */
public class TaskDiagramDirectEditNameFeature extends AbstractDirectEditingFeature {

	/**
	 * Task Diagram Direct Edit Name Feature
	 * @param fp Feature Provider
	 */
	public TaskDiagramDirectEditNameFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public int getEditingType() {
		return TYPE_TEXT;
	}

	@Override
	public String getInitialValue(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		TaskInstance task = (TaskInstance) getBusinessObjectForPictogramElement(pe);
		return task.getName();
	}

	@Override
	public void setValue(String value, IDirectEditingContext context) {
		Shape shape = (Shape) context.getPictogramElement();
		TaskInstance task = (TaskInstance) getBusinessObjectForPictogramElement(shape);
		VirSatTransactionalEditingDomain ed = VirSatEditingDomainRegistry.INSTANCE.getEd(task.getTypeInstance());
		Command command = task.setName(ed, value);
		ed.getCommandStack().execute(command);

		updatePictogramElement(shape.getContainer());
	}
}
