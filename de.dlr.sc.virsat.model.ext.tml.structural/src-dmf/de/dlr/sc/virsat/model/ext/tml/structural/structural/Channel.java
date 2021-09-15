/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel#getChannelBehavior <em>Channel Behavior</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends IEventSource {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getChannel_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Channel Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Behavior</em>' containment reference.
	 * @see #setChannelBehavior(ChannelBehavior)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getChannel_ChannelBehavior()
	 * @model containment="true"
	 * @generated
	 */
	ChannelBehavior getChannelBehavior();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel#getChannelBehavior <em>Channel Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Behavior</em>' containment reference.
	 * @see #getChannelBehavior()
	 * @generated
	 */
	void setChannelBehavior(ChannelBehavior value);

} // Channel
