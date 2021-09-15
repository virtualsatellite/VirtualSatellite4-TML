/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tasking Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getTasks <em>Tasks</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getChannels <em>Channels</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getTimeEvents <em>Time Events</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getGlobalParameters <em>Global Parameters</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getLastDiagramChange <em>Last Diagram Change</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getSchedularPolicy <em>Schedular Policy</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getNumberOfExecutors <em>Number Of Executors</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingEnvironment()
 * @model
 * @generated
 */
public interface TaskingEnvironment extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingEnvironment_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskInstance> getTasks();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingEnvironment_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Time Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Events</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingEnvironment_TimeEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeEvent> getTimeEvents();

	/**
	 * Returns the value of the '<em><b>Global Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Parameters</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingEnvironment_GlobalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getGlobalParameters();

	/**
	 * Returns the value of the '<em><b>Last Diagram Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Diagram Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Diagram Change</em>' attribute.
	 * @see #setLastDiagramChange(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingEnvironment_LastDiagramChange()
	 * @model
	 * @generated
	 */
	String getLastDiagramChange();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getLastDiagramChange <em>Last Diagram Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Diagram Change</em>' attribute.
	 * @see #getLastDiagramChange()
	 * @generated
	 */
	void setLastDiagramChange(String value);

	/**
	 * Returns the value of the '<em><b>Schedular Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedular Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedular Policy</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy
	 * @see #setSchedularPolicy(EnumSchedularPolicy)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingEnvironment_SchedularPolicy()
	 * @model
	 * @generated
	 */
	EnumSchedularPolicy getSchedularPolicy();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getSchedularPolicy <em>Schedular Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedular Policy</em>' attribute.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy
	 * @see #getSchedularPolicy()
	 * @generated
	 */
	void setSchedularPolicy(EnumSchedularPolicy value);

	/**
	 * Returns the value of the '<em><b>Number Of Executors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Executors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Executors</em>' attribute.
	 * @see #setNumberOfExecutors(int)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingEnvironment_NumberOfExecutors()
	 * @model
	 * @generated
	 */
	int getNumberOfExecutors();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment#getNumberOfExecutors <em>Number Of Executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Executors</em>' attribute.
	 * @see #getNumberOfExecutors()
	 * @generated
	 */
	void setNumberOfExecutors(int value);

} // TaskingEnvironment
