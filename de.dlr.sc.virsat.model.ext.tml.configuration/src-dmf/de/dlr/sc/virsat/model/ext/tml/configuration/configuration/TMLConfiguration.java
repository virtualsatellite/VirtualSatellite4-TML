/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TML Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration#getGeneratorConfiguration <em>Generator Configuration</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getTMLConfiguration()
 * @model
 * @generated
 */
public interface TMLConfiguration extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Generator Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Configuration</em>' containment reference.
	 * @see #setGeneratorConfiguration(GenerationConfiguration)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getTMLConfiguration_GeneratorConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	GenerationConfiguration getGeneratorConfiguration();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TMLConfiguration#getGeneratorConfiguration <em>Generator Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Configuration</em>' containment reference.
	 * @see #getGeneratorConfiguration()
	 * @generated
	 */
	void setGeneratorConfiguration(GenerationConfiguration value);

} // TMLConfiguration
