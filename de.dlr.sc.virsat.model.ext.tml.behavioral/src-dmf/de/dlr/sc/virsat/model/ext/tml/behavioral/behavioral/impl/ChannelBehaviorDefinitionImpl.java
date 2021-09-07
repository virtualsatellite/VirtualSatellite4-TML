/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Behavior Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorDefinitionImpl#getStorageType <em>Storage Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorDefinitionImpl#getImplName <em>Impl Name</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.ChannelBehaviorDefinitionImpl#getSerializedDefinition <em>Serialized Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelBehaviorDefinitionImpl extends BehaviorDefinitionImpl implements ChannelBehaviorDefinition {
	/**
	 * The default value of the '{@link #getStorageType() <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumStorageType STORAGE_TYPE_EDEFAULT = EnumStorageType.DOUBLE_BUFFER;

	/**
	 * The cached value of the '{@link #getStorageType() <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageType()
	 * @generated
	 * @ordered
	 */
	protected EnumStorageType storageType = STORAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplName() <em>Impl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplName() <em>Impl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplName()
	 * @generated
	 * @ordered
	 */
	protected String implName = IMPL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerializedDefinition() <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIALIZED_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerializedDefinition() <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedDefinition()
	 * @generated
	 * @ordered
	 */
	protected String serializedDefinition = SERIALIZED_DEFINITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelBehaviorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehavioralPackage.Literals.CHANNEL_BEHAVIOR_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumStorageType getStorageType() {
		return storageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageType(EnumStorageType newStorageType) {
		EnumStorageType oldStorageType = storageType;
		storageType = newStorageType == null ? STORAGE_TYPE_EDEFAULT : newStorageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__STORAGE_TYPE, oldStorageType, storageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplName() {
		return implName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplName(String newImplName) {
		String oldImplName = implName;
		implName = newImplName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__IMPL_NAME, oldImplName, implName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerializedDefinition() {
		return serializedDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerializedDefinition(String newSerializedDefinition) {
		String oldSerializedDefinition = serializedDefinition;
		serializedDefinition = newSerializedDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__SERIALIZED_DEFINITION, oldSerializedDefinition, serializedDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__STORAGE_TYPE:
				return getStorageType();
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__IMPL_NAME:
				return getImplName();
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__SERIALIZED_DEFINITION:
				return getSerializedDefinition();
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
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__STORAGE_TYPE:
				setStorageType((EnumStorageType)newValue);
				return;
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__IMPL_NAME:
				setImplName((String)newValue);
				return;
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__SERIALIZED_DEFINITION:
				setSerializedDefinition((String)newValue);
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
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__STORAGE_TYPE:
				setStorageType(STORAGE_TYPE_EDEFAULT);
				return;
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__IMPL_NAME:
				setImplName(IMPL_NAME_EDEFAULT);
				return;
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__SERIALIZED_DEFINITION:
				setSerializedDefinition(SERIALIZED_DEFINITION_EDEFAULT);
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
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__STORAGE_TYPE:
				return storageType != STORAGE_TYPE_EDEFAULT;
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__IMPL_NAME:
				return IMPL_NAME_EDEFAULT == null ? implName != null : !IMPL_NAME_EDEFAULT.equals(implName);
			case BehavioralPackage.CHANNEL_BEHAVIOR_DEFINITION__SERIALIZED_DEFINITION:
				return SERIALIZED_DEFINITION_EDEFAULT == null ? serializedDefinition != null : !SERIALIZED_DEFINITION_EDEFAULT.equals(serializedDefinition);
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
		result.append(" (storageType: ");
		result.append(storageType);
		result.append(", implName: ");
		result.append(implName);
		result.append(", serializedDefinition: ");
		result.append(serializedDefinition);
		result.append(')');
		return result.toString();
	}

} //ChannelBehaviorDefinitionImpl
