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

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType;
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author nepa_ay
 */
@SuppressWarnings("all")
public class CppChannelBehaviorTemplate extends AbstractTaskingTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected ChannelBehaviorDefinition channelBehaviorDefinition;
  
  public CppChannelBehaviorTemplate(final ChannelBehaviorDefinition channelBehaviorDefinition) {
    this.channelBehaviorDefinition = channelBehaviorDefinition;
  }
  
  private CharSequence printCallToUnImplementedMethod(final String className, final String returnType, final String methodName, final String params) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("std::cerr << \"Call to unimplemented method. ");
    String _channelTemplateHead = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead);
    _builder.append(" ");
    _builder.append(returnType);
    _builder.append(" ");
    _builder.append(className);
    _builder.append("::");
    _builder.append(methodName);
    _builder.append("(");
    _builder.append(params);
    _builder.append(")\" << std::endl;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence printAutoGeneratedMethodStub(final String className, final String returnType, final String methodName, final String params) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("std::cerr << \"Auto-generated method stub.");
    String _channelTemplateHead = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead);
    _builder.append(" ");
    _builder.append(returnType);
    _builder.append(" ");
    _builder.append(className);
    _builder.append("::");
    _builder.append(methodName);
    _builder.append("(");
    _builder.append(params);
    _builder.append(")\" << std::endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("///TODO: Write your code for ");
    _builder.append(className);
    _builder.append(" here...");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private String getChannelTemplateHead() {
    String ret = "";
    boolean _channelHasSize = this.channelHasSize(this.channelBehaviorDefinition);
    if (_channelHasSize) {
      String _ret = ret;
      ret = (_ret + "template <typename T, unsigned int SIZE>");
    } else {
      String _ret_1 = ret;
      ret = (_ret_1 + "template <typename T>");
    }
    return ret;
  }
  
  private String getChannelTemplateClassName(final String channelName) {
    String ret = "";
    boolean _channelHasSize = this.channelHasSize(this.channelBehaviorDefinition);
    if (_channelHasSize) {
      String _ret = ret;
      ret = (_ret + (channelName + "<T, SIZE>"));
    } else {
      String _ret_1 = ret;
      ret = (_ret_1 + (channelName + "<T>"));
    }
    return ret;
  }
  
  private String printParameter(final BehavioralParameterDefinition behavioralParameterDefinition, final boolean printType, final boolean init, final String name_prefix) {
    EnumValueType _valueType = behavioralParameterDefinition.getValueType();
    boolean _tripleEquals = (_valueType == EnumValueType.INTEGER);
    if (_tripleEquals) {
      StringConcatenation _builder = new StringConcatenation();
      {
        if (printType) {
          _builder.append("int ");
        }
      }
      _builder.append(name_prefix);
      String _name = behavioralParameterDefinition.getName();
      _builder.append(_name);
      {
        if (init) {
          _builder.append(" = ");
          Object _channelParameterValue = this.getChannelParameterValue(behavioralParameterDefinition);
          _builder.append(_channelParameterValue);
        }
      }
      return _builder.toString();
    } else {
      EnumValueType _valueType_1 = behavioralParameterDefinition.getValueType();
      boolean _tripleEquals_1 = (_valueType_1 == EnumValueType.FLOAT);
      if (_tripleEquals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        {
          if (printType) {
            _builder_1.append("float ");
          }
        }
        _builder_1.append(name_prefix);
        String _name_1 = behavioralParameterDefinition.getName();
        _builder_1.append(_name_1);
        {
          if (init) {
            _builder_1.append(" = ");
            Object _channelParameterValue_1 = this.getChannelParameterValue(behavioralParameterDefinition);
            _builder_1.append(_channelParameterValue_1);
          }
        }
        return _builder_1.toString();
      } else {
        EnumValueType _valueType_2 = behavioralParameterDefinition.getValueType();
        boolean _tripleEquals_2 = (_valueType_2 == EnumValueType.STRING);
        if (_tripleEquals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          {
            if (printType) {
              _builder_2.append("const char * ");
            }
          }
          _builder_2.append(name_prefix);
          String _name_2 = behavioralParameterDefinition.getName();
          _builder_2.append(_name_2);
          {
            if (init) {
              _builder_2.append(" = ");
              Object _channelParameterValue_2 = this.getChannelParameterValue(behavioralParameterDefinition);
              _builder_2.append(_channelParameterValue_2);
            }
          }
          return _builder_2.toString();
        }
      }
    }
    return null;
  }
  
  private CharSequence printConstructorParameters(final boolean printType) {
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
        String _printParameter = this.printParameter(param, printType, false, "arg_");
        _builder.append(_printParameter);
      }
    }
    return _builder;
  }
  
  private boolean provideVirtualImpl() {
    EnumStorageType _storageType = this.channelBehaviorDefinition.getStorageType();
    boolean _tripleEquals = (_storageType == EnumStorageType.FIFO);
    if (_tripleEquals) {
      return true;
    } else {
      return false;
    }
  }
  
  private CharSequence declareChannelMethods(final boolean hasVirtualImpl, final String channelName) {
    StringConcatenation _builder = new StringConcatenation();
    String _channelTemplateHead = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead);
    _builder.newLineIfNotEmpty();
    _builder.append("T* ");
    String _channelTemplateClassName = this.getChannelTemplateClassName(channelName);
    _builder.append(_channelTemplateClassName);
    _builder.append("::allocate(void) {");
    _builder.newLineIfNotEmpty();
    {
      if (hasVirtualImpl) {
        {
          EnumStorageType _storageType = this.channelBehaviorDefinition.getStorageType();
          boolean _tripleEquals = (_storageType == EnumStorageType.FIFO);
          if (_tripleEquals) {
            _builder.append("\t");
            CharSequence _printCallToUnImplementedMethod = this.printCallToUnImplementedMethod(this.getChannelTemplateClassName(channelName), "T*", "allocate", "void");
            _builder.append(_printCallToUnImplementedMethod, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return NULL;");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("//Implement memory allocation for ");
            EnumStorageType _storageType_1 = this.channelBehaviorDefinition.getStorageType();
            _builder.append(_storageType_1, "\t");
            _builder.append(" in concrete class...");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return NULL;");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("\t");
        CharSequence _printAutoGeneratedMethodStub = this.printAutoGeneratedMethodStub(this.getChannelTemplateClassName(channelName), "T*", "allocate", "void");
        _builder.append(_printAutoGeneratedMethodStub, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return NULL;");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _channelTemplateHead_1 = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead_1);
    _builder.newLineIfNotEmpty();
    _builder.append("bool ");
    String _channelTemplateClassName_1 = this.getChannelTemplateClassName(channelName);
    _builder.append(_channelTemplateClassName_1);
    _builder.append("::push(T* data) {");
    _builder.newLineIfNotEmpty();
    {
      if (hasVirtualImpl) {
        {
          EnumStorageType _storageType_2 = this.channelBehaviorDefinition.getStorageType();
          boolean _tripleEquals_1 = (_storageType_2 == EnumStorageType.FIFO);
          if (_tripleEquals_1) {
            _builder.append("\t");
            _builder.append("bool result = m_data.enqueue(data);");
            _builder.newLine();
            _builder.append("\t");
            String _channelTemplateClassName_2 = this.getChannelTemplateClassName(channelName);
            _builder.append(_channelTemplateClassName_2, "\t");
            _builder.append("::");
            String _abstractChannelClassName = this.gcp.getAbstractChannelClassName();
            _builder.append(_abstractChannelClassName, "\t");
            _builder.append("::TaskChannel::push();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return result;");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("//Implement push method for ");
            EnumStorageType _storageType_3 = this.channelBehaviorDefinition.getStorageType();
            _builder.append(_storageType_3, "\t");
            _builder.append(" in concrete class...");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return false;");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("\t");
        CharSequence _printAutoGeneratedMethodStub_1 = this.printAutoGeneratedMethodStub(this.getChannelTemplateClassName(channelName), "T*", "allocate", "void");
        _builder.append(_printAutoGeneratedMethodStub_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _channelTemplateHead_2 = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead_2);
    _builder.newLineIfNotEmpty();
    _builder.append("bool ");
    String _channelTemplateClassName_3 = this.getChannelTemplateClassName(channelName);
    _builder.append(_channelTemplateClassName_3);
    _builder.append("::push(T& data) {");
    _builder.newLineIfNotEmpty();
    {
      if (hasVirtualImpl) {
        {
          EnumStorageType _storageType_4 = this.channelBehaviorDefinition.getStorageType();
          boolean _tripleEquals_2 = (_storageType_4 == EnumStorageType.FIFO);
          if (_tripleEquals_2) {
            _builder.append("\t");
            CharSequence _printCallToUnImplementedMethod_1 = this.printCallToUnImplementedMethod(this.getChannelTemplateClassName(channelName), "bool", "push", "T& data");
            _builder.append(_printCallToUnImplementedMethod_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return false;");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("//Implement pop for ");
            EnumStorageType _storageType_5 = this.channelBehaviorDefinition.getStorageType();
            _builder.append(_storageType_5, "\t");
            _builder.append(" in concrete class...");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return false;");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("\t");
        CharSequence _printAutoGeneratedMethodStub_2 = this.printAutoGeneratedMethodStub(this.getChannelTemplateClassName(channelName), "T*", "allocate", "void");
        _builder.append(_printAutoGeneratedMethodStub_2, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    String _channelTemplateHead_3 = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead_3);
    _builder.newLineIfNotEmpty();
    _builder.append("T* ");
    String _channelTemplateClassName_4 = this.getChannelTemplateClassName(channelName);
    _builder.append(_channelTemplateClassName_4);
    _builder.append("::pop(void) {");
    _builder.newLineIfNotEmpty();
    {
      if (hasVirtualImpl) {
        {
          EnumStorageType _storageType_6 = this.channelBehaviorDefinition.getStorageType();
          boolean _tripleEquals_3 = (_storageType_6 == EnumStorageType.FIFO);
          if (_tripleEquals_3) {
            _builder.append("\t");
            _builder.append("return m_data.dequeue();");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("//Implement pop for ");
            EnumStorageType _storageType_7 = this.channelBehaviorDefinition.getStorageType();
            _builder.append(_storageType_7, "\t");
            _builder.append(" in concrete class...");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return NULL;");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("\t");
        CharSequence _printAutoGeneratedMethodStub_3 = this.printAutoGeneratedMethodStub(this.getChannelTemplateClassName(channelName), "T*", "allocate", "void");
        _builder.append(_printAutoGeneratedMethodStub_3, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return NULL;");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _channelTemplateHead_4 = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead_4);
    _builder.newLineIfNotEmpty();
    _builder.append("bool ");
    String _channelTemplateClassName_5 = this.getChannelTemplateClassName(channelName);
    _builder.append(_channelTemplateClassName_5);
    _builder.append("::isEmpty(void) const {");
    _builder.newLineIfNotEmpty();
    {
      if (hasVirtualImpl) {
        {
          EnumStorageType _storageType_8 = this.channelBehaviorDefinition.getStorageType();
          boolean _tripleEquals_4 = (_storageType_8 == EnumStorageType.FIFO);
          if (_tripleEquals_4) {
            _builder.append("\t");
            _builder.append("return m_data.isEmpty();");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("//Implement isEmpty for ");
            EnumStorageType _storageType_9 = this.channelBehaviorDefinition.getStorageType();
            _builder.append(_storageType_9, "\t");
            _builder.append(" in concrete class...");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return true;");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("\t");
        CharSequence _printAutoGeneratedMethodStub_4 = this.printAutoGeneratedMethodStub(this.getChannelTemplateClassName(channelName), "T*", "allocate", "void");
        _builder.append(_printAutoGeneratedMethodStub_4, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return true;");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public String compileAbstractHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    String _generationAbstractHeaderDescription = this.getGenerationAbstractHeaderDescription("CppChannelBehaviorTemplate.xtend");
    _builder.append(_generationAbstractHeaderDescription);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    final String className = this.getAbstractName(this.channelBehaviorDefinition.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(className);
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(className);
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.append("#include \"taskChannel.h\"");
    _builder.newLine();
    _builder.append("#include \"");
    String _abstractChannelClassName = this.gcp.getAbstractChannelClassName();
    _builder.append(_abstractChannelClassName);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    {
      EnumStorageType _storageType = this.channelBehaviorDefinition.getStorageType();
      boolean _tripleEquals = (_storageType == EnumStorageType.FIFO);
      if (_tripleEquals) {
        _builder.append("#include \"");
        String _queueClassName = this.gcp.getQueueClassName();
        _builder.append(_queueClassName);
        _builder.append(".h\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    String _channelTemplateHead = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("class ");
    _builder.append(className, "\t");
    _builder.append(": public ");
    String _abstractChannelClassName_1 = this.gcp.getAbstractChannelClassName();
    _builder.append(_abstractChannelClassName_1, "\t");
    _builder.append("<T> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(className, "\t\t\t");
    _builder.append("(");
    CharSequence _printConstructorParameters = this.printConstructorParameters(true);
    _builder.append(_printConstructorParameters, "\t\t\t");
    _builder.append("): ");
    String _abstractChannelClassName_2 = this.gcp.getAbstractChannelClassName();
    _builder.append(_abstractChannelClassName_2, "\t\t\t");
    _builder.append("<T>()");
    _builder.newLineIfNotEmpty();
    {
      boolean _provideVirtualImpl = this.provideVirtualImpl();
      if (_provideVirtualImpl) {
        _builder.append("\t\t\t\t");
        _builder.append(", m_data()");
        _builder.newLine();
      }
    }
    {
      EList<BehavioralParameterDefinition> _parameters = this.channelBehaviorDefinition.getParameters();
      for(final BehavioralParameterDefinition param : _parameters) {
        _builder.append("\t\t\t\t");
        _builder.append(", m_");
        String _name = param.getName();
        _builder.append(_name, "\t\t\t\t");
        _builder.append("(arg_");
        String _name_1 = param.getName();
        _builder.append(_name_1, "\t\t\t\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t  ");
    _builder.append("}");
    _builder.newLine();
    {
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.channelBehaviorDefinition.getParameters());
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\t\t\t\t  ");
        _builder.append(className, "\t\t\t\t  ");
        _builder.append("(): ");
        String _abstractChannelClassName_3 = this.gcp.getAbstractChannelClassName();
        _builder.append(_abstractChannelClassName_3, "\t\t\t\t  ");
        _builder.append("<T>()");
        _builder.newLineIfNotEmpty();
        {
          boolean _provideVirtualImpl_1 = this.provideVirtualImpl();
          if (_provideVirtualImpl_1) {
            _builder.append("\t\t\t\t  ");
            _builder.append("\t");
            _builder.append(", m_data()");
            _builder.newLine();
          }
        }
        {
          EList<BehavioralParameterDefinition> _parameters_1 = this.channelBehaviorDefinition.getParameters();
          for(final BehavioralParameterDefinition param_1 : _parameters_1) {
            _builder.append("\t\t\t\t  ");
            _builder.append("\t");
            _builder.append(", m_");
            String _name_2 = param_1.getName();
            _builder.append(_name_2, "\t\t\t\t  \t");
            _builder.append("(");
            Object _channelParameterValue = this.getChannelParameterValue(param_1);
            _builder.append(_channelParameterValue, "\t\t\t\t  \t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t\t  ");
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t\t\t  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t  ");
    _builder.newLine();
    _builder.append("\t\t\t\t  ");
    _builder.append("virtual ~");
    _builder.append(className, "\t\t\t\t  ");
    _builder.append("(){ }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t  ");
    _builder.newLine();
    {
      EnumStorageType _storageType_1 = this.channelBehaviorDefinition.getStorageType();
      boolean _tripleEquals_1 = (_storageType_1 == EnumStorageType.CUSTOM);
      if (_tripleEquals_1) {
        _builder.append("\t\t\t\t  ");
        _builder.append("//Keep methods pure virtual for ");
        EnumStorageType _storageType_2 = this.channelBehaviorDefinition.getStorageType();
        _builder.append(_storageType_2, "\t\t\t\t  ");
        _builder.append(" channels... concrete implementations in src/channel folder.");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t  ");
    _builder.append("virtual T* allocate(void)");
    {
      boolean _provideVirtualImpl_2 = this.provideVirtualImpl();
      boolean _not_1 = (!_provideVirtualImpl_2);
      if (_not_1) {
        _builder.append(" = 0");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("virtual bool push(T* data)");
    {
      boolean _provideVirtualImpl_3 = this.provideVirtualImpl();
      boolean _not_2 = (!_provideVirtualImpl_3);
      if (_not_2) {
        _builder.append(" = 0");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("virtual bool push(T& data)");
    {
      boolean _provideVirtualImpl_4 = this.provideVirtualImpl();
      boolean _not_3 = (!_provideVirtualImpl_4);
      if (_not_3) {
        _builder.append(" = 0");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("virtual T* pop(void)");
    {
      boolean _provideVirtualImpl_5 = this.provideVirtualImpl();
      boolean _not_4 = (!_provideVirtualImpl_5);
      if (_not_4) {
        _builder.append(" = 0");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("virtual bool isEmpty(void) const");
    {
      boolean _provideVirtualImpl_6 = this.provideVirtualImpl();
      boolean _not_5 = (!_provideVirtualImpl_6);
      if (_not_5) {
        _builder.append(" = 0");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("protected:");
    _builder.newLine();
    {
      EList<BehavioralParameterDefinition> _parameters_2 = this.channelBehaviorDefinition.getParameters();
      for(final BehavioralParameterDefinition param_2 : _parameters_2) {
        _builder.append("\t\t\t");
        String _printParameter = this.printParameter(param_2, true, false, "m_");
        _builder.append(_printParameter, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _provideVirtualImpl_7 = this.provideVirtualImpl();
      if (_provideVirtualImpl_7) {
        _builder.append("\t\t\t");
        String _queueClassName_1 = this.gcp.getQueueClassName();
        _builder.append(_queueClassName_1, "\t\t\t");
        _builder.append("<T, SIZE> m_data;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    {
      boolean _provideVirtualImpl_8 = this.provideVirtualImpl();
      if (_provideVirtualImpl_8) {
        _builder.append("\t");
        CharSequence _declareChannelMethods = this.declareChannelMethods(true, this.getAbstractName(this.channelBehaviorDefinition.getName()));
        _builder.append(_declareChannelMethods, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*  ");
    String _constantsName_2 = this.getConstantsName(className);
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileAbstractSource() {
    throw new UnsupportedOperationException("No Abstract Source");
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    String className = this.channelBehaviorDefinition.getName();
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generationHeaderDescription = this.getGenerationHeaderDescription("CppChannelBehaviorTemplate.xtend");
    _builder.append(_generationHeaderDescription);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(className);
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(className);
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.append("#include \"taskChannel.h\"");
    _builder.newLine();
    _builder.append("#include \"");
    String _abstractName = this.getAbstractName(className);
    _builder.append(_abstractName);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    String _channelTemplateHead = this.getChannelTemplateHead();
    _builder.append(_channelTemplateHead, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("class ");
    _builder.append(className, "\t");
    _builder.append(": public ");
    String _channelTemplateClassName = this.getChannelTemplateClassName(this.getAbstractName(className));
    _builder.append(_channelTemplateClassName, "\t");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append(className, "\t\t    ");
    _builder.append("(");
    CharSequence _printConstructorParameters = this.printConstructorParameters(true);
    _builder.append(_printConstructorParameters, "\t\t    ");
    _builder.append("): ");
    String _channelTemplateClassName_1 = this.getChannelTemplateClassName(this.getAbstractName(className));
    _builder.append(_channelTemplateClassName_1, "\t\t    ");
    _builder.append("(");
    CharSequence _printConstructorParameters_1 = this.printConstructorParameters(false);
    _builder.append(_printConstructorParameters_1, "\t\t    ");
    _builder.append(") { ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    {
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.channelBehaviorDefinition.getParameters());
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\t\t    ");
        _builder.append(className, "\t\t    ");
        _builder.append("(): ");
        String _channelTemplateClassName_2 = this.getChannelTemplateClassName(this.getAbstractName(className));
        _builder.append(_channelTemplateClassName_2, "\t\t    ");
        _builder.append("() { ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t    ");
    _builder.append("~");
    _builder.append(className, "\t\t    ");
    _builder.append("(){ }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.newLine();
    {
      boolean _provideVirtualImpl = this.provideVirtualImpl();
      if (_provideVirtualImpl) {
        _builder.append("\t\t    ");
        _builder.append("/** Uncomment following section and implement methods to override them.*/");
        _builder.newLine();
        _builder.append("\t\t    ");
        _builder.append("/*");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("T* allocate(void);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("bool push(T* data);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("bool push(T& data);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("T* pop(void);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("bool isEmpty(void) const;");
    _builder.newLine();
    _builder.append("\t\t\t   ");
    {
      boolean _provideVirtualImpl_1 = this.provideVirtualImpl();
      if (_provideVirtualImpl_1) {
        _builder.append("*/");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t   ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t\t  \t\t");
    _builder.append("//Define private variables here..");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _provideVirtualImpl_2 = this.provideVirtualImpl();
      if (_provideVirtualImpl_2) {
        _builder.append("\t");
        _builder.append("/** Uncomment following section and implement methods to override them.*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/*");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    CharSequence _declareChannelMethods = this.declareChannelMethods(false, className);
    _builder.append(_declareChannelMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _provideVirtualImpl_3 = this.provideVirtualImpl();
      if (_provideVirtualImpl_3) {
        _builder.append("*/");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*  ");
    String _constantsName_2 = this.getConstantsName(className);
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    throw new UnsupportedOperationException("No Concrete Source");
  }
}
