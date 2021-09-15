/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ElementConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ElementConfigurationImpl#getImplementationName <em>Implementation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementConfigurationImpl extends GenericCategoryImpl implements ElementConfiguration {
	/**
	 * The default value of the '{@link #getImplementationName() <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationName() <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationName()
	 * @generated
	 * @ordered
	 */
	protected String implementationName = IMPLEMENTATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.ELEMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementationName() {
		return implementationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationName(String newImplementationName) {
		String oldImplementationName = implementationName;
		implementationName = newImplementationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME, oldImplementationName, implementationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME:
				return getImplementationName();
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
			case ConfigurationPackage.ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME:
				setImplementationName((String)newValue);
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
			case ConfigurationPackage.ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME:
				setImplementationName(IMPLEMENTATION_NAME_EDEFAULT);
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
			case ConfigurationPackage.ELEMENT_CONFIGURATION__IMPLEMENTATION_NAME:
				return IMPLEMENTATION_NAME_EDEFAULT == null ? implementationName != null : !IMPLEMENTATION_NAME_EDEFAULT.equals(implementationName);
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
		result.append(" (implementationName: ");
		result.append(implementationName);
		result.append(')');
		return result.toString();
	}

} //ElementConfigurationImpl
