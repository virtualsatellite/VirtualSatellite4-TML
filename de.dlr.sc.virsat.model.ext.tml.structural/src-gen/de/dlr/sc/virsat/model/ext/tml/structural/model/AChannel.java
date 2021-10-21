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
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ReferencePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.dvlm.json.ABeanObjectAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ComposedPropertyInstance;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyComposed;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehavior;
import javax.xml.bind.annotation.XmlElement;


// *****************************************************************
// * Class Declaration
// *****************************************************************

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Data container - can specified as target or goal of tasks
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class AChannel extends IEventSource implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.Channel";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_DATATYPE = "dataType";
	public static final String PROPERTY_CHANNELBEHAVIOR = "channelBehavior";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AChannel() {
	}
	
	public AChannel(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "Channel");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "Channel");
		setTypeInstance(categoryAssignement);
	}
	
	public AChannel(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: dataType
	// *****************************************************************
	private BeanPropertyReference<DataType> dataType = new BeanPropertyReference<>();
	
	private void safeAccessDataType() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("dataType");
		dataType.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public DataType getDataType() {
		safeAccessDataType();
		return dataType.getValue();
	}
	
	public Command setDataType(EditingDomain ed, DataType value) {
		safeAccessDataType();
		return dataType.setValue(ed, value);
	}
	
	public void setDataType(DataType value) {
		safeAccessDataType();
		dataType.setValue(value);
	}
	
	public BeanPropertyReference<DataType> getDataTypeBean() {
		safeAccessDataType();
		return dataType;
	}
	
	// *****************************************************************
	// * Attribute: channelBehavior
	// *****************************************************************
	private BeanPropertyComposed<ChannelBehavior> channelBehavior = new BeanPropertyComposed<>();
	
	private void safeAccessChannelBehavior() {
		if (channelBehavior.getTypeInstance() == null) {
			ComposedPropertyInstance propertyInstance = (ComposedPropertyInstance) helper.getPropertyInstance("channelBehavior");
			channelBehavior.setTypeInstance(propertyInstance);
		}
	}
	
	@XmlElement(nillable = true)
	public ChannelBehavior getChannelBehavior() {
		safeAccessChannelBehavior();
		return channelBehavior.getValue();
	}
	
	public BeanPropertyComposed<ChannelBehavior> getChannelBehaviorBean() {
		safeAccessChannelBehavior();
		return channelBehavior;
	}
	
	
}
