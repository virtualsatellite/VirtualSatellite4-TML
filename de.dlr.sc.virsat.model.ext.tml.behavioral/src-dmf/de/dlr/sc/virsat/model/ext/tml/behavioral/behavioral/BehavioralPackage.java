/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral;

import de.dlr.sc.virsat.model.ext.core.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralFactory
 * @model kind="package"
 * @generated
 */
public interface BehavioralPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavioral";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.virsat.sc.dlr.de/dmf/v1.1/behavioral";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmf_behavioral";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehavioralPackage eINSTANCE = de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralParameterDefinitionImpl <em>Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralParameterDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getBehavioralParameterDefinition()
	 * @generated
	 */
	int BEHAVIORAL_PARAMETER_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_PARAMETER_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_PARAMETER_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_PARAMETER_DEFINITION__IS_STATIC = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_PARAMETER_DEFINITION__VALUE_TYPE = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_PARAMETER_DEFINITION__VALUE = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_PARAMETER_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_PARAMETER_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorDefinitionImpl <em>Channel Behavior Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getChannelBehaviorDefinition()
	 * @generated
	 */
	int CHANNEL_BEHAVIOR_DEFINITION = 1;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefintionStorageImpl <em>Behavior Defintion Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefintionStorageImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getBehaviorDefintionStorage()
	 * @generated
	 */
	int BEHAVIOR_DEFINTION_STORAGE = 2;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefinitionImpl <em>Behavior Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getBehaviorDefinition()
	 * @generated
	 */
	int BEHAVIOR_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINITION__PARAMETERS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_DEFINITION__UUID = BEHAVIOR_DEFINITION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_DEFINITION__NAME = BEHAVIOR_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_DEFINITION__PARAMETERS = BEHAVIOR_DEFINITION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_DEFINITION__STORAGE_TYPE = BEHAVIOR_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impl Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_DEFINITION__IMPL_NAME = BEHAVIOR_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serialized Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_DEFINITION__SERIALIZED_DEFINITION = BEHAVIOR_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Channel Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_DEFINITION_FEATURE_COUNT = BEHAVIOR_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Channel Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_DEFINITION_OPERATION_COUNT = BEHAVIOR_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINTION_STORAGE__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINTION_STORAGE__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Channel Behavior Defintions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Defintion Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINTION_STORAGE_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavior Defintion Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEFINTION_STORAGE_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.TimeEventBehaviorDefinitionImpl <em>Time Event Behavior Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.TimeEventBehaviorDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getTimeEventBehaviorDefinition()
	 * @generated
	 */
	int TIME_EVENT_BEHAVIOR_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_BEHAVIOR_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_BEHAVIOR_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>Time Event Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_BEHAVIOR_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Event Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_BEHAVIOR_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.TaskBehaviorImpl <em>Task Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.TaskBehaviorImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getTaskBehavior()
	 * @generated
	 */
	int TASK_BEHAVIOR = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BEHAVIOR__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BEHAVIOR__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>Task Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BEHAVIOR_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BEHAVIOR_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorParameterImpl <em>Behavior Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorParameterImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getBehaviorParameter()
	 * @generated
	 */
	int BEHAVIOR_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_PARAMETER__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_PARAMETER__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_PARAMETER__TYPE_OF = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_PARAMETER__VALUE = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_PARAMETER_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behavior Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_PARAMETER_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorImpl <em>Channel Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getChannelBehavior()
	 * @generated
	 */
	int CHANNEL_BEHAVIOR = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR__TYPE_OF = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR__PARAMETER_INSTANCES = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Channel Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Channel Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BEHAVIOR_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType <em>Enum Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getEnumValueType()
	 * @generated
	 */
	int ENUM_VALUE_TYPE = 8;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType <em>Enum Storage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getEnumStorageType()
	 * @generated
	 */
	int ENUM_STORAGE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition
	 * @generated
	 */
	EClass getBehavioralParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#isIsStatic()
	 * @see #getBehavioralParameterDefinition()
	 * @generated
	 */
	EAttribute getBehavioralParameterDefinition_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#getValueType()
	 * @see #getBehavioralParameterDefinition()
	 * @generated
	 */
	EAttribute getBehavioralParameterDefinition_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#getValue()
	 * @see #getBehavioralParameterDefinition()
	 * @generated
	 */
	EAttribute getBehavioralParameterDefinition_Value();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition <em>Channel Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Behavior Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition
	 * @generated
	 */
	EClass getChannelBehaviorDefinition();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getStorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getStorageType()
	 * @see #getChannelBehaviorDefinition()
	 * @generated
	 */
	EAttribute getChannelBehaviorDefinition_StorageType();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getImplName <em>Impl Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl Name</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getImplName()
	 * @see #getChannelBehaviorDefinition()
	 * @generated
	 */
	EAttribute getChannelBehaviorDefinition_ImplName();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getSerializedDefinition <em>Serialized Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serialized Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getSerializedDefinition()
	 * @see #getChannelBehaviorDefinition()
	 * @generated
	 */
	EAttribute getChannelBehaviorDefinition_SerializedDefinition();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage <em>Behavior Defintion Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Defintion Storage</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage
	 * @generated
	 */
	EClass getBehaviorDefintionStorage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage#getChannelBehaviorDefintions <em>Channel Behavior Defintions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel Behavior Defintions</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage#getChannelBehaviorDefintions()
	 * @see #getBehaviorDefintionStorage()
	 * @generated
	 */
	EReference getBehaviorDefintionStorage_ChannelBehaviorDefintions();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefinition <em>Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefinition
	 * @generated
	 */
	EClass getBehaviorDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefinition#getParameters()
	 * @see #getBehaviorDefinition()
	 * @generated
	 */
	EReference getBehaviorDefinition_Parameters();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TimeEventBehaviorDefinition <em>Time Event Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Event Behavior Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TimeEventBehaviorDefinition
	 * @generated
	 */
	EClass getTimeEventBehaviorDefinition();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TaskBehavior <em>Task Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Behavior</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TaskBehavior
	 * @generated
	 */
	EClass getTaskBehavior();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter <em>Behavior Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Parameter</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter
	 * @generated
	 */
	EClass getBehaviorParameter();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter#getTypeOf()
	 * @see #getBehaviorParameter()
	 * @generated
	 */
	EReference getBehaviorParameter_TypeOf();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter#getValue()
	 * @see #getBehaviorParameter()
	 * @generated
	 */
	EAttribute getBehaviorParameter_Value();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior <em>Channel Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Behavior</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior
	 * @generated
	 */
	EClass getChannelBehavior();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior#getTypeOf()
	 * @see #getChannelBehavior()
	 * @generated
	 */
	EReference getChannelBehavior_TypeOf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior#getParameterInstances <em>Parameter Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Instances</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior#getParameterInstances()
	 * @see #getChannelBehavior()
	 * @generated
	 */
	EReference getChannelBehavior_ParameterInstances();

	/**
	 * Returns the meta object for enum '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType <em>Enum Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Value Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType
	 * @generated
	 */
	EEnum getEnumValueType();

	/**
	 * Returns the meta object for enum '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType <em>Enum Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Storage Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType
	 * @generated
	 */
	EEnum getEnumStorageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehavioralFactory getBehavioralFactory();

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
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralParameterDefinitionImpl <em>Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralParameterDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getBehavioralParameterDefinition()
		 * @generated
		 */
		EClass BEHAVIORAL_PARAMETER_DEFINITION = eINSTANCE.getBehavioralParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIORAL_PARAMETER_DEFINITION__IS_STATIC = eINSTANCE.getBehavioralParameterDefinition_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIORAL_PARAMETER_DEFINITION__VALUE_TYPE = eINSTANCE.getBehavioralParameterDefinition_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIORAL_PARAMETER_DEFINITION__VALUE = eINSTANCE.getBehavioralParameterDefinition_Value();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorDefinitionImpl <em>Channel Behavior Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getChannelBehaviorDefinition()
		 * @generated
		 */
		EClass CHANNEL_BEHAVIOR_DEFINITION = eINSTANCE.getChannelBehaviorDefinition();

		/**
		 * The meta object literal for the '<em><b>Storage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_BEHAVIOR_DEFINITION__STORAGE_TYPE = eINSTANCE.getChannelBehaviorDefinition_StorageType();

		/**
		 * The meta object literal for the '<em><b>Impl Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_BEHAVIOR_DEFINITION__IMPL_NAME = eINSTANCE.getChannelBehaviorDefinition_ImplName();

		/**
		 * The meta object literal for the '<em><b>Serialized Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_BEHAVIOR_DEFINITION__SERIALIZED_DEFINITION = eINSTANCE.getChannelBehaviorDefinition_SerializedDefinition();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefintionStorageImpl <em>Behavior Defintion Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefintionStorageImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getBehaviorDefintionStorage()
		 * @generated
		 */
		EClass BEHAVIOR_DEFINTION_STORAGE = eINSTANCE.getBehaviorDefintionStorage();

		/**
		 * The meta object literal for the '<em><b>Channel Behavior Defintions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS = eINSTANCE.getBehaviorDefintionStorage_ChannelBehaviorDefintions();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefinitionImpl <em>Behavior Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getBehaviorDefinition()
		 * @generated
		 */
		EClass BEHAVIOR_DEFINITION = eINSTANCE.getBehaviorDefinition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DEFINITION__PARAMETERS = eINSTANCE.getBehaviorDefinition_Parameters();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.TimeEventBehaviorDefinitionImpl <em>Time Event Behavior Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.TimeEventBehaviorDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getTimeEventBehaviorDefinition()
		 * @generated
		 */
		EClass TIME_EVENT_BEHAVIOR_DEFINITION = eINSTANCE.getTimeEventBehaviorDefinition();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.TaskBehaviorImpl <em>Task Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.TaskBehaviorImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getTaskBehavior()
		 * @generated
		 */
		EClass TASK_BEHAVIOR = eINSTANCE.getTaskBehavior();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorParameterImpl <em>Behavior Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorParameterImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getBehaviorParameter()
		 * @generated
		 */
		EClass BEHAVIOR_PARAMETER = eINSTANCE.getBehaviorParameter();

		/**
		 * The meta object literal for the '<em><b>Type Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_PARAMETER__TYPE_OF = eINSTANCE.getBehaviorParameter_TypeOf();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_PARAMETER__VALUE = eINSTANCE.getBehaviorParameter_Value();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorImpl <em>Channel Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getChannelBehavior()
		 * @generated
		 */
		EClass CHANNEL_BEHAVIOR = eINSTANCE.getChannelBehavior();

		/**
		 * The meta object literal for the '<em><b>Type Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_BEHAVIOR__TYPE_OF = eINSTANCE.getChannelBehavior_TypeOf();

		/**
		 * The meta object literal for the '<em><b>Parameter Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_BEHAVIOR__PARAMETER_INSTANCES = eINSTANCE.getChannelBehavior_ParameterInstances();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType <em>Enum Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getEnumValueType()
		 * @generated
		 */
		EEnum ENUM_VALUE_TYPE = eINSTANCE.getEnumValueType();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType <em>Enum Storage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType
		 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralPackageImpl#getEnumStorageType()
		 * @generated
		 */
		EEnum ENUM_STORAGE_TYPE = eINSTANCE.getEnumStorageType();

	}

} //BehavioralPackage
