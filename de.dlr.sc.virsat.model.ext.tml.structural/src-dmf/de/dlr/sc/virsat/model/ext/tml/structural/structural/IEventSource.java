/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEvent Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getIEventSource()
 * @model
 * @generated
 */
public interface IEventSource extends GenericCategory {

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getIEventSource_Inputs()
	 * @model
	 * @generated
	 */
	EList<TaskInput> getInputs();
} // IEventSource
