/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.provider;


import de.dlr.sc.virsat.model.ext.core.core.provider.GenericCategoryItemProvider;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

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
 * This is the item provider adapter for a {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskingEnvironmentItemProvider 
	extends GenericCategoryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskingEnvironmentItemProvider(AdapterFactory adapterFactory) {
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

			addLastDiagramChangePropertyDescriptor(object);
			addSchedularPolicyPropertyDescriptor(object);
			addNumberOfExecutorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Last Diagram Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastDiagramChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskingEnvironment_lastDiagramChange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskingEnvironment_lastDiagramChange_feature", "_UI_TaskingEnvironment_type"),
				 StructuralPackage.Literals.TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedular Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedularPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskingEnvironment_schedularPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskingEnvironment_schedularPolicy_feature", "_UI_TaskingEnvironment_type"),
				 StructuralPackage.Literals.TASKING_ENVIRONMENT__SCHEDULAR_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Executors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfExecutorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskingEnvironment_numberOfExecutors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskingEnvironment_numberOfExecutors_feature", "_UI_TaskingEnvironment_type"),
				 StructuralPackage.Literals.TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(StructuralPackage.Literals.TASKING_ENVIRONMENT__TASKS);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_ENVIRONMENT__CHANNELS);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_ENVIRONMENT__TIME_EVENTS);
			childrenFeatures.add(StructuralPackage.Literals.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS);
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
	 * This returns TaskingEnvironment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskingEnvironment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskingEnvironment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskingEnvironment_type") :
			getString("_UI_TaskingEnvironment_type") + " " + label;
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

		switch (notification.getFeatureID(TaskingEnvironment.class)) {
			case StructuralPackage.TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE:
			case StructuralPackage.TASKING_ENVIRONMENT__SCHEDULAR_POLICY:
			case StructuralPackage.TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__TASKS:
			case StructuralPackage.TASKING_ENVIRONMENT__CHANNELS:
			case StructuralPackage.TASKING_ENVIRONMENT__TIME_EVENTS:
			case StructuralPackage.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS:
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
				(StructuralPackage.Literals.TASKING_ENVIRONMENT__TASKS,
				 StructuralFactory.eINSTANCE.createTaskInstance()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_ENVIRONMENT__CHANNELS,
				 StructuralFactory.eINSTANCE.createChannel()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_ENVIRONMENT__TIME_EVENTS,
				 StructuralFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(StructuralPackage.Literals.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS,
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
