/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralParameterDefinitionImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralParameterDefinitionImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralParameterDefinitionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehavioralParameterDefinitionImpl extends GenericCategoryImpl implements BehavioralParameterDefinition {
	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumValueType VALUE_TYPE_EDEFAULT = EnumValueType.INTEGER;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected EnumValueType valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralParameterDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehavioralPackage.Literals.BEHAVIORAL_PARAMETER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValueType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueType(EnumValueType newValueType) {
		EnumValueType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__IS_STATIC:
				return isIsStatic();
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE_TYPE:
				return getValueType();
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE:
				return getValue();
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
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE_TYPE:
				setValueType((EnumValueType)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE:
				setValue((String)newValue);
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
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE_TYPE:
				return valueType != VALUE_TYPE_EDEFAULT;
			case BehavioralPackage.BEHAVIORAL_PARAMETER_DEFINITION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (isStatic: ");
		result.append(isStatic);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //BehavioralParameterDefinitionImpl
