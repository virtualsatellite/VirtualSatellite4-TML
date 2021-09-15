/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Behavior Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getStorageType <em>Storage Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getImplName <em>Impl Name</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getSerializedDefinition <em>Serialized Definition</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getChannelBehaviorDefinition()
 * @model
 * @generated
 */
public interface ChannelBehaviorDefinition extends BehaviorDefinition {
	/**
	 * Returns the value of the '<em><b>Storage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Type</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType
	 * @see #setStorageType(EnumStorageType)
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getChannelBehaviorDefinition_StorageType()
	 * @model
	 * @generated
	 */
	EnumStorageType getStorageType();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getStorageType <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Type</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType
	 * @see #getStorageType()
	 * @generated
	 */
	void setStorageType(EnumStorageType value);

	/**
	 * Returns the value of the '<em><b>Impl Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Name</em>' attribute.
	 * @see #setImplName(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getChannelBehaviorDefinition_ImplName()
	 * @model
	 * @generated
	 */
	String getImplName();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getImplName <em>Impl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Name</em>' attribute.
	 * @see #getImplName()
	 * @generated
	 */
	void setImplName(String value);

	/**
	 * Returns the value of the '<em><b>Serialized Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialized Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialized Definition</em>' attribute.
	 * @see #setSerializedDefinition(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getChannelBehaviorDefinition_SerializedDefinition()
	 * @model
	 * @generated
	 */
	String getSerializedDefinition();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition#getSerializedDefinition <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialized Definition</em>' attribute.
	 * @see #getSerializedDefinition()
	 * @generated
	 */
	void setSerializedDefinition(String value);

} // ChannelBehaviorDefinition
