/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.CppFileNameProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IBuildScriptTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IConfigFileTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ISourceTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ITestTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.util.FileCreator;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;

/**
 * Generator class, that generates source code to specific location when
 * provided with a configuration
 * 
 * @author fran_tb
 *
 */
public class TMLGenerator {

	public static final String GENERATION_EXTENSION_ID = "de.dlr.sc.virsat.model.ext.tml.generator";

	private static final int SRC_SUBMONITOR_TICKS = 9;
	private static final int TEST_SUBMONITOR_TICKS = 9;

	TaskingEnvironmentHelper generationHelper = null;

	IGenerationConfigurationProvider gcp = null;

	IFileNameProvider fnp = null;
	ISourceTemplateProvider sourceTemplateProvider = null;
	IBuildScriptTemplateProvider buildScriptTemplateProvider = null;
	ITestTemplateProvider testTemplateProvider = null;
	IConfigFileTemplateProvider configFileTemplateProvider = null;

	TaskingEnvironmentConfiguration taskingEnvironmentConfiguration = null;
	TaskingEnvironment taskingEnvironment = null;

	private FileCreator fc;

	protected static List<IExtension> registeredGenerators = null;
	protected static String[] supportedVersions = null;

	/**
	 * Constructor for the generator. Requires a configuration and a root path
	 * 
	 * @param projectPath             path of the project for which code should be
	 *                                created
	 * @param generationConfiguration the root configuration element
	 */
	public TMLGenerator(String projectPath, GenerationConfiguration generationConfiguration) {
		// Domain setup
		taskingEnvironmentConfiguration = generationConfiguration.getTaskingEnvironmentConfiguration();
		taskingEnvironment = taskingEnvironmentConfiguration.getDomainElement();

		// Initilize helper classes
		generationHelper = TaskingEnvironmentHelper.getInstance().init(taskingEnvironment);
		gcp = GenerationConfigurationProvider.getInstance().init(projectPath, generationConfiguration);
		fnp = new CppFileNameProvider();

		initGenerator();

		// Create s for ecore elements
		String rootPath = gcp.getRootPath();
		fc = new FileCreator(rootPath + "/" + gcp.getSrcGenPath(), rootPath + "/" + gcp.getSrcPath());

	}

	/**
	 * Initialize extensions of selected generator
	 * 
	 */
	protected void initGenerator() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = registry.getConfigurationElementsFor(GENERATION_EXTENSION_ID);

