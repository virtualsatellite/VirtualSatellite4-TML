/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Output Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskOutputDefinition()
 * @model
 * @generated
 */
public interface TaskOutputDefinition extends GenericCategory {
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
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskOutputDefinition_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // TaskOutputDefinition
