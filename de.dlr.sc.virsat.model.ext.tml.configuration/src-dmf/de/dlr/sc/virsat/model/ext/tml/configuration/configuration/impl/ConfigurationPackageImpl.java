/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl;

import de.dlr.sc.virsat.model.dvlm.DVLMPackage;
import de.dlr.sc.virsat.model.ext.core.core.CorePackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationFactory;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ElementConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmlConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskingEnvironmentConfigurationEClass = null;

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
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigurationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = registeredConfigurationPackage instanceof ConfigurationPackageImpl ? (ConfigurationPackageImpl)registeredConfigurationPackage : new ConfigurationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DVLMPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		StructuralPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		BehavioralPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMLConfiguration() {
		return tmlConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMLConfiguration_GeneratorConfiguration() {
		return (EReference)tmlConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerationConfiguration() {
		return generationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_GenerationPath() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_SrcGenPath() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_SrcPath() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_BuildGenPath() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_TestPath() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_TaskDefinitionFolder() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_ChannelDefinitionFolder() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_TypeDefinitionFolder() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_ContribFolder() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_LibconfigFolder() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationConfiguration_TaskingVersion() {
		return (EAttribute)generationConfigurationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenerationConfiguration_TaskingEnvironmentConfiguration() {
		return (EReference)generationConfigurationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementConfiguration() {
		return elementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementConfiguration_ImplementationName() {
		return (EAttribute)elementConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskingEnvironmentConfiguration() {
		return taskingEnvironmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingEnvironmentConfiguration_DomainElement() {
		return (EReference)taskingEnvironmentConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
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
		tmlConfigurationEClass = createEClass(TML_CONFIGURATION);
		createEReference(tmlConfigurationEClass, TML_CONFIGURATION__GENERATOR_CONFIGURATION);

		generationConfigurationEClass = createEClass(GENERATION_CONFIGURATION);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__GENERATION_PATH);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__SRC_GEN_PATH);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__SRC_PATH);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__BUILD_GEN_PATH);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__TEST_PATH);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__CONTRIB_FOLDER);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__LIBCONFIG_FOLDER);
		createEAttribute(generationConfigurationEClass, GENERATION_CONFIGURATION__TASKING_VERSION);
		createEReference(generationConfigurationEClass, GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION);

		elementConfigurationEClass = createEClass(ELEMENT_CONFIGURATION);
		createEAttribute(elementConfigurationEClass, ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME);

		taskingEnvironmentConfigurationEClass = createEClass(TASKING_ENVIRONMENT_CONFIGURATION);
		createEReference(taskingEnvironmentConfigurationEClass, TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT);
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
		StructuralPackage theStructuralPackage = (StructuralPackage)EPackage.Registry.INSTANCE.getEPackage(StructuralPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tmlConfigurationEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		generationConfigurationEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		elementConfigurationEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskingEnvironmentConfigurationEClass.getESuperTypes().add(this.getElementConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(tmlConfigurationEClass, TMLConfiguration.class, "TMLConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMLConfiguration_GeneratorConfiguration(), this.getGenerationConfiguration(), null, "generatorConfiguration", null, 0, 1, TMLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationConfigurationEClass, GenerationConfiguration.class, "GenerationConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerationConfiguration_GenerationPath(), ecorePackage.getEString(), "generationPath", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_SrcGenPath(), ecorePackage.getEString(), "srcGenPath", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_SrcPath(), ecorePackage.getEString(), "srcPath", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_BuildGenPath(), ecorePackage.getEString(), "buildGenPath", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_TestPath(), ecorePackage.getEString(), "testPath", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_TaskDefinitionFolder(), ecorePackage.getEString(), "taskDefinitionFolder", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_ChannelDefinitionFolder(), ecorePackage.getEString(), "channelDefinitionFolder", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_TypeDefinitionFolder(), ecorePackage.getEString(), "typeDefinitionFolder", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_ContribFolder(), ecorePackage.getEString(), "contribFolder", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_LibconfigFolder(), ecorePackage.getEString(), "libconfigFolder", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationConfiguration_TaskingVersion(), ecorePackage.getEString(), "taskingVersion", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenerationConfiguration_TaskingEnvironmentConfiguration(), this.getTaskingEnvironmentConfiguration(), null, "taskingEnvironmentConfiguration", null, 0, 1, GenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementConfigurationEClass, ElementConfiguration.class, "ElementConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementConfiguration_ImplementationName(), ecorePackage.getEString(), "implementationName", null, 0, 1, ElementConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskingEnvironmentConfigurationEClass, TaskingEnvironmentConfiguration.class, "TaskingEnvironmentConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskingEnvironmentConfiguration_DomainElement(), theStructuralPackage.getTaskingEnvironment(), null, "domainElement", null, 0, 1, TaskingEnvironmentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigurationPackageImpl
