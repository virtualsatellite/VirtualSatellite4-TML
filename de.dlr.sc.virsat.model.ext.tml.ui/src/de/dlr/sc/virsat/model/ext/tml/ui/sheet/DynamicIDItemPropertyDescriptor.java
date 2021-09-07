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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * Item property descriptor with dynamic ID
 * 
 * @author fran_tb
 *
 */
public class DynamicIDItemPropertyDescriptor extends ItemPropertyDescriptor {

	String id = null;

	@Override
	public String getId(Object object) {
		if (id != null) {
			return id;
		}
		return super.getId(object);
	}

	/**
	 * Set the ID as String
	 * 
	 * @param id
	 *            ID as String
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param multiLine If the property section should be more than one line
	 * @param sortChoices If options should be sorted
	 * @param staticImage if available a static image for the property
	 * @param category the element's category name
	 * @param filterFlags Flags to filter the options 
	 * @param id the elements dynamically setable ID
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine,
			boolean sortChoices, Object staticImage, String category, String[] filterFlags, String id) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
				staticImage, category, filterFlags);
		this.id = id;
	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param isSettable If the element should be setable
	 * @param category the element's category name
	 * @param filterFlags Flags to filter the options 
	 * @param parentReferences The references of the parent
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EReference[] parentReferences, boolean isSettable, String category,
			String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, parentReferences, isSettable, category,
				filterFlags);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param isSettable If the element should be setable
	 * @param category the element's category name
	 * @param parentReferences The references of the parent
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EReference[] parentReferences, boolean isSettable,
			String category) {
		super(adapterFactory, resourceLocator, displayName, description, parentReferences, isSettable, category);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param isSettable If the element should be setable
	 * @param parentReferences The references of the parent
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EReference[] parentReferences, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description, parentReferences, isSettable);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param parentReferences The references of the parent
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EReference[] parentReferences) {
		super(adapterFactory, resourceLocator, displayName, description, parentReferences);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param multiLine If the property section should be more than one line
	 * @param sortChoices If options should be sorted
	 * @param staticImage if available a static image for the property
	 * @param category the element's category name
	 * @param filterFlags Flags to filter the options 
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine,
			boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
				staticImage, category, filterFlags);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param staticImage if available a static image for the property
	 * @param category the element's category name
	 * @param filterFlags Flags to filter the options 
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, staticImage, category,
				filterFlags);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param staticImage if available a static image for the property
	 * @param category the element's category name
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable, Object staticImage,
			String category) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, staticImage, category);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param staticImage if available a static image for the property
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, staticImage);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param category the element's category name
	 * @param filterFlags Flags to filter the options 
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable, String category,
			String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, category, filterFlags);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param category the element's category name
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable, String category) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, category);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param resourceLocator the elements resource locator e.g. edit plugin
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description, feature);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param isSettable If the element should be setable
	 * @param category the element's category name
	 * @param filterFlags Flags to filter the options 
	 * @param parentReferences The references of the parent
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, parentReferences, isSettable, category, filterFlags);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param isSettable If the element should be setable
	 * @param category the element's category name
	 * @param parentReferences The references of the parent
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category) {
		super(adapterFactory, displayName, description, parentReferences, isSettable, category);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param isSettable If the element should be setable
	 * @param parentReferences The references of the parent
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EReference[] parentReferences, boolean isSettable) {
		super(adapterFactory, displayName, description, parentReferences, isSettable);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param parentReferences The references of the parent
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EReference[] parentReferences) {
		super(adapterFactory, displayName, description, parentReferences);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param staticImage if available a static image for the property
	 * @param category the element's category name
	 * @param filterFlags Flags to filter the options 
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable, staticImage, category, filterFlags);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param staticImage if available a static image for the property
	 * @param category the element's category name
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, Object staticImage, String category) {
		super(adapterFactory, displayName, description, feature, isSettable, staticImage, category);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param staticImage if available a static image for the property
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, Object staticImage) {
		super(adapterFactory, displayName, description, feature, isSettable, staticImage);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param category the element's category name
	 * @param filterFlags Flags to filter the options 
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable, category, filterFlags);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 * @param category the element's category name
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, String category) {
		super(adapterFactory, displayName, description, feature, isSettable, category);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature
	 * @param isSettable If the element should be setable
	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, displayName, description, feature, isSettable);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to
	 * be multi-line and to sort choices; specifies a static image, a category, and
	 * filter flags; and determines the cell editor from the type of the structural
	 * feature.
	 * 
	 * @param adapterFactory The elements adaptor factory
	 * @param displayName the name shown for the element
	 * @param description the element's description
	 * @param feature the elements ecore feature

	 */
	public DynamicIDItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description,
			EStructuralFeature feature) {
		super(adapterFactory, displayName, description, feature);

	}

}
