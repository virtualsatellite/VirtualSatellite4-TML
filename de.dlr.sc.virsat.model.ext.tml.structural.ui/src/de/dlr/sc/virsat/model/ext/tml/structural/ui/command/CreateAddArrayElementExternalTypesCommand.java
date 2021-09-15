/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dlr.sc.virsat.model.dvlm.categories.ATypeInstance;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ComposedPropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.PropertyinstancesPackage;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ExternalType;

/**
 * Auto Generated Class inheriting from Generator Gap Class
 * 
 * This class is generated once, do your changes here
 * 
 * 
 * 
 */
public class CreateAddArrayElementExternalTypesCommand extends ACreateAddArrayElementExternalTypesCommand {
	@Override
	public Command create(EditingDomain editingDomain, ArrayInstance arrayInstance, Category type) {
		ATypeInstance ati = new CategoryInstantiator().generateInstance(arrayInstance, type);
		ExternalType externalType = new ExternalType(((ComposedPropertyInstance) ati).getTypeInstance());
		externalType.setAbstractType(true);
		return AddCommand.create(editingDomain, arrayInstance, PropertyinstancesPackage.Literals.ARRAY_INSTANCE__ARRAY_INSTANCES, ati);
	}
}
