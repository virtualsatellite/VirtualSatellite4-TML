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

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp.test.AbstractTestTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TestChannelBehaviorTemplate extends AbstractTestTemplate {
  private ChannelBehaviorDefinition channelBehaviorDefinition;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.getInstance();
  
  public TestChannelBehaviorTemplate(final TaskingEnvironment taskingEnvironment, final ChannelBehaviorDefinition channelBehaviorDefinition) {
    this.channelBehaviorDefinition = channelBehaviorDefinition;
    boolean _isInitilaized = this.taskingEnvironmentHelper.isInitilaized();
    boolean _not = (!_isInitilaized);
    if (_not) {
      this.taskingEnvironmentHelper.init(taskingEnvironment);
    }
  }
  
  public CharSequence printChannelParameterValues() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<BehavioralParameterDefinition> _parameters = this.channelBehaviorDefinition.getParameters();
      boolean _hasElements = false;
      for(final BehavioralParameterDefinition param : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        Object _channelParameterValue = this.getChannelParameterValue(param);
        _builder.append(_channelParameterValue);
      }
    }
    return _builder;
  }
  
  public CharSequence printTaskInputInstance(final DataType datatype) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Tasking::TaskInput input");
    String _name = datatype.getName();
    _builder.append(_name);
    _builder.append("(0, false);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printChannelInstance(final DataType datatype) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.channelBehaviorDefinition.getName();
    _builder.append(_name);
    _builder.append("<");
    String _name_1 = datatype.getName();
    _builder.append(_name_1);
    {
      boolean _channelHasSize = this.channelHasSize(this.channelBehaviorDefinition);
      if (_channelHasSize) {
        _builder.append(", SIZE");
      }
    }
    _builder.append("> ch");
    String _name_2 = datatype.getName();
    _builder.append(_name_2);
    {
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.channelBehaviorDefinition.getParameters());
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("(");
        CharSequence _printChannelParameterValues = this.printChannelParameterValues();
        _builder.append(_printChannelParameterValues);
        _builder.append(")");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printDatatypeInstance(final DataType datatype) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = datatype.getName();
    _builder.append(_name);
    _builder.append(" ");
    String _objectName = this.getObjectName(datatype.getName());
    _builder.append(_objectName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printTaskInput(final DataType datatype) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Preparing Input for Datatype - ");
    String _name = datatype.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    CharSequence _printTaskInputInstance = this.printTaskInputInstance(datatype);
    _builder.append(_printTaskInputInstance);
    _builder.newLineIfNotEmpty();
    CharSequence _printChannelInstance = this.printChannelInstance(datatype);
    _builder.append(_printChannelInstance);
    _builder.newLineIfNotEmpty();
    _builder.append("input");
    String _name_1 = datatype.getName();
    _builder.append(_name_1);
    _builder.append(".associate(&ch");
    String _name_2 = datatype.getName();
    _builder.append(_name_2);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("testTask.add(TestTask::");
    String _inputKeyName = this.getInputKeyName(this.getConstantsName(datatype.getName()));
    _builder.append(_inputKeyName);
    _builder.append(", &input");
    String _name_3 = datatype.getName();
    _builder.append(_name_3);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printPushToChannel(final DataType datatype) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ch");
    String _name = datatype.getName();
    _builder.append(_name);
    _builder.append(".push(&");
    String _objectName = this.getObjectName(datatype.getName());
    _builder.append(_objectName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printPopFromChannel(final DataType datatype) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ch");
    String _name = datatype.getName();
    _builder.append(_name);
    _builder.append(".pop();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef ");
    String _name = this.channelBehaviorDefinition.getName();
    String _plus = ("test" + _name);
    String _constantsName = this.getConstantsName(_plus);
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _name_1 = this.channelBehaviorDefinition.getName();
    String _plus_1 = ("test" + _name_1);
    String _constantsName_1 = this.getConstantsName(_plus_1);
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include \"gtest/gtest.h\"");
    _builder.newLine();
    _builder.append("#include \"task.h\"");
    _builder.newLine();
    _builder.append("#include \"tasking.h\"");
    _builder.newLine();
    _builder.append("#include \"taskInput.h\"");
    _builder.newLine();
    _builder.newLine();
    {
      Set<DataType> _dataTypes = this.taskingEnvironmentHelper.getDataTypes();
      for(final DataType dt : _dataTypes) {
        _builder.append("#include \"");
        String _name_2 = dt.getName();
        _builder.append(_name_2);
        _builder.append(".h\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("#include \"testTask.h\"");
    _builder.newLine();
    _builder.append("#include \"");
    String _name_3 = this.channelBehaviorDefinition.getName();
    _builder.append(_name_3);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#endif /* ");
    String _name_4 = this.channelBehaviorDefinition.getName();
    String _plus_2 = ("test" + _name_4);
    String _constantsName_2 = this.getConstantsName(_plus_2);
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"test");
    String _name = this.channelBehaviorDefinition.getName();
    _builder.append(_name);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("using namespace DataTypes;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      Set<DataType> _dataTypes = this.taskingEnvironmentHelper.getDataTypes();
      for(final DataType dt : _dataTypes) {
        _builder.append("\t");
        _builder.append("TEST(");
        String _name_1 = this.channelBehaviorDefinition.getName();
        _builder.append(_name_1, "\t");
        _builder.append("Test, ChannelTest_");
        String _name_2 = dt.getName();
        _builder.append(_name_2, "\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("const unsigned int SIZE = 10;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _printChannelInstance = this.printChannelInstance(dt);
        _builder.append(_printChannelInstance, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("EXPECT_EQ(ch");
        String _name_3 = dt.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(".isEmpty(), true);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _printDatatypeInstance = this.printDatatypeInstance(dt);
        _builder.append(_printDatatypeInstance, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _printPushToChannel = this.printPushToChannel(dt);
        _builder.append(_printPushToChannel, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("EXPECT_EQ(ch");
        String _name_4 = dt.getName();
        _builder.append(_name_4, "\t\t");
        _builder.append(".isEmpty(), false);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _printPopFromChannel = this.printPopFromChannel(dt);
        _builder.append(_printPopFromChannel, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("EXPECT_EQ(ch");
        String _name_5 = dt.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append(".isEmpty(), true);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("TEST(");
        String _name_6 = this.channelBehaviorDefinition.getName();
        _builder.append(_name_6, "\t");
        _builder.append("Test, ChannelTest_TaskInput_");
        String _name_7 = dt.getName();
        _builder.append(_name_7, "\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("TestTask testTask;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("const unsigned int SIZE = 10;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _printTaskInput = this.printTaskInput(dt);
        _builder.append(_printTaskInput, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Tasking::initialize(); // Initialize of all tasks");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Tasking::start(); // Starting the scheduler");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("EXPECT_EQ(testTask.m_executed, false);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _printDatatypeInstance_1 = this.printDatatypeInstance(dt);
        _builder.append(_printDatatypeInstance_1, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _printPushToChannel_1 = this.printPushToChannel(dt);
        _builder.append(_printPushToChannel_1, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Tasking::waitUntilEmpty(); // Wait until all tasks are performed\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Tasking::terminate(); // Terminate the scheduler");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Tasking::resetForTest();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("EXPECT_EQ(testTask.m_executed, true);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
