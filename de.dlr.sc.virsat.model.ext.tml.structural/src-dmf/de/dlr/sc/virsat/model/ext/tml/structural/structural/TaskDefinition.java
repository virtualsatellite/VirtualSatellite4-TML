/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import org.eclipse.emf.common.util.EList;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getSerializedDefinition <em>Serialized Definition</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getSchedulePolicy <em>Schedule Policy</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskDefinition()
 * @model
 * @generated
 */
public interface TaskDefinition extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskDefinition_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskInputDefinition> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskDefinition_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskOutputDefinition> getOutputs();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskDefinition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getParameters();

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
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskDefinition_SerializedDefinition()
	 * @model
	 * @generated
	 */
	String getSerializedDefinition();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getSerializedDefinition <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialized Definition</em>' attribute.
	 * @see #getSerializedDefinition()
	 * @generated
	 */
	void setSerializedDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Schedule Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Policy</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy
	 * @see #setSchedulePolicy(EnumSchedulePolicy)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskDefinition_SchedulePolicy()
	 * @model
	 * @generated
	 */
	EnumSchedulePolicy getSchedulePolicy();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition#getSchedulePolicy <em>Schedule Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Policy</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy
	 * @see #getSchedulePolicy()
	 * @generated
	 */
	void setSchedulePolicy(EnumSchedulePolicy value);

} // TaskDefinition
