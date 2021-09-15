/**
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralPackage
 * @generated
 */
public interface BehavioralFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehavioralFactory eINSTANCE = de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.impl.BehavioralFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	BehavioralParameterDefinition createBehavioralParameterDefinition();

	/**
	 * Returns a new object of class '<em>Channel Behavior Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Behavior Definition</em>'.
	 * @generated
	 */
	ChannelBehaviorDefinition createChannelBehaviorDefinition();

	/**
	 * Returns a new object of class '<em>Behavior Defintion Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Defintion Storage</em>'.
	 * @generated
	 */
	BehaviorDefintionStorage createBehaviorDefintionStorage();

	/**
	 * Returns a new object of class '<em>Behavior Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Definition</em>'.
	 * @generated
	 */
	BehaviorDefinition createBehaviorDefinition();

	/**
	 * Returns a new object of class '<em>Time Event Behavior Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Event Behavior Definition</em>'.
	 * @generated
	 */
	TimeEventBehaviorDefinition createTimeEventBehaviorDefinition();

	/**
	 * Returns a new object of class '<em>Task Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Behavior</em>'.
	 * @generated
	 */
	TaskBehavior createTaskBehavior();

	/**
	 * Returns a new object of class '<em>Behavior Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Parameter</em>'.
	 * @generated
	 */
	BehaviorParameter createBehaviorParameter();

	/**
	 * Returns a new object of class '<em>Channel Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Behavior</em>'.
	 * @generated
	 */
	ChannelBehavior createChannelBehavior();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehavioralPackage getBehavioralPackage();

} //BehavioralFactory
