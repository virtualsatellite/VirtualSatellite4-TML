/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dlr.sc.virsat.model.ext.core.core.CorePackage;

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
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory
 * @model kind="package"
 * @generated
 */
public interface StructuralPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structural";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.virsat.sc.dlr.de/dmf/v1.7/structural";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmf_structural";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuralPackage eINSTANCE = de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl <em>Tasking Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskingDefinition()
	 * @generated
	 */
	int TASKING_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Basic Type Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__ENUMERATIONS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__DATA_TYPES = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__EXTERNAL_TYPES = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Channel Behavior Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__TASK_DEFINITIONS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reference Frames</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__REFERENCE_FRAMES = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION__UNITS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tasking Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Tasking Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl <em>Tasking Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskingEnvironment()
	 * @generated
	 */
	int TASKING_ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__TASKS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__CHANNELS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__TIME_EVENTS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Global Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__GLOBAL_PARAMETERS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Diagram Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schedular Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__SCHEDULAR_POLICY = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number Of Executors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tasking Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tasking Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKING_ENVIRONMENT_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.IEventSourceImpl <em>IEvent Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.IEventSourceImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getIEventSource()
	 * @generated
	 */
	int IEVENT_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_SOURCE__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_SOURCE__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_SOURCE__INPUTS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEvent Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_SOURCE_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEvent Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_SOURCE_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ITypeImpl <em>IType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ITypeImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getIType()
	 * @generated
	 */
	int ITYPE = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>IType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskDefinition()
	 * @generated
	 */
	int TASK_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__INPUTS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__OUTPUTS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__PARAMETERS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serialized Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__SERIALIZED_DEFINITION = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schedule Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__SCHEDULE_POLICY = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputDefinitionImpl <em>Task Input Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskInputDefinition()
	 * @generated
	 */
	int TASK_INPUT_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_DEFINITION__DATA_TYPE = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Input Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Input Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskOutputDefinitionImpl <em>Task Output Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskOutputDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskOutputDefinition()
	 * @generated
	 */
	int TASK_OUTPUT_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_DEFINITION__DATA_TYPE = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Output Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Output Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl <em>Basic Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getBasicTypeDefinition()
	 * @generated
	 */
	int BASIC_TYPE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION__UUID = ITYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION__NAME = ITYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION__VALUE_TYPE = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION__SIZE = ITYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION__SOURCE = ITYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Custom Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION__CUSTOM_SOURCE = ITYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Basic Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Basic Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION_OPERATION_COUNT = ITYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ReferenceFrameDefinitionImpl <em>Reference Frame Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ReferenceFrameDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getReferenceFrameDefinition()
	 * @generated
	 */
	int REFERENCE_FRAME_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FRAME_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FRAME_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>Reference Frame Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FRAME_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Frame Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FRAME_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.UnitDefinitionImpl <em>Unit Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.UnitDefinitionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getUnitDefinition()
	 * @generated
	 */
	int UNIT_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The number of structural features of the '<em>Unit Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unit Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl <em>Task Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskInstance()
	 * @generated
	 */
	int TASK_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__TYPE_OF = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__PRIORITY = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__TASK_BEHAVIOR = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__OUTPUTS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE__INPUTS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INSTANCE_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputImpl <em>Task Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskInput()
	 * @generated
	 */
	int TASK_INPUT = 11;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__TYPE_OF = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__TRIGGER = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activation Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__ACTIVATION_THRESHOLD = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__IS_FINAL = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskOutputImpl <em>Task Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskOutputImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskOutput()
	 * @generated
	 */
	int TASK_OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__TYPE_OF = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__CHANNELS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TimeEventImpl <em>Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TimeEventImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTimeEvent()
	 * @generated
	 */
	int TIME_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__UUID = IEVENT_SOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__NAME = IEVENT_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__INPUTS = IEVENT_SOURCE__INPUTS;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__PERIOD = IEVENT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__OFFSET = IEVENT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_FEATURE_COUNT = IEVENT_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_OPERATION_COUNT = IEVENT_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ChannelImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 14;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__UUID = IEVENT_SOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = IEVENT_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__INPUTS = IEVENT_SOURCE__INPUTS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DATA_TYPE = IEVENT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channel Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL_BEHAVIOR = IEVENT_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = IEVENT_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = IEVENT_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UUID = ITYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = ITYPE__NAME;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUPER_TYPE = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ATTRIBUTES = ITYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ABSTRACT_TYPE = ITYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is TM Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_TM_TYPE = ITYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Serialized Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SERIALIZED_DEFINITION = ITYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ITYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ExternalTypeImpl <em>External Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ExternalTypeImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getExternalType()
	 * @generated
	 */
	int EXTERNAL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__UUID = DATA_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__SUPER_TYPE = DATA_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__ATTRIBUTES = DATA_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__ABSTRACT_TYPE = DATA_TYPE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Is TM Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__IS_TM_TYPE = DATA_TYPE__IS_TM_TYPE;

	/**
	 * The feature id for the '<em><b>Serialized Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__SERIALIZED_DEFINITION = DATA_TYPE__SERIALIZED_DEFINITION;

	/**
	 * The number of structural features of the '<em>External Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE_OF = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DIMENSIONS = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REFERENCE_FRAME = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE_UNIT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_CONST = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE_LITERAL = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MAX_VALUE_LITERAL = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MIN_VALUE_LITERAL = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ArrayDimensionImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getArrayDimension()
	 * @generated
	 */
	int ARRAY_DIMENSION = 18;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__SIZE = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 19;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__UUID = ITYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = ITYPE__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serialized Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SERIALIZED_DEFINITION = ITYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = ITYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationLiteralImpl
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__UUID = CorePackage.GENERIC_CATEGORY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = CorePackage.GENERIC_CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Key Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__KEY_NUM = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = CorePackage.GENERIC_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = CorePackage.GENERIC_CATEGORY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy <em>Enum Schedular Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumSchedularPolicy()
	 * @generated
	 */
	int ENUM_SCHEDULAR_POLICY = 21;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy <em>Enum Schedule Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumSchedulePolicy()
	 * @generated
	 */
	int ENUM_SCHEDULE_POLICY = 22;

	/**
	 * The meta object id for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType <em>Enum Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumValueType()
	 * @generated
	 */
	int ENUM_VALUE_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition <em>Tasking Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasking Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition
	 * @generated
	 */
	EClass getTaskingDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getBasicTypeDefinitions <em>Basic Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Type Definitions</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getBasicTypeDefinitions()
	 * @see #getTaskingDefinition()
	 * @generated
	 */
	EReference getTaskingDefinition_BasicTypeDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getEnumerations()
	 * @see #getTaskingDefinition()
	 * @generated
	 */
	EReference getTaskingDefinition_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getDataTypes()
	 * @see #getTaskingDefinition()
	 * @generated
	 */
	EReference getTaskingDefinition_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getExternalTypes <em>External Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Types</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getExternalTypes()
	 * @see #getTaskingDefinition()
	 * @generated
	 */
	EReference getTaskingDefinition_ExternalTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getChannelBehaviorDefinitions <em>Channel Behavior Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel Behavior Definitions</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getChannelBehaviorDefinitions()
	 * @see #getTaskingDefinition()
	 * @generated
	 */
	EReference getTaskingDefinition_ChannelBehaviorDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getTaskDefinitions <em>Task Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Definitions</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getTaskDefinitions()
	 * @see #getTaskingDefinition()
	 * @generated
	 */
	EReference getTaskingDefinition_TaskDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getReferenceFrames <em>Reference Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Frames</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getReferenceFrames()
	 * @see #getTaskingDefinition()
	 * @generated
	 */
	EReference getTaskingDefinition_ReferenceFrames();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getUnits()
	 * @see #getTaskingDefinition()
	 * @generated
	 */
	EReference getTaskingDefinition_Units();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment <em>Tasking Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasking Environment</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
	 * @generated
	 */
	EClass getTaskingEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getTasks()
	 * @see #getTaskingEnvironment()
	 * @generated
	 */
	EReference getTaskingEnvironment_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getChannels()
	 * @see #getTaskingEnvironment()
	 * @generated
	 */
	EReference getTaskingEnvironment_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getTimeEvents <em>Time Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Events</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getTimeEvents()
	 * @see #getTaskingEnvironment()
	 * @generated
	 */
	EReference getTaskingEnvironment_TimeEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getGlobalParameters <em>Global Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Parameters</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getGlobalParameters()
	 * @see #getTaskingEnvironment()
	 * @generated
	 */
	EReference getTaskingEnvironment_GlobalParameters();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getLastDiagramChange <em>Last Diagram Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Diagram Change</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getLastDiagramChange()
	 * @see #getTaskingEnvironment()
	 * @generated
	 */
	EAttribute getTaskingEnvironment_LastDiagramChange();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getSchedularPolicy <em>Schedular Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedular Policy</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getSchedularPolicy()
	 * @see #getTaskingEnvironment()
	 * @generated
	 */
	EAttribute getTaskingEnvironment_SchedularPolicy();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getNumberOfExecutors <em>Number Of Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Executors</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getNumberOfExecutors()
	 * @see #getTaskingEnvironment()
	 * @generated
	 */
	EAttribute getTaskingEnvironment_NumberOfExecutors();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource <em>IEvent Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEvent Source</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource
	 * @generated
	 */
	EClass getIEventSource();

	/**
	 * Returns the meta object for the reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource#getInputs()
	 * @see #getIEventSource()
	 * @generated
	 */
	EReference getIEventSource_Inputs();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.IType <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IType</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.IType
	 * @generated
	 */
	EClass getIType();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition
	 * @generated
	 */
	EClass getTaskDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getInputs()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getOutputs()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getParameters()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getSerializedDefinition <em>Serialized Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serialized Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getSerializedDefinition()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EAttribute getTaskDefinition_SerializedDefinition();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getSchedulePolicy <em>Schedule Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Policy</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getSchedulePolicy()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EAttribute getTaskDefinition_SchedulePolicy();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition <em>Task Input Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Input Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition
	 * @generated
	 */
	EClass getTaskInputDefinition();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition#getDataType()
	 * @see #getTaskInputDefinition()
	 * @generated
	 */
	EReference getTaskInputDefinition_DataType();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition <em>Task Output Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Output Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition
	 * @generated
	 */
	EClass getTaskOutputDefinition();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition#getDataType()
	 * @see #getTaskOutputDefinition()
	 * @generated
	 */
	EReference getTaskOutputDefinition_DataType();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition <em>Basic Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition
	 * @generated
	 */
	EClass getBasicTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getValueType()
	 * @see #getBasicTypeDefinition()
	 * @generated
	 */
	EAttribute getBasicTypeDefinition_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getSize()
	 * @see #getBasicTypeDefinition()
	 * @generated
	 */
	EAttribute getBasicTypeDefinition_Size();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getSource()
	 * @see #getBasicTypeDefinition()
	 * @generated
	 */
	EAttribute getBasicTypeDefinition_Source();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#isCustomSource <em>Custom Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Source</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#isCustomSource()
	 * @see #getBasicTypeDefinition()
	 * @generated
	 */
	EAttribute getBasicTypeDefinition_CustomSource();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition <em>Reference Frame Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Frame Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition
	 * @generated
	 */
	EClass getReferenceFrameDefinition();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition
	 * @generated
	 */
	EClass getUnitDefinition();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance <em>Task Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Instance</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance
	 * @generated
	 */
	EClass getTaskInstance();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getTypeOf()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EReference getTaskInstance_TypeOf();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getPriority()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EAttribute getTaskInstance_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getTaskBehavior <em>Task Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Behavior</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getTaskBehavior()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EReference getTaskInstance_TaskBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getOutputs()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EReference getTaskInstance_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getInputs()
	 * @see #getTaskInstance()
	 * @generated
	 */
	EReference getTaskInstance_Inputs();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput <em>Task Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Input</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput
	 * @generated
	 */
	EClass getTaskInput();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput#getTypeOf()
	 * @see #getTaskInput()
	 * @generated
	 */
	EReference getTaskInput_TypeOf();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput#getTrigger()
	 * @see #getTaskInput()
	 * @generated
	 */
	EReference getTaskInput_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput#getActivationThreshold <em>Activation Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Threshold</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput#getActivationThreshold()
	 * @see #getTaskInput()
	 * @generated
	 */
	EAttribute getTaskInput_ActivationThreshold();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput#isIsFinal()
	 * @see #getTaskInput()
	 * @generated
	 */
	EAttribute getTaskInput_IsFinal();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput <em>Task Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Output</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput
	 * @generated
	 */
	EClass getTaskOutput();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput#getTypeOf()
	 * @see #getTaskOutput()
	 * @generated
	 */
	EReference getTaskOutput_TypeOf();

	/**
	 * Returns the meta object for the reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput#getChannels()
	 * @see #getTaskOutput()
	 * @generated
	 */
	EReference getTaskOutput_Channels();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent <em>Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Event</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent
	 * @generated
	 */
	EClass getTimeEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent#getPeriod()
	 * @see #getTimeEvent()
	 * @generated
	 */
	EAttribute getTimeEvent_Period();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent#getOffset()
	 * @see #getTimeEvent()
	 * @generated
	 */
	EAttribute getTimeEvent_Offset();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel#getDataType()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel#getChannelBehavior <em>Channel Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Behavior</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel#getChannelBehavior()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_ChannelBehavior();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getSuperType()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_SuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getAttributes()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#isAbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#isAbstractType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_AbstractType();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#isIsTMType <em>Is TM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is TM Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#isIsTMType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_IsTMType();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getSerializedDefinition <em>Serialized Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serialized Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getSerializedDefinition()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_SerializedDefinition();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ExternalType <em>External Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.ExternalType
	 * @generated
	 */
	EClass getExternalType();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getTypeOf()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_TypeOf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getDimensions()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Dimensions();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getReferenceFrame <em>Reference Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Frame</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getReferenceFrame()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ReferenceFrame();

	/**
	 * Returns the meta object for the reference '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getTypeUnit <em>Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Unit</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getTypeUnit()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_TypeUnit();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#isIsConst()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getValueLiteral()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_ValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getMaxValueLiteral <em>Max Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value Literal</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getMaxValueLiteral()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MaxValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getMinValueLiteral <em>Min Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value Literal</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getMinValueLiteral()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MinValueLiteral();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Dimension</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension
	 * @generated
	 */
	EClass getArrayDimension();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension#getSize()
	 * @see #getArrayDimension()
	 * @generated
	 */
	EAttribute getArrayDimension_Size();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration#getSerializedDefinition <em>Serialized Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serialized Definition</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration#getSerializedDefinition()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_SerializedDefinition();

	/**
	 * Returns the meta object for class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral#getKeyNum <em>Key Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Num</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral#getKeyNum()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_KeyNum();

	/**
	 * Returns the meta object for enum '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy <em>Enum Schedular Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Schedular Policy</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy
	 * @generated
	 */
	EEnum getEnumSchedularPolicy();

	/**
	 * Returns the meta object for enum '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy <em>Enum Schedule Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Schedule Policy</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy
	 * @generated
	 */
	EEnum getEnumSchedulePolicy();

	/**
	 * Returns the meta object for enum '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType <em>Enum Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Value Type</em>'.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType
	 * @generated
	 */
	EEnum getEnumValueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuralFactory getStructuralFactory();

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
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl <em>Tasking Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskingDefinition()
		 * @generated
		 */
		EClass TASKING_DEFINITION = eINSTANCE.getTaskingDefinition();

		/**
		 * The meta object literal for the '<em><b>Basic Type Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS = eINSTANCE.getTaskingDefinition_BasicTypeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_DEFINITION__ENUMERATIONS = eINSTANCE.getTaskingDefinition_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_DEFINITION__DATA_TYPES = eINSTANCE.getTaskingDefinition_DataTypes();

		/**
		 * The meta object literal for the '<em><b>External Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_DEFINITION__EXTERNAL_TYPES = eINSTANCE.getTaskingDefinition_ExternalTypes();

		/**
		 * The meta object literal for the '<em><b>Channel Behavior Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS = eINSTANCE.getTaskingDefinition_ChannelBehaviorDefinitions();

		/**
		 * The meta object literal for the '<em><b>Task Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_DEFINITION__TASK_DEFINITIONS = eINSTANCE.getTaskingDefinition_TaskDefinitions();

		/**
		 * The meta object literal for the '<em><b>Reference Frames</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_DEFINITION__REFERENCE_FRAMES = eINSTANCE.getTaskingDefinition_ReferenceFrames();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_DEFINITION__UNITS = eINSTANCE.getTaskingDefinition_Units();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl <em>Tasking Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskingEnvironment()
		 * @generated
		 */
		EClass TASKING_ENVIRONMENT = eINSTANCE.getTaskingEnvironment();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_ENVIRONMENT__TASKS = eINSTANCE.getTaskingEnvironment_Tasks();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_ENVIRONMENT__CHANNELS = eINSTANCE.getTaskingEnvironment_Channels();

		/**
		 * The meta object literal for the '<em><b>Time Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_ENVIRONMENT__TIME_EVENTS = eINSTANCE.getTaskingEnvironment_TimeEvents();

		/**
		 * The meta object literal for the '<em><b>Global Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKING_ENVIRONMENT__GLOBAL_PARAMETERS = eINSTANCE.getTaskingEnvironment_GlobalParameters();

		/**
		 * The meta object literal for the '<em><b>Last Diagram Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE = eINSTANCE.getTaskingEnvironment_LastDiagramChange();

		/**
		 * The meta object literal for the '<em><b>Schedular Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASKING_ENVIRONMENT__SCHEDULAR_POLICY = eINSTANCE.getTaskingEnvironment_SchedularPolicy();

		/**
		 * The meta object literal for the '<em><b>Number Of Executors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS = eINSTANCE.getTaskingEnvironment_NumberOfExecutors();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.IEventSourceImpl <em>IEvent Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.IEventSourceImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getIEventSource()
		 * @generated
		 */
		EClass IEVENT_SOURCE = eINSTANCE.getIEventSource();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEVENT_SOURCE__INPUTS = eINSTANCE.getIEventSource_Inputs();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ITypeImpl <em>IType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ITypeImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getIType()
		 * @generated
		 */
		EClass ITYPE = eINSTANCE.getIType();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskDefinition()
		 * @generated
		 */
		EClass TASK_DEFINITION = eINSTANCE.getTaskDefinition();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__INPUTS = eINSTANCE.getTaskDefinition_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__OUTPUTS = eINSTANCE.getTaskDefinition_Outputs();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__PARAMETERS = eINSTANCE.getTaskDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Serialized Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEFINITION__SERIALIZED_DEFINITION = eINSTANCE.getTaskDefinition_SerializedDefinition();

		/**
		 * The meta object literal for the '<em><b>Schedule Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEFINITION__SCHEDULE_POLICY = eINSTANCE.getTaskDefinition_SchedulePolicy();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputDefinitionImpl <em>Task Input Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskInputDefinition()
		 * @generated
		 */
		EClass TASK_INPUT_DEFINITION = eINSTANCE.getTaskInputDefinition();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INPUT_DEFINITION__DATA_TYPE = eINSTANCE.getTaskInputDefinition_DataType();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskOutputDefinitionImpl <em>Task Output Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskOutputDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskOutputDefinition()
		 * @generated
		 */
		EClass TASK_OUTPUT_DEFINITION = eINSTANCE.getTaskOutputDefinition();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT_DEFINITION__DATA_TYPE = eINSTANCE.getTaskOutputDefinition_DataType();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl <em>Basic Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getBasicTypeDefinition()
		 * @generated
		 */
		EClass BASIC_TYPE_DEFINITION = eINSTANCE.getBasicTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_TYPE_DEFINITION__VALUE_TYPE = eINSTANCE.getBasicTypeDefinition_ValueType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_TYPE_DEFINITION__SIZE = eINSTANCE.getBasicTypeDefinition_Size();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_TYPE_DEFINITION__SOURCE = eINSTANCE.getBasicTypeDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Custom Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_TYPE_DEFINITION__CUSTOM_SOURCE = eINSTANCE.getBasicTypeDefinition_CustomSource();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ReferenceFrameDefinitionImpl <em>Reference Frame Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ReferenceFrameDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getReferenceFrameDefinition()
		 * @generated
		 */
		EClass REFERENCE_FRAME_DEFINITION = eINSTANCE.getReferenceFrameDefinition();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.UnitDefinitionImpl <em>Unit Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.UnitDefinitionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getUnitDefinition()
		 * @generated
		 */
		EClass UNIT_DEFINITION = eINSTANCE.getUnitDefinition();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl <em>Task Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskInstance()
		 * @generated
		 */
		EClass TASK_INSTANCE = eINSTANCE.getTaskInstance();

		/**
		 * The meta object literal for the '<em><b>Type Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INSTANCE__TYPE_OF = eINSTANCE.getTaskInstance_TypeOf();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_INSTANCE__PRIORITY = eINSTANCE.getTaskInstance_Priority();

		/**
		 * The meta object literal for the '<em><b>Task Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INSTANCE__TASK_BEHAVIOR = eINSTANCE.getTaskInstance_TaskBehavior();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INSTANCE__OUTPUTS = eINSTANCE.getTaskInstance_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INSTANCE__INPUTS = eINSTANCE.getTaskInstance_Inputs();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputImpl <em>Task Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskInput()
		 * @generated
		 */
		EClass TASK_INPUT = eINSTANCE.getTaskInput();

		/**
		 * The meta object literal for the '<em><b>Type Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INPUT__TYPE_OF = eINSTANCE.getTaskInput_TypeOf();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INPUT__TRIGGER = eINSTANCE.getTaskInput_Trigger();

		/**
		 * The meta object literal for the '<em><b>Activation Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_INPUT__ACTIVATION_THRESHOLD = eINSTANCE.getTaskInput_ActivationThreshold();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_INPUT__IS_FINAL = eINSTANCE.getTaskInput_IsFinal();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskOutputImpl <em>Task Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskOutputImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTaskOutput()
		 * @generated
		 */
		EClass TASK_OUTPUT = eINSTANCE.getTaskOutput();

		/**
		 * The meta object literal for the '<em><b>Type Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT__TYPE_OF = eINSTANCE.getTaskOutput_TypeOf();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT__CHANNELS = eINSTANCE.getTaskOutput_Channels();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TimeEventImpl <em>Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TimeEventImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getTimeEvent()
		 * @generated
		 */
		EClass TIME_EVENT = eINSTANCE.getTimeEvent();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EVENT__PERIOD = eINSTANCE.getTimeEvent_Period();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EVENT__OFFSET = eINSTANCE.getTimeEvent_Offset();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ChannelImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__DATA_TYPE = eINSTANCE.getChannel_DataType();

		/**
		 * The meta object literal for the '<em><b>Channel Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__CHANNEL_BEHAVIOR = eINSTANCE.getChannel_ChannelBehavior();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__SUPER_TYPE = eINSTANCE.getDataType_SuperType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__ATTRIBUTES = eINSTANCE.getDataType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Abstract Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__ABSTRACT_TYPE = eINSTANCE.getDataType_AbstractType();

		/**
		 * The meta object literal for the '<em><b>Is TM Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__IS_TM_TYPE = eINSTANCE.getDataType_IsTMType();

		/**
		 * The meta object literal for the '<em><b>Serialized Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SERIALIZED_DEFINITION = eINSTANCE.getDataType_SerializedDefinition();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ExternalTypeImpl <em>External Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ExternalTypeImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getExternalType()
		 * @generated
		 */
		EClass EXTERNAL_TYPE = eINSTANCE.getExternalType();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE_OF = eINSTANCE.getAttribute_TypeOf();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DIMENSIONS = eINSTANCE.getAttribute_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Reference Frame</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__REFERENCE_FRAME = eINSTANCE.getAttribute_ReferenceFrame();

		/**
		 * The meta object literal for the '<em><b>Type Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE_UNIT = eINSTANCE.getAttribute_TypeUnit();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_CONST = eINSTANCE.getAttribute_IsConst();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE_LITERAL = eINSTANCE.getAttribute_ValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Max Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MAX_VALUE_LITERAL = eINSTANCE.getAttribute_MaxValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Min Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MIN_VALUE_LITERAL = eINSTANCE.getAttribute_MinValueLiteral();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ArrayDimensionImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getArrayDimension()
		 * @generated
		 */
		EClass ARRAY_DIMENSION = eINSTANCE.getArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_DIMENSION__SIZE = eINSTANCE.getArrayDimension_Size();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '<em><b>Serialized Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__SERIALIZED_DEFINITION = eINSTANCE.getEnumeration_SerializedDefinition();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationLiteralImpl
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Key Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__KEY_NUM = eINSTANCE.getEnumerationLiteral_KeyNum();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy <em>Enum Schedular Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumSchedularPolicy()
		 * @generated
		 */
		EEnum ENUM_SCHEDULAR_POLICY = eINSTANCE.getEnumSchedularPolicy();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy <em>Enum Schedule Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumSchedulePolicy()
		 * @generated
		 */
		EEnum ENUM_SCHEDULE_POLICY = eINSTANCE.getEnumSchedulePolicy();

		/**
		 * The meta object literal for the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType <em>Enum Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType
		 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.StructuralPackageImpl#getEnumValueType()
		 * @generated
		 */
		EEnum ENUM_VALUE_TYPE = eINSTANCE.getEnumValueType();

	}

} //StructuralPackage
