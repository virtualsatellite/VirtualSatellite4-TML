/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Defintion Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorDefintionStorage#getChannelBehaviorDefintions <em>Channel Behavior Defintions</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getBehaviorDefintionStorage()
 * @model
 * @generated
 */
public interface BehaviorDefintionStorage extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Channel Behavior Defintions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Behavior Defintions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Behavior Defintions</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage#getBehaviorDefintionStorage_ChannelBehaviorDefintions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChannelBehaviorDefinition> getChannelBehaviorDefintions();

} // BehaviorDefintionStorage
