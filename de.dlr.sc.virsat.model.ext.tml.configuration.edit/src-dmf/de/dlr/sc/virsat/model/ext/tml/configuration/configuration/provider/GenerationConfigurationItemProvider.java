/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration.provider;


import de.dlr.sc.virsat.model.ext.core.core.provider.GenericCategoryItemProvider;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationFactory;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;

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
 * This is the item provider adapter for a {@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenerationConfigurationItemProvider 
	extends GenericCategoryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addGenerationPathPropertyDescriptor(object);
			addSrcGenPathPropertyDescriptor(object);
			addSrcPathPropertyDescriptor(object);
			addBuildGenPathPropertyDescriptor(object);
			addTestPathPropertyDescriptor(object);
			addTaskDefinitionFolderPropertyDescriptor(object);
			addChannelDefinitionFolderPropertyDescriptor(object);
			addTypeDefinitionFolderPropertyDescriptor(object);
			addContribFolderPropertyDescriptor(object);
			addLibconfigFolderPropertyDescriptor(object);
			addTaskingVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Generation Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerationPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_generationPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_generationPath_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__GENERATION_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Src Gen Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrcGenPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_srcGenPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_srcGenPath_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__SRC_GEN_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Src Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrcPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_srcPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_srcPath_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__SRC_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build Gen Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildGenPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_buildGenPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_buildGenPath_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__BUILD_GEN_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Test Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_testPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_testPath_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__TEST_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Task Definition Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskDefinitionFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_taskDefinitionFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_taskDefinitionFolder_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Channel Definition Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChannelDefinitionFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_channelDefinitionFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_channelDefinitionFolder_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Definition Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeDefinitionFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_typeDefinitionFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_typeDefinitionFolder_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contrib Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContribFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_contribFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_contribFolder_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__CONTRIB_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Libconfig Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLibconfigFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_libconfigFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_libconfigFolder_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__LIBCONFIG_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tasking Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskingVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerationConfiguration_taskingVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerationConfiguration_taskingVersion_feature", "_UI_GenerationConfiguration_type"),
				 ConfigurationPackage.Literals.GENERATION_CONFIGURATION__TASKING_VERSION,
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
			childrenFeatures.add(ConfigurationPackage.Literals.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION);
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
	 * This returns GenerationConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenerationConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenerationConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenerationConfiguration_type") :
			getString("_UI_GenerationConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(GenerationConfiguration.class)) {
			case ConfigurationPackage.GENERATION_CONFIGURATION__GENERATION_PATH:
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_GEN_PATH:
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_PATH:
			case ConfigurationPackage.GENERATION_CONFIGURATION__BUILD_GEN_PATH:
			case ConfigurationPackage.GENERATION_CONFIGURATION__TEST_PATH:
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER:
			case ConfigurationPackage.GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER:
			case ConfigurationPackage.GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER:
			case ConfigurationPackage.GENERATION_CONFIGURATION__CONTRIB_FOLDER:
			case ConfigurationPackage.GENERATION_CONFIGURATION__LIBCONFIG_FOLDER:
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION:
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
				(ConfigurationPackage.Literals.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION,
				 ConfigurationFactory.eINSTANCE.createTaskingEnvironmentConfiguration()));
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
