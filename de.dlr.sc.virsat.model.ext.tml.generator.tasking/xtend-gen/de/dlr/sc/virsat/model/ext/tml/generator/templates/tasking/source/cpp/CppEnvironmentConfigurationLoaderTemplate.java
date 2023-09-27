/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp;

import com.google.common.base.Objects;
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author nepa_ay
 */
@SuppressWarnings("all")
public class CppEnvironmentConfigurationLoaderTemplate extends AbstractTaskingTemplate {
  protected TaskingEnvironment taskingEnvironment;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.getInstance();
  
  public CppEnvironmentConfigurationLoaderTemplate(final TaskingEnvironment taskingEnvironment) {
    this.taskingEnvironment = taskingEnvironment;
    boolean _isInitilaized = this.taskingEnvironmentHelper.isInitilaized();
    boolean _not = (!_isInitilaized);
    if (_not) {
      this.taskingEnvironmentHelper.init(taskingEnvironment);
    }
  }
  
  private String getClassName() {
    return this.gcp.getConfigurationLoaderClassName();
  }
  
  public String getNewPrefix(final String prefix, final String ownerName) {
    String ret = prefix;
    boolean _equals = prefix.equals("");
    boolean _not = (!_equals);
    if (_not) {
      String _ret = ret;
      ret = (_ret + ".");
    }
    return (ret + ownerName);
  }
  
