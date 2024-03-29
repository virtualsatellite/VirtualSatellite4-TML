/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.model;

// *****************************************************************
// * Import Statements
// *****************************************************************
import javax.xml.bind.annotation.XmlAccessorType;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.concept.list.IBeanList;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyBeanList;
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
 * Super concept for all behavioral categories
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ABehaviorDefinition extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.behavioral.BehaviorDefinition";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_PARAMETERS = "parameters";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ABehaviorDefinition() {
	}
	
	public ABehaviorDefinition(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "BehaviorDefinition");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "BehaviorDefinition");
		setTypeInstance(categoryAssignement);
	}
	
	public ABehaviorDefinition(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Array Attribute: parameters
	// *****************************************************************
	private IBeanList<BehavioralParameterDefinition> parameters = new TypeSafeComposedPropertyInstanceList<>(BehavioralParameterDefinition.class);
	
	private void safeAccessParameters() {
		if (parameters.getArrayInstance() == null) {
			parameters.setArrayInstance((ArrayInstance) helper.getPropertyInstance("parameters"));
		}
	}
	
	public IBeanList<BehavioralParameterDefinition> getParameters() {
		safeAccessParameters();
		return parameters;
	}
	
	private IBeanList<BeanPropertyComposed<BehavioralParameterDefinition>> parametersBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessParametersBean() {
		if (parametersBean.getArrayInstance() == null) {
			parametersBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("parameters"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<BehavioralParameterDefinition>> getParametersBean() {
		safeAccessParametersBean();
		return parametersBean;
	}
	
	
}
