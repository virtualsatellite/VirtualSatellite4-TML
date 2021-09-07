/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.test;

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp.test.AbstractTestTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author nepa_ay
 */
@SuppressWarnings("all")
public class TestEnviromentTemplate extends AbstractTestTemplate {
  private TaskingEnvironment taskingEnvironment;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  public TestEnviromentTemplate(final TaskingEnvironment taskingEnvironment) {
    this.taskingEnvironment = taskingEnvironment;
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <stdlib.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include \"gtest/gtest.h\"");
    _builder.newLine();
    _builder.append("#include \"task.h\"");
    _builder.newLine();
    _builder.append("#include \"tasking.h\"");
    _builder.newLine();
    _builder.append("#include \"taskInput.h\"");
    _builder.newLine();
    _builder.append("#include \"testTasking.h\"");
    _builder.newLine();
    _builder.append("#include \"");
    String _name = this.taskingEnvironment.getName();
    _builder.append(_name);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"test");
    String _name = this.taskingEnvironment.getName();
    _builder.append(_name);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TEST(");
    String _name_1 = this.taskingEnvironment.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Test, BasicTest){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_2 = this.taskingEnvironment.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append(" taskingEnvironment(\"");
    String _testConfigFilename = this.gcp.getTestConfigFilename();
    _builder.append(_testConfigFilename, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("taskingEnvironment.init(); // Initilize Tasking Environment");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Tasking::start(); // Start Tasking");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Tasking::waitUntilEmpty(); // Wait until all tasks are performed.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("taskingEnvironment.terminate(); // Terminate the scheduler");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Tasking::resetForTest();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
