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
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.UnitValuePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.ext.core.model.GenericCategory;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyInt;
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
public abstract class AEnumerationLiteral extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.EnumerationLiteral";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_KEYNUM = "keyNum";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AEnumerationLiteral() {
	}
	
	public AEnumerationLiteral(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "EnumerationLiteral");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "EnumerationLiteral");
		setTypeInstance(categoryAssignement);
	}
	
	public AEnumerationLiteral(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: keyNum
	// *****************************************************************
	private BeanPropertyInt keyNum = new BeanPropertyInt();
	
	private void safeAccessKeyNum() {
		if (keyNum.getTypeInstance() == null) {
			keyNum.setTypeInstance((UnitValuePropertyInstance) helper.getPropertyInstance("keyNum"));
		}
	}
	
	public Command setKeyNum(EditingDomain ed, long value) {
		safeAccessKeyNum();
		return this.keyNum.setValue(ed, value);
	}
	
	public void setKeyNum(long value) {
		safeAccessKeyNum();
		this.keyNum.setValue(value);
	}
	
	public long getKeyNum() {
		safeAccessKeyNum();
		return keyNum.getValue();
	}
	
	public boolean isSetKeyNum() {
		safeAccessKeyNum();
		return keyNum.isSet();
	}
	
	@XmlElement
	public BeanPropertyInt getKeyNumBean() {
		safeAccessKeyNum();
		return keyNum;
	}
	
	
}