		for (IConfigurationElement e : config) {
			Object o;
			try {
				if (e.getDeclaringExtension().getLabel().equals(gcp.getTaskingVersion())) {

					o = e.createExecutableExtension("class");
					if (o instanceof ISourceTemplateProvider) {
						sourceTemplateProvider = (ISourceTemplateProvider) o;
					} else if (o instanceof IBuildScriptTemplateProvider) {
						buildScriptTemplateProvider = (IBuildScriptTemplateProvider) o;
					} else if (o instanceof ITestTemplateProvider) {
						testTemplateProvider = (ITestTemplateProvider) o;
					} else if (o instanceof IConfigFileTemplateProvider) {
						configFileTemplateProvider = (IConfigFileTemplateProvider) o;
					}

				}
			} catch (CoreException e1) {
				e1.printStackTrace();
				System.err.println("Extenision not valid");
			}
		}
		if (sourceTemplateProvider == null) {
			System.err.println("Generator for selected tasking version not available!");
			JOptionPane.showMessageDialog(null, "Generator for selected tasking version not available!", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Initializes all extension objects
	 */
	protected static void initExtensions() {

		if (registeredGenerators == null) {
			registeredGenerators = new ArrayList<IExtension>();
		}
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = registry.getConfigurationElementsFor(GENERATION_EXTENSION_ID);

		for (IConfigurationElement e : /* extensions[i].getConfigurationElements() */config) {
			Object o;
			try {
				o = e.createExecutableExtension("class");
				if (o instanceof ISourceTemplateProvider) {
					IExtension extension = e.getDeclaringExtension();
					if (!registeredGenerators.contains(extension)) {
						registeredGenerators.add(extension);
					}
				}
			} catch (CoreException e1) {
				e1.printStackTrace();
				System.err.println("Extension not valid");
			}
		}

	}

	/**
	 * Return a string array of registered generators
	 * 
	 * @return the string array
	 */
	public static final String[] getGeneratorList() {

		if (registeredGenerators == null) {
			initExtensions();
		}

		supportedVersions = new String[registeredGenerators.size()];
		int i = 0;
		for (IExtension generator : registeredGenerators) {
			supportedVersions[i++] = generator.getLabel();
		}
		return supportedVersions;
	}

	/**
	 * Call all generation sub methods here
	 * 
	 * @param progressMonitor a progress monitor
	 */
	public void doGenerate(IProgressMonitor progressMonitor) {
		SubMonitor generationSubMonitor = SubMonitor.convert(progressMonitor, 2);
		// Generate source codes
		generateSource(generationSubMonitor);
		generationSubMonitor.worked(1);

		// Generate google test files..
		generateTests(generationSubMonitor);
		generationSubMonitor.worked(1);

		generationSubMonitor.done();
	}

	/**
	 * Generate source code elements
	 * 
	 * @param progressMonitor a progress monitor
	 */
	public void generateSource(IProgressMonitor progressMonitor) {
		SubMonitor generationSrcSubMonitor = SubMonitor.convert(progressMonitor, SRC_SUBMONITOR_TICKS);

		// Generate TaskingEnvironment class.
		generateTaskingEnvironment(taskingEnvironment);
		generationSrcSubMonitor.worked(1);

		Set<TaskDefinition> taskDefinitions = generationHelper.getTaskDefinitions();
		for (TaskDefinition taskDefinition : taskDefinitions) {
			generateTaskDefinitions(taskingEnvironment, taskDefinition);
		}
		generationSrcSubMonitor.worked(1);

		for (DataType datatype : generationHelper.getDataTypes()) {
			generateDatatype(datatype);
		}
		generationSrcSubMonitor.worked(1);

		for (Enumeration enumeration : generationHelper.getEnumerations()) {
			generateEnumeration(enumeration);
		}
		generationSrcSubMonitor.worked(1);

		for (ChannelBehaviorDefinition channelBehaviorDefinition : generationHelper.getChannelBehaviorDefinitions()) {
			generateChannelBehaviorDefinitions(channelBehaviorDefinition);
		}
		generationSrcSubMonitor.worked(1);

		// Generate queue class
		generateQueueClass();
		generationSrcSubMonitor.worked(1);

		// Generate generic channel template class
		generateAbstractChannelClass();
		generationSrcSubMonitor.worked(1);

		// Generate build scripts for the project
		generateBuildScripts();
		generationSrcSubMonitor.worked(1);

		if (gcp.useLibconfig()) {
			// Generate libconfig-1.6 configuration loader class for the project.
			generateTMLConfigurationLoader(taskingEnvironment);
			// Generate configuration files for the project
			generateConfigurationFiles(taskingEnvironment);
		}
		generationSrcSubMonitor.worked(1);
		generationSrcSubMonitor.done();
	}

	/**
	 * Generate unit test files
	 * 
	 * @param progressMonitor a progress monitor
	 */
	private void generateTests(IProgressMonitor progressMonitor) {
		SubMonitor generationTestSubMonitor = SubMonitor.convert(progressMonitor, TEST_SUBMONITOR_TICKS);

		ArrayList<String> testSourceFiles = new ArrayList<>();
		testSourceFiles.add(generateTaskingEnvironmentTest(taskingEnvironment));
		if (gcp.useLibconfig()) {
			testSourceFiles.add(generateConfigurationLoaderTest(taskingEnvironment));
		}
		testSourceFiles.add(generateTestTaskClass(taskingEnvironment));
		generationTestSubMonitor.worked(1);

		for (ChannelBehaviorDefinition channelBehaviorDefinition : generationHelper.getChannelBehaviorDefinitions()) {
			testSourceFiles.add(generateChannelBehaviorTest(taskingEnvironment, channelBehaviorDefinition));
		}
		generationTestSubMonitor.worked(1);

		// Generate build scripts for test files
		generateBuildScriptsForTest(testSourceFiles);
		generationTestSubMonitor.worked(1);
		generationTestSubMonitor.done();
	}

	/**
	 * Generate build scripts
	 */
	private void generateBuildScripts() {
		// Generate CMakeLists.txt file for the project.
		generateCmake(taskingEnvironment);

		// Generate CMakeLists.txt file for the project.
		generateCmakeSrcDir(taskingEnvironment);

		// Generate CMakeLists.txt file for the project.
		generateCmakeSrcGenDir(taskingEnvironment);

		// Generate CMakeLists.txt file for contrib dir.
		generateCmakeContribDir();

		// Generate SConstruct file for the project.
		generateSConstruct();

		// Generate SConscript file for the project.
		generateSConscript();

		// Generate SConscript file for contrib dir.
		generateSConscriptContribDir();
	}

	/**
	 * Generate build script for test directory
	 * 
	 * @param testSourceFiles list of unit-test source filename
	 */
	private void generateBuildScriptsForTest(ArrayList<String> testSourceFiles) {
		// Generate CMakeLists.txt file for test dir.
		generateCmakeTestDir(testSourceFiles);

		// Generate SConscript file for test directory
		generateSConscriptTestDir(testSourceFiles);
	}

	// ****************************************************************************************************************************/
	// * METHODS TO GENERATE SOURCE FILES (.cpp and .h)
	// ****************************************************************************************************************************/

	/**
	 * Generate source code for a given tasking environment
	 * 
	 * @param taskingEnvironment element for which code should be generated
	 */
	protected void generateTaskingEnvironment(TaskingEnvironment taskingEnvironment) {
		try {
			ISourceTemplate template = sourceTemplateProvider.getTaskingEnvironmentTemplate(taskingEnvironment);

			fc.generate(".", fnp.getAbstractHeaderFileName(taskingEnvironment), template.compileAbstractHeader(), true);
			fc.generate(".", fnp.getAbstractSourceFileName(taskingEnvironment), template.compileAbstractSource(), true);
			fc.generateOnce(".", fnp.getHeaderFileName(taskingEnvironment), template.compileHeader());
			fc.generateOnce(".", fnp.getSourceFileName(taskingEnvironment), template.compileSource());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * Generate source code for a given data type
	 * 
	 * @param datatype element for which code should be generated
	 */
	protected void generateDatatype(DataType datatype) {
		try {
			ISourceTemplate sourceTemplate = sourceTemplateProvider.getDatatypeTemplate(datatype);
			fc.generate(gcp.getTypeDefinitionFolder(), fnp.getAbstractHeaderFileName(datatype),
					sourceTemplate.compileAbstractHeader(), true);
			fc.generateOnce(gcp.getTypeDefinitionFolder(), fnp.getHeaderFileName(datatype),
					sourceTemplate.compileHeader());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate source code for a given enumeration
	 * 
	 * @param enumeration element for which code should be generated
	 */
	protected void generateEnumeration(Enumeration enumeration) {
		try {
			ISourceTemplate template = sourceTemplateProvider.getEnumerationTemplate(enumeration);
			fc.generate(gcp.getTypeDefinitionFolder(), fnp.getHeaderFileName(enumeration), template.compileHeader(),
					true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate source code for a given task
	 * 
	 * @param taskingEnvironment model object
	 * @param taskDefinition     element for which code should be generated
	 */
	private void generateTaskDefinitions(TaskingEnvironment taskingEnvironment, TaskDefinition taskDefinition) {
		ISourceTemplate sourcetemplate = sourceTemplateProvider.getTaskDefinitionTemplate(taskingEnvironment,
				taskDefinition);
		fc.generate(gcp.getTaskDefinitionFolder(), fnp.getAbstractHeaderFileName(taskDefinition),
				sourcetemplate.compileAbstractHeader(), true);
		fc.generate(gcp.getTaskDefinitionFolder(), fnp.getAbstractSourceFileName(taskDefinition),
				sourcetemplate.compileAbstractSource(), true);
		fc.generateOnce(gcp.getTaskDefinitionFolder(), fnp.getHeaderFileName(taskDefinition),
				sourcetemplate.compileHeader());
		fc.generateOnce(gcp.getTaskDefinitionFolder(), fnp.getSourceFileName(taskDefinition),
				sourcetemplate.compileSource());

	}

	/**
	 * Generate source code for for the given channel behaviour (FIFO, LIFO etc)
	 * 
	 * @param channelBehaviorDefinition element for which code should be generated
	 */
	private void generateChannelBehaviorDefinitions(ChannelBehaviorDefinition channelBehaviorDefinition) {
		try {
			ISourceTemplate sourcetemplate = sourceTemplateProvider
					.getChannelBehaviorDefinitionTemplate(channelBehaviorDefinition);
			fc.generate(gcp.getChannelDefinitionFolder(), fnp.getAbstractHeaderFileName(channelBehaviorDefinition),
					sourcetemplate.compileAbstractHeader(), true);
			fc.generateOnce(gcp.getChannelDefinitionFolder(), fnp.getHeaderFileName(channelBehaviorDefinition),
					sourcetemplate.compileHeader());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate Queue template class source code.
	 */
	private void generateQueueClass() {
		try {
			ISourceTemplate sourcetemplate = sourceTemplateProvider.getChannelQueueTemplate();
			fc.generate(gcp.getChannelDefinitionFolder(), fnp.getHeaderFileName(gcp.getQueueClassName()),
					sourcetemplate.compileHeader(), true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate interface channel source code
	 */
	private void generateAbstractChannelClass() {
		try {
			ISourceTemplate sourcetemplate = sourceTemplateProvider.getAbstractChannelTemplate();
			fc.generate(gcp.getChannelDefinitionFolder(), fnp.getHeaderFileName(gcp.getAbstractChannelClassName()),
					sourcetemplate.compileHeader(), true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate configuration loader class source code
	 * 
	 * @param taskingEnvironment model object
	 * @param taskDefinitions    List of all the components in the model for which
	 *                           the configuration is to be loaded.
	 */
	private void generateTMLConfigurationLoader(TaskingEnvironment taskingEnvironment) {
		try {
			ISourceTemplate sourcetemplate = sourceTemplateProvider
					.getTMLConfigurationLoaderTemplate(taskingEnvironment);
			fc.generate(".", fnp.getHeaderFileName(gcp.getConfigurationLoaderClassName()),
					sourcetemplate.compileAbstractHeader(), true);
			fc.generate(".", fnp.getSourceFileName(gcp.getConfigurationLoaderClassName()),
					sourcetemplate.compileAbstractSource(), true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate configuration files for the project
	 * 
	 * @param taskingEnvironment model object
	 */
	private void generateConfigurationFiles(TaskingEnvironment taskingEnvironment) {
		try {
			IConfigFileTemplate configFileDefaultTemplate = configFileTemplateProvider
					.getConfigFileDefaultTemplate(taskingEnvironment);
			fc.generateOnce(".", gcp.getDefaultConfigFilename(), configFileDefaultTemplate.compileFileContent());

			IConfigFileTemplate configFileTestTemplate = configFileTemplateProvider
					.getConfigFileTestTemplate(taskingEnvironment);
			fc.generate(gcp.getTestPath(), gcp.getTestConfigFilename(), configFileTestTemplate.compileFileContent(),
					true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	// ****************************************************************************************************************************/
	// * METHODS TO GENERATE TEST FILES (test{TestCase}.c, test{TestCase}.h)
	// ****************************************************************************************************************************/

	/**
	 * Generate TestTask class for testing purpose
	 * 
	 * @param taskingEnvironment Tasking environment object
	 * @return TestTask source filename
	 */
	private String generateTestTaskClass(TaskingEnvironment taskingEnvironment) {
		try {
			ITestTemplate testTasktemplate = testTemplateProvider.getTestTaskTemplate(taskingEnvironment);
			fc.generate(gcp.getTestPath(), fnp.getTestHeaderFilename("Task"), testTasktemplate.compileHeader(), true);
			fc.generate(gcp.getTestPath(), fnp.getTestSourceFilename("Task"), testTasktemplate.compileSource(), true);
			return fnp.getTestSourceFilename("Task");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * Generate channel behavior test file
	 * 
	 * @param taskingEnvironment        Tasking environment object
	 * @param channelBehaviorDefinition Channel Behavior Definition object
	 * @return test source filename
	 */
	private String generateChannelBehaviorTest(TaskingEnvironment taskingEnvironment,
			ChannelBehaviorDefinition channelBehaviorDefinition) {
		try {
			ITestTemplate channelBehaviorTestTemplate = testTemplateProvider
					.getTestChannelBehaviorTemplate(taskingEnvironment, channelBehaviorDefinition);
			fc.generate(gcp.getTestPath(), fnp.getTestHeaderFilename(channelBehaviorDefinition.getName()),
					channelBehaviorTestTemplate.compileHeader(), true);
			fc.generate(gcp.getTestPath(), fnp.getTestSourceFilename(channelBehaviorDefinition.getName()),
					channelBehaviorTestTemplate.compileSource(), true);
			return fnp.getTestSourceFilename(channelBehaviorDefinition.getName());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * Generate test file for the tasking environment
	 * 
	 * @param taskingEnvironment Tasking environment object
	 * @return test source filename
	 */
	private String generateTaskingEnvironmentTest(TaskingEnvironment taskingEnvironment) {
		try {
			ITestTemplate testTaskMsgtemplate = testTemplateProvider.getTestEnvironmentTemplate(taskingEnvironment);
			fc.generate(gcp.getTestPath(), fnp.getTestHeaderFilename(taskingEnvironment.getName()),
					testTaskMsgtemplate.compileHeader(), true);
			fc.generate(gcp.getTestPath(), fnp.getTestSourceFilename(taskingEnvironment.getName()),
					testTaskMsgtemplate.compileSource(), true);
			return fnp.getTestSourceFilename(taskingEnvironment.getName());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * Generate configuration-loader test file
	 * 
	 * @param taskingEnvironment Tasking environment object
	 * @return test source filename
	 */
	private String generateConfigurationLoaderTest(TaskingEnvironment taskingEnvironment) {
		try {
			ITestTemplate testTemplate = testTemplateProvider.getTestConfigurationLoaderTemplate(taskingEnvironment);
			fc.generate(gcp.getTestPath(), fnp.getTestHeaderFilename(gcp.getConfigurationLoaderClassName()),
					testTemplate.compileHeader(), true);
			fc.generate(gcp.getTestPath(), fnp.getTestSourceFilename(gcp.getConfigurationLoaderClassName()),
					testTemplate.compileSource(), true);
			return fnp.getTestSourceFilename(gcp.getConfigurationLoaderClassName());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return "";
	}

	// ****************************************************************************************************************************/
	// * GENERATE BUILD SCRIPTS
	// ****************************************************************************************************************************/

	/**
	 * Generate CMakeLists.txt file in root directory
	 * 
	 * @param taskingEnvironment : Model object
	 */
	private void generateCmake(TaskingEnvironment taskingEnvironment) {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getCMakeTemplate(taskingEnvironment);
			// Generate CMakeLists.txt in root dir
			fc.generateOnce("../", fnp.getCmakeListsFilename(), template.compileScript());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate CMakeLists.txt file in contrib directory
	 */
	private void generateCmakeContribDir() {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getCMakeContribDirTemplate();
			// Generate CMakeLists.txt in root dir
			fc.generateOnce("../" + gcp.getContribFolder(), fnp.getCmakeListsFilename(), template.compileScript());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate CMakeList.txt file in src dir
	 * 
	 * @param taskingEnvironment : Model object
	 */
	private void generateCmakeSrcDir(TaskingEnvironment taskingEnvironment) {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getCMakeSrcDirTemplate(taskingEnvironment);
			// Generate CMakeLists.txt in root dir
			fc.generateOnce("./", fnp.getCmakeListsFilename(), template.compileScript());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate CMakeList.txt file in src-gen dir
	 * 
	 * @param taskingEnvironment : Model object
	 */
	private void generateCmakeSrcGenDir(TaskingEnvironment taskingEnvironment) {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getCMakeSrcGenDirTemplate(taskingEnvironment);
			// Generate CMakeLists.txt in root dir
			fc.generate("./", fnp.getCmakeListsFilename(), template.compileScript(), true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate CMakeList.txt file in test dir
	 * 
	 * @param testSourceFiles list of unit-test source filename
	 */
	private void generateCmakeTestDir(ArrayList<String> testSourceFiles) {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getCMakeTestDirTemplate(testSourceFiles);
			fc.generate(gcp.getTestPath(), fnp.getCmakeListsFilename(), template.compileScript(), true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate SConstruct in root dir
	 */
	private void generateSConstruct() {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getSConstructTemplate();
			fc.generateOnce("../", "SConstruct", template.compileScript());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate SConscript in root dir
	 */
	private void generateSConscript() {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getSConscriptTemplate();
			fc.generateOnce("../", "SConscript", template.compileScript());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate SConscript in test dir
	 * 
	 * @param testSourceFiles list of unit-test source filename
	 */
	private void generateSConscriptTestDir(ArrayList<String> testSourceFiles) {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getSConscriptTestDirTemplate(testSourceFiles);
			fc.generate(gcp.getTestPath(), "SConscript", template.compileScript(), true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Generate SConscript in contrib dir
	 */
	private void generateSConscriptContribDir() {
		try {
			IBuildScriptTemplate template = buildScriptTemplateProvider.getSConscriptContribDirTemplate();
			fc.generateOnce("../" + gcp.getContribFolder(), "SConscript", template.compileScript());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
