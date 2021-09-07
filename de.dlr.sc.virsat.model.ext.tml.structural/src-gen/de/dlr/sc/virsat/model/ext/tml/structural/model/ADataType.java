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
import de.dlr.sc.virsat.model.concept.list.IBeanList;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyString;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ReferencePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyBoolean;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyBeanList;
import de.dlr.sc.virsat.model.dvlm.json.ABeanObjectAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyInstanceList;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyComposed;
import javax.xml.bind.annotation.XmlElement;


// *****************************************************************
// * Class Declaration
// *****************************************************************

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Data type - describing a set of data
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ADataType extends IType implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.DataType";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_SUPERTYPE = "superType";
	public static final String PROPERTY_ATTRIBUTES = "attributes";
	public static final String PROPERTY_ABSTRACTTYPE = "abstractType";
	public static final String PROPERTY_ISTMTYPE = "isTMType";
	public static final String PROPERTY_SERIALIZEDDEFINITION = "serializedDefinition";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ADataType() {
	}
	
	public ADataType(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "DataType");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "DataType");
		setTypeInstance(categoryAssignement);
	}
	
	public ADataType(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: superType
	// *****************************************************************
	private BeanPropertyReference<DataType> superType = new BeanPropertyReference<>();
	
	private void safeAccessSuperType() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("superType");
		superType.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public DataType getSuperType() {
		safeAccessSuperType();
		return superType.getValue();
	}
	
	public Command setSuperType(EditingDomain ed, DataType value) {
		safeAccessSuperType();
		return superType.setValue(ed, value);
	}
	
	public void setSuperType(DataType value) {
		safeAccessSuperType();
		superType.setValue(value);
	}
	
	public BeanPropertyReference<DataType> getSuperTypeBean() {
		safeAccessSuperType();
		return superType;
	}
	
	// *****************************************************************
	// * Array Attribute: attributes
	// *****************************************************************
	private IBeanList<Attribute> attributes = new TypeSafeComposedPropertyInstanceList<>(Attribute.class);
	
	private void safeAccessAttributes() {
		if (attributes.getArrayInstance() == null) {
			attributes.setArrayInstance((ArrayInstance) helper.getPropertyInstance("attributes"));
		}
	}
	
	public IBeanList<Attribute> getAttributes() {
		safeAccessAttributes();
		return attributes;
	}
	
	private IBeanList<BeanPropertyComposed<Attribute>> attributesBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessAttributesBean() {
		if (attributesBean.getArrayInstance() == null) {
			attributesBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("attributes"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<Attribute>> getAttributesBean() {
		safeAccessAttributesBean();
		return attributesBean;
	}
	
	// *****************************************************************
	// * Attribute: abstractType
	// *****************************************************************
	private BeanPropertyBoolean abstractType = new BeanPropertyBoolean();
	
	private void safeAccessAbstractType() {
		if (abstractType.getTypeInstance() == null) {
			abstractType.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("abstractType"));
		}
	}
	
	public Command setAbstractType(EditingDomain ed, boolean value) {
		safeAccessAbstractType();
		return this.abstractType.setValue(ed, value);
	}
	
	public void setAbstractType(boolean value) {
		safeAccessAbstractType();
		this.abstractType.setValue(value);
	}
	
	public boolean getAbstractType() {
		safeAccessAbstractType();
		return abstractType.getValue();
	}
	
	@XmlElement
	public BeanPropertyBoolean getAbstractTypeBean() {
		safeAccessAbstractType();
		return abstractType;
	}
	
	// *****************************************************************
	// * Attribute: isTMType
	// *****************************************************************
	private BeanPropertyBoolean isTMType = new BeanPropertyBoolean();
	
	private void safeAccessIsTMType() {
		if (isTMType.getTypeInstance() == null) {
			isTMType.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("isTMType"));
		}
	}
	
	public Command setIsTMType(EditingDomain ed, boolean value) {
		safeAccessIsTMType();
		return this.isTMType.setValue(ed, value);
	}
	
	public void setIsTMType(boolean value) {
		safeAccessIsTMType();
		this.isTMType.setValue(value);
	}
	
	public boolean getIsTMType() {
		safeAccessIsTMType();
		return isTMType.getValue();
	}
	
	@XmlElement
	public BeanPropertyBoolean getIsTMTypeBean() {
		safeAccessIsTMType();
		return isTMType;
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
