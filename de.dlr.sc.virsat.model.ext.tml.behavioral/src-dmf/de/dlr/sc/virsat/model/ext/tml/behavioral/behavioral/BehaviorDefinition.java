/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefinition#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getBehaviorDefinition()
 * @model
 * @generated
 */
public interface BehaviorDefinition extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getBehaviorDefinition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehavioralParameterDefinition> getParameters();

} // BehaviorDefinition
