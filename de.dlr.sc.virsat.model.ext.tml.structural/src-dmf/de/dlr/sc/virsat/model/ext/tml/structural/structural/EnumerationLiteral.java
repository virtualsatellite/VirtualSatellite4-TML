/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral#getKeyNum <em>Key Num</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Key Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Num</em>' attribute.
	 * @see #setKeyNum(int)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getEnumerationLiteral_KeyNum()
	 * @model
	 * @generated
	 */
	int getKeyNum();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral#getKeyNum <em>Key Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Num</em>' attribute.
	 * @see #getKeyNum()
	 * @generated
	 */
	void setKeyNum(int value);

} // EnumerationLiteral
