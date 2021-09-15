/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl#getSerializedDefinition <em>Serialized Definition</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskDefinitionImpl#getSchedulePolicy <em>Schedule Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskDefinitionImpl extends GenericCategoryImpl implements TaskDefinition {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInputDefinition> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskOutputDefinition> outputs;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> parameters;

	/**
	 * The default value of the '{@link #getSerializedDefinition() <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIALIZED_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerializedDefinition() <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedDefinition()
	 * @generated
	 * @ordered
	 */
	protected String serializedDefinition = SERIALIZED_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulePolicy() <em>Schedule Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final EnumSchedulePolicy SCHEDULE_POLICY_EDEFAULT = EnumSchedulePolicy.PRIORITY;

	/**
	 * The cached value of the '{@link #getSchedulePolicy() <em>Schedule Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulePolicy()
	 * @generated
	 * @ordered
	 */
	protected EnumSchedulePolicy schedulePolicy = SCHEDULE_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.TASK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskInputDefinition> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<TaskInputDefinition>(TaskInputDefinition.class, this, StructuralPackage.TASK_DEFINITION__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskOutputDefinition> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<TaskOutputDefinition>(TaskOutputDefinition.class, this, StructuralPackage.TASK_DEFINITION__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Attribute>(Attribute.class, this, StructuralPackage.TASK_DEFINITION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerializedDefinition() {
		return serializedDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerializedDefinition(String newSerializedDefinition) {
		String oldSerializedDefinition = serializedDefinition;
		serializedDefinition = newSerializedDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_DEFINITION__SERIALIZED_DEFINITION, oldSerializedDefinition, serializedDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumSchedulePolicy getSchedulePolicy() {
		return schedulePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedulePolicy(EnumSchedulePolicy newSchedulePolicy) {
		EnumSchedulePolicy oldSchedulePolicy = schedulePolicy;
		schedulePolicy = newSchedulePolicy == null ? SCHEDULE_POLICY_EDEFAULT : newSchedulePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASK_DEFINITION__SCHEDULE_POLICY, oldSchedulePolicy, schedulePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralPackage.TASK_DEFINITION__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASK_DEFINITION__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASK_DEFINITION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralPackage.TASK_DEFINITION__INPUTS:
				return getInputs();
			case StructuralPackage.TASK_DEFINITION__OUTPUTS:
				return getOutputs();
			case StructuralPackage.TASK_DEFINITION__PARAMETERS:
				return getParameters();
			case StructuralPackage.TASK_DEFINITION__SERIALIZED_DEFINITION:
				return getSerializedDefinition();
			case StructuralPackage.TASK_DEFINITION__SCHEDULE_POLICY:
				return getSchedulePolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuralPackage.TASK_DEFINITION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends TaskInputDefinition>)newValue);
				return;
			case StructuralPackage.TASK_DEFINITION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends TaskOutputDefinition>)newValue);
				return;
			case StructuralPackage.TASK_DEFINITION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Attribute>)newValue);
				return;
			case StructuralPackage.TASK_DEFINITION__SERIALIZED_DEFINITION:
				setSerializedDefinition((String)newValue);
				return;
			case StructuralPackage.TASK_DEFINITION__SCHEDULE_POLICY:
				setSchedulePolicy((EnumSchedulePolicy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructuralPackage.TASK_DEFINITION__INPUTS:
				getInputs().clear();
				return;
			case StructuralPackage.TASK_DEFINITION__OUTPUTS:
				getOutputs().clear();
				return;
			case StructuralPackage.TASK_DEFINITION__PARAMETERS:
				getParameters().clear();
				return;
			case StructuralPackage.TASK_DEFINITION__SERIALIZED_DEFINITION:
				setSerializedDefinition(SERIALIZED_DEFINITION_EDEFAULT);
				return;
			case StructuralPackage.TASK_DEFINITION__SCHEDULE_POLICY:
				setSchedulePolicy(SCHEDULE_POLICY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructuralPackage.TASK_DEFINITION__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case StructuralPackage.TASK_DEFINITION__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case StructuralPackage.TASK_DEFINITION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StructuralPackage.TASK_DEFINITION__SERIALIZED_DEFINITION:
				return SERIALIZED_DEFINITION_EDEFAULT == null ? serializedDefinition != null : !SERIALIZED_DEFINITION_EDEFAULT.equals(serializedDefinition);
			case StructuralPackage.TASK_DEFINITION__SCHEDULE_POLICY:
				return schedulePolicy != SCHEDULE_POLICY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (serializedDefinition: ");
		result.append(serializedDefinition);
		result.append(", schedulePolicy: ");
		result.append(schedulePolicy);
		result.append(')');
		return result.toString();
	}

} //TaskDefinitionImpl
