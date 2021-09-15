/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
 package de.dlr.sc.virsat.model.ext.tml.structural.declaration


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DatatypeDefinitionStandaloneSetup extends DatatypeDefinitionStandaloneSetupGenerated {

	def static void doSetup() {
		new DatatypeDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
