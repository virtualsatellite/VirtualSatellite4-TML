/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.dvlm.DVLMPackage;
import de.dlr.sc.virsat.model.ext.core.core.CorePackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ExternalType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition;

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
public class StructuralPackageImpl extends EPackageImpl implements StructuralPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskingDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskingEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEventSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskInputDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskOutputDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceFrameDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchedularPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchedulePolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumValueTypeEEnum = null;

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
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructuralPackageImpl() {
		super(eNS_URI, StructuralFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructuralPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructuralPackage init() {
		if (isInited) return (StructuralPackage)EPackage.Registry.INSTANCE.getEPackage(StructuralPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStructuralPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StructuralPackageImpl theStructuralPackage = registeredStructuralPackage instanceof StructuralPackageImpl ? (StructuralPackageImpl)registeredStructuralPackage : new StructuralPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DVLMPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		BehavioralPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStructuralPackage.createPackageContents();

		// Initialize created meta-data
		theStructuralPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructuralPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructuralPackage.eNS_URI, theStructuralPackage);
		return theStructuralPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskingDefinition() {
		return taskingDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingDefinition_BasicTypeDefinitions() {
		return (EReference)taskingDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingDefinition_Enumerations() {
		return (EReference)taskingDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingDefinition_DataTypes() {
		return (EReference)taskingDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingDefinition_ExternalTypes() {
		return (EReference)taskingDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingDefinition_ChannelBehaviorDefinitions() {
		return (EReference)taskingDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingDefinition_TaskDefinitions() {
		return (EReference)taskingDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingDefinition_ReferenceFrames() {
		return (EReference)taskingDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingDefinition_Units() {
		return (EReference)taskingDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskingEnvironment() {
		return taskingEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingEnvironment_Tasks() {
		return (EReference)taskingEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingEnvironment_Channels() {
		return (EReference)taskingEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingEnvironment_TimeEvents() {
		return (EReference)taskingEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskingEnvironment_GlobalParameters() {
		return (EReference)taskingEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskingEnvironment_LastDiagramChange() {
		return (EAttribute)taskingEnvironmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskingEnvironment_SchedularPolicy() {
		return (EAttribute)taskingEnvironmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskingEnvironment_NumberOfExecutors() {
		return (EAttribute)taskingEnvironmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIEventSource() {
		return iEventSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIEventSource_Inputs() {
		return (EReference)iEventSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIType() {
		return iTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskDefinition() {
		return taskDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskDefinition_Inputs() {
		return (EReference)taskDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskDefinition_Outputs() {
		return (EReference)taskDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskDefinition_Parameters() {
		return (EReference)taskDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskDefinition_SerializedDefinition() {
		return (EAttribute)taskDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskDefinition_SchedulePolicy() {
		return (EAttribute)taskDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskInputDefinition() {
		return taskInputDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskInputDefinition_DataType() {
		return (EReference)taskInputDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskOutputDefinition() {
		return taskOutputDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskOutputDefinition_DataType() {
		return (EReference)taskOutputDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicTypeDefinition() {
		return basicTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicTypeDefinition_ValueType() {
		return (EAttribute)basicTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicTypeDefinition_Size() {
		return (EAttribute)basicTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicTypeDefinition_Source() {
		return (EAttribute)basicTypeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicTypeDefinition_CustomSource() {
		return (EAttribute)basicTypeDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceFrameDefinition() {
		return referenceFrameDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitDefinition() {
		return unitDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskInstance() {
		return taskInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskInstance_TypeOf() {
		return (EReference)taskInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskInstance_Priority() {
		return (EAttribute)taskInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskInstance_TaskBehavior() {
		return (EReference)taskInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskInstance_Outputs() {
		return (EReference)taskInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskInstance_Inputs() {
		return (EReference)taskInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskInput() {
		return taskInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskInput_TypeOf() {
		return (EReference)taskInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskInput_Trigger() {
		return (EReference)taskInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskInput_ActivationThreshold() {
		return (EAttribute)taskInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskInput_IsFinal() {
		return (EAttribute)taskInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskOutput() {
		return taskOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskOutput_TypeOf() {
		return (EReference)taskOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskOutput_Channels() {
		return (EReference)taskOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeEvent() {
		return timeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeEvent_Period() {
		return (EAttribute)timeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeEvent_Offset() {
		return (EAttribute)timeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_DataType() {
		return (EReference)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_ChannelBehavior() {
		return (EReference)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_SuperType() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_Attributes() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_AbstractType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_IsTMType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_SerializedDefinition() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalType() {
		return externalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_TypeOf() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Dimensions() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_ReferenceFrame() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_TypeUnit() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_IsConst() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_ValueLiteral() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_MaxValueLiteral() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_MinValueLiteral() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayDimension() {
		return arrayDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayDimension_Size() {
		return (EAttribute)arrayDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeration_Literals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumeration_SerializedDefinition() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumerationLiteral_KeyNum() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumSchedularPolicy() {
		return enumSchedularPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumSchedulePolicy() {
		return enumSchedulePolicyEEnum;
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
	public StructuralFactory getStructuralFactory() {
		return (StructuralFactory)getEFactoryInstance();
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
		taskingDefinitionEClass = createEClass(TASKING_DEFINITION);
		createEReference(taskingDefinitionEClass, TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS);
		createEReference(taskingDefinitionEClass, TASKING_DEFINITION__ENUMERATIONS);
		createEReference(taskingDefinitionEClass, TASKING_DEFINITION__DATA_TYPES);
		createEReference(taskingDefinitionEClass, TASKING_DEFINITION__EXTERNAL_TYPES);
		createEReference(taskingDefinitionEClass, TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS);
		createEReference(taskingDefinitionEClass, TASKING_DEFINITION__TASK_DEFINITIONS);
		createEReference(taskingDefinitionEClass, TASKING_DEFINITION__REFERENCE_FRAMES);
		createEReference(taskingDefinitionEClass, TASKING_DEFINITION__UNITS);

		taskingEnvironmentEClass = createEClass(TASKING_ENVIRONMENT);
		createEReference(taskingEnvironmentEClass, TASKING_ENVIRONMENT__TASKS);
		createEReference(taskingEnvironmentEClass, TASKING_ENVIRONMENT__CHANNELS);
		createEReference(taskingEnvironmentEClass, TASKING_ENVIRONMENT__TIME_EVENTS);
		createEReference(taskingEnvironmentEClass, TASKING_ENVIRONMENT__GLOBAL_PARAMETERS);
		createEAttribute(taskingEnvironmentEClass, TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE);
		createEAttribute(taskingEnvironmentEClass, TASKING_ENVIRONMENT__SCHEDULAR_POLICY);
		createEAttribute(taskingEnvironmentEClass, TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS);

		iEventSourceEClass = createEClass(IEVENT_SOURCE);
		createEReference(iEventSourceEClass, IEVENT_SOURCE__INPUTS);

		iTypeEClass = createEClass(ITYPE);

		taskDefinitionEClass = createEClass(TASK_DEFINITION);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__INPUTS);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__OUTPUTS);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__PARAMETERS);
		createEAttribute(taskDefinitionEClass, TASK_DEFINITION__SERIALIZED_DEFINITION);
		createEAttribute(taskDefinitionEClass, TASK_DEFINITION__SCHEDULE_POLICY);

		taskInputDefinitionEClass = createEClass(TASK_INPUT_DEFINITION);
		createEReference(taskInputDefinitionEClass, TASK_INPUT_DEFINITION__DATA_TYPE);

		taskOutputDefinitionEClass = createEClass(TASK_OUTPUT_DEFINITION);
		createEReference(taskOutputDefinitionEClass, TASK_OUTPUT_DEFINITION__DATA_TYPE);

		basicTypeDefinitionEClass = createEClass(BASIC_TYPE_DEFINITION);
		createEAttribute(basicTypeDefinitionEClass, BASIC_TYPE_DEFINITION__VALUE_TYPE);
		createEAttribute(basicTypeDefinitionEClass, BASIC_TYPE_DEFINITION__SIZE);
		createEAttribute(basicTypeDefinitionEClass, BASIC_TYPE_DEFINITION__SOURCE);
		createEAttribute(basicTypeDefinitionEClass, BASIC_TYPE_DEFINITION__CUSTOM_SOURCE);

		referenceFrameDefinitionEClass = createEClass(REFERENCE_FRAME_DEFINITION);

		unitDefinitionEClass = createEClass(UNIT_DEFINITION);

		taskInstanceEClass = createEClass(TASK_INSTANCE);
		createEReference(taskInstanceEClass, TASK_INSTANCE__TYPE_OF);
		createEAttribute(taskInstanceEClass, TASK_INSTANCE__PRIORITY);
		createEReference(taskInstanceEClass, TASK_INSTANCE__TASK_BEHAVIOR);
		createEReference(taskInstanceEClass, TASK_INSTANCE__OUTPUTS);
		createEReference(taskInstanceEClass, TASK_INSTANCE__INPUTS);

		taskInputEClass = createEClass(TASK_INPUT);
		createEReference(taskInputEClass, TASK_INPUT__TYPE_OF);
		createEReference(taskInputEClass, TASK_INPUT__TRIGGER);
		createEAttribute(taskInputEClass, TASK_INPUT__ACTIVATION_THRESHOLD);
		createEAttribute(taskInputEClass, TASK_INPUT__IS_FINAL);

		taskOutputEClass = createEClass(TASK_OUTPUT);
		createEReference(taskOutputEClass, TASK_OUTPUT__TYPE_OF);
		createEReference(taskOutputEClass, TASK_OUTPUT__CHANNELS);

		timeEventEClass = createEClass(TIME_EVENT);
		createEAttribute(timeEventEClass, TIME_EVENT__PERIOD);
		createEAttribute(timeEventEClass, TIME_EVENT__OFFSET);

		channelEClass = createEClass(CHANNEL);
		createEReference(channelEClass, CHANNEL__DATA_TYPE);
		createEReference(channelEClass, CHANNEL__CHANNEL_BEHAVIOR);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__SUPER_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__ATTRIBUTES);
		createEAttribute(dataTypeEClass, DATA_TYPE__ABSTRACT_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__IS_TM_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__SERIALIZED_DEFINITION);

		externalTypeEClass = createEClass(EXTERNAL_TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__TYPE_OF);
		createEReference(attributeEClass, ATTRIBUTE__DIMENSIONS);
		createEReference(attributeEClass, ATTRIBUTE__REFERENCE_FRAME);
		createEReference(attributeEClass, ATTRIBUTE__TYPE_UNIT);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_CONST);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE_LITERAL);
		createEAttribute(attributeEClass, ATTRIBUTE__MAX_VALUE_LITERAL);
		createEAttribute(attributeEClass, ATTRIBUTE__MIN_VALUE_LITERAL);

		arrayDimensionEClass = createEClass(ARRAY_DIMENSION);
		createEAttribute(arrayDimensionEClass, ARRAY_DIMENSION__SIZE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);
		createEAttribute(enumerationEClass, ENUMERATION__SERIALIZED_DEFINITION);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__KEY_NUM);

		// Create enums
		enumSchedularPolicyEEnum = createEEnum(ENUM_SCHEDULAR_POLICY);
		enumSchedulePolicyEEnum = createEEnum(ENUM_SCHEDULE_POLICY);
		enumValueTypeEEnum = createEEnum(ENUM_VALUE_TYPE);
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
		BehavioralPackage theBehavioralPackage = (BehavioralPackage)EPackage.Registry.INSTANCE.getEPackage(BehavioralPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskingDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskingEnvironmentEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		iEventSourceEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		iTypeEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskInputDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskOutputDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		basicTypeDefinitionEClass.getESuperTypes().add(this.getIType());
		referenceFrameDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		unitDefinitionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskInstanceEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskInputEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		taskOutputEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		timeEventEClass.getESuperTypes().add(this.getIEventSource());
		channelEClass.getESuperTypes().add(this.getIEventSource());
		dataTypeEClass.getESuperTypes().add(this.getIType());
		externalTypeEClass.getESuperTypes().add(this.getDataType());
		attributeEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		arrayDimensionEClass.getESuperTypes().add(theCorePackage.getGenericCategory());
		enumerationEClass.getESuperTypes().add(this.getIType());
		enumerationLiteralEClass.getESuperTypes().add(theCorePackage.getGenericCategory());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskingDefinitionEClass, TaskingDefinition.class, "TaskingDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskingDefinition_BasicTypeDefinitions(), this.getBasicTypeDefinition(), null, "basicTypeDefinitions", null, 0, -1, TaskingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingDefinition_Enumerations(), this.getEnumeration(), null, "enumerations", null, 0, -1, TaskingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingDefinition_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, TaskingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingDefinition_ExternalTypes(), this.getExternalType(), null, "externalTypes", null, 0, -1, TaskingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingDefinition_ChannelBehaviorDefinitions(), theBehavioralPackage.getChannelBehaviorDefinition(), null, "channelBehaviorDefinitions", null, 0, -1, TaskingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingDefinition_TaskDefinitions(), this.getTaskDefinition(), null, "taskDefinitions", null, 0, -1, TaskingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingDefinition_ReferenceFrames(), this.getReferenceFrameDefinition(), null, "referenceFrames", null, 0, -1, TaskingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingDefinition_Units(), this.getUnitDefinition(), null, "units", null, 0, -1, TaskingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskingEnvironmentEClass, TaskingEnvironment.class, "TaskingEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskingEnvironment_Tasks(), this.getTaskInstance(), null, "tasks", null, 0, -1, TaskingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingEnvironment_Channels(), this.getChannel(), null, "channels", null, 0, -1, TaskingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingEnvironment_TimeEvents(), this.getTimeEvent(), null, "timeEvents", null, 0, -1, TaskingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskingEnvironment_GlobalParameters(), this.getAttribute(), null, "globalParameters", null, 0, -1, TaskingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskingEnvironment_LastDiagramChange(), ecorePackage.getEString(), "lastDiagramChange", null, 0, 1, TaskingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskingEnvironment_SchedularPolicy(), this.getEnumSchedularPolicy(), "schedularPolicy", null, 0, 1, TaskingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskingEnvironment_NumberOfExecutors(), ecorePackage.getEInt(), "numberOfExecutors", null, 0, 1, TaskingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iEventSourceEClass, IEventSource.class, "IEventSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIEventSource_Inputs(), this.getTaskInput(), null, "inputs", null, 0, -1, IEventSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTypeEClass, IType.class, "IType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskDefinitionEClass, TaskDefinition.class, "TaskDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskDefinition_Inputs(), this.getTaskInputDefinition(), null, "inputs", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_Outputs(), this.getTaskOutputDefinition(), null, "outputs", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_Parameters(), this.getAttribute(), null, "parameters", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskDefinition_SerializedDefinition(), ecorePackage.getEString(), "serializedDefinition", null, 0, 1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskDefinition_SchedulePolicy(), this.getEnumSchedulePolicy(), "schedulePolicy", null, 0, 1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskInputDefinitionEClass, TaskInputDefinition.class, "TaskInputDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskInputDefinition_DataType(), this.getDataType(), null, "dataType", null, 0, 1, TaskInputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskOutputDefinitionEClass, TaskOutputDefinition.class, "TaskOutputDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskOutputDefinition_DataType(), this.getDataType(), null, "dataType", null, 0, 1, TaskOutputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicTypeDefinitionEClass, BasicTypeDefinition.class, "BasicTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicTypeDefinition_ValueType(), this.getEnumValueType(), "valueType", null, 0, 1, BasicTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicTypeDefinition_Size(), ecorePackage.getEInt(), "size", null, 0, 1, BasicTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicTypeDefinition_Source(), ecorePackage.getEString(), "source", null, 0, 1, BasicTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicTypeDefinition_CustomSource(), ecorePackage.getEBoolean(), "customSource", null, 0, 1, BasicTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceFrameDefinitionEClass, ReferenceFrameDefinition.class, "ReferenceFrameDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitDefinitionEClass, UnitDefinition.class, "UnitDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskInstanceEClass, TaskInstance.class, "TaskInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskInstance_TypeOf(), this.getTaskDefinition(), null, "typeOf", null, 0, 1, TaskInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskInstance_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, TaskInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskInstance_TaskBehavior(), theBehavioralPackage.getTaskBehavior(), null, "taskBehavior", null, 0, 1, TaskInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskInstance_Outputs(), this.getTaskOutput(), null, "outputs", null, 0, -1, TaskInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskInstance_Inputs(), this.getTaskInput(), null, "inputs", null, 0, -1, TaskInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskInputEClass, TaskInput.class, "TaskInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskInput_TypeOf(), this.getTaskInputDefinition(), null, "typeOf", null, 0, 1, TaskInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskInput_Trigger(), this.getIEventSource(), null, "trigger", null, 0, 1, TaskInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskInput_ActivationThreshold(), ecorePackage.getEInt(), "activationThreshold", null, 0, 1, TaskInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskInput_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, TaskInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskOutputEClass, TaskOutput.class, "TaskOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskOutput_TypeOf(), this.getTaskOutputDefinition(), null, "typeOf", null, 0, 1, TaskOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskOutput_Channels(), this.getChannel(), null, "channels", null, 0, -1, TaskOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEventEClass, TimeEvent.class, "TimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeEvent_Period(), ecorePackage.getEInt(), "period", null, 0, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeEvent_Offset(), ecorePackage.getEInt(), "offset", null, 0, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_ChannelBehavior(), theBehavioralPackage.getChannelBehavior(), null, "channelBehavior", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_SuperType(), this.getDataType(), null, "superType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_AbstractType(), ecorePackage.getEBoolean(), "abstractType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_IsTMType(), ecorePackage.getEBoolean(), "isTMType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_SerializedDefinition(), ecorePackage.getEString(), "serializedDefinition", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalTypeEClass, ExternalType.class, "ExternalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_TypeOf(), this.getIType(), null, "typeOf", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Dimensions(), this.getArrayDimension(), null, "dimensions", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_ReferenceFrame(), this.getReferenceFrameDefinition(), null, "referenceFrame", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_TypeUnit(), this.getUnitDefinition(), null, "typeUnit", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsConst(), ecorePackage.getEBoolean(), "isConst", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_ValueLiteral(), ecorePackage.getEString(), "valueLiteral", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_MaxValueLiteral(), ecorePackage.getEString(), "maxValueLiteral", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_MinValueLiteral(), ecorePackage.getEString(), "minValueLiteral", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayDimensionEClass, ArrayDimension.class, "ArrayDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayDimension_Size(), ecorePackage.getEInt(), "size", null, 0, 1, ArrayDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getEnumerationLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumeration_SerializedDefinition(), ecorePackage.getEString(), "serializedDefinition", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationLiteral_KeyNum(), ecorePackage.getEInt(), "keyNum", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumSchedularPolicyEEnum, EnumSchedularPolicy.class, "EnumSchedularPolicy");
		addEEnumLiteral(enumSchedularPolicyEEnum, EnumSchedularPolicy.PRIORITY);
		addEEnumLiteral(enumSchedularPolicyEEnum, EnumSchedularPolicy.FIFO);
		addEEnumLiteral(enumSchedularPolicyEEnum, EnumSchedularPolicy.LIFO);

		initEEnum(enumSchedulePolicyEEnum, EnumSchedulePolicy.class, "EnumSchedulePolicy");
		addEEnumLiteral(enumSchedulePolicyEEnum, EnumSchedulePolicy.PRIORITY);
		addEEnumLiteral(enumSchedulePolicyEEnum, EnumSchedulePolicy.FIFO);
		addEEnumLiteral(enumSchedulePolicyEEnum, EnumSchedulePolicy.LIFO);

		initEEnum(enumValueTypeEEnum, EnumValueType.class, "EnumValueType");
		addEEnumLiteral(enumValueTypeEEnum, EnumValueType.INTEGER);
		addEEnumLiteral(enumValueTypeEEnum, EnumValueType.FLOAT);
		addEEnumLiteral(enumValueTypeEEnum, EnumValueType.STRING);

		// Create resource
		createResource(eNS_URI);
	}

} //StructuralPackageImpl
