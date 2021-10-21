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
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.UnitValuePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
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
 * Definition of basic attribute types, that can be used to create data type
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ABasicTypeDefinition extends IType implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.BasicTypeDefinition";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_VALUETYPE = "valueType";
	public static final String PROPERTY_SIZE = "size";
	public static final String PROPERTY_SOURCE = "source";
	public static final String PROPERTY_CUSTOMSOURCE = "customSource";
	
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
	
	public ABasicTypeDefinition() {
	}
	
	public ABasicTypeDefinition(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "BasicTypeDefinition");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "BasicTypeDefinition");
		setTypeInstance(categoryAssignement);
	}
	
	public ABasicTypeDefinition(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
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
	// * Attribute: size
	// *****************************************************************
	private BeanPropertyInt size = new BeanPropertyInt();
	
	private void safeAccessSize() {
		if (size.getTypeInstance() == null) {
			size.setTypeInstance((UnitValuePropertyInstance) helper.getPropertyInstance("size"));
		}
	}
	
	public Command setSize(EditingDomain ed, long value) {
		safeAccessSize();
		return this.size.setValue(ed, value);
	}
	
	public void setSize(long value) {
		safeAccessSize();
		this.size.setValue(value);
	}
	
	public long getSize() {
		safeAccessSize();
		return size.getValue();
	}
	
	public boolean isSetSize() {
		safeAccessSize();
		return size.isSet();
	}
	
	@XmlElement
	public BeanPropertyInt getSizeBean() {
		safeAccessSize();
		return size;
	}
	
	// *****************************************************************
	// * Attribute: source
	// *****************************************************************
	private BeanPropertyString source = new BeanPropertyString();
	
	private void safeAccessSource() {
		if (source.getTypeInstance() == null) {
			source.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("source"));
		}
	}
	
	public Command setSource(EditingDomain ed, String value) {
		safeAccessSource();
		return this.source.setValue(ed, value);
	}
	
	public void setSource(String value) {
		safeAccessSource();
		this.source.setValue(value);
	}
	
	public String getSource() {
		safeAccessSource();
		return source.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getSourceBean() {
		safeAccessSource();
		return source;
	}
	
	// *****************************************************************
	// * Attribute: customSource
	// *****************************************************************
	private BeanPropertyBoolean customSource = new BeanPropertyBoolean();
	
	private void safeAccessCustomSource() {
		if (customSource.getTypeInstance() == null) {
			customSource.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("customSource"));
		}
	}
	
	public Command setCustomSource(EditingDomain ed, boolean value) {
		safeAccessCustomSource();
		return this.customSource.setValue(ed, value);
	}
	
	public void setCustomSource(boolean value) {
		safeAccessCustomSource();
		this.customSource.setValue(value);
	}
	
	public boolean getCustomSource() {
		safeAccessCustomSource();
		return customSource.getValue();
	}
	
	@XmlElement
	public BeanPropertyBoolean getCustomSourceBean() {
		safeAccessCustomSource();
		return customSource;
	}
	
	
}
