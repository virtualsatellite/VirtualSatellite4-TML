/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#isAbstractType <em>Abstract Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#isIsTMType <em>Is TM Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getSerializedDefinition <em>Serialized Definition</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends IType {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(DataType)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getDataType_SuperType()
	 * @model
	 * @generated
	 */
	DataType getSuperType();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(DataType value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getDataType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Abstract Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Type</em>' attribute.
	 * @see #setAbstractType(boolean)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getDataType_AbstractType()
	 * @model
	 * @generated
	 */
	boolean isAbstractType();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#isAbstractType <em>Abstract Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Type</em>' attribute.
	 * @see #isAbstractType()
	 * @generated
	 */
	void setAbstractType(boolean value);

	/**
	 * Returns the value of the '<em><b>Is TM Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is TM Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is TM Type</em>' attribute.
	 * @see #setIsTMType(boolean)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getDataType_IsTMType()
	 * @model
	 * @generated
	 */
	boolean isIsTMType();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#isIsTMType <em>Is TM Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is TM Type</em>' attribute.
	 * @see #isIsTMType()
	 * @generated
	 */
	void setIsTMType(boolean value);

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
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getDataType_SerializedDefinition()
	 * @model
	 * @generated
	 */
	String getSerializedDefinition();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType#getSerializedDefinition <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialized Definition</em>' attribute.
	 * @see #getSerializedDefinition()
	 * @generated
	 */
	void setSerializedDefinition(String value);

} // DataType
