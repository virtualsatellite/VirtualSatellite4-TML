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

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.AbstractTaskingTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ExternalTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CppDataTypeTemplate extends AbstractTaskingTemplate {
  protected DataType datatype = null;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  public CppDataTypeTemplate(final DataType dataType) {
    this.datatype = dataType;
    this.initIncludes(this.datatype);
  }
  
  private void initIncludes(final DataType datatype) {
    EList<Attribute> _attributes = datatype.getAttributes();
    for (final Attribute att : _attributes) {
      this.includeType(att.getTypeOf(), this.gcp);
    }
    DataType _superType = datatype.getSuperType();
    boolean _tripleNotEquals = (_superType != null);
    if (_tripleNotEquals) {
      this.includeType(datatype.getSuperType(), this.gcp);
      DataType _superType_1 = datatype.getSuperType();
      if ((_superType_1 instanceof ExternalTypeImpl)) {
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(datatype.getSuperType().getAttributes());
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          EList<Attribute> _attributes_1 = datatype.getSuperType().getAttributes();
          for (final Attribute att_1 : _attributes_1) {
            this.includeType(att_1.getTypeOf(), this.gcp);
          }
        }
      }
    }
  }
  
  public CharSequence usePacketizer(final Attribute att, final String nested, final boolean write) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isIsConst = att.isIsConst();
      boolean _not = (!_isIsConst);
      if (_not) {
        {
          IType _typeOf = att.getTypeOf();
          if ((_typeOf instanceof Enumeration)) {
            _builder.append("serialBuf.");
            {
              if (write) {
                _builder.append("writeEnum");
              } else {
                _builder.append("readEnum");
              }
            }
            _builder.append("(");
            {
              if ((nested != null)) {
                _builder.append(nested);
                _builder.append(".");
              }
            }
            String _name = att.getName();
            _builder.append(_name);
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          } else {
            IType _typeOf_1 = att.getTypeOf();
            if ((_typeOf_1 instanceof BasicTypeDefinition)) {
              {
                boolean _hasAppropriateSize = this.hasAppropriateSize(att);
                if (_hasAppropriateSize) {
                  {
                    boolean _isArray = this.isArray(att);
                    boolean _not_1 = (!_isArray);
                    if (_not_1) {
                      _builder.append("serialBuf.");
                      {
                        if (write) {
                          _builder.append("write");
                        } else {
                          _builder.append("read");
                        }
                      }
                      _builder.append("(");
                      {
                        if ((nested != null)) {
                          _builder.append(nested);
                          _builder.append(".");
                        }
                      }
                      String _name_1 = att.getName();
                      _builder.append(_name_1);
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    } else {
                      boolean _is1DArray = this.is1DArray(att);
                      if (_is1DArray) {
                        _builder.append("for(int i = 0; i < ");
                        int _size = att.getDimensions().get(0).getSize();
                        _builder.append(_size);
                        _builder.append("; i++){");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("serialBuf.");
                        {
                          if (write) {
                            _builder.append("write");
                          } else {
                            _builder.append("read");
                          }
                        }
                        _builder.append("(");
                        {
                          if ((nested != null)) {
                            _builder.append(nested, "\t");
                            _builder.append(".");
                          }
                        }
                        String _name_2 = att.getName();
                        _builder.append(_name_2, "\t");
                        _builder.append("[i]);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        boolean _is2DArray = this.is2DArray(att);
                        if (_is2DArray) {
                          _builder.append("for(int i = 0; i < ");
                          int _size_1 = att.getDimensions().get(0).getSize();
                          _builder.append(_size_1);
                          _builder.append("; i++){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("for(int j = 0; j < ");
                          int _size_2 = att.getDimensions().get(1).getSize();
                          _builder.append(_size_2, "\t");
                          _builder.append("; j++){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("serialBuf.");
                          {
                            if (write) {
                              _builder.append("write");
                            } else {
                              _builder.append("read");
                            }
                          }
                          _builder.append("(");
                          {
                            if ((nested != null)) {
                              _builder.append(nested, "\t\t");
                              _builder.append(".");
                            }
                          }
                          String _name_3 = att.getName();
                          _builder.append(_name_3, "\t\t");
                          _builder.append("[i][j]);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("}");
                          _builder.newLine();
                        } else {
                          _builder.append("//do not handle more than two dimensional array...");
                          _builder.newLine();
                        }
                      }
                    }
                  }
                }
              }
            } else {
              {
                boolean _isArray_1 = this.isArray(att);
                boolean _not_2 = (!_isArray_1);
                if (_not_2) {
                  {
                    EList<Attribute> _nestedAttributes = this.getNestedAttributes(att);
                    for(final Attribute nestedAtt : _nestedAttributes) {
                      {
                        if ((nested != null)) {
                          String _name_4 = att.getName();
                          String _plus = ((nested + ".") + _name_4);
                          CharSequence _usePacketizer = this.usePacketizer(nestedAtt, _plus, write);
                          _builder.append(_usePacketizer);
                          _builder.newLineIfNotEmpty();
                        } else {
                          CharSequence _usePacketizer_1 = this.usePacketizer(nestedAtt, att.getName(), write);
                          _builder.append(_usePacketizer_1);
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public String declareUnsignedCharAsInt(final Attribute att) {
    String result = "";
    if ((this.hasAppropriateSize(att) && (!att.isIsConst()))) {
      if (((!(att.getTypeOf() instanceof BasicTypeDefinition)) && 
        (!(att.getTypeOf() instanceof Enumeration)))) {
        EList<Attribute> _nestedAttributes = this.getNestedAttributes(att);
        for (final Attribute nestedAtt : _nestedAttributes) {
          String _result = result;
          String _declareUnsignedCharAsInt = this.declareUnsignedCharAsInt(nestedAtt);
          result = (_result + _declareUnsignedCharAsInt);
        }
      } else {
        if ((att.getTypeOf().getName().equals(this.T_STRING_UCHAR) || att.getTypeOf().getName().equals(this.T_STRING_UINT8_T))) {
          boolean _isArray = this.isArray(att);
          boolean _not = (!_isArray);
          if (_not) {
            String _result_1 = result;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("int ");
            String _name = att.getName();
            _builder.append(_name);
            _builder.append(";");
            result = (_result_1 + _builder);
          } else {
            boolean _is1DArray = this.is1DArray(att);
            if (_is1DArray) {
              String _result_2 = result;
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("int ");
              String _name_1 = att.getName();
              _builder_1.append(_name_1);
              _builder_1.append("[");
              int _size = att.getDimensions().get(0).getSize();
              _builder_1.append(_size);
              _builder_1.append("];");
              result = (_result_2 + _builder_1);
            } else {
              boolean _is2DArray = this.is2DArray(att);
              if (_is2DArray) {
                String _result_3 = result;
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("int ");
                String _name_2 = att.getName();
                _builder_2.append(_name_2);
                _builder_2.append("[");
                int _size_1 = att.getDimensions().get(0).getSize();
                _builder_2.append(_size_1);
                _builder_2.append("][");
                int _size_2 = att.getDimensions().get(1).getSize();
                _builder_2.append(_size_2);
                _builder_2.append("];");
                result = (_result_3 + _builder_2);
              }
            }
          }
        }
      }
    }
    return result;
  }
  
  public String assignIntAsUnsignedChar(final Attribute att) {
    String result = "";
    if ((this.hasAppropriateSize(att) && (!att.isIsConst()))) {
      if (((!(att.getTypeOf() instanceof BasicTypeDefinition)) && (!(att.getTypeOf() instanceof Enumeration)))) {
        EList<Attribute> _nestedAttributes = this.getNestedAttributes(att);
        for (final Attribute nestedAtt : _nestedAttributes) {
          String _result = result;
          String _declareUnsignedCharAsInt = this.declareUnsignedCharAsInt(nestedAtt);
          result = (_result + _declareUnsignedCharAsInt);
        }
      } else {
        if ((att.getTypeOf().getName().equals(this.T_STRING_UCHAR) || att.getTypeOf().getName().equals(this.T_STRING_UINT8_T))) {
          boolean _isArray = this.isArray(att);
          boolean _not = (!_isArray);
          if (_not) {
            String _result_1 = result;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("this->");
            String _name = att.getName();
            _builder.append(_name);
            _builder.append(" = ");
            String _name_1 = att.getName();
            _builder.append(_name_1);
            _builder.append(";");
            result = (_result_1 + _builder);
          } else {
            boolean _is1DArray = this.is1DArray(att);
            if (_is1DArray) {
              String _result_2 = result;
              CharSequence _1DIteration = this.get1DIteration(att);
              result = (_result_2 + _1DIteration);
            } else {
              boolean _is2DArray = this.is2DArray(att);
              if (_is2DArray) {
                String _result_3 = result;
                CharSequence _2DIteration = this.get2DIteration(att);
                result = (_result_3 + _2DIteration);
              }
            }
          }
        }
      }
    }
    return result;
  }
  
  public CharSequence get1DIteration(final Attribute att) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for(int i=0; i<");
    int _size = att.getDimensions().get(0).getSize();
    _builder.append(_size);
    _builder.append("; i++){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this->");
    String _name = att.getName();
    _builder.append(_name, "\t");
    _builder.append("[i] = ");
    String _name_1 = att.getName();
    _builder.append(_name_1, "\t");
    _builder.append("[i];");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence get2DIteration(final Attribute att) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for(int i=0; i<");
    int _size = att.getDimensions().get(0).getSize();
    _builder.append(_size);
    _builder.append("; i++){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for(int j=0; j<");
    int _size_1 = att.getDimensions().get(1).getSize();
    _builder.append(_size_1, "\t");
    _builder.append("; j++){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this->");
    String _name = att.getName();
    _builder.append(_name, "\t\t");
    _builder.append("[i][j] = ");
    String _name_1 = att.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("[i][j];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String getAttributeStreamElement(final Attribute att, final boolean declaration, final String nested, final String streamOperator, final String postfix, final boolean write, final String tmpConstant) {
    String result = "";
    boolean _hasAppropriateSize = this.hasAppropriateSize(att);
    if (_hasAppropriateSize) {
      if (((!(att.getTypeOf() instanceof BasicTypeDefinition)) && 
        (!(att.getTypeOf() instanceof Enumeration)))) {
        EList<Attribute> _nestedAttributes = this.getNestedAttributes(att);
        for (final Attribute nestedAtt : _nestedAttributes) {
          if ((nested != null)) {
            String _result = result;
            String _name = att.getName();
            String _plus = ((nested + ".") + _name);
            String _attributeStreamElement = this.getAttributeStreamElement(((Attribute) nestedAtt), declaration, _plus, streamOperator, postfix, write, tmpConstant);
            result = (_result + _attributeStreamElement);
          } else {
            String _result_1 = result;
            String _attributeStreamElement_1 = this.getAttributeStreamElement(((Attribute) nestedAtt), declaration, 
              att.getName(), streamOperator, postfix, write, tmpConstant);
            result = (_result_1 + _attributeStreamElement_1);
          }
        }
      } else {
        boolean _is1DArray = this.is1DArray(att);
        if (_is1DArray) {
          int _size = att.getDimensions().get(0).getSize();
          int _minus = (_size - 1);
          IntegerRange _upTo = new IntegerRange(0, _minus);
          for (final Integer i : _upTo) {
            {
              String _result_2 = result;
              result = (_result_2 + (streamOperator + " "));
              if (declaration) {
                String _result_3 = result;
                result = (_result_3 + "\"");
              }
              if (((nested != null) && ((!att.isIsConst()) || (!write)))) {
                String _result_4 = result;
                result = (_result_4 + (nested + "."));
              }
              if ((write && att.isIsConst())) {
                String _result_5 = result;
                result = (_result_5 + tmpConstant);
              } else {
                String _result_6 = result;
                String _arrayAttributeStreamElement = this.getArrayAttributeStreamElement(att, (i).intValue(), declaration, write);
                result = (_result_6 + _arrayAttributeStreamElement);
              }
              if (declaration) {
                String _result_7 = result;
                result = (_result_7 + "\"");
              }
              String _result_8 = result;
              result = (_result_8 + postfix);
            }
          }
        } else {
          boolean _isArray = this.isArray(att);
          boolean _not = (!_isArray);
          if (_not) {
            String _result_2 = result;
            result = (_result_2 + (streamOperator + " "));
            if (declaration) {
              String _result_3 = result;
              result = (_result_3 + "\"");
            }
            if (((nested != null) && ((!att.isIsConst()) || (!write)))) {
              String _result_4 = result;
              result = (_result_4 + (nested + "."));
            }
            if ((write && att.isIsConst())) {
              String _result_5 = result;
              result = (_result_5 + tmpConstant);
            } else {
              String _result_6 = result;
              String _simpleAttributeStreamElement = this.getSimpleAttributeStreamElement(att, write);
              result = (_result_6 + _simpleAttributeStreamElement);
            }
            if (declaration) {
              String _result_7 = result;
              result = (_result_7 + "\"");
            }
            String _result_8 = result;
            result = (_result_8 + postfix);
          }
        }
      }
    }
    return result;
  }
  
  public String getConstAttributeName(final Attribute att) {
    String _name = this.datatype.getName();
    String _plus = (_name + "_");
    String _name_1 = att.getName();
    String _plus_1 = (_plus + _name_1);
    return this.getConstantsName(_plus_1);
  }
  
  public String getSimpleAttributeStreamElement(final Attribute att, final boolean write) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((att.getTypeOf().getName().equals(this.T_STRING_UCHAR) || att.getTypeOf().getName().equals(this.T_STRING_UINT8_T)) && (!write))) {
        _builder.append("(unsigned int)");
      }
    }
    {
      boolean _isIsConst = att.isIsConst();
      if (_isIsConst) {
        String _constantsName = this.getConstantsName(att.getName());
        _builder.append(_constantsName);
      } else {
        String _name = att.getName();
        _builder.append(_name);
      }
    }
    return _builder.toString();
  }
  
  public String getArrayAttributeStreamElement(final Attribute att, final int index, final boolean declaration, final boolean write) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((att.getTypeOf().getName().equals(this.T_STRING_UCHAR) || att.getTypeOf().getName().equals(this.T_STRING_UINT8_T)) && (!write))) {
        _builder.append("(unsigned int)");
      }
    }
    String _name = att.getName();
    _builder.append(_name);
    {
      if (declaration) {
        _builder.append("_");
        _builder.append(index);
      } else {
        _builder.append("[");
        _builder.append(index);
        _builder.append("]");
      }
    }
    return _builder.toString();
  }
  
  private CharSequence getUsedNamespaces(final EList<Attribute> attributes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Attribute att : attributes) {
        {
          IType _typeOf = att.getTypeOf();
          if ((_typeOf instanceof Enumeration)) {
            _builder.append("using namespace ");
            String _namespaceName = this.getNamespaceName(att.getTypeOf().getName());
            _builder.append(_namespaceName);
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private String printArgParameter(final Attribute att, final boolean printType, final boolean printValue) {
    String ret = "";
    if (printType) {
      String _ret = ret;
      StringConcatenation _builder = new StringConcatenation();
      String _cppDataTypeName = this.getCppDataTypeName(att);
      _builder.append(_cppDataTypeName);
      _builder.append(" ");
      String _name = att.getName();
      _builder.append(_name);
      ret = (_ret + _builder);
    } else {
      if (printValue) {
        String _ret_1 = ret;
        Object _basicTypeInitialValue = this.getBasicTypeInitialValue(att);
        ret = (_ret_1 + _basicTypeInitialValue);
      } else {
        String _ret_2 = ret;
        String _name_1 = att.getName();
        ret = (_ret_2 + _name_1);
      }
    }
    return ret;
  }
  
  private String printArgParameters(final boolean printType, final boolean printValue) {
    String ret = "";
    DataType _superType = this.datatype.getSuperType();
    if ((_superType instanceof ExternalTypeImpl)) {
      String _ret = ret;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Attribute> _attributes = this.datatype.getSuperType().getAttributes();
        boolean _hasElements = false;
        for(final Attribute att : _attributes) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(", ", "");
          }
          String _printArgParameter = this.printArgParameter(att, printType, printValue);
          _builder.append(_printArgParameter);
        }
      }
      ret = (_ret + _builder);
    }
    return ret;
  }
  
  private String printArgParameters(final boolean printType) {
    return this.printArgParameters(printType, false);
  }
  
  private CharSequence getConstructor(final boolean isAbstract) {
    String ret = "";
    DataType _superType = this.datatype.getSuperType();
    boolean _tripleNotEquals = (_superType != null);
    if (_tripleNotEquals) {
      if (isAbstract) {
        String _ret = ret;
        StringConcatenation _builder = new StringConcatenation();
        String _abstractName = this.getAbstractName(this.datatype.getName());
        _builder.append(_abstractName);
        _builder.append("(");
        String _printArgParameters = this.printArgParameters(true);
        _builder.append(_printArgParameters);
        _builder.append(") : ");
        String _name = this.datatype.getSuperType().getName();
        _builder.append(_name);
        _builder.append("(");
        String _printArgParameters_1 = this.printArgParameters(false);
        _builder.append(_printArgParameters_1);
        _builder.append("){ };");
        ret = (_ret + _builder);
        DataType _superType_1 = this.datatype.getSuperType();
        if ((_superType_1 instanceof ExternalTypeImpl)) {
          boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.datatype.getSuperType().getAttributes());
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            String _ret_1 = ret;
            StringConcatenation _builder_1 = new StringConcatenation();
            String _abstractName_1 = this.getAbstractName(this.datatype.getName());
            _builder_1.append(_abstractName_1);
            _builder_1.append("() : ");
            String _name_1 = this.datatype.getSuperType().getName();
            _builder_1.append(_name_1);
            _builder_1.append("(");
            String _printArgParameters_2 = this.printArgParameters(false, true);
            _builder_1.append(_printArgParameters_2);
            _builder_1.append("){ };");
            ret = (_ret_1 + _builder_1);
          }
        }
      } else {
        String _ret_2 = ret;
        StringConcatenation _builder_2 = new StringConcatenation();
        String _name_2 = this.datatype.getName();
        _builder_2.append(_name_2);
        _builder_2.append("(");
        String _printArgParameters_3 = this.printArgParameters(true);
        _builder_2.append(_printArgParameters_3);
        _builder_2.append(") : ");
        String _abstractName_2 = this.getAbstractName(this.datatype.getName());
        _builder_2.append(_abstractName_2);
        _builder_2.append("(");
        String _printArgParameters_4 = this.printArgParameters(false);
        _builder_2.append(_printArgParameters_4);
        _builder_2.append("){ };");
        ret = (_ret_2 + _builder_2);
        DataType _superType_2 = this.datatype.getSuperType();
        if ((_superType_2 instanceof ExternalTypeImpl)) {
          boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(this.datatype.getSuperType().getAttributes());
          boolean _not_1 = (!_isNullOrEmpty_1);
          if (_not_1) {
            String _ret_3 = ret;
            StringConcatenation _builder_3 = new StringConcatenation();
            String _name_3 = this.datatype.getName();
            _builder_3.append(_name_3);
            _builder_3.append("() : ");
            String _abstractName_3 = this.getAbstractName(this.datatype.getName());
            _builder_3.append(_abstractName_3);
            _builder_3.append("(){ };");
            ret = (_ret_3 + _builder_3);
          }
        }
      }
    } else {
      String _ret_4 = ret;
      StringConcatenation _builder_4 = new StringConcatenation();
      {
        if (isAbstract) {
          String _abstractName_4 = this.getAbstractName(this.datatype.getName());
          _builder_4.append(_abstractName_4);
        } else {
          String _name_4 = this.datatype.getName();
          _builder_4.append(_name_4);
        }
      }
      _builder_4.append("(){ };");
      ret = (_ret_4 + _builder_4);
    }
    return ret;
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    String _generationHeaderDescription = this.getGenerationHeaderDescription("CppDataTypeTemplate.xtend");
    _builder.append(_generationHeaderDescription, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.datatype.getName());
    _builder.append(_constantsName, "\t\t");
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.datatype.getName());
    _builder.append(_constantsName_1, "\t\t");
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("#include \"");
    String _abstractName = this.getAbstractName(this.datatype.getName());
    _builder.append(_abstractName, "\t\t");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName, "\t\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("namespace DataTypes {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("class ");
    String _name = this.datatype.getName();
    _builder.append(_name, "\t\t\t\t\t");
    _builder.append(" : public ");
    String _abstractName_1 = this.getAbstractName(this.datatype.getName());
    _builder.append(_abstractName_1, "\t\t\t\t\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    CharSequence _constructor = this.getConstructor(false);
    _builder.append(_constructor, "\t\t\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("#endif /*  ");
    String _constantsName_2 = this.getConstantsName(this.datatype.getName());
    _builder.append(_constantsName_2, "\t\t");
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileAbstractHeader() {
    StringConcatenation _builder = new StringConcatenation();
    String _generationAbstractHeaderDescription = this.getGenerationAbstractHeaderDescription("CppDataTypeTemplate.xtend");
    _builder.append(_generationAbstractHeaderDescription);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.getAbstractName(this.datatype.getName()));
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.getAbstractName(this.datatype.getName()));
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include <time.h>");
    _builder.newLine();
    _builder.append("#include <stdint.h>");
    _builder.newLine();
    _builder.append("#include <stdio.h>");
    _builder.newLine();
    _builder.append("#include <stdlib.h>");
    _builder.newLine();
    _builder.append("#include <string> // std::string");
    _builder.newLine();
    _builder.append("#include <sstream> // std::istringstream");
    _builder.newLine();
    _builder.append("#include <fstream> // std::ofstream");
    _builder.newLine();
    _builder.append("#include <iostream> // std::cout");
    _builder.newLine();
    {
      if (false) {
        _builder.append("#include \"DataPackage.h\"");
        _builder.newLine();
        _builder.append("#include \"Packetizer.h\"");
        _builder.newLine();
      }
    }
    _builder.newLine();
    String _includes = this.getIncludes();
    _builder.append(_includes);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("namespace DataTypes {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _usedNamespaces = this.getUsedNamespaces(this.datatype.getAttributes());
    _builder.append(_usedNamespaces, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class ");
    String _abstractName = this.getAbstractName(this.datatype.getName());
    _builder.append(_abstractName, "\t\t");
    _builder.append(" ");
    {
      DataType _superType = this.datatype.getSuperType();
      boolean _tripleNotEquals = (_superType != null);
      if (_tripleNotEquals) {
        _builder.append(": public ");
        String _name = this.datatype.getSuperType().getName();
        _builder.append(_name, "\t\t");
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    CharSequence _constructor = this.getConstructor(true);
    _builder.append(_constructor, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    CharSequence _attributesDeclaration = this.getAttributesDeclaration(this.datatype.getAttributes(), true);
    _builder.append(_attributesDeclaration, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("void serializeLogHeader(std::ofstream& stream){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("time_t _tm = time(NULL);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("struct tm * curtime = localtime( &_tm);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("stream << \"%% ");
    String _name_1 = this.datatype.getName();
    _builder.append(_name_1, "\t\t\t\t\t");
    _builder.append(" - \" << asctime(curtime); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("stream << \"% \"");
    _builder.newLine();
    {
      EList<Attribute> _attributes = this.datatype.getAttributes();
      for(final Attribute att : _attributes) {
        _builder.append("\t\t\t\t\t\t");
        String _attributeStreamElement = this.getAttributeStreamElement(att, true, null, "<<", " << \"\\t\" ", false, "");
        _builder.append(_attributeStreamElement, "\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<< \"\\n\";");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("void serializeLog(std::ofstream& stream){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("stream");
    _builder.newLine();
    {
      EList<Attribute> _attributes_1 = this.datatype.getAttributes();
      for(final Attribute att_1 : _attributes_1) {
        _builder.append("\t\t\t\t\t\t");
        String _attributeStreamElement_1 = this.getAttributeStreamElement(att_1, false, null, "<<", " << \"\\t\" ", false, "");
        _builder.append(_attributeStreamElement_1, "\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<< \"\\n\";");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("void deserializeLog(std::string line) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("//Tmp variable to ignore constants");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("double tmp;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("std::istringstream lineStream(line);");
    _builder.newLine();
    {
      EList<Attribute> _attributes_2 = this.datatype.getAttributes();
      for(final Attribute att_2 : _attributes_2) {
        _builder.append("\t\t\t\t\t");
        String _declareUnsignedCharAsInt = this.declareUnsignedCharAsInt(att_2);
        _builder.append(_declareUnsignedCharAsInt, "\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("lineStream ");
    _builder.newLine();
    {
      EList<Attribute> _attributes_3 = this.datatype.getAttributes();
      for(final Attribute att_3 : _attributes_3) {
        _builder.append("\t\t\t\t\t\t");
        String _attributeStreamElement_2 = this.getAttributeStreamElement(att_3, false, null, ">>", "", true, "tmp");
        _builder.append(_attributeStreamElement_2, "\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append(";");
    _builder.newLine();
    {
      EList<Attribute> _attributes_4 = this.datatype.getAttributes();
      for(final Attribute att_4 : _attributes_4) {
        _builder.append("\t\t\t\t\t");
        String _assignIntAsUnsignedChar = this.assignIntAsUnsignedChar(att_4);
        _builder.append(_assignIntAsUnsignedChar, "\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    {
      if (false) {
        _builder.append("\t\t\t\t");
        _builder.append("void serialize(Packetizer& serialBuf) {");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("\t");
        _builder.append("DataPackage::serialize(serialBuf);");
        _builder.newLine();
        {
          EList<Attribute> _attributes_5 = this.datatype.getAttributes();
          for(final Attribute att_5 : _attributes_5) {
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            CharSequence _usePacketizer = this.usePacketizer(att_5, null, true);
            _builder.append(_usePacketizer, "\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("void deserialize(Packetizer& serialBuf) {");
        _builder.newLine();
        {
          EList<Attribute> _attributes_6 = this.datatype.getAttributes();
          for(final Attribute att_6 : _attributes_6) {
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            CharSequence _usePacketizer_1 = this.usePacketizer(att_6, null, false);
            _builder.append(_usePacketizer_1, "\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*  ");
    String _constantsName_2 = this.getConstantsName(this.getAbstractName(this.datatype.getName()));
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileAbstractSource() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
}
