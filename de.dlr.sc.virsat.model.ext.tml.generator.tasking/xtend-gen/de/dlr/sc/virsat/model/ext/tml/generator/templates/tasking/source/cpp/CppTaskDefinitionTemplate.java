/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp;

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.AbstractTaskingTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CppTaskDefinitionTemplate extends AbstractTaskingTemplate {
  protected TaskingEnvironment taskingEnvironment;
  
  protected TaskDefinition taskDefinition;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  public CppTaskDefinitionTemplate(final TaskingEnvironment taskingEnvironment, final TaskDefinition taskDefinition) {
    this.taskingEnvironment = taskingEnvironment;
    this.taskDefinition = taskDefinition;
    this.initIncludes();
  }
  
  protected Iterable<TaskInputDefinition> getTaskInputsWithDataType(final TaskDefinition taskDefinition) {
    final Function1<TaskInputDefinition, Boolean> _function = (TaskInputDefinition i) -> {
      DataType _dataType = i.getDataType();
      return Boolean.valueOf((_dataType != null));
    };
    return IterableExtensions.<TaskInputDefinition>filter(taskDefinition.getInputs(), _function);
  }
  
  protected Iterable<TaskOutputDefinition> getTaskOutputsWithDataType(final TaskDefinition taskDefinition) {
    final Function1<TaskOutputDefinition, Boolean> _function = (TaskOutputDefinition i) -> {
      DataType _dataType = i.getDataType();
      return Boolean.valueOf((_dataType != null));
    };
    return IterableExtensions.<TaskOutputDefinition>filter(taskDefinition.getOutputs(), _function);
  }
  
  protected Iterable<Attribute> filterOutBasicTypes(final EList<Attribute> attributes) {
    final Function1<Attribute, Boolean> _function = (Attribute att) -> {
      IType _typeOf = att.getTypeOf();
      return Boolean.valueOf((!(_typeOf instanceof BasicTypeDefinitionImpl)));
    };
    return IterableExtensions.<Attribute>filter(attributes, _function);
  }
  
  protected void initIncludes() {
    final Consumer<TaskInputDefinition> _function = (TaskInputDefinition input) -> {
      String _name = input.getDataType().getName();
      String _plus = ("\"" + _name);
      String _plus_1 = (_plus + ".h\"");
      this.addIncludes(_plus_1);
    };
    this.getTaskInputsWithDataType(this.taskDefinition).forEach(_function);
    final Consumer<TaskOutputDefinition> _function_1 = (TaskOutputDefinition output) -> {
      String _name = output.getDataType().getName();
      String _plus = ("\"" + _name);
      String _plus_1 = (_plus + ".h\"");
      this.addIncludes(_plus_1);
    };
    this.getTaskOutputsWithDataType(this.taskDefinition).forEach(_function_1);
    final Consumer<Attribute> _function_2 = (Attribute att) -> {
      String _name = att.getTypeOf().getName();
      String _plus = ("\"" + _name);
      String _plus_1 = (_plus + ".h\"");
      this.addIncludes(_plus_1);
    };
    this.filterOutBasicTypes(this.taskDefinition.getParameters()).forEach(_function_2);
    final Consumer<Attribute> _function_3 = (Attribute att) -> {
      String _name = att.getTypeOf().getName();
      String _plus = ("\"" + _name);
      String _plus_1 = (_plus + ".h\"");
      this.addIncludes(_plus_1);
    };
    this.filterOutBasicTypes(this.taskingEnvironment.getGlobalParameters()).forEach(_function_3);
  }
  
  public boolean isTask() {
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.taskDefinition.getInputs());
    return (!_isNullOrEmpty);
  }
  
  public CharSequence getConstructorArgs() {
    StringConcatenation _builder = new StringConcatenation();
    String _abstractName = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName);
    _builder.append("::Parameters* arg_parameters,");
    _builder.newLineIfNotEmpty();
    {
      EList<TaskOutputDefinition> _outputs = this.taskDefinition.getOutputs();
      for(final TaskOutputDefinition output : _outputs) {
        _builder.append("\t");
        String _abstractChannelClassName = this.gcp.getAbstractChannelClassName();
        _builder.append(_abstractChannelClassName, "\t");
        _builder.append("<");
        String _name = output.getDataType().getName();
        _builder.append(_name, "\t");
        _builder.append(">* arg_ch");
        String _className = this.getClassName(output.getName());
        _builder.append(_className, "\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence getConstrutorArgs_superClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("arg_parameters,");
    {
      EList<TaskOutputDefinition> _outputs = this.taskDefinition.getOutputs();
      for(final TaskOutputDefinition output : _outputs) {
        _builder.append("arg_ch");
        String _className = this.getClassName(output.getName());
        _builder.append(_className);
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public String compileAbstractHeader() {
    StringConcatenation _builder = new StringConcatenation();
    String _generationAbstractHeaderDescription = this.getGenerationAbstractHeaderDescription("CppTaskDefinitionTemplate.xtend");
    _builder.append(_generationAbstractHeaderDescription);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.getAbstractName(this.taskDefinition.getName()));
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.getAbstractName(this.taskDefinition.getName()));
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include <stdlib.h>");
    _builder.newLine();
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.append("#include <mutex>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include \"task.h\"");
    _builder.newLine();
    _builder.append("#include \"taskInput.h\"");
    _builder.newLine();
    _builder.append("#include \"");
    String _abstractChannelClassName = this.gcp.getAbstractChannelClassName();
    _builder.append(_abstractChannelClassName);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _includes = this.getIncludes();
    _builder.append(_includes);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("using namespace DataTypes; ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    String _abstractName = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName, "\t");
    {
      boolean _isTask = this.isTask();
      if (_isTask) {
        _builder.append(": public Tasking::Task");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    int key = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<TaskInputDefinition> _inputs = this.taskDefinition.getInputs();
      for(final TaskInputDefinition input : _inputs) {
        _builder.append("\t");
        _builder.append("static const int ");
        String _inputKeyName = this.getInputKeyName(input.getName());
        _builder.append(_inputKeyName, "\t");
        _builder.append(" = ");
        int _plusPlus = key++;
        _builder.append(_plusPlus, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.taskDefinition.getInputs());
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("class Inputs{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("public:");
        _builder.newLine();
        {
          Iterable<TaskInputDefinition> _taskInputsWithDataType = this.getTaskInputsWithDataType(this.taskDefinition);
          for(final TaskInputDefinition input_1 : _taskInputsWithDataType) {
            _builder.append("\t");
            _builder.append("\t\t");
            String _name = input_1.getDataType().getName();
            _builder.append(_name, "\t\t\t");
            _builder.append(" *");
            String _name_1 = input_1.getName();
            _builder.append(_name_1, "\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("Inputs() {}; ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("};");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class Outputs{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("unsigned int errorCode; ");
    _builder.newLine();
    {
      EList<TaskOutputDefinition> _outputs = this.taskDefinition.getOutputs();
      for(final TaskOutputDefinition output : _outputs) {
        _builder.append("\t\t\t");
        String _className = this.getClassName(output.getDataType().getName());
        _builder.append(_className, "\t\t\t");
        _builder.append(" *");
        String _objectName = this.getObjectName(output.getName());
        _builder.append(_objectName, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("Outputs():errorCode(0){}; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class Parameters{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public:");
    _builder.newLine();
    {
      boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(this.taskingEnvironment.getGlobalParameters());
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        _builder.append("\t\t\t");
        _builder.append("//Global parameters...");
        _builder.newLine();
        _builder.append("\t\t\t");
        CharSequence _attributesDeclaration = this.getAttributesDeclaration(this.taskingEnvironment.getGlobalParameters(), false);
        _builder.append(_attributesDeclaration, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    {
      boolean _isNullOrEmpty_2 = IterableExtensions.isNullOrEmpty(this.taskDefinition.getParameters());
      boolean _not_2 = (!_isNullOrEmpty_2);
      if (_not_2) {
        _builder.append("//Local parameters...");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t");
        CharSequence _attributesDeclaration_1 = this.getAttributesDeclaration(this.taskDefinition.getParameters(), false);
        _builder.append(_attributesDeclaration_1, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("Parameters() {}; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    String _abstractName_1 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_1, "\t");
    _builder.append("(");
    CharSequence _removeLastChar = this.removeLastChar(this.getConstructorArgs());
    _builder.append(_removeLastChar, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual ~");
    String _abstractName_2 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_2, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("void initialize();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual void init(Parameters *parameters) = 0; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual void execute(void) = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("virtual void terminate(void) = 0;");
    _builder.newLine();
    {
      boolean _isTask_1 = this.isTask();
      if (_isTask_1) {
        _builder.append("\t   ");
        _builder.append("virtual void output(const Inputs &inputs, Outputs &outputs) = 0;");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("virtual void update(const Inputs &inputs) = 0;");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected:");
    _builder.newLine();
    {
      boolean _isNullOrEmpty_3 = IterableExtensions.isNullOrEmpty(this.getTaskInputsWithDataType(this.taskDefinition));
      boolean _not_3 = (!_isNullOrEmpty_3);
      if (_not_3) {
        _builder.append("\t\t");
        _builder.append("//Input channels..");
        _builder.newLine();
        {
          Iterable<TaskInputDefinition> _taskInputsWithDataType_1 = this.getTaskInputsWithDataType(this.taskDefinition);
          for(final TaskInputDefinition input_2 : _taskInputsWithDataType_1) {
            _builder.append("\t\t");
            String _abstractChannelClassName_1 = this.gcp.getAbstractChannelClassName();
            _builder.append(_abstractChannelClassName_1, "\t\t");
            _builder.append("<");
            String _name_2 = input_2.getDataType().getName();
            _builder.append(_name_2, "\t\t");
            _builder.append(">* input_ch");
            String _className_1 = this.getClassName(input_2.getName());
            _builder.append(_className_1, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _isNullOrEmpty_4 = IterableExtensions.isNullOrEmpty(this.taskDefinition.getOutputs());
      boolean _not_4 = (!_isNullOrEmpty_4);
      if (_not_4) {
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("//Ouput channels..");
        _builder.newLine();
        {
          EList<TaskOutputDefinition> _outputs_1 = this.taskDefinition.getOutputs();
          for(final TaskOutputDefinition output_1 : _outputs_1) {
            _builder.append("\t\t");
            String _abstractChannelClassName_2 = this.gcp.getAbstractChannelClassName();
            _builder.append(_abstractChannelClassName_2, "\t\t");
            _builder.append("<");
            String _name_3 = output_1.getDataType().getName();
            _builder.append(_name_3, "\t\t");
            _builder.append(">* output_ch");
            String _className_2 = this.getClassName(output_1.getName());
            _builder.append(_className_2, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Parameters* parameters;");
    _builder.newLine();
    {
      boolean _isNullOrEmpty_5 = IterableExtensions.isNullOrEmpty(this.getTaskInputsWithDataType(this.taskDefinition));
      boolean _not_5 = (!_isNullOrEmpty_5);
      if (_not_5) {
        _builder.append("\t\t");
        _builder.append("Inputs inputs;");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("Outputs outputs;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("std::mutex mutex_");
    String _abstractName_3 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_3, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("} // namespace ATON");
    _builder.newLine();
    _builder.append("#endif /* ");
    String _constantsName_2 = this.getConstantsName(this.getAbstractName(this.taskDefinition.getName()));
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileAbstractSource() {
    StringConcatenation _builder = new StringConcatenation();
    String _generationAbstractHeaderDescription = this.getGenerationAbstractHeaderDescription("CppTaskDefinitionTemplate.xtend");
    _builder.append(_generationAbstractHeaderDescription);
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("#include \"");
    String _abstractName = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append("::");
    String _abstractName_1 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_1);
    _builder.append("::");
    String _abstractName_2 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_2);
    _builder.append("(");
    CharSequence _removeLastChar = this.removeLastChar(this.getConstructorArgs());
    _builder.append(_removeLastChar);
    _builder.append(") :");
    _builder.newLineIfNotEmpty();
    {
      boolean _isTask = this.isTask();
      if (_isTask) {
        _builder.append("\t");
        _builder.append("Task(100, ");
        int _size = this.taskDefinition.getInputs().size();
        _builder.append(_size, "\t");
        _builder.append("),");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.getTaskInputsWithDataType(this.taskDefinition));
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("//Input channels..");
        _builder.newLine();
        {
          Iterable<TaskInputDefinition> _taskInputsWithDataType = this.getTaskInputsWithDataType(this.taskDefinition);
          for(final TaskInputDefinition input : _taskInputsWithDataType) {
            _builder.append("\t");
            _builder.append("input_ch");
            String _className = this.getClassName(input.getName());
            _builder.append(_className, "\t");
            _builder.append("(NULL),");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(this.taskDefinition.getOutputs());
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        _builder.append("\t");
        _builder.append("//Ouput channels..");
        _builder.newLine();
        {
          EList<TaskOutputDefinition> _outputs = this.taskDefinition.getOutputs();
          for(final TaskOutputDefinition output : _outputs) {
            _builder.append("\t");
            _builder.append("output_ch");
            String _className_1 = this.getClassName(output.getName());
            _builder.append(_className_1, "\t");
            _builder.append("(arg_ch");
            String _className_2 = this.getClassName(output.getName());
            _builder.append(_className_2, "\t");
            _builder.append("),");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("//Parameters");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("parameters(arg_parameters)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1);
    _builder.append("::");
    String _abstractName_3 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_3);
    _builder.append("::~");
    String _abstractName_4 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_4);
    _builder.append("(void) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// Nothing to do");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void ");
    String _projectName_2 = this.gcp.getProjectName();
    _builder.append(_projectName_2);
    _builder.append("::");
    String _abstractName_5 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_5);
    _builder.append("::initialize() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// Initialize ");
    String _abstractName_6 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_6, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("std::cout << \"Initializing ");
    String _abstractName_7 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_7, "\t");
    _builder.append("...\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("init(parameters);");
    _builder.newLine();
    {
      boolean _isNullOrEmpty_2 = IterableExtensions.isNullOrEmpty(this.getTaskInputsWithDataType(this.taskDefinition));
      boolean _not_2 = (!_isNullOrEmpty_2);
      if (_not_2) {
        _builder.append("\t");
        _builder.append("// Get input channels");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if(m_inputs > 0) {");
        _builder.newLine();
        {
          Iterable<TaskInputDefinition> _taskInputsWithDataType_1 = this.getTaskInputsWithDataType(this.taskDefinition);
          for(final TaskInputDefinition input_1 : _taskInputsWithDataType_1) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("if(m_inputList[");
            String _inputKeyName = this.getInputKeyName(input_1.getName());
            _builder.append(_inputKeyName, "\t\t");
            _builder.append("] != NULL) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("input_ch");
            String _className_3 = this.getClassName(input_1.getName());
            _builder.append(_className_3, "\t\t\t");
            _builder.append(" = reinterpret_cast<");
            String _abstractChannelClassName = this.gcp.getAbstractChannelClassName();
            _builder.append(_abstractChannelClassName, "\t\t\t");
            _builder.append("<");
            String _name = input_1.getDataType().getName();
            _builder.append(_name, "\t\t\t");
            _builder.append(">*>(getInput(");
            String _inputKeyName_1 = this.getInputKeyName(input_1.getName());
            _builder.append(_inputKeyName_1, "\t\t\t");
            _builder.append(")->getChannel());");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("std::cout << \"done!\" << std::endl;");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    String _generationHeaderDescription = this.getGenerationHeaderDescription("CppTaskDefinitionTemplate.xtend");
    _builder.append(_generationHeaderDescription);
    _builder.newLineIfNotEmpty();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.taskDefinition.getName());
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.taskDefinition.getName());
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include \"");
    String _abstractName = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("class ");
    String _name = this.taskDefinition.getName();
    _builder.append(_name);
    _builder.append(": public ");
    String _abstractName_1 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    String _name_1 = this.taskDefinition.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("(");
    CharSequence _removeLastChar = this.removeLastChar(this.getConstructorArgs());
    _builder.append(_removeLastChar, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t  \t");
    _builder.append("virtual ~");
    String _name_2 = this.taskDefinition.getName();
    _builder.append(_name_2, "\t\t  \t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void init(Parameters *parameters); ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void execute(void);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void terminate(void);");
    _builder.newLine();
    {
      boolean _isTask = this.isTask();
      if (_isTask) {
        _builder.append("\t\t");
        _builder.append("void output(const Inputs &inputs, Outputs &outputs);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("void update(const Inputs &inputs);");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// declare private fields here!");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("} // namespace ");
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1);
    _builder.newLineIfNotEmpty();
    _builder.append("#endif /* ");
    String _constantsName_2 = this.getConstantsName(this.taskDefinition.getName());
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _generationHeaderDescription = this.getGenerationHeaderDescription("CppTaskDefinitionTemplate.xtend");
    _builder.append(_generationHeaderDescription, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"");
    String _name = this.taskDefinition.getName();
    _builder.append(_name, "\t");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName, "\t");
    _builder.append("::");
    String _name_1 = this.taskDefinition.getName();
    _builder.append(_name_1, "\t");
    _builder.append("::");
    String _name_2 = this.taskDefinition.getName();
    _builder.append(_name_2, "\t");
    _builder.append("(");
    CharSequence _removeLastChar = this.removeLastChar(this.getConstructorArgs());
    _builder.append(_removeLastChar, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(": ");
    String _abstractName = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName, "\t\t");
    _builder.append("(");
    CharSequence _removeLastChar_1 = this.removeLastChar(this.getConstrutorArgs_superClass());
    _builder.append(_removeLastChar_1, "\t\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1, "\t");
    _builder.append("::");
    String _name_3 = this.taskDefinition.getName();
    _builder.append(_name_3, "\t");
    _builder.append("::~");
    String _name_4 = this.taskDefinition.getName();
    _builder.append(_name_4, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _projectName_2 = this.gcp.getProjectName();
    _builder.append(_projectName_2, "\t");
    _builder.append("::");
    String _name_5 = this.taskDefinition.getName();
    _builder.append(_name_5, "\t");
    _builder.append("::init(Parameters *parameters) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this->parameters = parameters;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _projectName_3 = this.gcp.getProjectName();
    _builder.append(_projectName_3, "\t");
    _builder.append("::");
    String _name_6 = this.taskDefinition.getName();
    _builder.append(_name_6, "\t");
    _builder.append("::execute(void) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("std::lock_guard<std::mutex> lock(mutex_");
    String _abstractName_1 = this.getAbstractName(this.taskDefinition.getName());
    _builder.append(_abstractName_1, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//execute module...");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _projectName_4 = this.gcp.getProjectName();
    _builder.append(_projectName_4, "\t");
    _builder.append("::");
    String _name_7 = this.taskDefinition.getName();
    _builder.append(_name_7, "\t");
    _builder.append("::terminate(void) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _isTask = this.isTask();
      if (_isTask) {
        _builder.append("\t");
        _builder.append("void ");
        String _projectName_5 = this.gcp.getProjectName();
        _builder.append(_projectName_5, "\t");
        _builder.append("::");
        String _name_8 = this.taskDefinition.getName();
        _builder.append(_name_8, "\t");
        _builder.append("::output(const Inputs &inputs, Outputs &outputs) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("void ");
        String _projectName_6 = this.gcp.getProjectName();
        _builder.append(_projectName_6, "\t");
        _builder.append("::");
        String _name_9 = this.taskDefinition.getName();
        _builder.append(_name_9, "\t");
        _builder.append("::update(const Inputs &inputs) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
