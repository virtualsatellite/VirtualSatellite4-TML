/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationLiteralImpl#getKeyNum <em>Key Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationLiteralImpl extends GenericCategoryImpl implements EnumerationLiteral {
	/**
	 * The default value of the '{@link #getKeyNum() <em>Key Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyNum()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKeyNum() <em>Key Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyNum()
	 * @generated
	 * @ordered
	 */
	protected int keyNum = KEY_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKeyNum() {
		return keyNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyNum(int newKeyNum) {
		int oldKeyNum = keyNum;
		keyNum = newKeyNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ENUMERATION_LITERAL__KEY_NUM, oldKeyNum, keyNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralPackage.ENUMERATION_LITERAL__KEY_NUM:
				return getKeyNum();
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
			case StructuralPackage.ENUMERATION_LITERAL__KEY_NUM:
				setKeyNum((Integer)newValue);
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
			case StructuralPackage.ENUMERATION_LITERAL__KEY_NUM:
				setKeyNum(KEY_NUM_EDEFAULT);
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
			case StructuralPackage.ENUMERATION_LITERAL__KEY_NUM:
				return keyNum != KEY_NUM_EDEFAULT;
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
		result.append(" (keyNum: ");
		result.append(keyNum);
		result.append(')');
		return result.toString();
	}

} //EnumerationLiteralImpl
