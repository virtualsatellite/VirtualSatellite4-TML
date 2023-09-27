/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;


import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirsatCategoryAssignmentOpenEditorFeature;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;

import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.model.ui.editor.input.VirSatUriEditorInput;

/**
 * 
 * @author nepa_ay
 *
 */
public class CommonDoubleClickFeature extends VirsatCategoryAssignmentOpenEditorFeature {

	private boolean hasDoneChanges = false;
	
	public CommonDoubleClickFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
    public boolean canExecute(ICustomContext context) {
        return super.canExecute(context);
    }
	
	@Override
	public boolean hasDoneChanges() {
		return hasDoneChanges;
	}
	
	@Override
	public void execute(ICustomContext context) {
		PictogramElement pe = context.getPictogramElements()[0];
		IBeanCategoryAssignment bean = (IBeanCategoryAssignment) getBusinessObjectForPictogramElement(pe);
		if (bean instanceof TaskInstance) {		
			handleDoubleClickOnTaskDiagram((TaskInstance) bean, context);
		} else { 
			VirSatUriEditorInput.openDrillDownEditor(bean.getTypeInstance());
		}
	}
	
	/**
	 * 
	 * @param task
	 * @param context
	 */
	private void handleDoubleClickOnTaskDiagram(TaskInstance task, ICustomContext context) {
		VirSatUriEditorInput.openDrillDownEditor(task.getTypeInstance());
	}
}
