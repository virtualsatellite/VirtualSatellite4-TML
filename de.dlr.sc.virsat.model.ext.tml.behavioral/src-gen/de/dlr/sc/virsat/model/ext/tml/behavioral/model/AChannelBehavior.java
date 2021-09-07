/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ReferencePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyBeanList;
import de.dlr.sc.virsat.model.dvlm.json.ABeanObjectAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Instance of a channel behavior definition
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class AChannelBehavior extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelBehavior";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_TYPEOF = "typeOf";
	public static final String PROPERTY_PARAMETERINSTANCES = "parameterInstances";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AChannelBehavior() {
	}
	
	public AChannelBehavior(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "ChannelBehavior");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "ChannelBehavior");
		setTypeInstance(categoryAssignement);
	}
	
	public AChannelBehavior(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: typeOf
	// *****************************************************************
	private BeanPropertyReference<ChannelBehaviorDefinition> typeOf = new BeanPropertyReference<>();
	
	private void safeAccessTypeOf() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("typeOf");
		typeOf.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public ChannelBehaviorDefinition getTypeOf() {
		safeAccessTypeOf();
		return typeOf.getValue();
	}
	
	public Command setTypeOf(EditingDomain ed, ChannelBehaviorDefinition value) {
		safeAccessTypeOf();
		return typeOf.setValue(ed, value);
	}
	
	public void setTypeOf(ChannelBehaviorDefinition value) {
		safeAccessTypeOf();
		typeOf.setValue(value);
	}
	
	public BeanPropertyReference<ChannelBehaviorDefinition> getTypeOfBean() {
		safeAccessTypeOf();
		return typeOf;
	}
	
	// *****************************************************************
	// * Array Attribute: parameterInstances
	// *****************************************************************
	private IBeanList<BehaviorParameter> parameterInstances = new TypeSafeComposedPropertyInstanceList<>(BehaviorParameter.class);
	
	private void safeAccessParameterInstances() {
		if (parameterInstances.getArrayInstance() == null) {
			parameterInstances.setArrayInstance((ArrayInstance) helper.getPropertyInstance("parameterInstances"));
		}
	}
	
	public IBeanList<BehaviorParameter> getParameterInstances() {
		safeAccessParameterInstances();
		return parameterInstances;
	}
	
	private IBeanList<BeanPropertyComposed<BehaviorParameter>> parameterInstancesBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessParameterInstancesBean() {
		if (parameterInstancesBean.getArrayInstance() == null) {
			parameterInstancesBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("parameterInstances"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<BehaviorParameter>> getParameterInstancesBean() {
		safeAccessParameterInstancesBean();
		return parameterInstancesBean;
	}
	
	
}
