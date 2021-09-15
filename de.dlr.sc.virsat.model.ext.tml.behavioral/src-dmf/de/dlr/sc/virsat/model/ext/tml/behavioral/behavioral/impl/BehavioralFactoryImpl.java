/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.*;

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
public class BehavioralFactoryImpl extends EFactoryImpl implements BehavioralFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehavioralFactory init() {
		try {
			BehavioralFactory theBehavioralFactory = (BehavioralFactory)EPackage.Registry.INSTANCE.getEFactory(BehavioralPackage.eNS_URI);
			if (theBehavioralFactory != null) {
				return theBehavioralFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehavioralFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFactoryImpl() {
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
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION: return createBehavioralParameterDefinition();
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION: return createChannelBehaviorDefinition();
			case BehavioralPackage.BEHAVIOR_DEFINTION_STORAGE: return createBehaviorDefintionStorage();
			case BehavioralPackage.BEHAVIOR_DEFINITION: return createBehaviorDefinition();
			case BehavioralPackage.TIME_EVENT_BEHAVIOR_DEFINITION: return createTimeEventBehaviorDefinition();
			case BehavioralPackage.TASK_BEHAVIOR: return createTaskBehavior();
			case BehavioralPackage.BEHAVIOR_PARAMETER: return createBehaviorParameter();
			case BehavioralPackage.CHANNEL_BEHAVIOR: return createChannelBehavior();
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
			case BehavioralPackage.ENUM_VALUE_TYPE:
				return createEnumValueTypeFromString(eDataType, initialValue);
			case BehavioralPackage.ENUM_STORAGE_TYPE:
				return createEnumStorageTypeFromString(eDataType, initialValue);
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
			case BehavioralPackage.ENUM_VALUE_TYPE:
				return convertEnumValueTypeToString(eDataType, instanceValue);
			case BehavioralPackage.ENUM_STORAGE_TYPE:
				return convertEnumStorageTypeToString(eDataType, instanceValue);
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
	public BehavioralParameterDefinition createBehavioralParameterDefinition() {
		BehavioralParameterDefinitionImpl behavioralParameterDefinition = new BehavioralParameterDefinitionImpl();
		return behavioralParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelBehaviorDefinition createChannelBehaviorDefinition() {
		ChannelBehaviorDefinitionImpl channelBehaviorDefinition = new ChannelBehaviorDefinitionImpl();
		return channelBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorDefintionStorage createBehaviorDefintionStorage() {
		BehaviorDefintionStorageImpl behaviorDefintionStorage = new BehaviorDefintionStorageImpl();
		return behaviorDefintionStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorDefinition createBehaviorDefinition() {
		BehaviorDefinitionImpl behaviorDefinition = new BehaviorDefinitionImpl();
		return behaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeEventBehaviorDefinition createTimeEventBehaviorDefinition() {
		TimeEventBehaviorDefinitionImpl timeEventBehaviorDefinition = new TimeEventBehaviorDefinitionImpl();
		return timeEventBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskBehavior createTaskBehavior() {
		TaskBehaviorImpl taskBehavior = new TaskBehaviorImpl();
		return taskBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorParameter createBehaviorParameter() {
		BehaviorParameterImpl behaviorParameter = new BehaviorParameterImpl();
		return behaviorParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelBehavior createChannelBehavior() {
		ChannelBehaviorImpl channelBehavior = new ChannelBehaviorImpl();
		return channelBehavior;
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
	public EnumStorageType createEnumStorageTypeFromString(EDataType eDataType, String initialValue) {
		EnumStorageType result = EnumStorageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumStorageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehavioralPackage getBehavioralPackage() {
		return (BehavioralPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehavioralPackage getPackage() {
		return BehavioralPackage.eINSTANCE;
	}

} //BehavioralFactoryImpl
