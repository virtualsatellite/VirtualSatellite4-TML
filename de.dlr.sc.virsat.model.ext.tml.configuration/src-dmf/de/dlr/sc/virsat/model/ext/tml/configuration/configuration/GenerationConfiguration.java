/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getGenerationPath <em>Generation Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getSrcGenPath <em>Src Gen Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getSrcPath <em>Src Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getBuildGenPath <em>Build Gen Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTestPath <em>Test Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskDefinitionFolder <em>Task Definition Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getChannelDefinitionFolder <em>Channel Definition Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTypeDefinitionFolder <em>Type Definition Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getContribFolder <em>Contrib Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getLibconfigFolder <em>Libconfig Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskingVersion <em>Tasking Version</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskingEnvironmentConfiguration <em>Tasking Environment Configuration</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration()
 * @model
 * @generated
 */
public interface GenerationConfiguration extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Generation Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Path</em>' attribute.
	 * @see #setGenerationPath(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_GenerationPath()
	 * @model
	 * @generated
	 */
	String getGenerationPath();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getGenerationPath <em>Generation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Path</em>' attribute.
	 * @see #getGenerationPath()
	 * @generated
	 */
	void setGenerationPath(String value);

	/**
	 * Returns the value of the '<em><b>Src Gen Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Gen Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Gen Path</em>' attribute.
	 * @see #setSrcGenPath(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_SrcGenPath()
	 * @model
	 * @generated
	 */
	String getSrcGenPath();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getSrcGenPath <em>Src Gen Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Gen Path</em>' attribute.
	 * @see #getSrcGenPath()
	 * @generated
	 */
	void setSrcGenPath(String value);

	/**
	 * Returns the value of the '<em><b>Src Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Path</em>' attribute.
	 * @see #setSrcPath(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_SrcPath()
	 * @model
	 * @generated
	 */
	String getSrcPath();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getSrcPath <em>Src Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Path</em>' attribute.
	 * @see #getSrcPath()
	 * @generated
	 */
	void setSrcPath(String value);

	/**
	 * Returns the value of the '<em><b>Build Gen Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Gen Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Gen Path</em>' attribute.
	 * @see #setBuildGenPath(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_BuildGenPath()
	 * @model
	 * @generated
	 */
	String getBuildGenPath();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getBuildGenPath <em>Build Gen Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Gen Path</em>' attribute.
	 * @see #getBuildGenPath()
	 * @generated
	 */
	void setBuildGenPath(String value);

	/**
	 * Returns the value of the '<em><b>Test Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Path</em>' attribute.
	 * @see #setTestPath(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_TestPath()
	 * @model
	 * @generated
	 */
	String getTestPath();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTestPath <em>Test Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Path</em>' attribute.
	 * @see #getTestPath()
	 * @generated
	 */
	void setTestPath(String value);

	/**
	 * Returns the value of the '<em><b>Task Definition Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Definition Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Definition Folder</em>' attribute.
	 * @see #setTaskDefinitionFolder(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_TaskDefinitionFolder()
	 * @model
	 * @generated
	 */
	String getTaskDefinitionFolder();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskDefinitionFolder <em>Task Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Definition Folder</em>' attribute.
	 * @see #getTaskDefinitionFolder()
	 * @generated
	 */
	void setTaskDefinitionFolder(String value);

	/**
	 * Returns the value of the '<em><b>Channel Definition Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Definition Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Definition Folder</em>' attribute.
	 * @see #setChannelDefinitionFolder(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_ChannelDefinitionFolder()
	 * @model
	 * @generated
	 */
	String getChannelDefinitionFolder();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getChannelDefinitionFolder <em>Channel Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Definition Folder</em>' attribute.
	 * @see #getChannelDefinitionFolder()
	 * @generated
	 */
	void setChannelDefinitionFolder(String value);

	/**
	 * Returns the value of the '<em><b>Type Definition Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition Folder</em>' attribute.
	 * @see #setTypeDefinitionFolder(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_TypeDefinitionFolder()
	 * @model
	 * @generated
	 */
	String getTypeDefinitionFolder();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTypeDefinitionFolder <em>Type Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition Folder</em>' attribute.
	 * @see #getTypeDefinitionFolder()
	 * @generated
	 */
	void setTypeDefinitionFolder(String value);

	/**
	 * Returns the value of the '<em><b>Contrib Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrib Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrib Folder</em>' attribute.
	 * @see #setContribFolder(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_ContribFolder()
	 * @model
	 * @generated
	 */
	String getContribFolder();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getContribFolder <em>Contrib Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrib Folder</em>' attribute.
	 * @see #getContribFolder()
	 * @generated
	 */
	void setContribFolder(String value);

	/**
	 * Returns the value of the '<em><b>Libconfig Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libconfig Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libconfig Folder</em>' attribute.
	 * @see #setLibconfigFolder(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_LibconfigFolder()
	 * @model
	 * @generated
	 */
	String getLibconfigFolder();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getLibconfigFolder <em>Libconfig Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libconfig Folder</em>' attribute.
	 * @see #getLibconfigFolder()
	 * @generated
	 */
	void setLibconfigFolder(String value);

	/**
	 * Returns the value of the '<em><b>Tasking Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasking Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasking Version</em>' attribute.
	 * @see #setTaskingVersion(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_TaskingVersion()
	 * @model
	 * @generated
	 */
	String getTaskingVersion();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskingVersion <em>Tasking Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasking Version</em>' attribute.
	 * @see #getTaskingVersion()
	 * @generated
	 */
	void setTaskingVersion(String value);

	/**
	 * Returns the value of the '<em><b>Tasking Environment Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasking Environment Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasking Environment Configuration</em>' containment reference.
	 * @see #setTaskingEnvironmentConfiguration(TaskingEnvironmentConfiguration)
	 * @see de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage#getGenerationConfiguration_TaskingEnvironmentConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	TaskingEnvironmentConfiguration getTaskingEnvironmentConfiguration();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration#getTaskingEnvironmentConfiguration <em>Tasking Environment Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasking Environment Configuration</em>' containment reference.
	 * @see #getTaskingEnvironmentConfiguration()
	 * @generated
	 */
	void setTaskingEnvironmentConfiguration(TaskingEnvironmentConfiguration value);

} // GenerationConfiguration
