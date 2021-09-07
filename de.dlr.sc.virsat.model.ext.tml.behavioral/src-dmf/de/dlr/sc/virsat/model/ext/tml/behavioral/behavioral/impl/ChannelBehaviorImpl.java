/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;

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
 * An implementation of the model object '<em><b>Channel Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorImpl#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorImpl#getParameterInstances <em>Parameter Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelBehaviorImpl extends GenericCategoryImpl implements ChannelBehavior {
	/**
	 * The cached value of the '{@link #getTypeOf() <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOf()
	 * @generated
	 * @ordered
	 */
	protected ChannelBehaviorDefinition typeOf;

	/**
	 * The cached value of the '{@link #getParameterInstances() <em>Parameter Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorParameter> parameterInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehavioralPackage.Literals.CHANNEL_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelBehaviorDefinition getTypeOf() {
		if (typeOf != null && typeOf.eIsProxy()) {
			InternalEObject oldTypeOf = (InternalEObject)typeOf;
			typeOf = (ChannelBehaviorDefinition)eResolveProxy(oldTypeOf);
			if (typeOf != oldTypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehavioralPackage.CHANNEL_BEHAVIOR__TYPE_OF, oldTypeOf, typeOf));
			}
		}
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelBehaviorDefinition basicGetTypeOf() {
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOf(ChannelBehaviorDefinition newTypeOf) {
		ChannelBehaviorDefinition oldTypeOf = typeOf;
		typeOf = newTypeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehavioralPackage.CHANNEL_BEHAVIOR__TYPE_OF, oldTypeOf, typeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviorParameter> getParameterInstances() {
		if (parameterInstances == null) {
			parameterInstances = new EObjectContainmentEList<BehaviorParameter>(BehaviorParameter.class, this, BehavioralPackage.CHANNEL_BEHAVIOR__PARAMETER_INSTANCES);
		}
		return parameterInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehavioralPackage.CHANNEL_BEHAVIOR__PARAMETER_INSTANCES:
				return ((InternalEList<?>)getParameterInstances()).basicRemove(otherEnd, msgs);
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
			case BehavioralPackage.CHANNEL_BEHAVIOR__TYPE_OF:
				if (resolve) return getTypeOf();
				return basicGetTypeOf();
			case BehavioralPackage.CHANNEL_BEHAVIOR__PARAMETER_INSTANCES:
				return getParameterInstances();
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
			case BehavioralPackage.CHANNEL_BEHAVIOR__TYPE_OF:
				setTypeOf((ChannelBehaviorDefinition)newValue);
				return;
			case BehavioralPackage.CHANNEL_BEHAVIOR__PARAMETER_INSTANCES:
				getParameterInstances().clear();
				getParameterInstances().addAll((Collection<? extends BehaviorParameter>)newValue);
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
			case BehavioralPackage.CHANNEL_BEHAVIOR__TYPE_OF:
				setTypeOf((ChannelBehaviorDefinition)null);
				return;
			case BehavioralPackage.CHANNEL_BEHAVIOR__PARAMETER_INSTANCES:
				getParameterInstances().clear();
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
			case BehavioralPackage.CHANNEL_BEHAVIOR__TYPE_OF:
				return typeOf != null;
			case BehavioralPackage.CHANNEL_BEHAVIOR__PARAMETER_INSTANCES:
				return parameterInstances != null && !parameterInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChannelBehaviorImpl
