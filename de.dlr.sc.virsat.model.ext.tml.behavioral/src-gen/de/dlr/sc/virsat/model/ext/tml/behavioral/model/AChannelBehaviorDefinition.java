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
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyEnum;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ValuePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.EnumUnitPropertyInstance;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyString;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import javax.xml.bind.annotation.XmlElement;


// *****************************************************************
// * Class Declaration
// *****************************************************************

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Category to specify channel behavior
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class AChannelBehaviorDefinition extends BehaviorDefinition implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelBehaviorDefinition";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_STORAGETYPE = "storageType";
	public static final String PROPERTY_IMPLNAME = "implName";
	public static final String PROPERTY_SERIALIZEDDEFINITION = "serializedDefinition";
	
	// StorageType enumeration value names
	public static final String STORAGETYPE_DOUBLE_BUFFER_NAME = "DOUBLE_BUFFER";
	public static final String STORAGETYPE_FIFO_NAME = "FIFO";
	public static final String STORAGETYPE_LIFO_NAME = "LIFO";
	public static final String STORAGETYPE_EVENT_ONLY_NAME = "EVENT_ONLY";
	public static final String STORAGETYPE_CUSTOM_NAME = "CUSTOM";
	// StorageType enumeration values
	public static final String STORAGETYPE_DOUBLE_BUFFER_VALUE = "1";
	public static final String STORAGETYPE_FIFO_VALUE = "2";
	public static final String STORAGETYPE_LIFO_VALUE = "3";
	public static final String STORAGETYPE_EVENT_ONLY_VALUE = "4";
	public static final String STORAGETYPE_CUSTOM_VALUE = "5";
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AChannelBehaviorDefinition() {
	}
	
	public AChannelBehaviorDefinition(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "ChannelBehaviorDefinition");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "ChannelBehaviorDefinition");
		setTypeInstance(categoryAssignement);
	}
	
	public AChannelBehaviorDefinition(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: storageType
	// *****************************************************************
	private BeanPropertyEnum storageType = new BeanPropertyEnum();
	
	private void safeAccessStorageType() {
		if (storageType.getTypeInstance() == null) {
			storageType.setTypeInstance((EnumUnitPropertyInstance) helper.getPropertyInstance("storageType"));
		}
	}
	
	public Command setStorageType(EditingDomain ed, String value) {
		safeAccessStorageType();
		return this.storageType.setValue(ed, value);
	}
	
	public void setStorageType(String value) {
		safeAccessStorageType();
		this.storageType.setValue(value);
	}
	
	public String getStorageType() {
		safeAccessStorageType();
		return storageType.getValue();
	}
	
	public double getStorageTypeEnum() {
		safeAccessStorageType();
		return storageType.getEnumValue();
	}
	
	@XmlElement
	public BeanPropertyEnum getStorageTypeBean() {
		safeAccessStorageType();
		return storageType;
	}
	
	// *****************************************************************
	// * Attribute: implName
	// *****************************************************************
	private BeanPropertyString implName = new BeanPropertyString();
	
	private void safeAccessImplName() {
		if (implName.getTypeInstance() == null) {
			implName.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("implName"));
		}
	}
	
	public Command setImplName(EditingDomain ed, String value) {
		safeAccessImplName();
		return this.implName.setValue(ed, value);
	}
	
	public void setImplName(String value) {
		safeAccessImplName();
		this.implName.setValue(value);
	}
	
	public String getImplName() {
		safeAccessImplName();
		return implName.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getImplNameBean() {
		safeAccessImplName();
		return implName;
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
	
	
}
