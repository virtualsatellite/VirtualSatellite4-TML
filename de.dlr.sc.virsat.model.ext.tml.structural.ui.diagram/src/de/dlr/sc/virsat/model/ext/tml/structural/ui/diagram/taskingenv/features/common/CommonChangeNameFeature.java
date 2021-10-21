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


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;

import de.dlr.sc.virsat.model.concept.types.IBeanName;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.ui.util.TMLUiUtil;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;

/**
 * TML Structural Change Name Feature
 * @author nepa_ay
 *
 */
public class CommonChangeNameFeature extends AbstractCustomFeature {

	private boolean hasDoneChanges = false;
	
	/**
	 * Constructor
	 * @param fp Feature provider.
	 */
	public CommonChangeNameFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canExecute(ICustomContext context) {
		Object obj = getBusinessObjectForPictogramElement(context.getInnerPictogramElement());
		return obj instanceof IBeanName;
	}

	@Override
	public void execute(ICustomContext context) {
		hasDoneChanges = false;
		PictogramElement pe = context.getInnerPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		
		if (bo instanceof IBeanCategoryAssignment) {
			IBeanCategoryAssignment bean = (IBeanCategoryAssignment) bo;
			TransactionalEditingDomain ed = VirSatEditingDomainRegistry.INSTANCE.getEd(bean.getTypeInstance());
			
			String currentName = bean.getName();
			String newName = TMLUiUtil.showChangeNameDialog(currentName, null); //$NON-NLS-1$
			if (newName != null && !newName.equals(currentName)) {
				hasDoneChanges = true;
				ed.getCommandStack().execute(bean.setName(ed, newName));
				updatePictogramElement(pe);
			}
		}
	}

	@Override
	public boolean hasDoneChanges() {
		return hasDoneChanges;
	}

	@Override
	public String getName() {
		return "Rename";
	}
	
	@Override
	public String getDescription() {
		return "Change name of the selected element";
	}
	
	@Override
	public String getImageId() {
		return IPlatformImageConstants.IMG_DIAGRAM;
	}
}
