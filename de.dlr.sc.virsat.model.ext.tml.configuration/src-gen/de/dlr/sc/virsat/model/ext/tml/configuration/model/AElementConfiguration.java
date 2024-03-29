/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.configuration.model;

// *****************************************************************
// * Import Statements
// *****************************************************************
import javax.xml.bind.annotation.XmlAccessorType;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ValuePropertyInstance;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyString;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import org.eclipse.emf.edit.domain.EditingDomain;
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
 * 
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class AElementConfiguration extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.configuration.ElementConfiguration";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_IMPLEMENTATIONNAME = "implementationName";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AElementConfiguration() {
	}
	
	public AElementConfiguration(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "ElementConfiguration");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "ElementConfiguration");
		setTypeInstance(categoryAssignement);
	}
	
	public AElementConfiguration(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: implementationName
	// *****************************************************************
	private BeanPropertyString implementationName = new BeanPropertyString();
	
	private void safeAccessImplementationName() {
		if (implementationName.getTypeInstance() == null) {
			implementationName.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("implementationName"));
		}
	}
	
	public Command setImplementationName(EditingDomain ed, String value) {
		safeAccessImplementationName();
		return this.implementationName.setValue(ed, value);
	}
	
	public void setImplementationName(String value) {
		safeAccessImplementationName();
		this.implementationName.setValue(value);
	}
	
	public String getImplementationName() {
		safeAccessImplementationName();
		return implementationName.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getImplementationNameBean() {
		safeAccessImplementationName();
		return implementationName;
	}
	
	
}
