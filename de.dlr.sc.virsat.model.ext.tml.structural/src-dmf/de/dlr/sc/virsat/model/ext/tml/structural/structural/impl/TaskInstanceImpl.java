/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TaskBehavior;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl#getTaskBehavior <em>Task Behavior</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInstanceImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskInstanceImpl extends GenericCategoryImpl implements TaskInstance {
	/**
	 * The cached value of the '{@link #getTypeOf() <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOf()
	 * @generated
	 * @ordered
	 */
	protected TaskDefinition typeOf;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskBehavior() <em>Task Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskBehavior()
	 * @generated
	 * @ordered
	 */
	protected TaskBehavior taskBehavior;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskOutput> outputs;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInput> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.TASK_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDefinition getTypeOf() {
		if (typeOf != null && typeOf.eIsProxy()) {
			InternalEObject oldTypeOf = (InternalEObject)typeOf;
			typeOf = (TaskDefinition)eResolveProxy(oldTypeOf);
			if (typeOf != oldTypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.TASK_INSTANCE__TYPE_OF, oldTypeOf, typeOf));
			}
		}
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition basicGetTypeOf() {
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOf(TaskDefinition newTypeOf) {
		TaskDefinition oldTypeOf = typeOf;
		typeOf = newTypeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_INSTANCE__TYPE_OF, oldTypeOf, typeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_INSTANCE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskBehavior getTaskBehavior() {
		return taskBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskBehavior(TaskBehavior newTaskBehavior, NotificationChain msgs) {
		TaskBehavior oldTaskBehavior = taskBehavior;
		taskBehavior = newTaskBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR, oldTaskBehavior, newTaskBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskBehavior(TaskBehavior newTaskBehavior) {
		if (newTaskBehavior != taskBehavior) {
			NotificationChain msgs = null;
			if (taskBehavior != null)
				msgs = ((InternalEObject)taskBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR, null, msgs);
			if (newTaskBehavior != null)
				msgs = ((InternalEObject)newTaskBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR, null, msgs);
			msgs = basicSetTaskBehavior(newTaskBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR, newTaskBehavior, newTaskBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<TaskOutput>(TaskOutput.class, this, StructuralPackage.TASK_INSTANCE__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<TaskInput>(TaskInput.class, this, StructuralPackage.TASK_INSTANCE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR:
				return basicSetTaskBehavior(null, msgs);
			case StructuralPackage.TASK_INSTANCE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASK_INSTANCE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralPackage.TASK_INSTANCE__TYPE_OF:
				if (resolve) return getTypeOf();
				return basicGetTypeOf();
			case StructuralPackage.TASK_INSTANCE__PRIORITY:
				return getPriority();
			case StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR:
				return getTaskBehavior();
			case StructuralPackage.TASK_INSTANCE__OUTPUTS:
				return getOutputs();
			case StructuralPackage.TASK_INSTANCE__INPUTS:
				return getInputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuralPackage.TASK_INSTANCE__TYPE_OF:
				setTypeOf((TaskDefinition)newValue);
				return;
			case StructuralPackage.TASK_INSTANCE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR:
				setTaskBehavior((TaskBehavior)newValue);
				return;
			case StructuralPackage.TASK_INSTANCE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends TaskOutput>)newValue);
				return;
			case StructuralPackage.TASK_INSTANCE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends TaskInput>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructuralPackage.TASK_INSTANCE__TYPE_OF:
				setTypeOf((TaskDefinition)null);
				return;
			case StructuralPackage.TASK_INSTANCE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR:
				setTaskBehavior((TaskBehavior)null);
				return;
			case StructuralPackage.TASK_INSTANCE__OUTPUTS:
				getOutputs().clear();
				return;
			case StructuralPackage.TASK_INSTANCE__INPUTS:
				getInputs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructuralPackage.TASK_INSTANCE__TYPE_OF:
				return typeOf != null;
			case StructuralPackage.TASK_INSTANCE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case StructuralPackage.TASK_INSTANCE__TASK_BEHAVIOR:
				return taskBehavior != null;
			case StructuralPackage.TASK_INSTANCE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case StructuralPackage.TASK_INSTANCE__INPUTS:
				return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TaskInstanceImpl
