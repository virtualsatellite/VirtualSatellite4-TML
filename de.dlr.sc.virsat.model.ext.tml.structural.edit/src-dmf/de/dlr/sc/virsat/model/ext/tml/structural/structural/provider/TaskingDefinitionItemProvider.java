/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.provider;


import de.dlr.sc.virsat.model.ext.core.core.provider.GenericCategoryItemProvider;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskingDefinitionItemProvider extends GenericCategoryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskingDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_DEFINITION__ENUMERATIONS);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_DEFINITION__DATA_TYPES);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_DEFINITION__EXTERNAL_TYPES);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_DEFINITION__TASK_DEFINITIONS);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_DEFINITION__REFERENCE_FRAMES);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_DEFINITION__UNITS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TaskingDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskingDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskingDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskingDefinition_type") :
			getString("_UI_TaskingDefinition_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TaskingDefinition.class)) {
			case StructuralPackage.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS:
			case StructuralPackage.TASKING_DEFINITION__ENUMERATIONS:
			case StructuralPackage.TASKING_DEFINITION__DATA_TYPES:
			case StructuralPackage.TASKING_DEFINITION__EXTERNAL_TYPES:
			case StructuralPackage.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS:
			case StructuralPackage.TASKING_DEFINITION__TASK_DEFINITIONS:
			case StructuralPackage.TASKING_DEFINITION__REFERENCE_FRAMES:
			case StructuralPackage.TASKING_DEFINITION__UNITS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS,
				 StructuralFactory.eINSTANCE.createBasicTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__ENUMERATIONS,
				 StructuralFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__DATA_TYPES,
				 StructuralFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__DATA_TYPES,
				 StructuralFactory.eINSTANCE.createExternalType()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__EXTERNAL_TYPES,
				 StructuralFactory.eINSTANCE.createExternalType()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS,
				 BehavioralFactory.eINSTANCE.createChannelBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__TASK_DEFINITIONS,
				 StructuralFactory.eINSTANCE.createTaskDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__REFERENCE_FRAMES,
				 StructuralFactory.eINSTANCE.createReferenceFrameDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_DEFINITION__UNITS,
				 StructuralFactory.eINSTANCE.createUnitDefinition()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == StructuralPackage.Literals.TASKING_DEFINITION__DATA_TYPES ||
			childFeature == StructuralPackage.Literals.TASKING_DEFINITION__EXTERNAL_TYPES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConceptEditPlugin.INSTANCE;
	}

}
