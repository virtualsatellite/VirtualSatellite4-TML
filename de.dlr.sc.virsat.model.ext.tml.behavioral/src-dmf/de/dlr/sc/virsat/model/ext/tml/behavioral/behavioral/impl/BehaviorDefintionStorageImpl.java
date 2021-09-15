/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Defintion Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehaviorDefintionStorageImpl#getChannelBehaviorDefintions <em>Channel Behavior Defintions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorDefintionStorageImpl extends GenericCategoryImpl implements BehaviorDefintionStorage {
	/**
	 * The cached value of the '{@link #getChannelBehaviorDefintions() <em>Channel Behavior Defintions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelBehaviorDefintions()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelBehaviorDefinition> channelBehaviorDefintions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorDefintionStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehavioralPackage.Literals.BEHAVIOR_DEFINTION_STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChannelBehaviorDefinition> getChannelBehaviorDefintions() {
		if (channelBehaviorDefintions == null) {
			channelBehaviorDefintions = new EObjectContainmentEList<ChannelBehaviorDefinition>(ChannelBehaviorDefinition.class, this, BehavioralPackage.BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS);
		}
		return channelBehaviorDefintions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehavioralPackage.BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS:
				return ((InternalEList<?>)getChannelBehaviorDefintions()).basicRemove(otherEnd, msgs);
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
			case BehavioralPackage.BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS:
				return getChannelBehaviorDefintions();
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
			case BehavioralPackage.BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS:
				getChannelBehaviorDefintions().clear();
				getChannelBehaviorDefintions().addAll((Collection<? extends ChannelBehaviorDefinition>)newValue);
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
			case BehavioralPackage.BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS:
				getChannelBehaviorDefintions().clear();
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
			case BehavioralPackage.BEHAVIOR_DEFINTION_STORAGE__CHANNEL_BEHAVIOR_DEFINTIONS:
				return channelBehaviorDefintions != null && !channelBehaviorDefintions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorDefintionStorageImpl
