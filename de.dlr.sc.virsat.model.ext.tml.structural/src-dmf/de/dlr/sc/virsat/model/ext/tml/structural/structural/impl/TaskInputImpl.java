/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputImpl#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputImpl#getActivationThreshold <em>Activation Threshold</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskInputImpl#isIsFinal <em>Is Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskInputImpl extends GenericCategoryImpl implements TaskInput {
	/**
	 * The cached value of the '{@link #getTypeOf() <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOf()
	 * @generated
	 * @ordered
	 */
	protected TaskInputDefinition typeOf;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected IEventSource trigger;

	/**
	 * The default value of the '{@link #getActivationThreshold() <em>Activation Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVATION_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActivationThreshold() <em>Activation Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationThreshold()
	 * @generated
	 * @ordered
	 */
	protected int activationThreshold = ACTIVATION_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.TASK_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskInputDefinition getTypeOf() {
		if (typeOf != null && typeOf.eIsProxy()) {
			InternalEObject oldTypeOf = (InternalEObject)typeOf;
			typeOf = (TaskInputDefinition)eResolveProxy(oldTypeOf);
			if (typeOf != oldTypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.TASK_INPUT__TYPE_OF, oldTypeOf, typeOf));
			}
		}
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInputDefinition basicGetTypeOf() {
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOf(TaskInputDefinition newTypeOf) {
		TaskInputDefinition oldTypeOf = typeOf;
		typeOf = newTypeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_INPUT__TYPE_OF, oldTypeOf, typeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IEventSource getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (IEventSource)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.TASK_INPUT__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEventSource basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(IEventSource newTrigger) {
		IEventSource oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_INPUT__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getActivationThreshold() {
		return activationThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationThreshold(int newActivationThreshold) {
		int oldActivationThreshold = activationThreshold;
		activationThreshold = newActivationThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_INPUT__ACTIVATION_THRESHOLD, oldActivationThreshold, activationThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_INPUT__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralPackage.TASK_INPUT__TYPE_OF:
				if (resolve) return getTypeOf();
				return basicGetTypeOf();
			case StructuralPackage.TASK_INPUT__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case StructuralPackage.TASK_INPUT__ACTIVATION_THRESHOLD:
				return getActivationThreshold();
			case StructuralPackage.TASK_INPUT__IS_FINAL:
				return isIsFinal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuralPackage.TASK_INPUT__TYPE_OF:
				setTypeOf((TaskInputDefinition)newValue);
				return;
			case StructuralPackage.TASK_INPUT__TRIGGER:
				setTrigger((IEventSource)newValue);
				return;
			case StructuralPackage.TASK_INPUT__ACTIVATION_THRESHOLD:
				setActivationThreshold((Integer)newValue);
				return;
			case StructuralPackage.TASK_INPUT__IS_FINAL:
				setIsFinal((Boolean)newValue);
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
			case StructuralPackage.TASK_INPUT__TYPE_OF:
				setTypeOf((TaskInputDefinition)null);
				return;
			case StructuralPackage.TASK_INPUT__TRIGGER:
				setTrigger((IEventSource)null);
				return;
			case StructuralPackage.TASK_INPUT__ACTIVATION_THRESHOLD:
				setActivationThreshold(ACTIVATION_THRESHOLD_EDEFAULT);
				return;
			case StructuralPackage.TASK_INPUT__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
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
			case StructuralPackage.TASK_INPUT__TYPE_OF:
				return typeOf != null;
			case StructuralPackage.TASK_INPUT__TRIGGER:
				return trigger != null;
			case StructuralPackage.TASK_INPUT__ACTIVATION_THRESHOLD:
				return activationThreshold != ACTIVATION_THRESHOLD_EDEFAULT;
			case StructuralPackage.TASK_INPUT__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
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
		result.append(" (activationThreshold: ");
		result.append(activationThreshold);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(')');
		return result.toString();
	}

} //TaskInputImpl
