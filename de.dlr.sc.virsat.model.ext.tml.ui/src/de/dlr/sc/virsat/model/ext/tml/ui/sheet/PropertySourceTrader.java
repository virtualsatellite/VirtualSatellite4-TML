/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.ui.sheet;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import de.dlr.sc.virsat.model.dvlm.general.IUuid;

/**
 * Property source trader returning a property source either per instance or per type
 * @author fran_tb
 *
 */
public class PropertySourceTrader {

	/**
	 * Create a property source trader
	 * @param mappingType Either per type or per instance
	 * @param provider Property soource provider
	 */
	public PropertySourceTrader(MappingType mappingType, IPropertySourceProvider provider) {
		this.mappingType = mappingType;
		this.propertySourceCreator = provider;
	}

	Map<String, IPropertySource> propertySourcePerID = new HashMap<String, IPropertySource>();
	MappingType mappingType;
	IPropertySourceProvider propertySourceCreator;

	/**
	 * Enum type specifying the mapping of the trader
	 * @author fran_tb
	 *
	 */
	public enum MappingType {
		PROPERTY_SOURCE_PER_TYPE, PROPERTY_SOURCE_PER_INSTNCE
	}

	/**
	 * Get a property source either by type ID or by element type
	 * @param element Type ID or element type
	 * @return the property source
	 */
	public IPropertySource getPropertySource(Object element) {
		String id = null;
		if (mappingType == MappingType.PROPERTY_SOURCE_PER_INSTNCE) {
			if (element instanceof IUuid) {
				id = ((IUuid) element).getUuid().toString();
			} else {
				return null;
			}
		} else if (mappingType == MappingType.PROPERTY_SOURCE_PER_TYPE) {
			id = element.getClass().getName();
		}
		IPropertySource propertySource = propertySourcePerID.get(id);
		if (propertySource == null) {
			propertySource = propertySourceCreator.getPropertySource(element);
			propertySourcePerID.put(id, propertySource);
		}
		return propertySource;
	}

}
