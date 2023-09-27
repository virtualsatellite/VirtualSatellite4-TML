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
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ValuePropertyInstance;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ReferencePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyBoolean;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.UnitValuePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.json.ABeanObjectAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Instance of a TaskInputDefintion of the containing task, specifies where data or events are coming from
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ATaskInput extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.TaskInput";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_TYPEOF = "typeOf";
	public static final String PROPERTY_TRIGGER = "trigger";
	public static final String PROPERTY_ACTIVATIONTHRESHOLD = "activationThreshold";
	public static final String PROPERTY_ISFINAL = "isFinal";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ATaskInput() {
	}
	
	public ATaskInput(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "TaskInput");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "TaskInput");
		setTypeInstance(categoryAssignement);
	}
	
	public ATaskInput(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: typeOf
	// *****************************************************************
	private BeanPropertyReference<TaskInputDefinition> typeOf = new BeanPropertyReference<>();
	
	private void safeAccessTypeOf() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("typeOf");
		typeOf.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public TaskInputDefinition getTypeOf() {
		safeAccessTypeOf();
		return typeOf.getValue();
	}
	
	public Command setTypeOf(EditingDomain ed, TaskInputDefinition value) {
		safeAccessTypeOf();
		return typeOf.setValue(ed, value);
	}
	
	public void setTypeOf(TaskInputDefinition value) {
		safeAccessTypeOf();
		typeOf.setValue(value);
	}
	
	public BeanPropertyReference<TaskInputDefinition> getTypeOfBean() {
		safeAccessTypeOf();
		return typeOf;
	}
	
	// *****************************************************************
	// * Attribute: trigger
	// *****************************************************************
	private BeanPropertyReference<IEventSource> trigger = new BeanPropertyReference<>();
	
	private void safeAccessTrigger() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("trigger");
		trigger.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public IEventSource getTrigger() {
		safeAccessTrigger();
		return trigger.getValue();
	}
	
	public Command setTrigger(EditingDomain ed, IEventSource value) {
		safeAccessTrigger();
		return trigger.setValue(ed, value);
	}
	
	public void setTrigger(IEventSource value) {
		safeAccessTrigger();
		trigger.setValue(value);
	}
	
	public BeanPropertyReference<IEventSource> getTriggerBean() {
		safeAccessTrigger();
		return trigger;
	}
	
	// *****************************************************************
	// * Attribute: activationThreshold
	// *****************************************************************
	private BeanPropertyInt activationThreshold = new BeanPropertyInt();
	
	private void safeAccessActivationThreshold() {
		if (activationThreshold.getTypeInstance() == null) {
			activationThreshold.setTypeInstance((UnitValuePropertyInstance) helper.getPropertyInstance("activationThreshold"));
		}
	}
	
	public Command setActivationThreshold(EditingDomain ed, long value) {
		safeAccessActivationThreshold();
		return this.activationThreshold.setValue(ed, value);
	}
	
	public void setActivationThreshold(long value) {
		safeAccessActivationThreshold();
		this.activationThreshold.setValue(value);
	}
	
	public long getActivationThreshold() {
		safeAccessActivationThreshold();
		return activationThreshold.getValue();
	}
	
	public boolean isSetActivationThreshold() {
		safeAccessActivationThreshold();
		return activationThreshold.isSet();
	}
	
	@XmlElement
	public BeanPropertyInt getActivationThresholdBean() {
		safeAccessActivationThreshold();
		return activationThreshold;
	}
	
	// *****************************************************************
	// * Attribute: isFinal
	// *****************************************************************
	private BeanPropertyBoolean isFinal = new BeanPropertyBoolean();
	
	private void safeAccessIsFinal() {
		if (isFinal.getTypeInstance() == null) {
			isFinal.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("isFinal"));
		}
	}
	
	public Command setIsFinal(EditingDomain ed, boolean value) {
		safeAccessIsFinal();
		return this.isFinal.setValue(ed, value);
	}
	
	public void setIsFinal(boolean value) {
		safeAccessIsFinal();
		this.isFinal.setValue(value);
	}
	
	public boolean getIsFinal() {
		safeAccessIsFinal();
		return isFinal.getValue();
	}
	
	@XmlElement
	public BeanPropertyBoolean getIsFinalBean() {
		safeAccessIsFinal();
		return isFinal;
	}
	
	
}
