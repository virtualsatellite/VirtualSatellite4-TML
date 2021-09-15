/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getSize <em>Size</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getSource <em>Source</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#isCustomSource <em>Custom Source</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getBasicTypeDefinition()
 * @model
 * @generated
 */
public interface BasicTypeDefinition extends IType {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType
	 * @see #setValueType(EnumValueType)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getBasicTypeDefinition_ValueType()
	 * @model
	 * @generated
	 */
	EnumValueType getValueType();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(EnumValueType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getBasicTypeDefinition_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getBasicTypeDefinition_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Custom Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Source</em>' attribute.
	 * @see #setCustomSource(boolean)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getBasicTypeDefinition_CustomSource()
	 * @model
	 * @generated
	 */
	boolean isCustomSource();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition#isCustomSource <em>Custom Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Source</em>' attribute.
	 * @see #isCustomSource()
	 * @generated
	 */
	void setCustomSource(boolean value);

} // BasicTypeDefinition
