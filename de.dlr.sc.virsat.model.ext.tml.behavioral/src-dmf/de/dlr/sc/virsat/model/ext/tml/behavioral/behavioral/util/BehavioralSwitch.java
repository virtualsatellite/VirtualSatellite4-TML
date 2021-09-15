/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.util;

import de.dlr.sc.virsat.model.dvlm.dmf.DObject;

import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.dvlm.general.IUuid;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage
 * @generated
 */
public class BehavioralSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehavioralPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralSwitch() {
		if (modelPackage == null) {
			modelPackage = BehavioralPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION: {
				BehavioralParameterDefinition behavioralParameterDefinition = (BehavioralParameterDefinition)theEObject;
				T result = caseBehavioralParameterDefinition(behavioralParameterDefinition);
				if (result == null) result = caseGenericCategory(behavioralParameterDefinition);
				if (result == null) result = caseDObject(behavioralParameterDefinition);
				if (result == null) result = caseIUuid(behavioralParameterDefinition);
				if (result == null) result = caseIName(behavioralParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION: {
				ChannelBehaviorDefinition channelBehaviorDefinition = (ChannelBehaviorDefinition)theEObject;
				T result = caseChannelBehaviorDefinition(channelBehaviorDefinition);
				if (result == null) result = caseBehaviorDefinition(channelBehaviorDefinition);
				if (result == null) result = caseGenericCategory(channelBehaviorDefinition);
				if (result == null) result = caseDObject(channelBehaviorDefinition);
				if (result == null) result = caseIUuid(channelBehaviorDefinition);
				if (result == null) result = caseIName(channelBehaviorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehavioralPackage.BEHAVIOR_DEFINTION_STORAGE: {
				BehaviorDefintionStorage behaviorDefintionStorage = (BehaviorDefintionStorage)theEObject;
				T result = caseBehaviorDefintionStorage(behaviorDefintionStorage);
				if (result == null) result = caseGenericCategory(behaviorDefintionStorage);
				if (result == null) result = caseDObject(behaviorDefintionStorage);
				if (result == null) result = caseIUuid(behaviorDefintionStorage);
				if (result == null) result = caseIName(behaviorDefintionStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehavioralPackage.BEHAVIOR_DEFINITION: {
				BehaviorDefinition behaviorDefinition = (BehaviorDefinition)theEObject;
				T result = caseBehaviorDefinition(behaviorDefinition);
				if (result == null) result = caseGenericCategory(behaviorDefinition);
				if (result == null) result = caseDObject(behaviorDefinition);
				if (result == null) result = caseIUuid(behaviorDefinition);
				if (result == null) result = caseIName(behaviorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehavioralPackage.TIME_EVENT_BEHAVIOR_DEFINITION: {
				TimeEventBehaviorDefinition timeEventBehaviorDefinition = (TimeEventBehaviorDefinition)theEObject;
				T result = caseTimeEventBehaviorDefinition(timeEventBehaviorDefinition);
				if (result == null) result = caseGenericCategory(timeEventBehaviorDefinition);
				if (result == null) result = caseDObject(timeEventBehaviorDefinition);
				if (result == null) result = caseIUuid(timeEventBehaviorDefinition);
				if (result == null) result = caseIName(timeEventBehaviorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehavioralPackage.TASK_BEHAVIOR: {
				TaskBehavior taskBehavior = (TaskBehavior)theEObject;
				T result = caseTaskBehavior(taskBehavior);
				if (result == null) result = caseGenericCategory(taskBehavior);
				if (result == null) result = caseDObject(taskBehavior);
				if (result == null) result = caseIUuid(taskBehavior);
				if (result == null) result = caseIName(taskBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehavioralPackage.BEHAVIOR_PARAMETER: {
				BehaviorParameter behaviorParameter = (BehaviorParameter)theEObject;
				T result = caseBehaviorParameter(behaviorParameter);
				if (result == null) result = caseGenericCategory(behaviorParameter);
				if (result == null) result = caseDObject(behaviorParameter);
				if (result == null) result = caseIUuid(behaviorParameter);
				if (result == null) result = caseIName(behaviorParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehavioralPackage.CHANNEL_BEHAVIOR: {
				ChannelBehavior channelBehavior = (ChannelBehavior)theEObject;
				T result = caseChannelBehavior(channelBehavior);
				if (result == null) result = caseGenericCategory(channelBehavior);
				if (result == null) result = caseDObject(channelBehavior);
				if (result == null) result = caseIUuid(channelBehavior);
				if (result == null) result = caseIName(channelBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralParameterDefinition(BehavioralParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Behavior Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Behavior Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelBehaviorDefinition(ChannelBehaviorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Defintion Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Defintion Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorDefintionStorage(BehaviorDefintionStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorDefinition(BehaviorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Event Behavior Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Event Behavior Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEventBehaviorDefinition(TimeEventBehaviorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskBehavior(TaskBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorParameter(BehaviorParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelBehavior(ChannelBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IUuid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IUuid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIUuid(IUuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IName</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IName</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIName(IName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDObject(DObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericCategory(GenericCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehavioralSwitch
