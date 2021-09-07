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
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyInstanceList;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyComposed;
import de.dlr.sc.virsat.model.ext.core.model.GenericCategory;
import javax.xml.bind.annotation.XmlElement;


// *****************************************************************
// * Class Declaration
// *****************************************************************

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Pure definition and specification of a task
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ATaskDefinition extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.TaskDefinition";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_INPUTS = "inputs";
	public static final String PROPERTY_OUTPUTS = "outputs";
	public static final String PROPERTY_PARAMETERS = "parameters";
	public static final String PROPERTY_SERIALIZEDDEFINITION = "serializedDefinition";
	public static final String PROPERTY_SCHEDULEPOLICY = "schedulePolicy";
	
	// SchedulePolicy enumeration value names
	public static final String SCHEDULEPOLICY_Priority_NAME = "Priority";
	public static final String SCHEDULEPOLICY_FIFO_NAME = "FIFO";
	public static final String SCHEDULEPOLICY_LIFO_NAME = "LIFO";
	// SchedulePolicy enumeration values
	public static final String SCHEDULEPOLICY_Priority_VALUE = "1";
	public static final String SCHEDULEPOLICY_FIFO_VALUE = "2";
	public static final String SCHEDULEPOLICY_LIFO_VALUE = "3";
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ATaskDefinition() {
	}
	
	public ATaskDefinition(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "TaskDefinition");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "TaskDefinition");
		setTypeInstance(categoryAssignement);
	}
	
	public ATaskDefinition(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Array Attribute: inputs
	// *****************************************************************
	private IBeanList<TaskInputDefinition> inputs = new TypeSafeComposedPropertyInstanceList<>(TaskInputDefinition.class);
	
	private void safeAccessInputs() {
		if (inputs.getArrayInstance() == null) {
			inputs.setArrayInstance((ArrayInstance) helper.getPropertyInstance("inputs"));
		}
	}
	
	public IBeanList<TaskInputDefinition> getInputs() {
		safeAccessInputs();
		return inputs;
	}
	
	private IBeanList<BeanPropertyComposed<TaskInputDefinition>> inputsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessInputsBean() {
		if (inputsBean.getArrayInstance() == null) {
			inputsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("inputs"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<TaskInputDefinition>> getInputsBean() {
		safeAccessInputsBean();
		return inputsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: outputs
	// *****************************************************************
	private IBeanList<TaskOutputDefinition> outputs = new TypeSafeComposedPropertyInstanceList<>(TaskOutputDefinition.class);
	
	private void safeAccessOutputs() {
		if (outputs.getArrayInstance() == null) {
			outputs.setArrayInstance((ArrayInstance) helper.getPropertyInstance("outputs"));
		}
	}
	
	public IBeanList<TaskOutputDefinition> getOutputs() {
		safeAccessOutputs();
		return outputs;
	}
	
	private IBeanList<BeanPropertyComposed<TaskOutputDefinition>> outputsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessOutputsBean() {
		if (outputsBean.getArrayInstance() == null) {
			outputsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("outputs"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<TaskOutputDefinition>> getOutputsBean() {
		safeAccessOutputsBean();
		return outputsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: parameters
	// *****************************************************************
	private IBeanList<Attribute> parameters = new TypeSafeComposedPropertyInstanceList<>(Attribute.class);
	
	private void safeAccessParameters() {
		if (parameters.getArrayInstance() == null) {
			parameters.setArrayInstance((ArrayInstance) helper.getPropertyInstance("parameters"));
		}
	}
	
	public IBeanList<Attribute> getParameters() {
		safeAccessParameters();
		return parameters;
	}
	
	private IBeanList<BeanPropertyComposed<Attribute>> parametersBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessParametersBean() {
		if (parametersBean.getArrayInstance() == null) {
			parametersBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("parameters"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<Attribute>> getParametersBean() {
		safeAccessParametersBean();
		return parametersBean;
	}
	
	// *****************************************************************
	// * Attribute: serializedDefinition
	// *****************************************************************
	private BeanPropertyString serializedDefinition = new BeanPropertyString();
	
	private void safeAccessSerializedDefinition() {
		if (serializedDefinition.getTypeInstance() == null) {
			serializedDefinition.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("serializedDefinition"));
		}
	}
	
	public Command setSerializedDefinition(EditingDomain ed, String value) {
		safeAccessSerializedDefinition();
		return this.serializedDefinition.setValue(ed, value);
	}
	
	public void setSerializedDefinition(String value) {
		safeAccessSerializedDefinition();
		this.serializedDefinition.setValue(value);
	}
	
	public String getSerializedDefinition() {
		safeAccessSerializedDefinition();
		return serializedDefinition.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getSerializedDefinitionBean() {
		safeAccessSerializedDefinition();
		return serializedDefinition;
	}
	
	// *****************************************************************
	// * Attribute: schedulePolicy
	// *****************************************************************
	private BeanPropertyEnum schedulePolicy = new BeanPropertyEnum();
	
	private void safeAccessSchedulePolicy() {
		if (schedulePolicy.getTypeInstance() == null) {
			schedulePolicy.setTypeInstance((EnumUnitPropertyInstance) helper.getPropertyInstance("schedulePolicy"));
		}
	}
	
	public Command setSchedulePolicy(EditingDomain ed, String value) {
		safeAccessSchedulePolicy();
		return this.schedulePolicy.setValue(ed, value);
	}
	
	public void setSchedulePolicy(String value) {
		safeAccessSchedulePolicy();
		this.schedulePolicy.setValue(value);
	}
	
	public String getSchedulePolicy() {
		safeAccessSchedulePolicy();
		return schedulePolicy.getValue();
	}
	
	public double getSchedulePolicyEnum() {
		safeAccessSchedulePolicy();
		return schedulePolicy.getEnumValue();
	}
	
	@XmlElement
	public BeanPropertyEnum getSchedulePolicyBean() {
		safeAccessSchedulePolicy();
		return schedulePolicy;
	}
	
	
}
