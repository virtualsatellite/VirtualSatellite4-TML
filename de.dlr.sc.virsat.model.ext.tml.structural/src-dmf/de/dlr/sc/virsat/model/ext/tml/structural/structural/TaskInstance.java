/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import org.eclipse.emf.common.util.EList;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.TaskBehavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getTaskBehavior <em>Task Behavior</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskInstance()
 * @model
 * @generated
 */
public interface TaskInstance extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of</em>' reference.
	 * @see #setTypeOf(TaskDefinition)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskInstance_TypeOf()
	 * @model
	 * @generated
	 */
	TaskDefinition getTypeOf();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getTypeOf <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of</em>' reference.
	 * @see #getTypeOf()
	 * @generated
	 */
	void setTypeOf(TaskDefinition value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskInstance_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Task Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Behavior</em>' containment reference.
	 * @see #setTaskBehavior(TaskBehavior)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskInstance_TaskBehavior()
	 * @model containment="true"
	 * @generated
	 */
	TaskBehavior getTaskBehavior();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance#getTaskBehavior <em>Task Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Behavior</em>' containment reference.
	 * @see #getTaskBehavior()
	 * @generated
	 */
	void setTaskBehavior(TaskBehavior value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskInstance_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskOutput> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskInstance_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskInput> getInputs();

} // TaskInstance
