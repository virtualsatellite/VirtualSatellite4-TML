/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.model;

// *****************************************************************
// * Import Statements
// *****************************************************************
import javax.xml.bind.annotation.XmlAccessorType;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyEnum;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ValuePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.EnumUnitPropertyInstance;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.concept.list.IBeanList;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyString;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyBeanList;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.UnitValuePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyInstanceList;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyComposed;
import de.dlr.sc.virsat.model.ext.core.model.GenericCategory;
import javax.xml.bind.annotation.XmlElement;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyInt;


// *****************************************************************
// * Class Declaration
// *****************************************************************

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Overall Container to describe a task model
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ATaskingEnvironment extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.TaskingEnvironment";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_TASKS = "tasks";
	public static final String PROPERTY_CHANNELS = "channels";
	public static final String PROPERTY_TIMEEVENTS = "timeEvents";
	public static final String PROPERTY_GLOBALPARAMETERS = "globalParameters";
	public static final String PROPERTY_LASTDIAGRAMCHANGE = "lastDiagramChange";
	public static final String PROPERTY_SCHEDULARPOLICY = "schedularPolicy";
	public static final String PROPERTY_NUMBEROFEXECUTORS = "numberOfExecutors";
	
	// SchedularPolicy enumeration value names
	public static final String SCHEDULARPOLICY_Priority_NAME = "Priority";
	public static final String SCHEDULARPOLICY_FIFO_NAME = "FIFO";
	public static final String SCHEDULARPOLICY_LIFO_NAME = "LIFO";
	// SchedularPolicy enumeration values
	public static final String SCHEDULARPOLICY_Priority_VALUE = "1";
	public static final String SCHEDULARPOLICY_FIFO_VALUE = "2";
	public static final String SCHEDULARPOLICY_LIFO_VALUE = "3";
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ATaskingEnvironment() {
	}
	
	public ATaskingEnvironment(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "TaskingEnvironment");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "TaskingEnvironment");
		setTypeInstance(categoryAssignement);
	}
	
	public ATaskingEnvironment(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Array Attribute: tasks
	// *****************************************************************
	private IBeanList<TaskInstance> tasks = new TypeSafeComposedPropertyInstanceList<>(TaskInstance.class);
	
	private void safeAccessTasks() {
		if (tasks.getArrayInstance() == null) {
			tasks.setArrayInstance((ArrayInstance) helper.getPropertyInstance("tasks"));
		}
	}
	
	public IBeanList<TaskInstance> getTasks() {
		safeAccessTasks();
		return tasks;
	}
	
	private IBeanList<BeanPropertyComposed<TaskInstance>> tasksBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessTasksBean() {
		if (tasksBean.getArrayInstance() == null) {
			tasksBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("tasks"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<TaskInstance>> getTasksBean() {
		safeAccessTasksBean();
		return tasksBean;
	}
	
	// *****************************************************************
	// * Array Attribute: channels
	// *****************************************************************
	private IBeanList<Channel> channels = new TypeSafeComposedPropertyInstanceList<>(Channel.class);
	
	private void safeAccessChannels() {
		if (channels.getArrayInstance() == null) {
			channels.setArrayInstance((ArrayInstance) helper.getPropertyInstance("channels"));
		}
	}
	
	public IBeanList<Channel> getChannels() {
		safeAccessChannels();
		return channels;
	}
	
	private IBeanList<BeanPropertyComposed<Channel>> channelsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessChannelsBean() {
		if (channelsBean.getArrayInstance() == null) {
			channelsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("channels"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<Channel>> getChannelsBean() {
		safeAccessChannelsBean();
		return channelsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: timeEvents
	// *****************************************************************
	private IBeanList<TimeEvent> timeEvents = new TypeSafeComposedPropertyInstanceList<>(TimeEvent.class);
	
	private void safeAccessTimeEvents() {
		if (timeEvents.getArrayInstance() == null) {
			timeEvents.setArrayInstance((ArrayInstance) helper.getPropertyInstance("timeEvents"));
		}
	}
	
	public IBeanList<TimeEvent> getTimeEvents() {
		safeAccessTimeEvents();
		return timeEvents;
	}
	
	private IBeanList<BeanPropertyComposed<TimeEvent>> timeEventsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessTimeEventsBean() {
		if (timeEventsBean.getArrayInstance() == null) {
			timeEventsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("timeEvents"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<TimeEvent>> getTimeEventsBean() {
		safeAccessTimeEventsBean();
		return timeEventsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: globalParameters
	// *****************************************************************
	private IBeanList<Attribute> globalParameters = new TypeSafeComposedPropertyInstanceList<>(Attribute.class);
	
	private void safeAccessGlobalParameters() {
		if (globalParameters.getArrayInstance() == null) {
			globalParameters.setArrayInstance((ArrayInstance) helper.getPropertyInstance("globalParameters"));
		}
	}
	
	public IBeanList<Attribute> getGlobalParameters() {
		safeAccessGlobalParameters();
		return globalParameters;
	}
	
	private IBeanList<BeanPropertyComposed<Attribute>> globalParametersBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessGlobalParametersBean() {
		if (globalParametersBean.getArrayInstance() == null) {
			globalParametersBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("globalParameters"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<Attribute>> getGlobalParametersBean() {
		safeAccessGlobalParametersBean();
		return globalParametersBean;
	}
	
	// *****************************************************************
	// * Attribute: lastDiagramChange
	// *****************************************************************
	private BeanPropertyString lastDiagramChange = new BeanPropertyString();
	
	private void safeAccessLastDiagramChange() {
		if (lastDiagramChange.getTypeInstance() == null) {
			lastDiagramChange.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("lastDiagramChange"));
		}
	}
	
	public Command setLastDiagramChange(EditingDomain ed, String value) {
		safeAccessLastDiagramChange();
		return this.lastDiagramChange.setValue(ed, value);
	}
	
	public void setLastDiagramChange(String value) {
		safeAccessLastDiagramChange();
		this.lastDiagramChange.setValue(value);
	}
	
	public String getLastDiagramChange() {
		safeAccessLastDiagramChange();
		return lastDiagramChange.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getLastDiagramChangeBean() {
		safeAccessLastDiagramChange();
		return lastDiagramChange;
	}
	
	// *****************************************************************
	// * Attribute: schedularPolicy
	// *****************************************************************
	private BeanPropertyEnum schedularPolicy = new BeanPropertyEnum();
	
	private void safeAccessSchedularPolicy() {
		if (schedularPolicy.getTypeInstance() == null) {
			schedularPolicy.setTypeInstance((EnumUnitPropertyInstance) helper.getPropertyInstance("schedularPolicy"));
		}
	}
	
	public Command setSchedularPolicy(EditingDomain ed, String value) {
		safeAccessSchedularPolicy();
		return this.schedularPolicy.setValue(ed, value);
	}
	
	public void setSchedularPolicy(String value) {
		safeAccessSchedularPolicy();
		this.schedularPolicy.setValue(value);
	}
	
	public String getSchedularPolicy() {
		safeAccessSchedularPolicy();
		return schedularPolicy.getValue();
	}
	
	public double getSchedularPolicyEnum() {
		safeAccessSchedularPolicy();
		return schedularPolicy.getEnumValue();
	}
	
	@XmlElement
	public BeanPropertyEnum getSchedularPolicyBean() {
		safeAccessSchedularPolicy();
		return schedularPolicy;
	}
	
	// *****************************************************************
	// * Attribute: numberOfExecutors
	// *****************************************************************
	private BeanPropertyInt numberOfExecutors = new BeanPropertyInt();
	
	private void safeAccessNumberOfExecutors() {
		if (numberOfExecutors.getTypeInstance() == null) {
			numberOfExecutors.setTypeInstance((UnitValuePropertyInstance) helper.getPropertyInstance("numberOfExecutors"));
		}
	}
	
	public Command setNumberOfExecutors(EditingDomain ed, long value) {
		safeAccessNumberOfExecutors();
		return this.numberOfExecutors.setValue(ed, value);
	}
	
	public void setNumberOfExecutors(long value) {
		safeAccessNumberOfExecutors();
		this.numberOfExecutors.setValue(value);
	}
	
	public long getNumberOfExecutors() {
		safeAccessNumberOfExecutors();
		return numberOfExecutors.getValue();
	}
	
	public boolean isSetNumberOfExecutors() {
		safeAccessNumberOfExecutors();
		return numberOfExecutors.isSet();
	}
	
	@XmlElement
	public BeanPropertyInt getNumberOfExecutorsBean() {
		safeAccessNumberOfExecutors();
		return numberOfExecutors;
	}
	
	
}
