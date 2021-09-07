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
 * Overall Container for Behavior Definitions
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ABehaviorDefintionStorage extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.behavioral.BehaviorDefintionStorage";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_CHANNELBEHAVIORDEFINTIONS = "channelBehaviorDefintions";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ABehaviorDefintionStorage() {
	}
	
	public ABehaviorDefintionStorage(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "BehaviorDefintionStorage");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "BehaviorDefintionStorage");
		setTypeInstance(categoryAssignement);
	}
	
	public ABehaviorDefintionStorage(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Array Attribute: channelBehaviorDefintions
	// *****************************************************************
	private IBeanList<ChannelBehaviorDefinition> channelBehaviorDefintions = new TypeSafeComposedPropertyInstanceList<>(ChannelBehaviorDefinition.class);
	
	private void safeAccessChannelBehaviorDefintions() {
		if (channelBehaviorDefintions.getArrayInstance() == null) {
			channelBehaviorDefintions.setArrayInstance((ArrayInstance) helper.getPropertyInstance("channelBehaviorDefintions"));
		}
	}
	
	public IBeanList<ChannelBehaviorDefinition> getChannelBehaviorDefintions() {
		safeAccessChannelBehaviorDefintions();
		return channelBehaviorDefintions;
	}
	
	private IBeanList<BeanPropertyComposed<ChannelBehaviorDefinition>> channelBehaviorDefintionsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessChannelBehaviorDefintionsBean() {
		if (channelBehaviorDefintionsBean.getArrayInstance() == null) {
			channelBehaviorDefintionsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("channelBehaviorDefintions"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<ChannelBehaviorDefinition>> getChannelBehaviorDefintionsBean() {
		safeAccessChannelBehaviorDefintionsBean();
		return channelBehaviorDefintionsBean;
	}
	
	
}
