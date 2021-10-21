/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers.TMLDiagramIconProvider;
import de.dlr.sc.virsat.model.ui.editor.input.VirSatUriEditorInput;

/**
 * Sequence graph diagram Change Name Feature
 * @author nepa_ay
 *
 */
public class CommonOpenVirSatEditorFeature extends AbstractCustomFeature implements IMenuActionFeature {

	private boolean hasDoneChanges = false;
	
	/**
	 * Constructor
	 * @param fp Feature provider.
	 */
	public CommonOpenVirSatEditorFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canExecute(ICustomContext context) {
		PictogramElement pe = context.getInnerPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		return bo instanceof IBeanCategoryAssignment;
	}

	@Override
	public void execute(ICustomContext context) {
		PictogramElement pe = context.getInnerPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		if (bo instanceof IBeanCategoryAssignment) {
			IBeanCategoryAssignment bean = (IBeanCategoryAssignment) bo;
			CategoryAssignment ca = bean.getTypeInstance();
			VirSatUriEditorInput.openDrillDownEditor(ca);
		}
	}
	
	@Override
	public boolean hasDoneChanges() {
		return hasDoneChanges;
	}

	@Override
	public String getName() {
		return "Open VirSat Editor";
	}
	
	@Override
	public String getDescription() {
		return "Open VirSat Editor";
	}
	
	@Override
	public String getImageId() {
		return TMLDiagramIconProvider.VIRSAT_EDITOR_ICON;
	}
}
