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

import com.google.common.base.Objects;
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp.test.AbstractTestTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author nepa_ay
 */
@SuppressWarnings("all")
public class TestConfigurationLoaderTemplate extends AbstractTestTemplate {
  private TaskingEnvironment taskingEnvironment;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.getInstance();
  
  public TestConfigurationLoaderTemplate(final TaskingEnvironment taskingEnvironment) {
    this.taskingEnvironment = taskingEnvironment;
    boolean _isInitilaized = this.taskingEnvironmentHelper.isInitilaized();
    boolean _not = (!_isInitilaized);
    if (_not) {
      this.taskingEnvironmentHelper.init(taskingEnvironment);
    }
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <stdlib.h>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("#include \"gtest/gtest.h\"");
    _builder.newLine();
    _builder.append("#include \"../../");
    String _removeFileSepChars = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars);
    _builder.append("/");
    String _removeFileSepChars_1 = this.removeFileSepChars(this.gcp.getLibconfigFolder());
    _builder.append(_removeFileSepChars_1);
    _builder.append("/libconfig.h++\"");
    _builder.newLineIfNotEmpty();
    {
      Set<TaskDefinition> _taskDefinitions = this.taskingEnvironmentHelper.getTaskDefinitions();
      for(final TaskDefinition taskDefinition : _taskDefinitions) {
        {
          boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(taskDefinition.getParameters());
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            _builder.append("#include \"");
            String _abstractName = this.getAbstractName(taskDefinition.getName());
            _builder.append(_abstractName);
            _builder.append(".h\"");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("#include \"");
    String _configurationLoaderClassName = this.gcp.getConfigurationLoaderClassName();
    _builder.append(_configurationLoaderClassName);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"test");
    String _configurationLoaderClassName = this.gcp.getConfigurationLoaderClassName();
    _builder.append(_configurationLoaderClassName);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("const char * ");
    String _acronym = this.getAcronym(this.gcp.getConfigurationLoaderClassName());
    _builder.append(_acronym, "\t");
    _builder.append("_TEST_CONFIG_FILE = \"./");
    String _testConfigFilename = this.gcp.getTestConfigFilename();
    _builder.append(_testConfigFilename, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _configurationLoaderClassName_1 = this.gcp.getConfigurationLoaderClassName();
    _builder.append(_configurationLoaderClassName_1, "\t");
    _builder.append(" configurationLoader;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        _builder.append("\t");
        _builder.append("TEST(ConfigurationLoaderTest, ");
        String _className = this.getClassName(task.getName());
        _builder.append(_className, "\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("configurationLoader.loadFile(");
        String _acronym_1 = this.getAcronym(this.gcp.getConfigurationLoaderClassName());
        _builder.append(_acronym_1, "\t\t");
        _builder.append("_TEST_CONFIG_FILE);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        String _projectName_1 = this.gcp.getProjectName();
        _builder.append(_projectName_1, "\t\t");
        _builder.append("::");
        String _abstractName = this.getAbstractName(task.getTypeOf().getName());
        _builder.append(_abstractName, "\t\t");
        _builder.append("::Parameters parameters");
        String _className_1 = this.getClassName(task.getTypeOf().getName());
        _builder.append(_className_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("configurationLoader.getParameters(parameters");
        String _className_2 = this.getClassName(task.getTypeOf().getName());
        _builder.append(_className_2, "\t\t");
        _builder.append(", \"");
        String _className_3 = this.getClassName(task.getName());
        _builder.append(_className_3, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("//Create Reference-Output");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _projectName_2 = this.gcp.getProjectName();
        _builder.append(_projectName_2, "\t\t");
        _builder.append("::");
        String _abstractName_1 = this.getAbstractName(task.getTypeOf().getName());
        _builder.append(_abstractName_1, "\t\t");
        _builder.append("::Parameters parameters;");
        _builder.newLineIfNotEmpty();
        {
          EList<Attribute> _parameters = task.getTypeOf().getParameters();
          for(final Attribute att : _parameters) {
            {
              boolean _is1DArray = this.is1DArray(att);
              if (_is1DArray) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("for(int i=0; i<");
                int _size = att.getDimensions().get(0).getSize();
                _builder.append(_size, "\t\t");
                _builder.append("; i++){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("parameters.");
                String _name = att.getName();
                _builder.append(_name, "\t\t\t");
                _builder.append("[i] = ");
                Object _defaultValue = this.getDefaultValue(att, true);
                _builder.append(_defaultValue, "\t\t\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              } else {
                boolean _is2DArray = this.is2DArray(att);
                if (_is2DArray) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("for(int i=0; i<");
                  int _size_1 = att.getDimensions().get(0).getSize();
                  _builder.append(_size_1, "\t\t");
                  _builder.append("; i++){");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("for(int j=0; j<");
                  int _size_2 = att.getDimensions().get(1).getSize();
                  _builder.append(_size_2, "\t\t\t");
                  _builder.append("; j++){");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("parameters.");
                  String _name_1 = att.getName();
                  _builder.append(_name_1, "\t\t\t\t");
                  _builder.append("[i][j] = ");
                  Object _defaultValue_1 = this.getDefaultValue(att, true);
                  _builder.append(_defaultValue_1, "\t\t\t\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("parameters.");
                  String _name_2 = att.getName();
                  _builder.append(_name_2, "\t\t");
                  _builder.append(" = ");
                  Object _defaultValue_2 = this.getDefaultValue(att, true);
                  _builder.append(_defaultValue_2, "\t\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("//TestOutput:");
        _builder.newLine();
        {
          EList<Attribute> _parameters_1 = task.getTypeOf().getParameters();
          for(final Attribute att_1 : _parameters_1) {
            {
              boolean _is1DArray_1 = this.is1DArray(att_1);
              if (_is1DArray_1) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("EXPECT_EQ(parameters.");
                String _name_3 = att_1.getName();
                _builder.append(_name_3, "\t\t");
                _builder.append("[0], parameters");
                String _className_4 = this.getClassName(task.getTypeOf().getName());
                _builder.append(_className_4, "\t\t");
                _builder.append(".");
                String _name_4 = att_1.getName();
                _builder.append(_name_4, "\t\t");
                _builder.append("[0]);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("EXPECT_EQ(parameters.");
                String _name_5 = att_1.getName();
                _builder.append(_name_5, "\t\t");
                _builder.append("[");
                int _size_3 = att_1.getDimensions().get(0).getSize();
                int _minus = (_size_3 - 1);
                _builder.append(_minus, "\t\t");
                _builder.append("], parameters");
                String _className_5 = this.getClassName(task.getTypeOf().getName());
                _builder.append(_className_5, "\t\t");
                _builder.append(".");
                String _name_6 = att_1.getName();
                _builder.append(_name_6, "\t\t");
                _builder.append("[");
                int _size_4 = att_1.getDimensions().get(0).getSize();
                int _minus_1 = (_size_4 - 1);
                _builder.append(_minus_1, "\t\t");
                _builder.append("]);");
                _builder.newLineIfNotEmpty();
              } else {
                boolean _is2DArray_1 = this.is2DArray(att_1);
                if (_is2DArray_1) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("EXPECT_EQ(parameters.");
                  String _name_7 = att_1.getName();
                  _builder.append(_name_7, "\t\t");
                  _builder.append("[0][0], parameters");
                  String _className_6 = this.getClassName(task.getTypeOf().getName());
                  _builder.append(_className_6, "\t\t");
                  _builder.append(".");
                  String _name_8 = att_1.getName();
                  _builder.append(_name_8, "\t\t");
                  _builder.append("[0][0]);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("EXPECT_EQ(parameters.");
                  String _name_9 = att_1.getName();
                  _builder.append(_name_9, "\t\t");
                  _builder.append("[");
                  int _size_5 = att_1.getDimensions().get(0).getSize();
                  int _minus_2 = (_size_5 - 1);
                  _builder.append(_minus_2, "\t\t");
                  _builder.append("][");
                  int _size_6 = att_1.getDimensions().get(1).getSize();
                  int _minus_3 = (_size_6 - 1);
                  _builder.append(_minus_3, "\t\t");
                  _builder.append("], parameters");
                  String _className_7 = this.getClassName(task.getTypeOf().getName());
                  _builder.append(_className_7, "\t\t");
                  _builder.append(".");
                  String _name_10 = att_1.getName();
                  _builder.append(_name_10, "\t\t");
                  _builder.append("[");
                  int _size_7 = att_1.getDimensions().get(0).getSize();
                  int _minus_4 = (_size_7 - 1);
                  _builder.append(_minus_4, "\t\t");
                  _builder.append("][");
                  int _size_8 = att_1.getDimensions().get(1).getSize();
                  int _minus_5 = (_size_8 - 1);
                  _builder.append(_minus_5, "\t\t");
                  _builder.append("]);");
                  _builder.newLineIfNotEmpty();
                } else {
                  if (((att_1.getTypeOf() instanceof BasicTypeDefinition) || (att_1.getTypeOf() instanceof Enumeration))) {
                    {
                      String _name_11 = att_1.getTypeOf().getName();
                      boolean _equals = Objects.equal(_name_11, this.T_STRING_CHAR);
                      if (_equals) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("EXPECT_EQ(*(parameters.");
                        String _name_12 = att_1.getName();
                        _builder.append(_name_12, "\t\t");
                        _builder.append("), *(parameters");
                        String _className_8 = this.getClassName(task.getTypeOf().getName());
                        _builder.append(_className_8, "\t\t");
                        _builder.append(".");
                        String _name_13 = att_1.getName();
                        _builder.append(_name_13, "\t\t");
                        _builder.append("));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("EXPECT_EQ(parameters.");
                        String _name_14 = att_1.getName();
                        _builder.append(_name_14, "\t\t");
                        _builder.append(", parameters");
                        String _className_9 = this.getClassName(task.getTypeOf().getName());
                        _builder.append(_className_9, "\t\t");
                        _builder.append(".");
                        String _name_15 = att_1.getName();
                        _builder.append(_name_15, "\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
