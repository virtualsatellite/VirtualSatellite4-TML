/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.tml.structural.structural.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuralFactoryImpl extends EFactoryImpl implements StructuralFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuralFactory init() {
		try {
			StructuralFactory theStructuralFactory = (StructuralFactory)EPackage.Registry.INSTANCE.getEFactory(StructuralPackage.eNS_URI);
			if (theStructuralFactory != null) {
				return theStructuralFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuralFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructuralPackage.TASKING_DEFINITION: return createTaskingDefinition();
			case StructuralPackage.TASKING_ENVIRONMENT: return createTaskingEnvironment();
			case StructuralPackage.IEVENT_SOURCE: return createIEventSource();
			case StructuralPackage.ITYPE: return createIType();
			case StructuralPackage.TASK_DEFINITION: return createTaskDefinition();
			case StructuralPackage.TASK_INPUT_DEFINITION: return createTaskInputDefinition();
			case StructuralPackage.TASK_OUTPUT_DEFINITION: return createTaskOutputDefinition();
			case StructuralPackage.BASIC_TYPE_DEFINITION: return createBasicTypeDefinition();
			case StructuralPackage.REFERENCE_FRAME_DEFINITION: return createReferenceFrameDefinition();
			case StructuralPackage.UNIT_DEFINITION: return createUnitDefinition();
			case StructuralPackage.TASK_INSTANCE: return createTaskInstance();
			case StructuralPackage.TASK_INPUT: return createTaskInput();
			case StructuralPackage.TASK_OUTPUT: return createTaskOutput();
			case StructuralPackage.TIME_EVENT: return createTimeEvent();
			case StructuralPackage.CHANNEL: return createChannel();
			case StructuralPackage.DATA_TYPE: return createDataType();
			case StructuralPackage.EXTERNAL_TYPE: return createExternalType();
			case StructuralPackage.ATTRIBUTE: return createAttribute();
			case StructuralPackage.ARRAY_DIMENSION: return createArrayDimension();
			case StructuralPackage.ENUMERATION: return createEnumeration();
			case StructuralPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StructuralPackage.ENUM_SCHEDULAR_POLICY:
				return createEnumSchedularPolicyFromString(eDataType, initialValue);
			case StructuralPackage.ENUM_SCHEDULE_POLICY:
				return createEnumSchedulePolicyFromString(eDataType, initialValue);
			case StructuralPackage.ENUM_VALUE_TYPE:
				return createEnumValueTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StructuralPackage.ENUM_SCHEDULAR_POLICY:
				return convertEnumSchedularPolicyToString(eDataType, instanceValue);
			case StructuralPackage.ENUM_SCHEDULE_POLICY:
				return convertEnumSchedulePolicyToString(eDataType, instanceValue);
			case StructuralPackage.ENUM_VALUE_TYPE:
				return convertEnumValueTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskingDefinition createTaskingDefinition() {
		TaskingDefinitionImpl taskingDefinition = new TaskingDefinitionImpl();
		return taskingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskingEnvironment createTaskingEnvironment() {
		TaskingEnvironmentImpl taskingEnvironment = new TaskingEnvironmentImpl();
		return taskingEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IEventSource createIEventSource() {
		IEventSourceImpl iEventSource = new IEventSourceImpl();
		return iEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IType createIType() {
		ITypeImpl iType = new ITypeImpl();
		return iType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDefinition createTaskDefinition() {
		TaskDefinitionImpl taskDefinition = new TaskDefinitionImpl();
		return taskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskInputDefinition createTaskInputDefinition() {
		TaskInputDefinitionImpl taskInputDefinition = new TaskInputDefinitionImpl();
		return taskInputDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskOutputDefinition createTaskOutputDefinition() {
		TaskOutputDefinitionImpl taskOutputDefinition = new TaskOutputDefinitionImpl();
		return taskOutputDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicTypeDefinition createBasicTypeDefinition() {
		BasicTypeDefinitionImpl basicTypeDefinition = new BasicTypeDefinitionImpl();
		return basicTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceFrameDefinition createReferenceFrameDefinition() {
		ReferenceFrameDefinitionImpl referenceFrameDefinition = new ReferenceFrameDefinitionImpl();
		return referenceFrameDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitDefinition createUnitDefinition() {
		UnitDefinitionImpl unitDefinition = new UnitDefinitionImpl();
		return unitDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskInstance createTaskInstance() {
		TaskInstanceImpl taskInstance = new TaskInstanceImpl();
		return taskInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskInput createTaskInput() {
		TaskInputImpl taskInput = new TaskInputImpl();
		return taskInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskOutput createTaskOutput() {
		TaskOutputImpl taskOutput = new TaskOutputImpl();
		return taskOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeEvent createTimeEvent() {
		TimeEventImpl timeEvent = new TimeEventImpl();
		return timeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalType createExternalType() {
		ExternalTypeImpl externalType = new ExternalTypeImpl();
		return externalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayDimension createArrayDimension() {
		ArrayDimensionImpl arrayDimension = new ArrayDimensionImpl();
		return arrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSchedularPolicy createEnumSchedularPolicyFromString(EDataType eDataType, String initialValue) {
		EnumSchedularPolicy result = EnumSchedularPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumSchedularPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSchedulePolicy createEnumSchedulePolicyFromString(EDataType eDataType, String initialValue) {
		EnumSchedulePolicy result = EnumSchedulePolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumSchedulePolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValueType createEnumValueTypeFromString(EDataType eDataType, String initialValue) {
		EnumValueType result = EnumValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralPackage getStructuralPackage() {
		return (StructuralPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuralPackage getPackage() {
		return StructuralPackage.eINSTANCE;
	}

} //StructuralFactoryImpl
