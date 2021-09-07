/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput#getChannels <em>Channels</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskOutput()
 * @model
 * @generated
 */
public interface TaskOutput extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of</em>' reference.
	 * @see #setTypeOf(TaskOutputDefinition)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskOutput_TypeOf()
	 * @model
	 * @generated
	 */
	TaskOutputDefinition getTypeOf();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput#getTypeOf <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of</em>' reference.
	 * @see #getTypeOf()
	 * @generated
	 */
	void setTypeOf(TaskOutputDefinition value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskOutput_Channels()
	 * @model
	 * @generated
	 */
	EList<Channel> getChannels();

} // TaskOutput
