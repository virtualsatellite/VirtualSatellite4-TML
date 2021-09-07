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
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyBoolean;
import org.eclipse.emf.common.command.Command;
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
 * Attribute definition for parameters of behavioral definitions
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ABehavioralParameterDefinition extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.behavioral.BehavioralParameterDefinition";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_ISSTATIC = "isStatic";
	public static final String PROPERTY_VALUETYPE = "valueType";
	public static final String PROPERTY_VALUE = "value";
	
	// ValueType enumeration value names
	public static final String VALUETYPE_INTEGER_NAME = "INTEGER";
	public static final String VALUETYPE_FLOAT_NAME = "FLOAT";
	public static final String VALUETYPE_STRING_NAME = "STRING";
	// ValueType enumeration values
	public static final String VALUETYPE_INTEGER_VALUE = "1";
	public static final String VALUETYPE_FLOAT_VALUE = "2";
	public static final String VALUETYPE_STRING_VALUE = "3";
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ABehavioralParameterDefinition() {
	}
	
	public ABehavioralParameterDefinition(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "BehavioralParameterDefinition");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "BehavioralParameterDefinition");
		setTypeInstance(categoryAssignement);
	}
	
	public ABehavioralParameterDefinition(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: isStatic
	// *****************************************************************
	private BeanPropertyBoolean isStatic = new BeanPropertyBoolean();
	
	private void safeAccessIsStatic() {
		if (isStatic.getTypeInstance() == null) {
			isStatic.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("isStatic"));
		}
	}
	
	public Command setIsStatic(EditingDomain ed, boolean value) {
		safeAccessIsStatic();
		return this.isStatic.setValue(ed, value);
	}
	
	public void setIsStatic(boolean value) {
		safeAccessIsStatic();
		this.isStatic.setValue(value);
	}
	
	public boolean getIsStatic() {
		safeAccessIsStatic();
		return isStatic.getValue();
	}
	
	@XmlElement
	public BeanPropertyBoolean getIsStaticBean() {
		safeAccessIsStatic();
		return isStatic;
	}
	
	// *****************************************************************
	// * Attribute: valueType
	// *****************************************************************
	private BeanPropertyEnum valueType = new BeanPropertyEnum();
	
	private void safeAccessValueType() {
		if (valueType.getTypeInstance() == null) {
			valueType.setTypeInstance((EnumUnitPropertyInstance) helper.getPropertyInstance("valueType"));
		}
	}
	
	public Command setValueType(EditingDomain ed, String value) {
		safeAccessValueType();
		return this.valueType.setValue(ed, value);
	}
	
	public void setValueType(String value) {
		safeAccessValueType();
		this.valueType.setValue(value);
	}
	
	public String getValueType() {
		safeAccessValueType();
		return valueType.getValue();
	}
	
	public double getValueTypeEnum() {
		safeAccessValueType();
		return valueType.getEnumValue();
	}
	
	@XmlElement
	public BeanPropertyEnum getValueTypeBean() {
		safeAccessValueType();
		return valueType;
	}
	
	// *****************************************************************
	// * Attribute: value
	// *****************************************************************
	private BeanPropertyString value = new BeanPropertyString();
	
	private void safeAccessValue() {
		if (value.getTypeInstance() == null) {
			value.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("value"));
		}
	}
	
	public Command setValue(EditingDomain ed, String value) {
		safeAccessValue();
		return this.value.setValue(ed, value);
	}
	
	public void setValue(String value) {
		safeAccessValue();
		this.value.setValue(value);
	}
	
	public String getValue() {
		safeAccessValue();
		return value.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getValueBean() {
		safeAccessValue();
		return value;
	}
	
	
}
