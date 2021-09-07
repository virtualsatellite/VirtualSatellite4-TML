/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
 package de.dlr.sc.virsat.model.ext.tml.behavioral

import de.dlr.sc.virsat.model.ext.tml.resource.VirSatAwareXtextResourceSet
import de.dlr.sc.virsat.model.ext.tml.resource.VirsatReferenceableXtextResource

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ChannelDefinitionRuntimeModule extends AbstractChannelDefinitionRuntimeModule {
	
	override bindResourceSet() {
		return VirSatAwareXtextResourceSet
	}
	
	override bindXtextResourceSet() {
		return VirSatAwareXtextResourceSet
	}
	
	override bindXtextResource() {
		return VirsatReferenceableXtextResource
	}
	
}
