/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage
 * @generated
 */
public interface ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationFactory eINSTANCE = de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.ConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TML Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TML Configuration</em>'.
	 * @generated
	 */
	TMLConfiguration createTMLConfiguration();

	/**
	 * Returns a new object of class '<em>Generation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Configuration</em>'.
	 * @generated
	 */
	GenerationConfiguration createGenerationConfiguration();

	/**
	 * Returns a new object of class '<em>Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Configuration</em>'.
	 * @generated
	 */
	ElementConfiguration createElementConfiguration();

	/**
	 * Returns a new object of class '<em>Tasking Environment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tasking Environment Configuration</em>'.
	 * @generated
	 */
	TaskingEnvironmentConfiguration createTaskingEnvironmentConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationPackage getConfigurationPackage();

} //ConfigurationFactory
