/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedularPolicy;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent;
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
 * An implementation of the model object '<em><b>Tasking Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl#getTimeEvents <em>Time Events</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl#getGlobalParameters <em>Global Parameters</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl#getLastDiagramChange <em>Last Diagram Change</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl#getSchedularPolicy <em>Schedular Policy</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingEnvironmentImpl#getNumberOfExecutors <em>Number Of Executors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskingEnvironmentImpl extends GenericCategoryImpl implements TaskingEnvironment {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInstance> tasks;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The cached value of the '{@link #getTimeEvents() <em>Time Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeEvent> timeEvents;

	/**
	 * The cached value of the '{@link #getGlobalParameters() <em>Global Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> globalParameters;

	/**
	 * The default value of the '{@link #getLastDiagramChange() <em>Last Diagram Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDiagramChange()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_DIAGRAM_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastDiagramChange() <em>Last Diagram Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDiagramChange()
	 * @generated
	 * @ordered
	 */
	protected String lastDiagramChange = LAST_DIAGRAM_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedularPolicy() <em>Schedular Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedularPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final EnumSchedularPolicy SCHEDULAR_POLICY_EDEFAULT = EnumSchedularPolicy.PRIORITY;

	/**
	 * The cached value of the '{@link #getSchedularPolicy() <em>Schedular Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedularPolicy()
	 * @generated
	 * @ordered
	 */
	protected EnumSchedularPolicy schedularPolicy = SCHEDULAR_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfExecutors() <em>Number Of Executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExecutors()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_EXECUTORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfExecutors() <em>Number Of Executors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExecutors()
	 * @generated
	 * @ordered
	 */
	protected int numberOfExecutors = NUMBER_OF_EXECUTORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskingEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.TASKING_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskInstance> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<TaskInstance>(TaskInstance.class, this, StructuralPackage.TASKING_ENVIRONMENT__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<Channel>(Channel.class, this, StructuralPackage.TASKING_ENVIRONMENT__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeEvent> getTimeEvents() {
		if (timeEvents == null) {
			timeEvents = new EObjectContainmentEList<TimeEvent>(TimeEvent.class, this, StructuralPackage.TASKING_ENVIRONMENT__TIME_EVENTS);
		}
		return timeEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getGlobalParameters() {
		if (globalParameters == null) {
			globalParameters = new EObjectContainmentEList<Attribute>(Attribute.class, this, StructuralPackage.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS);
		}
		return globalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastDiagramChange() {
		return lastDiagramChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastDiagramChange(String newLastDiagramChange) {
		String oldLastDiagramChange = lastDiagramChange;
		lastDiagramChange = newLastDiagramChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE, oldLastDiagramChange, lastDiagramChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumSchedularPolicy getSchedularPolicy() {
		return schedularPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedularPolicy(EnumSchedularPolicy newSchedularPolicy) {
		EnumSchedularPolicy oldSchedularPolicy = schedularPolicy;
		schedularPolicy = newSchedularPolicy == null ? SCHEDULAR_POLICY_EDEFAULT : newSchedularPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASKING_ENVIRONMENT__SCHEDULAR_POLICY, oldSchedularPolicy, schedularPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfExecutors() {
		return numberOfExecutors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfExecutors(int newNumberOfExecutors) {
		int oldNumberOfExecutors = numberOfExecutors;
		numberOfExecutors = newNumberOfExecutors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS, oldNumberOfExecutors, numberOfExecutors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralPackage.TASKING_ENVIRONMENT__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_ENVIRONMENT__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_ENVIRONMENT__TIME_EVENTS:
				return ((InternalEList<?>)getTimeEvents()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS:
				return ((InternalEList<?>)getGlobalParameters()).basicRemove(otherEnd, msgs);
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
			case StructuralPackage.TASKING_ENVIRONMENT__TASKS:
				return getTasks();
			case StructuralPackage.TASKING_ENVIRONMENT__CHANNELS:
				return getChannels();
			case StructuralPackage.TASKING_ENVIRONMENT__TIME_EVENTS:
				return getTimeEvents();
			case StructuralPackage.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS:
				return getGlobalParameters();
			case StructuralPackage.TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE:
				return getLastDiagramChange();
			case StructuralPackage.TASKING_ENVIRONMENT__SCHEDULAR_POLICY:
				return getSchedularPolicy();
			case StructuralPackage.TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS:
				return getNumberOfExecutors();
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
			case StructuralPackage.TASKING_ENVIRONMENT__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends TaskInstance>)newValue);
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__TIME_EVENTS:
				getTimeEvents().clear();
				getTimeEvents().addAll((Collection<? extends TimeEvent>)newValue);
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS:
				getGlobalParameters().clear();
				getGlobalParameters().addAll((Collection<? extends Attribute>)newValue);
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE:
				setLastDiagramChange((String)newValue);
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__SCHEDULAR_POLICY:
				setSchedularPolicy((EnumSchedularPolicy)newValue);
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS:
				setNumberOfExecutors((Integer)newValue);
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
			case StructuralPackage.TASKING_ENVIRONMENT__TASKS:
				getTasks().clear();
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__CHANNELS:
				getChannels().clear();
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__TIME_EVENTS:
				getTimeEvents().clear();
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS:
				getGlobalParameters().clear();
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE:
				setLastDiagramChange(LAST_DIAGRAM_CHANGE_EDEFAULT);
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__SCHEDULAR_POLICY:
				setSchedularPolicy(SCHEDULAR_POLICY_EDEFAULT);
				return;
			case StructuralPackage.TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS:
				setNumberOfExecutors(NUMBER_OF_EXECUTORS_EDEFAULT);
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
			case StructuralPackage.TASKING_ENVIRONMENT__TASKS:
				return tasks != null && !tasks.isEmpty();
			case StructuralPackage.TASKING_ENVIRONMENT__CHANNELS:
				return channels != null && !channels.isEmpty();
			case StructuralPackage.TASKING_ENVIRONMENT__TIME_EVENTS:
				return timeEvents != null && !timeEvents.isEmpty();
			case StructuralPackage.TASKING_ENVIRONMENT__GLOBAL_PARAMETERS:
				return globalParameters != null && !globalParameters.isEmpty();
			case StructuralPackage.TASKING_ENVIRONMENT__LAST_DIAGRAM_CHANGE:
				return LAST_DIAGRAM_CHANGE_EDEFAULT == null ? lastDiagramChange != null : !LAST_DIAGRAM_CHANGE_EDEFAULT.equals(lastDiagramChange);
			case StructuralPackage.TASKING_ENVIRONMENT__SCHEDULAR_POLICY:
				return schedularPolicy != SCHEDULAR_POLICY_EDEFAULT;
			case StructuralPackage.TASKING_ENVIRONMENT__NUMBER_OF_EXECUTORS:
				return numberOfExecutors != NUMBER_OF_EXECUTORS_EDEFAULT;
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
		result.append(" (lastDiagramChange: ");
		result.append(lastDiagramChange);
		result.append(", schedularPolicy: ");
		result.append(schedularPolicy);
		result.append(", numberOfExecutors: ");
		result.append(numberOfExecutors);
		result.append(')');
		return result.toString();
	}

} //TaskingEnvironmentImpl
