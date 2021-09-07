/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ReferencePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.UnitValuePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.json.ABeanObjectAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ComposedPropertyInstance;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyComposed;
import de.dlr.sc.virsat.model.ext.core.model.GenericCategory;
import javax.xml.bind.annotation.XmlAccessorType;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.concept.list.IBeanList;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import javax.xml.bind.annotation.XmlAccessType;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyBeanList;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.TaskBehavior;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyInstanceList;
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
 * Instance of a TaskDefinition, contains a behavior that can configure inputs and outputs
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ATaskInstance extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.TaskInstance";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_TYPEOF = "typeOf";
	public static final String PROPERTY_PRIORITY = "priority";
	public static final String PROPERTY_TASKBEHAVIOR = "taskBehavior";
	public static final String PROPERTY_OUTPUTS = "outputs";
	public static final String PROPERTY_INPUTS = "inputs";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ATaskInstance() {
	}
	
	public ATaskInstance(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "TaskInstance");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "TaskInstance");
		setTypeInstance(categoryAssignement);
	}
	
	public ATaskInstance(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: typeOf
	// *****************************************************************
	private BeanPropertyReference<TaskDefinition> typeOf = new BeanPropertyReference<>();
	
	private void safeAccessTypeOf() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("typeOf");
		typeOf.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public TaskDefinition getTypeOf() {
		safeAccessTypeOf();
		return typeOf.getValue();
	}
	
	public Command setTypeOf(EditingDomain ed, TaskDefinition value) {
		safeAccessTypeOf();
		return typeOf.setValue(ed, value);
	}
	
	public void setTypeOf(TaskDefinition value) {
		safeAccessTypeOf();
		typeOf.setValue(value);
	}
	
	public BeanPropertyReference<TaskDefinition> getTypeOfBean() {
		safeAccessTypeOf();
		return typeOf;
	}
	
	// *****************************************************************
	// * Attribute: priority
	// *****************************************************************
	private BeanPropertyInt priority = new BeanPropertyInt();
	
	private void safeAccessPriority() {
		if (priority.getTypeInstance() == null) {
			priority.setTypeInstance((UnitValuePropertyInstance) helper.getPropertyInstance("priority"));
		}
	}
	
	public Command setPriority(EditingDomain ed, long value) {
		safeAccessPriority();
		return this.priority.setValue(ed, value);
	}
	
	public void setPriority(long value) {
		safeAccessPriority();
		this.priority.setValue(value);
	}
	
	public long getPriority() {
		safeAccessPriority();
		return priority.getValue();
	}
	
	public boolean isSetPriority() {
		safeAccessPriority();
		return priority.isSet();
	}
	
	@XmlElement
	public BeanPropertyInt getPriorityBean() {
		safeAccessPriority();
		return priority;
	}
	
	// *****************************************************************
	// * Attribute: taskBehavior
	// *****************************************************************
	private BeanPropertyComposed<TaskBehavior> taskBehavior = new BeanPropertyComposed<>();
	
	private void safeAccessTaskBehavior() {
		if (taskBehavior.getTypeInstance() == null) {
			ComposedPropertyInstance propertyInstance = (ComposedPropertyInstance) helper.getPropertyInstance("taskBehavior");
			taskBehavior.setTypeInstance(propertyInstance);
		}
	}
	
	@XmlElement(nillable = true)
	public TaskBehavior getTaskBehavior() {
		safeAccessTaskBehavior();
		return taskBehavior.getValue();
	}
	
	public BeanPropertyComposed<TaskBehavior> getTaskBehaviorBean() {
		safeAccessTaskBehavior();
		return taskBehavior;
	}
	
	// *****************************************************************
	// * Array Attribute: outputs
	// *****************************************************************
	private IBeanList<TaskOutput> outputs = new TypeSafeComposedPropertyInstanceList<>(TaskOutput.class);
	
	private void safeAccessOutputs() {
		if (outputs.getArrayInstance() == null) {
			outputs.setArrayInstance((ArrayInstance) helper.getPropertyInstance("outputs"));
		}
	}
	
	public IBeanList<TaskOutput> getOutputs() {
		safeAccessOutputs();
		return outputs;
	}
	
	private IBeanList<BeanPropertyComposed<TaskOutput>> outputsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessOutputsBean() {
		if (outputsBean.getArrayInstance() == null) {
			outputsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("outputs"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<TaskOutput>> getOutputsBean() {
		safeAccessOutputsBean();
		return outputsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: inputs
	// *****************************************************************
	private IBeanList<TaskInput> inputs = new TypeSafeComposedPropertyInstanceList<>(TaskInput.class);
	
	private void safeAccessInputs() {
		if (inputs.getArrayInstance() == null) {
			inputs.setArrayInstance((ArrayInstance) helper.getPropertyInstance("inputs"));
		}
	}
	
	public IBeanList<TaskInput> getInputs() {
		safeAccessInputs();
		return inputs;
	}
	
	private IBeanList<BeanPropertyComposed<TaskInput>> inputsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessInputsBean() {
		if (inputsBean.getArrayInstance() == null) {
			inputsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("inputs"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<TaskInput>> getInputsBean() {
		safeAccessInputsBean();
		return inputsBean;
	}
	
	
}
