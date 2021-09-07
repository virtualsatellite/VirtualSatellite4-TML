/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration;

import de.dlr.sc.virsat.model.ext.core.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.virsat.sc.dlr.de/dmf/v1.8/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmf_configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TMLConfigurationImpl <em>TML Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TMLConfigurationImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl#getTMLConfiguration()
	 * @generated
	 */
	int TML_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML_CONFIGURATION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML_CONFIGURATION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Generator Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML_CONFIGURATION__GENERATOR_CONFIGURATION = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TML Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML_CONFIGURATION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TML Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML_CONFIGURATION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl <em>Generation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl#getGenerationConfiguration()
	 * @generated
	 */
	int GENERATION_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Generation Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__GENERATION_PATH = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src Gen Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__SRC_GEN_PATH = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__SRC_PATH = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Build Gen Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__BUILD_GEN_PATH = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__TEST_PATH = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task Definition Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Channel Definition Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Definition Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contrib Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__CONTRIB_FOLDER = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Libconfig Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__LIBCONFIG_FOLDER = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tasking Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__TASKING_VERSION = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tasking Environment Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Generation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Generation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ElementConfigurationImpl <em>Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ElementConfigurationImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl#getElementConfiguration()
	 * @generated
	 */
	int ELEMENT_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONFIGURATION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TaskingEnvironmentConfigurationImpl <em>Tasking Environment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TaskingEnvironmentConfigurationImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl#getTaskingEnvironmentConfiguration()
	 * @generated
	 */
	int TASKING_ENVIRONMENT_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT_CONFIGURATION__UUID = ELEMENT_CONFIGURATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT_CONFIGURATION__NAME = ELEMENT_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT_CONFIGURATION__IMPLEMENTATION_NAME = ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Domain Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT = ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tasking Environment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT_CONFIGURATION_FEATURE_COUNT = ELEMENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tasking Environment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT_CONFIGURATION_OPERATION_COUNT = ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration <em>TML Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TML Configuration</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration
	 * @generated
	 */
	EClass getTMLConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration#getGeneratorConfiguration <em>Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator Configuration</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration#getGeneratorConfiguration()
	 * @see #getTMLConfiguration()
	 * @generated
	 */
	EReference getTMLConfiguration_GeneratorConfiguration();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration <em>Generation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Configuration</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration
	 * @generated
	 */
	EClass getGenerationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getGenerationPath <em>Generation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Path</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getGenerationPath()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_GenerationPath();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getSrcGenPath <em>Src Gen Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Gen Path</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getSrcGenPath()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_SrcGenPath();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getSrcPath <em>Src Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Path</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getSrcPath()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_SrcPath();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getBuildGenPath <em>Build Gen Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Gen Path</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getBuildGenPath()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_BuildGenPath();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTestPath <em>Test Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Path</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTestPath()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_TestPath();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskDefinitionFolder <em>Task Definition Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Definition Folder</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskDefinitionFolder()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_TaskDefinitionFolder();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getChannelDefinitionFolder <em>Channel Definition Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Definition Folder</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getChannelDefinitionFolder()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_ChannelDefinitionFolder();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTypeDefinitionFolder <em>Type Definition Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Definition Folder</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTypeDefinitionFolder()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_TypeDefinitionFolder();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getContribFolder <em>Contrib Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrib Folder</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getContribFolder()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_ContribFolder();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getLibconfigFolder <em>Libconfig Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libconfig Folder</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getLibconfigFolder()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_LibconfigFolder();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskingVersion <em>Tasking Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tasking Version</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskingVersion()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_TaskingVersion();

	/**
	 * Returns the meta object for the containment reference '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskingEnvironmentConfiguration <em>Tasking Environment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tasking Environment Configuration</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskingEnvironmentConfiguration()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EReference getGenerationConfiguration_TaskingEnvironmentConfiguration();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ElementConfiguration <em>Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Configuration</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ElementConfiguration
	 * @generated
	 */
	EClass getElementConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ElementConfiguration#getImplementationName <em>Implementation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Name</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ElementConfiguration#getImplementationName()
	 * @see #getElementConfiguration()
	 * @generated
	 */
	EAttribute getElementConfiguration_ImplementationName();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration <em>Tasking Environment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasking Environment Configuration</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration
	 * @generated
	 */
	EClass getTaskingEnvironmentConfiguration();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration#getDomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Element</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration#getDomainElement()
	 * @see #getTaskingEnvironmentConfiguration()
	 * @generated
	 */
	EReference getTaskingEnvironmentConfiguration_DomainElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TMLConfigurationImpl <em>TML Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TMLConfigurationImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl#getTMLConfiguration()
		 * @generated
		 */
		EClass TML_CONFIGURATION = eINSTANCE.getTMLConfiguration();

		/**
		 * The meta object literal for the '<em><b>Generator Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TML_CONFIGURATION__GENERATOR_CONFIGURATION = eINSTANCE.getTMLConfiguration_GeneratorConfiguration();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl <em>Generation Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl#getGenerationConfiguration()
		 * @generated
		 */
		EClass GENERATION_CONFIGURATION = eINSTANCE.getGenerationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Generation Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__GENERATION_PATH = eINSTANCE.getGenerationConfiguration_GenerationPath();

		/**
		 * The meta object literal for the '<em><b>Src Gen Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__SRC_GEN_PATH = eINSTANCE.getGenerationConfiguration_SrcGenPath();

		/**
		 * The meta object literal for the '<em><b>Src Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__SRC_PATH = eINSTANCE.getGenerationConfiguration_SrcPath();

		/**
		 * The meta object literal for the '<em><b>Build Gen Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__BUILD_GEN_PATH = eINSTANCE.getGenerationConfiguration_BuildGenPath();

		/**
		 * The meta object literal for the '<em><b>Test Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__TEST_PATH = eINSTANCE.getGenerationConfiguration_TestPath();

		/**
		 * The meta object literal for the '<em><b>Task Definition Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER = eINSTANCE.getGenerationConfiguration_TaskDefinitionFolder();

		/**
		 * The meta object literal for the '<em><b>Channel Definition Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER = eINSTANCE.getGenerationConfiguration_ChannelDefinitionFolder();

		/**
		 * The meta object literal for the '<em><b>Type Definition Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER = eINSTANCE.getGenerationConfiguration_TypeDefinitionFolder();

		/**
		 * The meta object literal for the '<em><b>Contrib Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__CONTRIB_FOLDER = eINSTANCE.getGenerationConfiguration_ContribFolder();

		/**
		 * The meta object literal for the '<em><b>Libconfig Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__LIBCONFIG_FOLDER = eINSTANCE.getGenerationConfiguration_LibconfigFolder();

		/**
		 * The meta object literal for the '<em><b>Tasking Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__TASKING_VERSION = eINSTANCE.getGenerationConfiguration_TaskingVersion();

		/**
		 * The meta object literal for the '<em><b>Tasking Environment Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION = eINSTANCE.getGenerationConfiguration_TaskingEnvironmentConfiguration();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ElementConfigurationImpl <em>Element Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ElementConfigurationImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl#getElementConfiguration()
		 * @generated
		 */
		EClass ELEMENT_CONFIGURATION = eINSTANCE.getElementConfiguration();

		/**
		 * The meta object literal for the '<em><b>Implementation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME = eINSTANCE.getElementConfiguration_ImplementationName();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TaskingEnvironmentConfigurationImpl <em>Tasking Environment Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TaskingEnvironmentConfigurationImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationPackageImpl#getTaskingEnvironmentConfiguration()
		 * @generated
		 */
		EClass TASKING_ENVIRONMENT_CONFIGURATION = eINSTANCE.getTaskingEnvironmentConfiguration();

		/**
		 * The meta object literal for the '<em><b>Domain Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT = eINSTANCE.getTaskingEnvironmentConfiguration_DomainElement();

	}

} //ConfigurationPackage
