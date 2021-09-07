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
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyBeanList;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
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
 * 
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class AEnumeration extends IType implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.Enumeration";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_LITERALS = "literals";
	public static final String PROPERTY_SERIALIZEDDEFINITION = "serializedDefinition";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AEnumeration() {
	}
	
	public AEnumeration(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "Enumeration");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "Enumeration");
		setTypeInstance(categoryAssignement);
	}
	
	public AEnumeration(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Array Attribute: literals
	// *****************************************************************
	private IBeanList<EnumerationLiteral> literals = new TypeSafeComposedPropertyInstanceList<>(EnumerationLiteral.class);
	
	private void safeAccessLiterals() {
		if (literals.getArrayInstance() == null) {
			literals.setArrayInstance((ArrayInstance) helper.getPropertyInstance("literals"));
		}
	}
	
	public IBeanList<EnumerationLiteral> getLiterals() {
		safeAccessLiterals();
		return literals;
	}
	
	private IBeanList<BeanPropertyComposed<EnumerationLiteral>> literalsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessLiteralsBean() {
		if (literalsBean.getArrayInstance() == null) {
			literalsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("literals"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<EnumerationLiteral>> getLiteralsBean() {
		safeAccessLiteralsBean();
		return literalsBean;
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
