/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.structural.provider;

import org.eclipse.emf.common.notify.Adapter;

/**
 * Custom class of the class StructuralItemProviderAdapterFactory
 * @author fran_tb
 *
 */
public class StructuralItemProviderAdapterFactoryCustom extends StructuralItemProviderAdapterFactory {

	/**
	 * Get channel item adapter
	 * - injects custom class
	 * @return item adapter object 
	 */
	public Adapter createChannelAdapter() {
		if (channelItemProvider == null) {
			channelItemProvider = new ChannelItemProviderCustom(this);
		}

		return channelItemProvider;
	}

}
