/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration#getLiterals <em>Literals</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration#getSerializedDefinition <em>Serialized Definition</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends IType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getEnumeration_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getLiterals();

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
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getEnumeration_SerializedDefinition()
	 * @model
	 * @generated
	 */
	String getSerializedDefinition();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration#getSerializedDefinition <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialized Definition</em>' attribute.
	 * @see #getSerializedDefinition()
	 * @generated
	 */
	void setSerializedDefinition(String value);

} // Enumeration
