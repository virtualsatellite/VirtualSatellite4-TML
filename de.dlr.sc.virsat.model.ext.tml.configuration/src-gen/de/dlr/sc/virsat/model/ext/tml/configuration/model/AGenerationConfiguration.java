/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ComposedPropertyInstance;
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
 * Contains all generator related configuration
 * 
 */	
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class AGenerationConfiguration extends GenericCategory implements IBeanCategoryAssignment {

	public static final String FULL_QUALIFIED_CATEGORY_NAME = "de.dlr.sc.virsat.model.ext.tml.configuration.GenerationConfiguration";
	
	/**
 	* Call this method to get the full qualified name of the underlying category
 	* @return The FQN of the category as String
 	*/
	public String getFullQualifiedCategoryName() {
		return FULL_QUALIFIED_CATEGORY_NAME;
	}
	
	// property name constants
	public static final String PROPERTY_GENERATIONPATH = "generationPath";
	public static final String PROPERTY_SRCGENPATH = "srcGenPath";
	public static final String PROPERTY_SRCPATH = "srcPath";
	public static final String PROPERTY_BUILDGENPATH = "buildGenPath";
	public static final String PROPERTY_TESTPATH = "testPath";
	public static final String PROPERTY_TASKDEFINITIONFOLDER = "taskDefinitionFolder";
	public static final String PROPERTY_CHANNELDEFINITIONFOLDER = "channelDefinitionFolder";
	public static final String PROPERTY_TYPEDEFINITIONFOLDER = "typeDefinitionFolder";
	public static final String PROPERTY_CONTRIBFOLDER = "contribFolder";
	public static final String PROPERTY_LIBCONFIGFOLDER = "libconfigFolder";
	public static final String PROPERTY_TASKINGVERSION = "taskingVersion";
	public static final String PROPERTY_TASKINGENVIRONMENTCONFIGURATION = "taskingEnvironmentConfiguration";
	
	
	
	// *****************************************************************
	// * Class Constructors
	// *****************************************************************
	
	public AGenerationConfiguration() {
	}
	
	public AGenerationConfiguration(Concept concept) {
		Category categoryFromActiveCategories = ActiveConceptHelper.getCategory(concept, "GenerationConfiguration");
		CategoryAssignment categoryAssignement = new CategoryInstantiator().generateInstance(categoryFromActiveCategories, "GenerationConfiguration");
		setTypeInstance(categoryAssignement);
	}
	
	public AGenerationConfiguration(CategoryAssignment categoryAssignement) {
		setTypeInstance(categoryAssignement);
	}
	
	
	// *****************************************************************
	// * Attribute: generationPath
	// *****************************************************************
	private BeanPropertyString generationPath = new BeanPropertyString();
	
	private void safeAccessGenerationPath() {
		if (generationPath.getTypeInstance() == null) {
			generationPath.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("generationPath"));
		}
	}
	
	public Command setGenerationPath(EditingDomain ed, String value) {
		safeAccessGenerationPath();
		return this.generationPath.setValue(ed, value);
	}
	
	public void setGenerationPath(String value) {
		safeAccessGenerationPath();
		this.generationPath.setValue(value);
	}
	
	public String getGenerationPath() {
		safeAccessGenerationPath();
		return generationPath.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getGenerationPathBean() {
		safeAccessGenerationPath();
		return generationPath;
	}
	
	// *****************************************************************
	// * Attribute: srcGenPath
	// *****************************************************************
	private BeanPropertyString srcGenPath = new BeanPropertyString();
	
	private void safeAccessSrcGenPath() {
		if (srcGenPath.getTypeInstance() == null) {
			srcGenPath.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("srcGenPath"));
		}
	}
	
	public Command setSrcGenPath(EditingDomain ed, String value) {
		safeAccessSrcGenPath();
		return this.srcGenPath.setValue(ed, value);
	}
	
	public void setSrcGenPath(String value) {
		safeAccessSrcGenPath();
		this.srcGenPath.setValue(value);
	}
	
	public String getSrcGenPath() {
		safeAccessSrcGenPath();
		return srcGenPath.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getSrcGenPathBean() {
		safeAccessSrcGenPath();
		return srcGenPath;
	}
	
	// *****************************************************************
	// * Attribute: srcPath
	// *****************************************************************
	private BeanPropertyString srcPath = new BeanPropertyString();
	
	private void safeAccessSrcPath() {
		if (srcPath.getTypeInstance() == null) {
			srcPath.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("srcPath"));
		}
	}
	
	public Command setSrcPath(EditingDomain ed, String value) {
		safeAccessSrcPath();
		return this.srcPath.setValue(ed, value);
	}
	
	public void setSrcPath(String value) {
		safeAccessSrcPath();
		this.srcPath.setValue(value);
	}
	
	public String getSrcPath() {
		safeAccessSrcPath();
		return srcPath.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getSrcPathBean() {
		safeAccessSrcPath();
		return srcPath;
	}
	
	// *****************************************************************
	// * Attribute: buildGenPath
	// *****************************************************************
	private BeanPropertyString buildGenPath = new BeanPropertyString();
	
	private void safeAccessBuildGenPath() {
		if (buildGenPath.getTypeInstance() == null) {
			buildGenPath.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("buildGenPath"));
		}
	}
	
	public Command setBuildGenPath(EditingDomain ed, String value) {
		safeAccessBuildGenPath();
		return this.buildGenPath.setValue(ed, value);
	}
	
	public void setBuildGenPath(String value) {
		safeAccessBuildGenPath();
		this.buildGenPath.setValue(value);
	}
	
	public String getBuildGenPath() {
		safeAccessBuildGenPath();
		return buildGenPath.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getBuildGenPathBean() {
		safeAccessBuildGenPath();
		return buildGenPath;
	}
	
	// *****************************************************************
	// * Attribute: testPath
	// *****************************************************************
	private BeanPropertyString testPath = new BeanPropertyString();
	
	private void safeAccessTestPath() {
		if (testPath.getTypeInstance() == null) {
			testPath.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("testPath"));
		}
	}
	
	public Command setTestPath(EditingDomain ed, String value) {
		safeAccessTestPath();
		return this.testPath.setValue(ed, value);
	}
	
	public void setTestPath(String value) {
		safeAccessTestPath();
		this.testPath.setValue(value);
	}
	
	public String getTestPath() {
		safeAccessTestPath();
		return testPath.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getTestPathBean() {
		safeAccessTestPath();
		return testPath;
	}
	
	// *****************************************************************
	// * Attribute: taskDefinitionFolder
	// *****************************************************************
	private BeanPropertyString taskDefinitionFolder = new BeanPropertyString();
	
	private void safeAccessTaskDefinitionFolder() {
		if (taskDefinitionFolder.getTypeInstance() == null) {
			taskDefinitionFolder.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("taskDefinitionFolder"));
		}
	}
	
	public Command setTaskDefinitionFolder(EditingDomain ed, String value) {
		safeAccessTaskDefinitionFolder();
		return this.taskDefinitionFolder.setValue(ed, value);
	}
	
	public void setTaskDefinitionFolder(String value) {
		safeAccessTaskDefinitionFolder();
		this.taskDefinitionFolder.setValue(value);
	}
	
	public String getTaskDefinitionFolder() {
		safeAccessTaskDefinitionFolder();
		return taskDefinitionFolder.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getTaskDefinitionFolderBean() {
		safeAccessTaskDefinitionFolder();
		return taskDefinitionFolder;
	}
	
	// *****************************************************************
	// * Attribute: channelDefinitionFolder
	// *****************************************************************
	private BeanPropertyString channelDefinitionFolder = new BeanPropertyString();
	
	private void safeAccessChannelDefinitionFolder() {
		if (channelDefinitionFolder.getTypeInstance() == null) {
			channelDefinitionFolder.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("channelDefinitionFolder"));
		}
	}
	
	public Command setChannelDefinitionFolder(EditingDomain ed, String value) {
		safeAccessChannelDefinitionFolder();
		return this.channelDefinitionFolder.setValue(ed, value);
	}
	
	public void setChannelDefinitionFolder(String value) {
		safeAccessChannelDefinitionFolder();
		this.channelDefinitionFolder.setValue(value);
	}
	
	public String getChannelDefinitionFolder() {
		safeAccessChannelDefinitionFolder();
		return channelDefinitionFolder.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getChannelDefinitionFolderBean() {
		safeAccessChannelDefinitionFolder();
		return channelDefinitionFolder;
	}
	
	// *****************************************************************
	// * Attribute: typeDefinitionFolder
	// *****************************************************************
	private BeanPropertyString typeDefinitionFolder = new BeanPropertyString();
	
	private void safeAccessTypeDefinitionFolder() {
		if (typeDefinitionFolder.getTypeInstance() == null) {
			typeDefinitionFolder.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("typeDefinitionFolder"));
		}
	}
	
	public Command setTypeDefinitionFolder(EditingDomain ed, String value) {
		safeAccessTypeDefinitionFolder();
		return this.typeDefinitionFolder.setValue(ed, value);
	}
	
	public void setTypeDefinitionFolder(String value) {
		safeAccessTypeDefinitionFolder();
		this.typeDefinitionFolder.setValue(value);
	}
	
	public String getTypeDefinitionFolder() {
		safeAccessTypeDefinitionFolder();
		return typeDefinitionFolder.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getTypeDefinitionFolderBean() {
		safeAccessTypeDefinitionFolder();
		return typeDefinitionFolder;
	}
	
	// *****************************************************************
	// * Attribute: contribFolder
	// *****************************************************************
	private BeanPropertyString contribFolder = new BeanPropertyString();
	
	private void safeAccessContribFolder() {
		if (contribFolder.getTypeInstance() == null) {
			contribFolder.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("contribFolder"));
		}
	}
	
	public Command setContribFolder(EditingDomain ed, String value) {
		safeAccessContribFolder();
		return this.contribFolder.setValue(ed, value);
	}
	
	public void setContribFolder(String value) {
		safeAccessContribFolder();
		this.contribFolder.setValue(value);
	}
	
	public String getContribFolder() {
		safeAccessContribFolder();
		return contribFolder.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getContribFolderBean() {
		safeAccessContribFolder();
		return contribFolder;
	}
	
	// *****************************************************************
	// * Attribute: libconfigFolder
	// *****************************************************************
	private BeanPropertyString libconfigFolder = new BeanPropertyString();
	
	private void safeAccessLibconfigFolder() {
		if (libconfigFolder.getTypeInstance() == null) {
			libconfigFolder.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("libconfigFolder"));
		}
	}
	
	public Command setLibconfigFolder(EditingDomain ed, String value) {
		safeAccessLibconfigFolder();
		return this.libconfigFolder.setValue(ed, value);
	}
	
	public void setLibconfigFolder(String value) {
		safeAccessLibconfigFolder();
		this.libconfigFolder.setValue(value);
	}
	
	public String getLibconfigFolder() {
		safeAccessLibconfigFolder();
		return libconfigFolder.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getLibconfigFolderBean() {
		safeAccessLibconfigFolder();
		return libconfigFolder;
	}
	
	// *****************************************************************
	// * Attribute: taskingVersion
	// *****************************************************************
	private BeanPropertyString taskingVersion = new BeanPropertyString();
	
	private void safeAccessTaskingVersion() {
		if (taskingVersion.getTypeInstance() == null) {
			taskingVersion.setTypeInstance((ValuePropertyInstance) helper.getPropertyInstance("taskingVersion"));
		}
	}
	
	public Command setTaskingVersion(EditingDomain ed, String value) {
		safeAccessTaskingVersion();
		return this.taskingVersion.setValue(ed, value);
	}
	
	public void setTaskingVersion(String value) {
		safeAccessTaskingVersion();
		this.taskingVersion.setValue(value);
	}
	
	public String getTaskingVersion() {
		safeAccessTaskingVersion();
		return taskingVersion.getValue();
	}
	
	@XmlElement
	public BeanPropertyString getTaskingVersionBean() {
		safeAccessTaskingVersion();
		return taskingVersion;
	}
	
	// *****************************************************************
	// * Attribute: taskingEnvironmentConfiguration
	// *****************************************************************
	private BeanPropertyComposed<TaskingEnvironmentConfiguration> taskingEnvironmentConfiguration = new BeanPropertyComposed<>();
	
	private void safeAccessTaskingEnvironmentConfiguration() {
		if (taskingEnvironmentConfiguration.getTypeInstance() == null) {
			ComposedPropertyInstance propertyInstance = (ComposedPropertyInstance) helper.getPropertyInstance("taskingEnvironmentConfiguration");
			taskingEnvironmentConfiguration.setTypeInstance(propertyInstance);
		}
	}
	
	@XmlElement(nillable = true)
	public TaskingEnvironmentConfiguration getTaskingEnvironmentConfiguration() {
		safeAccessTaskingEnvironmentConfiguration();
		return taskingEnvironmentConfiguration.getValue();
	}
	
	public BeanPropertyComposed<TaskingEnvironmentConfiguration> getTaskingEnvironmentConfigurationBean() {
		safeAccessTaskingEnvironmentConfiguration();
		return taskingEnvironmentConfiguration;
	}
	
	
}
