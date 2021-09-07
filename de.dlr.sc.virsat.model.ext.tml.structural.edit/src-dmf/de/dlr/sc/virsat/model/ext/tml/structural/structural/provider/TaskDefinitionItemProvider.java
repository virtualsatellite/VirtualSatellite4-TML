/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.provider;


import de.dlr.sc.virsat.model.ext.core.core.provider.GenericCategoryItemProvider;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDefinitionItemProvider 
	extends GenericCategoryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addSerializedDefinitionPropertyDescriptor(object);
			addSchedulePolicyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Serialized Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSerializedDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDefinition_serializedDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDefinition_serializedDefinition_feature", "_UI_TaskDefinition_type"),
				 StructuralPackage.Literals.TASK_DEFINITION__SERIALIZED_DEFINITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulePolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskDefinition_schedulePolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskDefinition_schedulePolicy_feature", "_UI_TaskDefinition_type"),
				 StructuralPackage.Literals.TASK_DEFINITION__SCHEDULE_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(StructuralPackage.Literals.TASK_DEFINITION__INPUTS);
			childrenFeatures.add(StructuralPackage.Literals.TASK_DEFINITION__OUTPUTS);
			childrenFeatures.add(StructuralPackage.Literals.TASK_DEFINITION__PARAMETERS);
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
	 * This returns TaskDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskDefinition_type") :
			getString("_UI_TaskDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(TaskDefinition.class)) {
			case StructuralPackage.TASK_DEFINITION__SERIALIZED_DEFINITION:
			case StructuralPackage.TASK_DEFINITION__SCHEDULE_POLICY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructuralPackage.TASK_DEFINITION__INPUTS:
			case StructuralPackage.TASK_DEFINITION__OUTPUTS:
			case StructuralPackage.TASK_DEFINITION__PARAMETERS:
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
				(StructuralPackage.Literals.TASK_DEFINITION__INPUTS,
				 StructuralFactory.eINSTANCE.createTaskInputDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASK_DEFINITION__OUTPUTS,
				 StructuralFactory.eINSTANCE.createTaskOutputDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASK_DEFINITION__PARAMETERS,
				 StructuralFactory.eINSTANCE.createAttribute()));
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
