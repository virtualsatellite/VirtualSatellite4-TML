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
import de.dlr.sc.virsat.model.concept.list.TypeSafeReferencePropertyBeanList;
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
import de.dlr.sc.virsat.model.concept.list.TypeSafeReferencePropertyInstanceList;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.dvlm.json.ABeanObjectAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Instance of a TaskInputDefintion of the containing task, specifies where data or events are going to
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ATaskOutput extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.TaskOutput";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_TYPEOF = "typeOf";
	public static final String PROPERTY_CHANNELS = "channels";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ATaskOutput() {
	}
	
	public ATaskOutput(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "TaskOutput");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "TaskOutput");
		setTypeInstance(categoryAssignement);
	}
	
	public ATaskOutput(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: typeOf
	// *****************************************************************
	private BeanPropertyReference<TaskOutputDefinition> typeOf = new BeanPropertyReference<>();
	
	private void safeAccessTypeOf() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("typeOf");
		typeOf.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public TaskOutputDefinition getTypeOf() {
		safeAccessTypeOf();
		return typeOf.getValue();
	}
	
	public Command setTypeOf(EditingDomain ed, TaskOutputDefinition value) {
		safeAccessTypeOf();
		return typeOf.setValue(ed, value);
	}
	
	public void setTypeOf(TaskOutputDefinition value) {
		safeAccessTypeOf();
		typeOf.setValue(value);
	}
	
	public BeanPropertyReference<TaskOutputDefinition> getTypeOfBean() {
		safeAccessTypeOf();
		return typeOf;
	}
	
	// *****************************************************************
	// * Array Attribute: channels
	// *****************************************************************
		private IBeanList<Channel> channels = new TypeSafeReferencePropertyInstanceList<>(Channel.class);
	
		private void safeAccessChannels() {
			if (channels.getArrayInstance() == null) {
				channels.setArrayInstance((ArrayInstance) helper.getPropertyInstance("channels"));
			}
		}
	
		public IBeanList<Channel> getChannels() {
			safeAccessChannels();
			return channels;
		}
		
		private IBeanList<BeanPropertyReference<Channel>> channelsBean = new TypeSafeReferencePropertyBeanList<>();
		
		private void safeAccessChannelsBean() {
			if (channelsBean.getArrayInstance() == null) {
				channelsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("channels"));
			}
		}
		
		@XmlElement
		public IBeanList<BeanPropertyReference<Channel>> getChannelsBean() {
			safeAccessChannelsBean();
			return channelsBean;
		}
	
	
}
