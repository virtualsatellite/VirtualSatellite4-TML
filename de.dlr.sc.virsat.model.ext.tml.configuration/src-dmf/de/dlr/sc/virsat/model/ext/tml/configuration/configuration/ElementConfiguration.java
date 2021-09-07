/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ElementConfiguration#getImplementationName <em>Implementation Name</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getElementConfiguration()
 * @model
 * @generated
 */
public interface ElementConfiguration extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Name</em>' attribute.
	 * @see #setImplementationName(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getElementConfiguration_ImplementationName()
	 * @model
	 * @generated
	 */
	String getImplementationName();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ElementConfiguration#getImplementationName <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Name</em>' attribute.
	 * @see #getImplementationName()
	 * @generated
	 */
	void setImplementationName(String value);

} // ElementConfiguration
