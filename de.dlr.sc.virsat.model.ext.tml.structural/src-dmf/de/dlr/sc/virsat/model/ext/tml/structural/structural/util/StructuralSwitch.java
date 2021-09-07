/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.util;

import de.dlr.sc.virsat.model.dvlm.dmf.DObject;

import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.dvlm.general.IUuid;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.*;

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
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage
 * @generated
 */
public class StructuralSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructuralPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralSwitch() {
		if (modelPackage == null) {
			modelPackage = StructuralPackage.eINSTANCE;
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
			case StructuralPackage.TASKING_DEFINITION: {
				TaskingDefinition taskingDefinition = (TaskingDefinition)theEObject;
				T result = caseTaskingDefinition(taskingDefinition);
				if (result == null) result = caseGenericCategory(taskingDefinition);
				if (result == null) result = caseDObject(taskingDefinition);
				if (result == null) result = caseIUuid(taskingDefinition);
				if (result == null) result = caseIName(taskingDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.TASKING_ENVIRONMENT: {
				TaskingEnvironment taskingEnvironment = (TaskingEnvironment)theEObject;
				T result = caseTaskingEnvironment(taskingEnvironment);
				if (result == null) result = caseGenericCategory(taskingEnvironment);
				if (result == null) result = caseDObject(taskingEnvironment);
				if (result == null) result = caseIUuid(taskingEnvironment);
				if (result == null) result = caseIName(taskingEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.IEVENT_SOURCE: {
				IEventSource iEventSource = (IEventSource)theEObject;
				T result = caseIEventSource(iEventSource);
				if (result == null) result = caseGenericCategory(iEventSource);
				if (result == null) result = caseDObject(iEventSource);
				if (result == null) result = caseIUuid(iEventSource);
				if (result == null) result = caseIName(iEventSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.ITYPE: {
				IType iType = (IType)theEObject;
				T result = caseIType(iType);
				if (result == null) result = caseGenericCategory(iType);
				if (result == null) result = caseDObject(iType);
				if (result == null) result = caseIUuid(iType);
				if (result == null) result = caseIName(iType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.TASK_DEFINITION: {
				TaskDefinition taskDefinition = (TaskDefinition)theEObject;
				T result = caseTaskDefinition(taskDefinition);
				if (result == null) result = caseGenericCategory(taskDefinition);
				if (result == null) result = caseDObject(taskDefinition);
				if (result == null) result = caseIUuid(taskDefinition);
				if (result == null) result = caseIName(taskDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.TASK_INPUT_DEFINITION: {
				TaskInputDefinition taskInputDefinition = (TaskInputDefinition)theEObject;
				T result = caseTaskInputDefinition(taskInputDefinition);
				if (result == null) result = caseGenericCategory(taskInputDefinition);
				if (result == null) result = caseDObject(taskInputDefinition);
				if (result == null) result = caseIUuid(taskInputDefinition);
				if (result == null) result = caseIName(taskInputDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.TASK_OUTPUT_DEFINITION: {
				TaskOutputDefinition taskOutputDefinition = (TaskOutputDefinition)theEObject;
				T result = caseTaskOutputDefinition(taskOutputDefinition);
				if (result == null) result = caseGenericCategory(taskOutputDefinition);
				if (result == null) result = caseDObject(taskOutputDefinition);
				if (result == null) result = caseIUuid(taskOutputDefinition);
				if (result == null) result = caseIName(taskOutputDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.BASIC_TYPE_DEFINITION: {
				BasicTypeDefinition basicTypeDefinition = (BasicTypeDefinition)theEObject;
				T result = caseBasicTypeDefinition(basicTypeDefinition);
				if (result == null) result = caseIType(basicTypeDefinition);
				if (result == null) result = caseGenericCategory(basicTypeDefinition);
				if (result == null) result = caseDObject(basicTypeDefinition);
				if (result == null) result = caseIUuid(basicTypeDefinition);
				if (result == null) result = caseIName(basicTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.REFERENCE_FRAME_DEFINITION: {
				ReferenceFrameDefinition referenceFrameDefinition = (ReferenceFrameDefinition)theEObject;
				T result = caseReferenceFrameDefinition(referenceFrameDefinition);
				if (result == null) result = caseGenericCategory(referenceFrameDefinition);
				if (result == null) result = caseDObject(referenceFrameDefinition);
				if (result == null) result = caseIUuid(referenceFrameDefinition);
				if (result == null) result = caseIName(referenceFrameDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.UNIT_DEFINITION: {
				UnitDefinition unitDefinition = (UnitDefinition)theEObject;
				T result = caseUnitDefinition(unitDefinition);
				if (result == null) result = caseGenericCategory(unitDefinition);
				if (result == null) result = caseDObject(unitDefinition);
				if (result == null) result = caseIUuid(unitDefinition);
				if (result == null) result = caseIName(unitDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.TASK_INSTANCE: {
				TaskInstance taskInstance = (TaskInstance)theEObject;
				T result = caseTaskInstance(taskInstance);
				if (result == null) result = caseGenericCategory(taskInstance);
				if (result == null) result = caseDObject(taskInstance);
				if (result == null) result = caseIUuid(taskInstance);
				if (result == null) result = caseIName(taskInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.TASK_INPUT: {
				TaskInput taskInput = (TaskInput)theEObject;
				T result = caseTaskInput(taskInput);
				if (result == null) result = caseGenericCategory(taskInput);
				if (result == null) result = caseDObject(taskInput);
				if (result == null) result = caseIUuid(taskInput);
				if (result == null) result = caseIName(taskInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.TASK_OUTPUT: {
				TaskOutput taskOutput = (TaskOutput)theEObject;
				T result = caseTaskOutput(taskOutput);
				if (result == null) result = caseGenericCategory(taskOutput);
				if (result == null) result = caseDObject(taskOutput);
				if (result == null) result = caseIUuid(taskOutput);
				if (result == null) result = caseIName(taskOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.TIME_EVENT: {
				TimeEvent timeEvent = (TimeEvent)theEObject;
				T result = caseTimeEvent(timeEvent);
				if (result == null) result = caseIEventSource(timeEvent);
				if (result == null) result = caseGenericCategory(timeEvent);
				if (result == null) result = caseDObject(timeEvent);
				if (result == null) result = caseIUuid(timeEvent);
				if (result == null) result = caseIName(timeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = caseIEventSource(channel);
				if (result == null) result = caseGenericCategory(channel);
				if (result == null) result = caseDObject(channel);
				if (result == null) result = caseIUuid(channel);
				if (result == null) result = caseIName(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseIType(dataType);
				if (result == null) result = caseGenericCategory(dataType);
				if (result == null) result = caseDObject(dataType);
				if (result == null) result = caseIUuid(dataType);
				if (result == null) result = caseIName(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.EXTERNAL_TYPE: {
				ExternalType externalType = (ExternalType)theEObject;
				T result = caseExternalType(externalType);
				if (result == null) result = caseDataType(externalType);
				if (result == null) result = caseIType(externalType);
				if (result == null) result = caseGenericCategory(externalType);
				if (result == null) result = caseDObject(externalType);
				if (result == null) result = caseIUuid(externalType);
				if (result == null) result = caseIName(externalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseGenericCategory(attribute);
				if (result == null) result = caseDObject(attribute);
				if (result == null) result = caseIUuid(attribute);
				if (result == null) result = caseIName(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.ARRAY_DIMENSION: {
				ArrayDimension arrayDimension = (ArrayDimension)theEObject;
				T result = caseArrayDimension(arrayDimension);
				if (result == null) result = caseGenericCategory(arrayDimension);
				if (result == null) result = caseDObject(arrayDimension);
				if (result == null) result = caseIUuid(arrayDimension);
				if (result == null) result = caseIName(arrayDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseIType(enumeration);
				if (result == null) result = caseGenericCategory(enumeration);
				if (result == null) result = caseDObject(enumeration);
				if (result == null) result = caseIUuid(enumeration);
				if (result == null) result = caseIName(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuralPackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseGenericCategory(enumerationLiteral);
				if (result == null) result = caseDObject(enumerationLiteral);
				if (result == null) result = caseIUuid(enumerationLiteral);
				if (result == null) result = caseIName(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasking Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasking Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskingDefinition(TaskingDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasking Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasking Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskingEnvironment(TaskingEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEvent Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEvent Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEventSource(IEventSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIType(IType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskDefinition(TaskDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInputDefinition(TaskInputDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutputDefinition(TaskOutputDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicTypeDefinition(BasicTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Frame Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Frame Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceFrameDefinition(ReferenceFrameDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitDefinition(UnitDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInstance(TaskInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInput(TaskInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutput(TaskOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEvent(TimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalType(ExternalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDimension(ArrayDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
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

} //StructuralSwitch
