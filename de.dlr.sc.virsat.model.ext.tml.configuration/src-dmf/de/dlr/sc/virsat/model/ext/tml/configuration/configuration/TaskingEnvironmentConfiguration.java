/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration;

import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tasking Environment Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration#getDomainElement <em>Domain Element</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getTaskingEnvironmentConfiguration()
 * @model
 * @generated
 */
public interface TaskingEnvironmentConfiguration extends ElementConfiguration {
	/**
	 * Returns the value of the '<em><b>Domain Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Element</em>' reference.
	 * @see #setDomainElement(TaskingEnvironment)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getTaskingEnvironmentConfiguration_DomainElement()
	 * @model
	 * @generated
	 */
	TaskingEnvironment getDomainElement();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration#getDomainElement <em>Domain Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Element</em>' reference.
	 * @see #getDomainElement()
	 * @generated
	 */
	void setDomainElement(TaskingEnvironment value);

} // TaskingEnvironmentConfiguration
