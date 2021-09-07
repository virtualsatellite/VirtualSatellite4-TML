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
import de.dlr.sc.virsat.model.concept.list.IBeanList;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import javax.xml.bind.annotation.XmlAccessType;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyBeanList;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.concept.list.TypeSafeComposedPropertyInstanceList;
import de.dlr.sc.virsat.model.concept.types.property.BeanPropertyComposed;
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
 * Overall Container to describe a tasking definitions
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ATaskingDefinition extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.structural.TaskingDefinition";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_BASICTYPEDEFINITIONS = "basicTypeDefinitions";
	public static final String PROPERTY_ENUMERATIONS = "enumerations";
	public static final String PROPERTY_DATATYPES = "dataTypes";
	public static final String PROPERTY_EXTERNALTYPES = "externalTypes";
	public static final String PROPERTY_CHANNELBEHAVIORDEFINITIONS = "channelBehaviorDefinitions";
	public static final String PROPERTY_TASKDEFINITIONS = "taskDefinitions";
	public static final String PROPERTY_REFERENCEFRAMES = "referenceFrames";
	public static final String PROPERTY_UNITS = "units";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public ATaskingDefinition() {
	}
	
	public ATaskingDefinition(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "TaskingDefinition");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "TaskingDefinition");
		setTypeInstance(categoryAssignement);
	}
	
	public ATaskingDefinition(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Array Attribute: basicTypeDefinitions
	// *****************************************************************
	private IBeanList<BasicTypeDefinition> basicTypeDefinitions = new TypeSafeComposedPropertyInstanceList<>(BasicTypeDefinition.class);
	
	private void safeAccessBasicTypeDefinitions() {
		if (basicTypeDefinitions.getArrayInstance() == null) {
			basicTypeDefinitions.setArrayInstance((ArrayInstance) helper.getPropertyInstance("basicTypeDefinitions"));
		}
	}
	
	public IBeanList<BasicTypeDefinition> getBasicTypeDefinitions() {
		safeAccessBasicTypeDefinitions();
		return basicTypeDefinitions;
	}
	
	private IBeanList<BeanPropertyComposed<BasicTypeDefinition>> basicTypeDefinitionsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessBasicTypeDefinitionsBean() {
		if (basicTypeDefinitionsBean.getArrayInstance() == null) {
			basicTypeDefinitionsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("basicTypeDefinitions"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<BasicTypeDefinition>> getBasicTypeDefinitionsBean() {
		safeAccessBasicTypeDefinitionsBean();
		return basicTypeDefinitionsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: enumerations
	// *****************************************************************
	private IBeanList<Enumeration> enumerations = new TypeSafeComposedPropertyInstanceList<>(Enumeration.class);
	
	private void safeAccessEnumerations() {
		if (enumerations.getArrayInstance() == null) {
			enumerations.setArrayInstance((ArrayInstance) helper.getPropertyInstance("enumerations"));
		}
	}
	
	public IBeanList<Enumeration> getEnumerations() {
		safeAccessEnumerations();
		return enumerations;
	}
	
	private IBeanList<BeanPropertyComposed<Enumeration>> enumerationsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessEnumerationsBean() {
		if (enumerationsBean.getArrayInstance() == null) {
			enumerationsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("enumerations"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<Enumeration>> getEnumerationsBean() {
		safeAccessEnumerationsBean();
		return enumerationsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: dataTypes
	// *****************************************************************
	private IBeanList<DataType> dataTypes = new TypeSafeComposedPropertyInstanceList<>(DataType.class);
	
	private void safeAccessDataTypes() {
		if (dataTypes.getArrayInstance() == null) {
			dataTypes.setArrayInstance((ArrayInstance) helper.getPropertyInstance("dataTypes"));
		}
	}
	
	public IBeanList<DataType> getDataTypes() {
		safeAccessDataTypes();
		return dataTypes;
	}
	
	private IBeanList<BeanPropertyComposed<DataType>> dataTypesBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessDataTypesBean() {
		if (dataTypesBean.getArrayInstance() == null) {
			dataTypesBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("dataTypes"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<DataType>> getDataTypesBean() {
		safeAccessDataTypesBean();
		return dataTypesBean;
	}
	
	// *****************************************************************
	// * Array Attribute: externalTypes
	// *****************************************************************
	private IBeanList<ExternalType> externalTypes = new TypeSafeComposedPropertyInstanceList<>(ExternalType.class);
	
	private void safeAccessExternalTypes() {
		if (externalTypes.getArrayInstance() == null) {
			externalTypes.setArrayInstance((ArrayInstance) helper.getPropertyInstance("externalTypes"));
		}
	}
	
	public IBeanList<ExternalType> getExternalTypes() {
		safeAccessExternalTypes();
		return externalTypes;
	}
	
	private IBeanList<BeanPropertyComposed<ExternalType>> externalTypesBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessExternalTypesBean() {
		if (externalTypesBean.getArrayInstance() == null) {
			externalTypesBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("externalTypes"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<ExternalType>> getExternalTypesBean() {
		safeAccessExternalTypesBean();
		return externalTypesBean;
	}
	
	// *****************************************************************
	// * Array Attribute: channelBehaviorDefinitions
	// *****************************************************************
	private IBeanList<ChannelBehaviorDefinition> channelBehaviorDefinitions = new TypeSafeComposedPropertyInstanceList<>(ChannelBehaviorDefinition.class);
	
	private void safeAccessChannelBehaviorDefinitions() {
		if (channelBehaviorDefinitions.getArrayInstance() == null) {
			channelBehaviorDefinitions.setArrayInstance((ArrayInstance) helper.getPropertyInstance("channelBehaviorDefinitions"));
		}
	}
	
	public IBeanList<ChannelBehaviorDefinition> getChannelBehaviorDefinitions() {
		safeAccessChannelBehaviorDefinitions();
		return channelBehaviorDefinitions;
	}
	
	private IBeanList<BeanPropertyComposed<ChannelBehaviorDefinition>> channelBehaviorDefinitionsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessChannelBehaviorDefinitionsBean() {
		if (channelBehaviorDefinitionsBean.getArrayInstance() == null) {
			channelBehaviorDefinitionsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("channelBehaviorDefinitions"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<ChannelBehaviorDefinition>> getChannelBehaviorDefinitionsBean() {
		safeAccessChannelBehaviorDefinitionsBean();
		return channelBehaviorDefinitionsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: taskDefinitions
	// *****************************************************************
	private IBeanList<TaskDefinition> taskDefinitions = new TypeSafeComposedPropertyInstanceList<>(TaskDefinition.class);
	
	private void safeAccessTaskDefinitions() {
		if (taskDefinitions.getArrayInstance() == null) {
			taskDefinitions.setArrayInstance((ArrayInstance) helper.getPropertyInstance("taskDefinitions"));
		}
	}
	
	public IBeanList<TaskDefinition> getTaskDefinitions() {
		safeAccessTaskDefinitions();
		return taskDefinitions;
	}
	
	private IBeanList<BeanPropertyComposed<TaskDefinition>> taskDefinitionsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessTaskDefinitionsBean() {
		if (taskDefinitionsBean.getArrayInstance() == null) {
			taskDefinitionsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("taskDefinitions"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<TaskDefinition>> getTaskDefinitionsBean() {
		safeAccessTaskDefinitionsBean();
		return taskDefinitionsBean;
	}
	
	// *****************************************************************
	// * Array Attribute: referenceFrames
	// *****************************************************************
	private IBeanList<ReferenceFrameDefinition> referenceFrames = new TypeSafeComposedPropertyInstanceList<>(ReferenceFrameDefinition.class);
	
	private void safeAccessReferenceFrames() {
		if (referenceFrames.getArrayInstance() == null) {
			referenceFrames.setArrayInstance((ArrayInstance) helper.getPropertyInstance("referenceFrames"));
		}
	}
	
	public IBeanList<ReferenceFrameDefinition> getReferenceFrames() {
		safeAccessReferenceFrames();
		return referenceFrames;
	}
	
	private IBeanList<BeanPropertyComposed<ReferenceFrameDefinition>> referenceFramesBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessReferenceFramesBean() {
		if (referenceFramesBean.getArrayInstance() == null) {
			referenceFramesBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("referenceFrames"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<ReferenceFrameDefinition>> getReferenceFramesBean() {
		safeAccessReferenceFramesBean();
		return referenceFramesBean;
	}
	
	// *****************************************************************
	// * Array Attribute: units
	// *****************************************************************
	private IBeanList<UnitDefinition> units = new TypeSafeComposedPropertyInstanceList<>(UnitDefinition.class);
	
	private void safeAccessUnits() {
		if (units.getArrayInstance() == null) {
			units.setArrayInstance((ArrayInstance) helper.getPropertyInstance("units"));
		}
	}
	
	public IBeanList<UnitDefinition> getUnits() {
		safeAccessUnits();
		return units;
	}
	
	private IBeanList<BeanPropertyComposed<UnitDefinition>> unitsBean = new TypeSafeComposedPropertyBeanList<>();
	
	private void safeAccessUnitsBean() {
		if (unitsBean.getArrayInstance() == null) {
			unitsBean.setArrayInstance((ArrayInstance) helper.getPropertyInstance("units"));
		}
	}
	
	@XmlElement
	public IBeanList<BeanPropertyComposed<UnitDefinition>> getUnitsBean() {
		safeAccessUnitsBean();
		return unitsBean;
	}
	
	
}
