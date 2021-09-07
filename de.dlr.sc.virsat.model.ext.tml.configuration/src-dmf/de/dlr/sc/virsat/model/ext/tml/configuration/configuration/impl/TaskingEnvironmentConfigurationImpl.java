/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl;

import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tasking Environment Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TaskingEnvironmentConfigurationImpl#getDomainElement <em>Domain Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskingEnvironmentConfigurationImpl extends ElementConfigurationImpl implements TaskingEnvironmentConfiguration {
	/**
	 * The cached value of the '{@link #getDomainElement() <em>Domain Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElement()
	 * @generated
	 * @ordered
	 */
	protected TaskingEnvironment domainElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskingEnvironmentConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.TASKING_ENVIRONMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskingEnvironment getDomainElement() {
		if (domainElement != null && domainElement.eIsProxy()) {
			InternalEObject oldDomainElement = (InternalEObject)domainElement;
			domainElement = (TaskingEnvironment)eResolveProxy(oldDomainElement);
			if (domainElement != oldDomainElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationPackage.TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT, oldDomainElement, domainElement));
			}
		}
		return domainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskingEnvironment basicGetDomainElement() {
		return domainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainElement(TaskingEnvironment newDomainElement) {
		TaskingEnvironment oldDomainElement = domainElement;
		domainElement = newDomainElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT, oldDomainElement, domainElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT:
				if (resolve) return getDomainElement();
				return basicGetDomainElement();
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
			case ConfigurationPackage.TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT:
				setDomainElement((TaskingEnvironment)newValue);
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
			case ConfigurationPackage.TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT:
				setDomainElement((TaskingEnvironment)null);
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
			case ConfigurationPackage.TASKING_ENVIRONMENT_CONFIGURATION__DOMAIN_ELEMENT:
				return domainElement != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskingEnvironmentConfigurationImpl
