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
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyString;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ReferencePropertyInstance;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.dlr.sc.virsat.model.dvlm.json.ABeanObjectAdapter;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyComposed;
import de.dlr.sc.virsat.model.ext.core.model.GenericCategory;
import javax.xml.bind.annotation.XmlAccessorType;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ValuePropertyInstance;
import javax.xml.bind.annotation.XmlRootElement;
import de.dlr.sc.virsat.model.concept.list.IBeanList;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyBoolean;
import org.eclipse.emf.common.command.Command;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyBeanList;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyInstanceList;
import javax.xml.bind.annotation.XmlElement;


// *****************************************************************
// * Class Declaration
// *****************************************************************

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Attribute that is contained in a classifier and is typed
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class AAttribute extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.Attribute";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_TYPEOF = "typeOf";
	public static final String PROPERTY_DIMENSIONS = "dimensions";
	public static final String PROPERTY_REFERENCEFRAME = "referenceFrame";
	public static final String PROPERTY_TYPEUNIT = "typeUnit";
	public static final String PROPERTY_ISCONST = "isConst";
	public static final String PROPERTY_VALUELITERAL = "valueLiteral";
	public static final String PROPERTY_MAXVALUELITERAL = "maxValueLiteral";
	public static final String PROPERTY_MINVALUELITERAL = "minValueLiteral";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AAttribute() {
	}
	
	public AAttribute(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "Attribute");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "Attribute");
		setTypeInstance(categoryAssignement);
	}
	
	public AAttribute(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: typeOf
	// *****************************************************************
	private BeanPropertyReference<IType> typeOf = new BeanPropertyReference<>();
	
	private void safeAccessTypeOf() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("typeOf");
		typeOf.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public IType getTypeOf() {
		safeAccessTypeOf();
		return typeOf.getValue();
	}
	
	public Command setTypeOf(EditingDomain ed, IType value) {
		safeAccessTypeOf();
		return typeOf.setValue(ed, value);
	}
	
	public void setTypeOf(IType value) {
		safeAccessTypeOf();
		typeOf.setValue(value);
	}
	
	public BeanPropertyReference<IType> getTypeOfBean() {
		safeAccessTypeOf();
		return typeOf;
	}
	
	// *****************************************************************
	// * Array Attribute: dimensions
	// *****************************************************************
	private IBeanList<ArrayDimension> dimensions = new TypeSafeComposedPropertyInstanceList<>(ArrayDimension.class);
	
	private void safeAccessDimensions() {
		if (dimensions.getArrayInstance() == null) {
			dimensions.setArrayInstance((ArrayInstance) helper.getPropertyInstance("dimensions"));
		}
	}
	
	public IBeanList<ArrayDimension> getDimensions() {
		safeAccessDimensions();
		return dimensions;
	}
	
	private IBeanList<BeanPropertyComposed<ArrayDimension>> dimensionsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessDimensionsBean() {
		if (dimensionsBean.getArrayInstance() == null) {
			dimensionsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("dimensions"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<ArrayDimension>> getDimensionsBean() {
		safeAccessDimensionsBean();
		return dimensionsBean;
	}
	
	// *****************************************************************
	// * Attribute: referenceFrame
	// *****************************************************************
	private BeanPropertyReference<ReferenceFrameDefinition> referenceFrame = new BeanPropertyReference<>();
	
	private void safeAccessReferenceFrame() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("referenceFrame");
		referenceFrame.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public ReferenceFrameDefinition getReferenceFrame() {
		safeAccessReferenceFrame();
		return referenceFrame.getValue();
	}
	
	public Command setReferenceFrame(EditingDomain ed, ReferenceFrameDefinition value) {
		safeAccessReferenceFrame();
		return referenceFrame.setValue(ed, value);
	}
	
	public void setReferenceFrame(ReferenceFrameDefinition value) {
		safeAccessReferenceFrame();
		referenceFrame.setValue(value);
	}
	
	public BeanPropertyReference<ReferenceFrameDefinition> getReferenceFrameBean() {
		safeAccessReferenceFrame();
		return referenceFrame;
	}
	
	// *****************************************************************
	// * Attribute: typeUnit
	// *****************************************************************
	private BeanPropertyReference<UnitDefinition> typeUnit = new BeanPropertyReference<>();
	
	private void safeAccessTypeUnit() {
		ReferencePropertyInstance propertyInstance = (ReferencePropertyInstance) helper.getPropertyInstance("typeUnit");
		typeUnit.setTypeInstance(propertyInstance);
	}
	
	@XmlElement(nillable = true)
	@XmlJavaTypeAdapter(ABeanObjectAdapter.class)
	public UnitDefinition getTypeUnit() {
		safeAccessTypeUnit();
		return typeUnit.getValue();
	}
	
	public Command setTypeUnit(EditingDomain ed, UnitDefinition value) {
		safeAccessTypeUnit();
		return typeUnit.setValue(ed, value);
	}
	
	public void setTypeUnit(UnitDefinition value) {
		safeAccessTypeUnit();
		typeUnit.setValue(value);
	}
	
	public BeanPropertyReference<UnitDefinition> getTypeUnitBean() {
		safeAccessTypeUnit();
		return typeUnit;
	}
	
	// *****************************************************************
	// * Attribute: isConst
	// *****************************************************************
	private BeanPropertyBoolean isConst = new BeanPropertyBoolean();
	
	private void safeAccessIsConst() {
		if (isConst.getTypeInstance() == null) {
			isConst.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("isConst"));
		}
	}
	
	public Command setIsConst(EditingDomain ed, boolean value) {
		safeAccessIsConst();
		return this.isConst.setValue(ed, value);
	}
	
	public void setIsConst(boolean value) {
		safeAccessIsConst();
		this.isConst.setValue(value);
	}
	
	public boolean getIsConst() {
		safeAccessIsConst();
		return isConst.getValue();
	}
	
	@XmlElement
	public BeanPropertyBoolean getIsConstBean() {
		safeAccessIsConst();
		return isConst;
	}
	
	// *****************************************************************
	// * Attribute: valueLiteral
	// *****************************************************************
	private BeanPropertyString valueLiteral = new BeanPropertyString();
	
	private void safeAccessValueLiteral() {
		if (valueLiteral.getTypeInstance() == null) {
			valueLiteral.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("valueLiteral"));
		}
	}
	
	public Command setValueLiteral(EditingDomain ed, String value) {
		safeAccessValueLiteral();
		return this.valueLiteral.setValue(ed, value);
	}
	
	public void setValueLiteral(String value) {
		safeAccessValueLiteral();
		this.valueLiteral.setValue(value);
	}
	
	public String getValueLiteral() {
		safeAccessValueLiteral();
		return valueLiteral.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getValueLiteralBean() {
		safeAccessValueLiteral();
		return valueLiteral;
	}
	
	// *****************************************************************
	// * Attribute: maxValueLiteral
	// *****************************************************************
	private BeanPropertyString maxValueLiteral = new BeanPropertyString();
	
	private void safeAccessMaxValueLiteral() {
		if (maxValueLiteral.getTypeInstance() == null) {
			maxValueLiteral.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("maxValueLiteral"));
		}
	}
	
	public Command setMaxValueLiteral(EditingDomain ed, String value) {
		safeAccessMaxValueLiteral();
		return this.maxValueLiteral.setValue(ed, value);
	}
	
	public void setMaxValueLiteral(String value) {
		safeAccessMaxValueLiteral();
		this.maxValueLiteral.setValue(value);
	}
	
	public String getMaxValueLiteral() {
		safeAccessMaxValueLiteral();
		return maxValueLiteral.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getMaxValueLiteralBean() {
		safeAccessMaxValueLiteral();
		return maxValueLiteral;
	}
	
	// *****************************************************************
	// * Attribute: minValueLiteral
	// *****************************************************************
	private BeanPropertyString minValueLiteral = new BeanPropertyString();
	
	private void safeAccessMinValueLiteral() {
		if (minValueLiteral.getTypeInstance() == null) {
			minValueLiteral.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("minValueLiteral"));
		}
	}
	
	public Command setMinValueLiteral(EditingDomain ed, String value) {
		safeAccessMinValueLiteral();
		return this.minValueLiteral.setValue(ed, value);
	}
	
	public void setMinValueLiteral(String value) {
		safeAccessMinValueLiteral();
		this.minValueLiteral.setValue(value);
	}
	
	public String getMinValueLiteral() {
		safeAccessMinValueLiteral();
		return minValueLiteral.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getMinValueLiteralBean() {
		safeAccessMinValueLiteral();
		return minValueLiteral;
	}
	
	
}
