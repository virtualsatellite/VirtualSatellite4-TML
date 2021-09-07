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
import de.dlr.sc.virsat.model.concept.list.TypeSafeReferencePropertyBeanList;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.concept.list.IBeanList;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyReference;
import de.dlr.sc.virsat.model.concept.list.TypeSafeReferencePropertyInstanceList;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
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
 * Interface for all kinds of event sources
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class AIEventSource extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.IEventSource";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_INPUTS = "inputs";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AIEventSource() {
	}
	
	public AIEventSource(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "IEventSource");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "IEventSource");
		setTypeInstance(categoryAssignement);
	}
	
	public AIEventSource(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Array Attribute: inputs
	// *****************************************************************
		private IBeanList<TaskInput> inputs = new TypeSafeReferencePropertyInstanceList<>(TaskInput.class);
	
		private void safeAccessInputs() {
			if (inputs.getArrayInstance() == null) {
				inputs.setArrayInstance((ArrayInstance) helper.getPropertyInstance("inputs"));
			}
		}
	
		public IBeanList<TaskInput> getInputs() {
			safeAccessInputs();
			return inputs;
		}
		
		private IBeanList<BeanPropertyReference<TaskInput>> inputsBean = new TypeSafeReferencePropertyBeanList<>();
		
		private void safeAccessInputsBean() {
			if (inputsBean.getArrayInstance() == null) {
				inputsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("inputs"));
			}
		}
		
		@XmlElement
		public IBeanList<BeanPropertyReference<TaskInput>> getInputsBean() {
			safeAccessInputsBean();
			return inputsBean;
		}
	
	
}
