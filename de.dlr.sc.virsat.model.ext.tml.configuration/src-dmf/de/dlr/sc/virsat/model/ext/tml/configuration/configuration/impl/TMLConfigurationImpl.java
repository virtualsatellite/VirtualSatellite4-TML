/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TML Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.TMLConfigurationImpl#getGeneratorConfiguration <em>Generator Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMLConfigurationImpl extends GenericCategoryImpl implements TMLConfiguration {
	/**
	 * The cached value of the '{@link #getGeneratorConfiguration() <em>Generator Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorConfiguration()
	 * @generated
	 * @ordered
	 */
	protected GenerationConfiguration generatorConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMLConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.TML_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationConfiguration getGeneratorConfiguration() {
		return generatorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorConfiguration(GenerationConfiguration newGeneratorConfiguration, NotificationChain msgs) {
		GenerationConfiguration oldGeneratorConfiguration = generatorConfiguration;
		generatorConfiguration = newGeneratorConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION, oldGeneratorConfiguration, newGeneratorConfiguration);
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
	public void setGeneratorConfiguration(GenerationConfiguration newGeneratorConfiguration) {
		if (newGeneratorConfiguration != generatorConfiguration) {
			NotificationChain msgs = null;
			if (generatorConfiguration != null)
				msgs = ((InternalEObject)generatorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION, null, msgs);
			if (newGeneratorConfiguration != null)
				msgs = ((InternalEObject)newGeneratorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION, null, msgs);
			msgs = basicSetGeneratorConfiguration(newGeneratorConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION, newGeneratorConfiguration, newGeneratorConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION:
				return basicSetGeneratorConfiguration(null, msgs);
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
			case ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION:
				return getGeneratorConfiguration();
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
			case ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION:
				setGeneratorConfiguration((GenerationConfiguration)newValue);
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
			case ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION:
				setGeneratorConfiguration((GenerationConfiguration)null);
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
			case ConfigurationPackage.TML_CONFIGURATION__GENERATOR_CONFIGURATION:
				return generatorConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //TMLConfigurationImpl
