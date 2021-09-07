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
 * Source of time-based events send to tasks
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ATimeEvent extends IEventSource implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.TimeEvent";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_PERIOD = "period";
	public static final String PROPERTY_OFFSET = "offset";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ATimeEvent() {
	}
	
	public ATimeEvent(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "TimeEvent");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "TimeEvent");
		setTypeInstance(categoryAssignement);
	}
	
	public ATimeEvent(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: period
	// *****************************************************************
	private BeanPropertyInt period = new BeanPropertyInt();
	
	private void safeAccessPeriod() {
		if (period.getTypeInstance() == null) {
			period.setTypeInstance((UnitValuePropertyInstance) helper.getPropertyInstance("period"));
		}
	}
	
	public Command setPeriod(EditingDomain ed, long value) {
		safeAccessPeriod();
		return this.period.setValue(ed, value);
	}
	
	public void setPeriod(long value) {
		safeAccessPeriod();
		this.period.setValue(value);
	}
	
	public long getPeriod() {
		safeAccessPeriod();
		return period.getValue();
	}
	
	public boolean isSetPeriod() {
		safeAccessPeriod();
		return period.isSet();
	}
	
	@XmlElement
	public BeanPropertyInt getPeriodBean() {
		safeAccessPeriod();
		return period;
	}
	
	// *****************************************************************
	// * Attribute: offset
	// *****************************************************************
	private BeanPropertyInt offset = new BeanPropertyInt();
	
	private void safeAccessOffset() {
		if (offset.getTypeInstance() == null) {
			offset.setTypeInstance((UnitValuePropertyInstance) helper.getPropertyInstance("offset"));
		}
	}
	
	public Command setOffset(EditingDomain ed, long value) {
		safeAccessOffset();
		return this.offset.setValue(ed, value);
	}
	
	public void setOffset(long value) {
		safeAccessOffset();
		this.offset.setValue(value);
	}
	
	public long getOffset() {
		safeAccessOffset();
		return offset.getValue();
	}
	
	public boolean isSetOffset() {
		safeAccessOffset();
		return offset.isSet();
	}
	
	@XmlElement
	public BeanPropertyInt getOffsetBean() {
		safeAccessOffset();
		return offset;
	}
	
	
}
