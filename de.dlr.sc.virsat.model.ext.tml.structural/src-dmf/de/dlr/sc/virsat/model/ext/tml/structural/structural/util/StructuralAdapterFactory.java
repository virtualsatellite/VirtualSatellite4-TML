/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.util;

import de.dlr.sc.virsat.model.dvlm.dmf.DObject;

import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.dvlm.general.IUuid;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage
 * @generated
 */
public class StructuralAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructuralPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StructuralPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralSwitch<Adapter> modelSwitch =
		new StructuralSwitch<Adapter>() {
			@Override
			public Adapter caseTaskingDefinition(TaskingDefinition object) {
				return createTaskingDefinitionAdapter();
			}
			@Override
			public Adapter caseTaskingEnvironment(TaskingEnvironment object) {
				return createTaskingEnvironmentAdapter();
			}
			@Override
			public Adapter caseIEventSource(IEventSource object) {
				return createIEventSourceAdapter();
			}
			@Override
			public Adapter caseIType(IType object) {
				return createITypeAdapter();
			}
			@Override
			public Adapter caseTaskDefinition(TaskDefinition object) {
				return createTaskDefinitionAdapter();
			}
			@Override
			public Adapter caseTaskInputDefinition(TaskInputDefinition object) {
				return createTaskInputDefinitionAdapter();
			}
			@Override
			public Adapter caseTaskOutputDefinition(TaskOutputDefinition object) {
				return createTaskOutputDefinitionAdapter();
			}
			@Override
			public Adapter caseBasicTypeDefinition(BasicTypeDefinition object) {
				return createBasicTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseReferenceFrameDefinition(ReferenceFrameDefinition object) {
				return createReferenceFrameDefinitionAdapter();
			}
			@Override
			public Adapter caseUnitDefinition(UnitDefinition object) {
				return createUnitDefinitionAdapter();
			}
			@Override
			public Adapter caseTaskInstance(TaskInstance object) {
				return createTaskInstanceAdapter();
			}
			@Override
			public Adapter caseTaskInput(TaskInput object) {
				return createTaskInputAdapter();
			}
			@Override
			public Adapter caseTaskOutput(TaskOutput object) {
				return createTaskOutputAdapter();
			}
			@Override
			public Adapter caseTimeEvent(TimeEvent object) {
				return createTimeEventAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseExternalType(ExternalType object) {
				return createExternalTypeAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseArrayDimension(ArrayDimension object) {
				return createArrayDimensionAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseIUuid(IUuid object) {
				return createIUuidAdapter();
			}
			@Override
			public Adapter caseIName(IName object) {
				return createINameAdapter();
			}
			@Override
			public Adapter caseDObject(DObject object) {
				return createDObjectAdapter();
			}
			@Override
			public Adapter caseGenericCategory(GenericCategory object) {
				return createGenericCategoryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition <em>Tasking Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition
	 * @generated
	 */
	public Adapter createTaskingDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment <em>Tasking Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
	 * @generated
	 */
	public Adapter createTaskingEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource <em>IEvent Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource
	 * @generated
	 */
	public Adapter createIEventSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.IType <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.IType
	 * @generated
	 */
	public Adapter createITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition
	 * @generated
	 */
	public Adapter createTaskDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition <em>Task Input Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition
	 * @generated
	 */
	public Adapter createTaskInputDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition <em>Task Output Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition
	 * @generated
	 */
	public Adapter createTaskOutputDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition <em>Basic Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition
	 * @generated
	 */
	public Adapter createBasicTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition <em>Reference Frame Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition
	 * @generated
	 */
	public Adapter createReferenceFrameDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition
	 * @generated
	 */
	public Adapter createUnitDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance <em>Task Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance
	 * @generated
	 */
	public Adapter createTaskInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput <em>Task Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput
	 * @generated
	 */
	public Adapter createTaskInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput <em>Task Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput
	 * @generated
	 */
	public Adapter createTaskOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent <em>Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent
	 * @generated
	 */
	public Adapter createTimeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ExternalType <em>External Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.ExternalType
	 * @generated
	 */
	public Adapter createExternalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension
	 * @generated
	 */
	public Adapter createArrayDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.dvlm.general.IUuid <em>IUuid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.dvlm.general.IUuid
	 * @generated
	 */
	public Adapter createIUuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.dvlm.general.IName <em>IName</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.dvlm.general.IName
	 * @generated
	 */
	public Adapter createINameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.dvlm.dmf.DObject <em>DObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.dvlm.dmf.DObject
	 * @generated
	 */
	public Adapter createDObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.core.core.GenericCategory <em>Generic Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.core.core.GenericCategory
	 * @generated
	 */
	public Adapter createGenericCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StructuralAdapterFactory
