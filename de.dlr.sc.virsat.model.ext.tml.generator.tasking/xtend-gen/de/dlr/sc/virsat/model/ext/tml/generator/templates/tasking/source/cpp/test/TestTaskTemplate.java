/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * @author nepa_ay
 */
@SuppressWarnings("all")
public class TestTaskTemplate extends AbstractTestTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.getInstance();
  
  public TestTaskTemplate(final TaskingEnvironment taskingEnvironment) {
    boolean _isInitilaized = this.taskingEnvironmentHelper.isInitilaized();
    boolean _not = (!_isInitilaized);
    if (_not) {
      this.taskingEnvironmentHelper.init(taskingEnvironment);
    }
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef TEST_TASK_H_");
    _builder.newLine();
    _builder.append("#define TEST_TASK_H_");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include \"task.h\"");
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class TestTask : public Tasking::Task {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public: ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("TestTask(void) : Task(100, ");
    int _length = ((Object[])Conversions.unwrapArray(this.taskingEnvironmentHelper.getDataTypes(), Object.class)).length;
    _builder.append(_length, "\t\t\t");
    _builder.append(") { }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    int key = 0;
    _builder.newLineIfNotEmpty();
    {
      Set<DataType> _dataTypes = this.taskingEnvironmentHelper.getDataTypes();
      for(final DataType datatype : _dataTypes) {
        _builder.append("\t\t\t");
        _builder.append("static const unsigned int ");
        String _inputKeyName = this.getInputKeyName(this.getConstantsName(datatype.getName()));
        _builder.append(_inputKeyName, "\t\t\t");
        _builder.append(" = ");
        int _plusPlus = key++;
        _builder.append(_plusPlus, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("void initialize(); ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("void execute();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("void terminate();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("bool m_executed = false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*  TEST_TASK_H_ */");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.append("#include \"testTask.h\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("void ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append("::TestTask::initialize(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("m_executed = false;");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("std::cout << \"TestTask initialized!\" << std::endl;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void ");
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1);
    _builder.append("::TestTask::execute(){");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("m_executed = true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("std::cout << \"TestTask executed!\" << std::endl;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void ");
    String _projectName_2 = this.gcp.getProjectName();
    _builder.append(_projectName_2);
    _builder.append("::TestTask::terminate(){");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("m_executed = false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("std::cout << \"TestTask terminated!\" << std::endl;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
