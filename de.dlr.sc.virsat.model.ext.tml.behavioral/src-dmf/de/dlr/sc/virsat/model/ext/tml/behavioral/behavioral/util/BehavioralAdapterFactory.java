/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.util;

import de.dlr.sc.virsat.model.dvlm.dmf.DObject;

import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.dvlm.general.IUuid;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage
 * @generated
 */
public class BehavioralAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehavioralPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehavioralPackage.eINSTANCE;
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
	protected BehavioralSwitch<Adapter> modelSwitch =
		new BehavioralSwitch<Adapter>() {
			@Override
			public Adapter caseBehavioralParameterDefinition(BehavioralParameterDefinition object) {
				return createBehavioralParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseChannelBehaviorDefinition(ChannelBehaviorDefinition object) {
				return createChannelBehaviorDefinitionAdapter();
			}
			@Override
			public Adapter caseBehaviorDefintionStorage(BehaviorDefintionStorage object) {
				return createBehaviorDefintionStorageAdapter();
			}
			@Override
			public Adapter caseBehaviorDefinition(BehaviorDefinition object) {
				return createBehaviorDefinitionAdapter();
			}
			@Override
			public Adapter caseTimeEventBehaviorDefinition(TimeEventBehaviorDefinition object) {
				return createTimeEventBehaviorDefinitionAdapter();
			}
			@Override
			public Adapter caseTaskBehavior(TaskBehavior object) {
				return createTaskBehaviorAdapter();
			}
			@Override
			public Adapter caseBehaviorParameter(BehaviorParameter object) {
				return createBehaviorParameterAdapter();
			}
			@Override
			public Adapter caseChannelBehavior(ChannelBehavior object) {
				return createChannelBehaviorAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition
	 * @generated
	 */
	public Adapter createBehavioralParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition <em>Channel Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition
	 * @generated
	 */
	public Adapter createChannelBehaviorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage <em>Behavior Defintion Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage
	 * @generated
	 */
	public Adapter createBehaviorDefintionStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefinition <em>Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefinition
	 * @generated
	 */
	public Adapter createBehaviorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TimeEventBehaviorDefinition <em>Time Event Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TimeEventBehaviorDefinition
	 * @generated
	 */
	public Adapter createTimeEventBehaviorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TaskBehavior <em>Task Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TaskBehavior
	 * @generated
	 */
	public Adapter createTaskBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter <em>Behavior Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter
	 * @generated
	 */
	public Adapter createBehaviorParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior <em>Channel Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior
	 * @generated
	 */
	public Adapter createChannelBehaviorAdapter() {
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

} //BehavioralAdapterFactory