  public CharSequence readAttribute(final Attribute att, final String paramName, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isArray = this.isArray(att);
      if (_isArray) {
        {
          boolean _is2DArray = this.is2DArray(att);
          if (_is2DArray) {
            CharSequence _read2DAttribute = this.read2DAttribute(att, paramName, prefix);
            _builder.append(_read2DAttribute);
            _builder.newLineIfNotEmpty();
          } else {
            CharSequence _read1DAttribute = this.read1DAttribute(att, paramName, prefix);
            _builder.append(_read1DAttribute);
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        CharSequence _readScalarAttribute = this.readScalarAttribute(att, paramName, prefix);
        _builder.append(_readScalarAttribute);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private String getTypeCastPrefix(final Attribute att) {
    IType _typeOf = att.getTypeOf();
    if ((_typeOf instanceof Enumeration)) {
      return "*((int*)&";
    } else {
      String _name = att.getTypeOf().getName();
      boolean _matched = false;
      if (Objects.equal(_name, this.T_STRING_CHAR)) {
        _matched=true;
        return "((const char*&)";
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_UCHAR)) {
          _matched=true;
          return "*((int*)&";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_INT8_T)) {
          _matched=true;
          return "*((int*)&";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_INT16_T)) {
          _matched=true;
          return "*((int*)&";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_LONG)) {
          _matched=true;
          return "*((long long*)&";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_INT64_T)) {
          _matched=true;
          return "*((long long int*)&";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_UINT8_T)) {
          _matched=true;
          return "*((unsigned int*)&";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_UINT16_T)) {
          _matched=true;
          return "*((unsigned int*)&";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_ULONG)) {
          _matched=true;
          return "*((long long unsigned int*)&";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, this.T_STRING_UINT64_T)) {
          _matched=true;
          return "*((long long unsigned int*)&";
        }
      }
      return "";
    }
  }
  
  private String getTypeCastPostfix(final Attribute att) {
    String ret = "";
    if ((((((((((((att.getTypeOf() instanceof Enumeration) || att.getTypeOf().getName().equals(this.T_STRING_CHAR)) || att.getTypeOf().getName().equals(this.T_STRING_UCHAR)) || att.getTypeOf().getName().equals(this.T_STRING_INT8_T)) || att.getTypeOf().getName().equals(this.T_STRING_INT16_T)) || att.getTypeOf().getName().equals(this.T_STRING_LONG)) || att.getTypeOf().getName().equals(this.T_STRING_INT64_T)) || att.getTypeOf().getName().equals(this.T_STRING_UINT8_T)) || att.getTypeOf().getName().equals(this.T_STRING_UINT16_T)) || att.getTypeOf().getName().equals(this.T_STRING_ULONG)) || att.getTypeOf().getName().equals(this.T_STRING_UINT64_T))) {
      String _ret = ret;
      ret = (_ret + ")");
    }
    return ret;
  }
  
  public CharSequence readScalarAttribute(final Attribute att, final String paramName, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((att.getTypeOf() instanceof BasicTypeDefinition) || (att.getTypeOf() instanceof Enumeration))) {
        _builder.append("if (!root");
        String _className = this.getClassName(paramName);
        _builder.append(_className);
        _builder.append(".lookupValue(\"");
        String _name = att.getName();
        _builder.append(_name);
        _builder.append("\", ");
        String _typeCastPrefix = this.getTypeCastPrefix(att);
        _builder.append(_typeCastPrefix);
        _builder.append(prefix);
        {
          boolean _equals = prefix.equals("");
          boolean _not = (!_equals);
          if (_not) {
            _builder.append(".");
          }
        }
        String _objectName = this.getObjectName(paramName);
        _builder.append(_objectName);
        _builder.append(".");
        String _name_1 = att.getName();
        _builder.append(_name_1);
        String _typeCastPostfix = this.getTypeCastPostfix(att);
        _builder.append(_typeCastPostfix);
        _builder.append(")) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("cerr << \"One Parameter not found: ");
        String _name_2 = att.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" for ");
        _builder.append(paramName, "\t");
        _builder.append("\" << endl;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return PARAMETERS_NOT_COMPLETE;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("const Setting &root");
        String _className_1 = this.getClassName(att.getName());
        _builder.append(_className_1);
        _builder.append(" = rootParameters[\"");
        String _name_3 = att.getName();
        _builder.append(_name_3);
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
        {
          final Function1<Attribute, Boolean> _function = (Attribute a) -> {
            boolean _isIsConst = a.isIsConst();
            return Boolean.valueOf((!_isIsConst));
          };
          Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(this.getNestedAttributes(att), _function);
          for(final Attribute nestedAtt : _filter) {
            CharSequence _readAttribute = this.readAttribute(nestedAtt, att.getName(), this.getNewPrefix(prefix, paramName));
            _builder.append(_readAttribute);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence read1DAttribute(final Attribute att, final String paramName, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("const Setting &array_");
    String _name = att.getName();
    _builder.append(_name);
    _builder.append(" = rootParameters[\"");
    String _name_1 = att.getName();
    _builder.append(_name_1);
    _builder.append("\"];");
    _builder.newLineIfNotEmpty();
    _builder.append("if(!array_");
    String _name_2 = att.getName();
    _builder.append(_name_2);
    _builder.append(".isArray()){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("cerr << \"One Parameter not found: ");
    String _name_3 = att.getName();
    _builder.append(_name_3, "\t");
    _builder.append(" for ");
    _builder.append(paramName, "\t");
    _builder.append("\" << endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return PARAMETERS_NOT_COMPLETE;");
    _builder.newLine();
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(int i=0; i<array_");
    String _name_4 = att.getName();
    _builder.append(_name_4, "\t");
    _builder.append(".getLength(); i++){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(prefix, "\t\t");
    {
      boolean _equals = prefix.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append(".");
      }
    }
    _builder.append(paramName, "\t\t");
    _builder.append(".");
    String _name_5 = att.getName();
    _builder.append(_name_5, "\t\t");
    _builder.append("[i] = static_cast<");
    String _cppDataTypeName = this.getCppDataTypeName(att);
    _builder.append(_cppDataTypeName, "\t\t");
    _builder.append(">(array_");
    String _name_6 = att.getName();
    _builder.append(_name_6, "\t\t");
    _builder.append("[i]);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence read2DAttribute(final Attribute att, final String paramName, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("const Setting &matrix_");
    String _name = att.getName();
    _builder.append(_name);
    _builder.append(" = rootParameters[\"");
    String _name_1 = att.getName();
    _builder.append(_name_1);
    _builder.append("\"];");
    _builder.newLineIfNotEmpty();
    _builder.append("if(!matrix_");
    String _name_2 = att.getName();
    _builder.append(_name_2);
    _builder.append(".isList()){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("cerr << \"One Parameter not found: ");
    String _name_3 = att.getName();
    _builder.append(_name_3, "\t");
    _builder.append(" for ");
    _builder.append(paramName, "\t");
    _builder.append("\" << endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return PARAMETERS_NOT_COMPLETE;");
    _builder.newLine();
    _builder.append("}else{");
    _builder.newLine();
    {
      int _size = att.getDimensions().get(0).getSize();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        _builder.append("\t");
        _builder.append("const Setting &array_");
        String _name_4 = att.getName();
        _builder.append(_name_4, "\t");
        _builder.append(i, "\t");
        _builder.append(" = matrix_");
        String _name_5 = att.getName();
        _builder.append(_name_5, "\t");
        _builder.append("[");
        _builder.append(i, "\t");
        _builder.append("];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("for(int i=0; i<");
        int _size_1 = att.getDimensions().get(1).getSize();
        _builder.append(_size_1, "\t");
        _builder.append("; i++){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(prefix, "\t\t");
        {
          boolean _equals = prefix.equals("");
          boolean _not = (!_equals);
          if (_not) {
            _builder.append(".");
          }
        }
        _builder.append(paramName, "\t\t");
        _builder.append(".");
        String _name_6 = att.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append("[");
        _builder.append(i, "\t\t");
        _builder.append("][i] = static_cast<");
        String _cppDataTypeName = this.getCppDataTypeName(att);
        _builder.append(_cppDataTypeName, "\t\t");
        _builder.append(">(array_");
        String _name_7 = att.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append(i, "\t\t");
        _builder.append("[i]);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printGetParametersMethod(final TaskDefinition taskDefinition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append("::");
    String _className = this.getClassName();
    _builder.append(_className);
    _builder.append("::getParameters(");
    String _abstractName = this.getAbstractName(taskDefinition.getName());
    _builder.append(_abstractName);
    _builder.append("::Parameters &parameters, const char * instanceName){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("const Setting &rootParameters = cfg.getRoot()[instanceName];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (rootParameters.getLength() != ");
    int _length = ((Object[])Conversions.unwrapArray(taskDefinition.getParameters(), Object.class)).length;
    _builder.append(_length, "\t\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("cerr << \"Wrong number of Parameters for ");
    String _name = taskDefinition.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("!\" << endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return PARAMETERS_NOT_COMPLETE;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Parsing Class Parameters");
    _builder.newLine();
    {
      final Function1<Attribute, Boolean> _function = (Attribute a) -> {
        boolean _isIsConst = a.isIsConst();
        return Boolean.valueOf((!_isIsConst));
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(taskDefinition.getParameters(), _function);
      for(final Attribute att : _filter) {
        _builder.append("\t\t");
        CharSequence _readAttribute = this.readAttribute(att, "parameters", "");
        _builder.append(_readAttribute, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return SUCCESS;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("catch (const SettingNotFoundException &nfex) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cerr << \"");
    String _name_1 = taskDefinition.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append(" Parameters not found in configuration file.\" << endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return PARAMETERS_NOT_COMPLETE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("const Setting &rootParameters = cfg.getRoot()[\"");
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1, "\t\t");
    _builder.append("\"];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (rootParameters.getLength() != ");
    int _length_1 = ((Object[])Conversions.unwrapArray(this.taskingEnvironment.getGlobalParameters(), Object.class)).length;
    _builder.append(_length_1, "\t\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("cerr << \"Wrong number of Parameters for ");
    String _projectName_2 = this.gcp.getProjectName();
    _builder.append(_projectName_2, "\t\t\t");
    _builder.append("!\" << endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return PARAMETERS_NOT_COMPLETE;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Parsing Class Parameters");
    _builder.newLine();
    {
      final Function1<Attribute, Boolean> _function_1 = (Attribute a) -> {
        boolean _isIsConst = a.isIsConst();
        return Boolean.valueOf((!_isIsConst));
      };
      Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(this.taskingEnvironment.getGlobalParameters(), _function_1);
      for(final Attribute att_1 : _filter_1) {
        _builder.append("\t\t");
        CharSequence _readAttribute_1 = this.readAttribute(att_1, "parameters", "");
        _builder.append(_readAttribute_1, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return SUCCESS;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("catch (const SettingNotFoundException &nfex) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cerr << \"");
    String _projectName_3 = this.gcp.getProjectName();
    _builder.append(_projectName_3, "\t\t");
    _builder.append(" Parameters not found in configuration file.\" << endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return PARAMETERS_NOT_COMPLETE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public String compileAbstractHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.getClassName());
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.getClassName());
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generationAbstractHeaderDescription = this.getGenerationAbstractHeaderDescription("CppEnvironmentConfigurationLoaderTemplate.xtend");
    _builder.append(_generationAbstractHeaderDescription);
    _builder.newLineIfNotEmpty();
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
        _builder.append("#include \"");
        String _abstractName = this.getAbstractName(taskDefinition.getName());
        _builder.append(_abstractName);
        _builder.append(".h\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    String _className = this.getClassName();
    _builder.append(_className, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("libconfig::Config cfg;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _className_1 = this.getClassName();
    _builder.append(_className_1, "\t\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("~");
    String _className_2 = this.getClassName();
    _builder.append(_className_2, "\t\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("int loadFile(const char * file);");
    _builder.newLine();
    {
      Set<TaskDefinition> _taskDefinitions_1 = this.taskingEnvironmentHelper.getTaskDefinitions();
      for(final TaskDefinition taskDefinition_1 : _taskDefinitions_1) {
        _builder.append("\t\t\t");
        _builder.append("int getParameters(");
        String _abstractName_1 = this.getAbstractName(taskDefinition_1.getName());
        _builder.append(_abstractName_1, "\t\t\t");
        _builder.append("::Parameters &parameters, const char * instanceName);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("enum Status {SUCCESS = 0, FILE_NOT_FOUND = 1, INVALID_FILE = 2, PARAMETERS_NOT_COMPLETE = 3};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /* ");
    String _constantsName_2 = this.getConstantsName(this.getClassName());
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileAbstractSource() {
    StringConcatenation _builder = new StringConcatenation();
    String _generationAbstractSourceDescription = this.getGenerationAbstractSourceDescription("CppEnvironmentConfigurationLoaderTemplate.xtend");
    _builder.append(_generationAbstractSourceDescription);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include \"");
    String _className = this.getClassName();
    _builder.append(_className);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.append("#include <sstream>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.append("using namespace libconfig;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append("::");
    String _className_1 = this.getClassName();
    _builder.append(_className_1);
    _builder.append("::");
    String _className_2 = this.getClassName();
    _builder.append(_className_2);
    _builder.append("(): cfg() {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1);
    _builder.append("::");
    String _className_3 = this.getClassName();
    _builder.append(_className_3);
    _builder.append("::~");
    String _className_4 = this.getClassName();
    _builder.append(_className_4);
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("int ");
    String _projectName_2 = this.gcp.getProjectName();
    _builder.append(_projectName_2);
    _builder.append("::");
    String _className_5 = this.getClassName();
    _builder.append(_className_5);
    _builder.append("::loadFile(const char * file) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cfg.readFile(file);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} catch (const FileIOException &fioex) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("std::cerr << \"I/O error while opening file.\" << std::endl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return FILE_NOT_FOUND;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} catch (const ParseException &pex) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("std::cerr << \"Parse error at \" << pex.getFile() << \":\" << pex.getLine() << \" - \" << pex.getError() << std::endl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return INVALID_FILE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return SUCCESS;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      Set<TaskDefinition> _taskDefinitions = this.taskingEnvironmentHelper.getTaskDefinitions();
      for(final TaskDefinition taskDefinition : _taskDefinitions) {
        CharSequence _printGetParametersMethod = this.printGetParametersMethod(taskDefinition);
        _builder.append(_printGetParametersMethod);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String compileHeader() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public String compileSource() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
