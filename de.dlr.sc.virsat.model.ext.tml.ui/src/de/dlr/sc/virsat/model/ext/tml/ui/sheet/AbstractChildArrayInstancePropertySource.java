/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.ui.sheet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * Property source for an array property element, listing all array elements in
 * the property section
 * 
 * @author fran_tb
 *
 */
public abstract class AbstractChildArrayInstancePropertySource implements IPropertySource {

	EObject parent;

	/**
	 * Create the property source of an ecore element
	 * @param element ecore object
	 */
	public AbstractChildArrayInstancePropertySource(EObject element) {
		itemPropertyDescriptors = new ArrayList<IItemPropertyDescriptor>();
		instanceElementPerTypeId = new HashMap<String, EObject>();
		parent = element;
		initInstanceVales();
	}

	/**
	 * refresh the parent element 
	 * @param element parent element
	 */
	public void refreshParentElement(EObject element) {
		this.parent = element;
	}

	/**
	 * Init list values
	 */
	protected void initInstanceVales() {
		String id = null;
		for (Object instance : getChildInstanceArray(parent)) {
			id = getChildTypeID((EObject) instance);
			if (id != null) {
				instanceElementPerTypeId.put(id, (EObject) instance);
			} else {
				// If type does not exist anymore delete the instance
				EcoreUtil.delete((EObject) instance);
			}
			id = null;
		}
	}

	/**
	 * This is used to store all the property descriptors. Derived classes should
	 * add descriptors to this vector.
	 */
	protected List<IItemPropertyDescriptor> itemPropertyDescriptors;

	protected Map<String, EObject> instanceElementPerTypeId;

	/**
	 * Get array of child types - used to show the child properties name
	 * @return EList of channel types parameter definitions
	 */
	protected abstract EList<?> getChildTypeArray();

	/**
	 * Get the instance of the channel's parameters
	 * @param object channel instance
	 * @return EList of channel's parameters instances
	 */
	protected abstract EList<?> getChildInstanceArray(Object object);

	/**
	 * Get UUID of a parameter definition or instance
	 * @param object Parameter definition or instance
	 * @return UUID of the type declaration as string
	 */
	protected abstract String getChildTypeID(EObject object);

	/**
	 * Get the name of the parameter definition
	 * @param object parameter definition
	 * @return Name property of the parameter
	 */
	protected abstract String getChildTypeName(EObject object);

	/**
	 * Get the ecore feature of the behavior parameter value
	 * @return Ecore structural feature of the behavior package
	 */
	protected abstract EStructuralFeature getFeature();

	/**
	 * Get the category of a parameter instance
	 * @param object behavior parameter
	 * @return Category name as string
	 */
	protected abstract String getCategoryName(EObject object);

	/**
	 * Get the resource locator
	 * @return the concept DMF edit plugin instance
	 */
	protected abstract ResourceLocator getResourceLocator();

	/**
	 * Get the name of the parent element of the list
	 * @return Name of the element as string
	 */
	protected abstract String getParentName();

	/**
	 * Get the value of a child property instance
	 * @param child child instance
	 * @return the value of the parameter instance
	 */
	protected abstract Object getChildValue(EObject child);
	
	/**
	 * Get the value of a child property instance
	 * @param id the UUID of the parameter definitions type
	 * @return the value of the parameter instance
	 */
	protected abstract Object getChildValue(Object id);
	
	/**
	 * Get the value of a child property instance
	 * @param child child instance
	 * @param id the UUID of the parameter definitions type
	 * @return the value of the parameter instance
	 */
	protected abstract Object getChildValue(EObject child, Object id);

	/**
	 * Set the value of a child parameter
	 * @param child parameter instance
	 * @param value the value
	 */
	protected abstract void setChildValue(EObject child, Object value);

	/**
	 * Create an instance object of a parameter definition by its ID
	 * @param typeID The ID of the parameter definition
	 * @return The created parameter instance
	 */
	protected abstract EObject createChildValueInstance(String typeID);

	/**
	 * Get the property descriptors of the parent element
	 * @param object Not used in this implementation
	 * @return A list of property descriptors
	 */
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {

		for (Object childElement : getChildTypeArray()) {
			addPropertyDescriptor((EObject) childElement);
		}

		return itemPropertyDescriptors;
	}

	/**
	 * Add a property descriptor for a property element
	 * @param object the property element
	 */
	protected void addPropertyDescriptor(EObject object) {

		String description = "Property value " + getChildTypeName(object) + " of " + getParentName();

		itemPropertyDescriptors.add(new DynamicIDItemPropertyDescriptor(null, getResourceLocator(),
				getChildTypeName(object), description, getFeature(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getCategoryName(object), null, getChildTypeID(object)));
	}

	/**
	 * Get the property descriptors as array
	 * @return An array of the property descriptors
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		Collection<IPropertyDescriptor> result = new ArrayList<IPropertyDescriptor>();
		for (IItemPropertyDescriptor itemPropertyDescriptor : getPropertyDescriptors(parent)) {
			result.add(new PropertyDescriptor(instanceElementPerTypeId.get(itemPropertyDescriptor.getId(parent)),
					itemPropertyDescriptor));
		}

		return result.toArray(new IPropertyDescriptor[result.size()]);
	}

	@Override
	public Object getEditableValue() {
		return parent;
	}

	@Override
	public Object getPropertyValue(Object id) {
		return getChildValue(instanceElementPerTypeId.get(id), id);
	}

	@Override
	public boolean isPropertySet(Object id) {
		return getChildValue(instanceElementPerTypeId.get(id), id) != null;
	}

	@Override
	public void resetPropertyValue(Object id) {
		setChildValue(instanceElementPerTypeId.get(id), null);

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		String idString = (String) id;
		if (instanceElementPerTypeId.get(idString) == null) {
			EObject valueInstanceHolder = createChildValueInstance(idString);
			instanceElementPerTypeId.put(idString, valueInstanceHolder);
		}
		setChildValue(instanceElementPerTypeId.get(idString), value);
	}

}
