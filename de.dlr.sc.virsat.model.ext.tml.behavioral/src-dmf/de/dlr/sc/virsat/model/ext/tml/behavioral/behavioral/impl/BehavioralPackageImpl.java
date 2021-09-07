/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl;

import de.dlr.sc.virsat.model.dvlm.DVLMPackage;
import de.dlr.sc.virsat.model.ext.core.core.CorePackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralFactory;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TaskBehavior;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TimeEventBehaviorDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehavioralPackageImpl extends EPackageImpl implements BehavioralPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralParameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelBehaviorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorDefintionStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventBehaviorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStorageTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehavioralPackageImpl() {
		super(eNS_URI, BehavioralFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BehavioralPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehavioralPackage init() {
		if (isInited) return (BehavioralPackage)EPackage.Registry.INSTANCE.getEPackage(BehavioralPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBehavioralPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BehavioralPackageImpl theBehavioralPackage = registeredBehavioralPackage instanceof BehavioralPackageImpl ? (BehavioralPackageImpl)registeredBehavioralPackage : new BehavioralPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DVLMPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBehavioralPackage.createPackageContents();

		// Initialize created meta-data
		theBehavioralPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehavioralPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehavioralPackage.eNS_URI, theBehavioralPackage);
		return theBehavioralPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehavioralParameterDefinition() {
		return behavioralParameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehavioralParameterDefinition_IsStatic() {
		return (EAttribute)behavioralParameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehavioralParameterDefinition_ValueType() {
		return (EAttribute)behavioralParameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehavioralParameterDefinition_Value() {
		return (EAttribute)behavioralParameterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannelBehaviorDefinition() {
		return channelBehaviorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelBehaviorDefinition_StorageType() {
		return (EAttribute)channelBehaviorDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelBehaviorDefinition_ImplName() {
		return (EAttribute)channelBehaviorDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelBehaviorDefinition_SerializedDefinition() {
		return (EAttribute)channelBehaviorDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviorDefintionStorage() {
		return behaviorDefintionStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorDefintionStorage_ChannelBehaviorDefintions() {
		return (EReference)behaviorDefintionStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviorDefinition() {
		return behaviorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorDefinition_Parameters() {
		return (EReference)behaviorDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeEventBehaviorDefinition() {
		return timeEventBehaviorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskBehavior() {
		return taskBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviorParameter() {
		return behaviorParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorParameter_TypeOf() {
		return (EReference)behaviorParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorParameter_Value() {
		return (EAttribute)behaviorParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannelBehavior() {
		return channelBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelBehavior_TypeOf() {
		return (EReference)channelBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelBehavior_ParameterInstances() {
		return (EReference)channelBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumValueType() {
		return enumValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumStorageType() {
		return enumStorageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehavioralFactory getBehavioralFactory() {
		return (BehavioralFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		behavioralParameterDefinitionEClass = createEClass(BEHAVIORAL_PARAMETER_DEFINITION);
		createEAttribute(behavioralParameterDefinitionEClass, BEHAVIORAL_PARAMETER_DEFINITION__IS_STATIC);
		createEAttribute(behavioralParameterDefinitionEClass, BEHAVIORAL_PARAMETER_DEFINITION__VALUE_TYPE);
		createEAttribute(behavioralParameterDefinitionEClass, BEHAVIORAL_PARAMETER_DEFINITION__VALUE);

		channelBehaviorDefinitionEClass = createEClass(CHANNEL_BEHAVIOR_DEFINITION);
		createEAttribute(channelBehaviorDefinitionEClass, CHANNEL_BEHAVIOR_DEFINITION__STORAGE_TYPE);
		createEAttribute(channelBehaviorDefinitionEClass, CHANNEL_BEHAVIOR_DEFINITION__IMPL_NAME);
		createEAttribute(channelBehaviorDefinitionEClass, CHANNEL_BEHAVIOR_DEFINITION__SERIALIZED_DEFINITION);

		behaviorDefintionStorageEClass = createEClass(BEHAVIOR_DEFINTION_STORAGE);
		createEReference(behaviorDefintionStorageEClass, BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS);

		behaviorDefinitionEClass = createEClass(BEHAVIOR_DEFINITION);
		createEReference(behaviorDefinitionEClass, BEHAVIOR_DEFINITION__PARAMETERS);

		timeEventBehaviorDefinitionEClass = createEClass(TIME_EVENT_BEHAVIOR_DEFINITION);

		taskBehaviorEClass = createEClass(TASK_BEHAVIOR);

		behaviorParameterEClass = createEClass(BEHAVIOR_PARAMETER);
		createEReference(behaviorParameterEClass, BEHAVIOR_PARAMETER__TYPE_OF);
		createEAttribute(behaviorParameterEClass, BEHAVIOR_PARAMETER__VALUE);

		channelBehaviorEClass = createEClass(CHANNEL_BEHAVIOR);
		createEReference(channelBehaviorEClass, CHANNEL_BEHAVIOR__TYPE_OF);
		createEReference(channelBehaviorEClass, CHANNEL_BEHAVIOR__PARAMETER_INSTANCES);

		// Create enums
		enumValueTypeEEnum = createEEnum(ENUM_VALUE_TYPE);
		enumStorageTypeEEnum = createEEnum(ENUM_STORAGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		behavioralParameterDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		channelBehaviorDefinitionEClass.getESuperTypes().add(this.getBehaviorDefinition());
		behaviorDefintionStorageEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		behaviorDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		timeEventBehaviorDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskBehaviorEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		behaviorParameterEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		channelBehaviorEClass.getESuperTypes().add(theCorePackage.getGenericCategory());

		// Initialize classes, features, and operations; add parameters
		initEClass(behavioralParameterDefinitionEClass, BehavioralParameterDefinition.class, "BehavioralParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavioralParameterDefinition_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, BehavioralParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavioralParameterDefinition_ValueType(), this.getEnumValueType(), "valueType", null, 0, 1, BehavioralParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavioralParameterDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, BehavioralParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelBehaviorDefinitionEClass, ChannelBehaviorDefinition.class, "ChannelBehaviorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelBehaviorDefinition_StorageType(), this.getEnumStorageType(), "storageType", null, 0, 1, ChannelBehaviorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelBehaviorDefinition_ImplName(), ecorePackage.getEString(), "implName", null, 0, 1, ChannelBehaviorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelBehaviorDefinition_SerializedDefinition(), ecorePackage.getEString(), "serializedDefinition", null, 0, 1, ChannelBehaviorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorDefintionStorageEClass, BehaviorDefintionStorage.class, "BehaviorDefintionStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorDefintionStorage_ChannelBehaviorDefintions(), this.getChannelBehaviorDefinition(), null, "channelBehaviorDefintions", null, 0, -1, BehaviorDefintionStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorDefinitionEClass, BehaviorDefinition.class, "BehaviorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorDefinition_Parameters(), this.getBehavioralParameterDefinition(), null, "parameters", null, 0, -1, BehaviorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEventBehaviorDefinitionEClass, TimeEventBehaviorDefinition.class, "TimeEventBehaviorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskBehaviorEClass, TaskBehavior.class, "TaskBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behaviorParameterEClass, BehaviorParameter.class, "BehaviorParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorParameter_TypeOf(), this.getBehavioralParameterDefinition(), null, "typeOf", null, 0, 1, BehaviorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, BehaviorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelBehaviorEClass, ChannelBehavior.class, "ChannelBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelBehavior_TypeOf(), this.getChannelBehaviorDefinition(), null, "typeOf", null, 0, 1, ChannelBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelBehavior_ParameterInstances(), this.getBehaviorParameter(), null, "parameterInstances", null, 0, -1, ChannelBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumValueTypeEEnum, EnumValueType.class, "EnumValueType");
		addEEnumLiteral(enumValueTypeEEnum, EnumValueType.INTEGER);
		addEEnumLiteral(enumValueTypeEEnum, EnumValueType.FLOAT);
		addEEnumLiteral(enumValueTypeEEnum, EnumValueType.STRING);

		initEEnum(enumStorageTypeEEnum, EnumStorageType.class, "EnumStorageType");
		addEEnumLiteral(enumStorageTypeEEnum, EnumStorageType.DOUBLE_BUFFER);
		addEEnumLiteral(enumStorageTypeEEnum, EnumStorageType.FIFO);
		addEEnumLiteral(enumStorageTypeEEnum, EnumStorageType.LIFO);
		addEEnumLiteral(enumStorageTypeEEnum, EnumStorageType.EVENT_ONLY);
		addEEnumLiteral(enumStorageTypeEEnum, EnumStorageType.CUSTOM);

		// Create resource
		createResource(eNS_URI);
	}

} //BehavioralPackageImpl
