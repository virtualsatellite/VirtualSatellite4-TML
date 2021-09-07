/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getBehavioralParameterDefinition()
 * @model
 * @generated
 */
public interface BehavioralParameterDefinition extends GenericCategory {

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getBehavioralParameterDefinition_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType
	 * @see #setValueType(EnumValueType)
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getBehavioralParameterDefinition_ValueType()
	 * @model
	 * @generated
	 */
	EnumValueType getValueType();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(EnumValueType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getBehavioralParameterDefinition_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);
} // BehavioralParameterDefinition
