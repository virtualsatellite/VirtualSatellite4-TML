/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.structural.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.provider.ConceptEditPlugin;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel;

/**
 * Customization class for generated item provider
 * 	- changes property presentation of channel behaviors 
 * @author fran_tb
 *
 */
public class ChannelItemProviderCustom extends ChannelItemProvider {

	/**
	 * Constructor forwarding the factory to super class
	 * @param adapterFactory Adapter Factory
	 */
	public ChannelItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUuidPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addInputsPropertyDescriptor(object);
			addDataTypePropertyDescriptor(object);
			if (object instanceof Channel) {
				if (((Channel) object).getChannelBehavior() != null) {
					addTypeOfPropertyDescriptor();
				}
			}
		}
		return itemPropertyDescriptors;
	}

	/**
	 * Adds presentation of channel definition to channel properties
	 * @param object
	 */
	protected void addTypeOfPropertyDescriptor() {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getBehavioralResourceLocator(), getString("_UI_ChannelBehavior_typeOf_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChannelBehavior_typeOf_feature",
								"_UI_ChannelBehavior_type"),
						BehavioralPackage.Literals.CHANNEL_BEHAVIOR__TYPE_OF, true, false, true, null, null, null));
	}

	@Override
	public String getText(Object object) {
		String label = ((Channel) object).getName();
		ChannelBehavior cBehavior = ((Channel) object).getChannelBehavior();
		if (cBehavior != null && cBehavior.getTypeOf() != null) {
			label += " : " + cBehavior.getTypeOf().getName();
		}
		return getString("_UI_Channel_type") + " " + label;
	}


	/**
	 * Get the edit plugin instance 
	 * @return instance of edit plugin
	 */
	protected ResourceLocator getBehavioralResourceLocator() {
		return ConceptEditPlugin.INSTANCE;
	}

}
