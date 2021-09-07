/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates;

import com.google.common.base.Objects;
import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationImpl;
import java.lang.reflect.Method;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public abstract class AbstractTemplate {
  protected final int MAX_SERIALIZABLE_ARRAY_SIZE = 100;
  
  protected final String T_STRING_BOOL = "bool";
  
  protected final String T_STRING_CHAR = "char";
  
  protected final String T_STRING_DOUBLE = "double";
  
  protected final String T_STRING_FLOAT = "float";
  
  protected final String T_STRING_INT = "int";
  
  protected final String T_STRING_INT16_T = "int16_t";
  
  protected final String T_STRING_INT64_T = "int64_t";
  
  protected final String T_STRING_INT8_T = "int8_t";
  
  protected final String T_STRING_LONG = "long";
  
  protected final String T_STRING_UCHAR = "uchar";
  
  protected final String T_STRING_UINT = "uint";
  
  protected final String T_STRING_UINT16_T = "uint16_t";
  
  protected final String T_STRING_UINT64_T = "uint64_t";
  
  protected final String T_STRING_UINT8_T = "uint8_t";
  
  protected final String T_STRING_ULONG = "ulong";
  
  public String getCppDataTypeName(final Attribute att) {
    String _switchResult = null;
    String _name = att.getTypeOf().getName();
    boolean _matched = false;
    if (Objects.equal(_name, this.T_STRING_CHAR)) {
      _matched=true;
      return "char *";
    }
    if (!_matched) {
      if (Objects.equal(_name, this.T_STRING_UCHAR)) {
        _matched=true;
        return "unsigned char";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, this.T_STRING_UINT)) {
        _matched=true;
        return "unsigned int";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, this.T_STRING_ULONG)) {
        _matched=true;
        return "unsigned long";
      }
    }
    if (!_matched) {
      String _xifexpression = null;
      IType _typeOf = att.getTypeOf();
      if ((_typeOf instanceof Enumeration)) {
        String _namespaceName = this.getNamespaceName(att.getTypeOf().getName());
        String _plus = (_namespaceName + "::");
        String _name_1 = att.getTypeOf().getName();
        _xifexpression = (_plus + _name_1);
      } else {
        _xifexpression = att.getTypeOf().getName();
      }
      _switchResult = _xifexpression;
    }
    return _switchResult;
  }
  
  public Object getBasicTypeInitialValue(final Attribute att) {
    return this.getDefaultValue(att.getTypeOf().getName());
  }
  
  public String getElementName(final IName element) {
    return element.getName();
  }
  
  public String getAbstractName(final String name) {
    return ("A" + name);
  }
  
  public String getObjectName(final String className) {
    String firstChar = className.substring(0, 1).toLowerCase();
    String _substring = className.substring(1, className.length());
    return (firstChar + _substring);
  }
  
  public String getClassName(final String objectName) {
    String firstChar = objectName.substring(0, 1).toUpperCase();
    String _substring = objectName.substring(1, objectName.length());
    return (firstChar + _substring);
  }
  
  public String getConstantsName(final String className) {
    String constantName = className;
    boolean _equals = constantName.toUpperCase().equals(constantName);
    boolean _not = (!_equals);
    if (_not) {
      int uC = 0;
      for (int i = 1; (i < className.length()); i++) {
        boolean _isUpperCase = Character.isUpperCase(className.charAt(i));
        if (_isUpperCase) {
          constantName = new StringBuffer(constantName).insert((i + uC), "_").toString();
          uC++;
        }
      }
    }
    return constantName.toUpperCase();
  }
  
  public String getAcronym(final String className) {
    String acro = "";
    for (int i = 1; (i < className.length()); i++) {
      {
        char charI = className.charAt(i);
        boolean _isUpperCase = Character.isUpperCase(charI);
        if (_isUpperCase) {
          String _acro = acro;
          acro = (_acro + Character.valueOf(charI));
        }
      }
    }
    return acro;
  }
  
  public String getNamespaceName(final String enumName) {
    String _className = this.getClassName(enumName);
    return ("NS" + _className);
  }
  
  public CharSequence removeLastChar(final CharSequence chars) {
    if ((chars == null)) {
      return "";
    } else {
      int _length = chars.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        final CharSequence c = this.removeLineDelimiter(chars);
        int _length_1 = c.length();
        boolean _greaterThan_1 = (_length_1 > 0);
        if (_greaterThan_1) {
          int _length_2 = c.length();
          int _minus = (_length_2 - 1);
          return c.subSequence(0, _minus);
        }
        return c;
      }
      return chars;
    }
  }
  
  public CharSequence removeLineDelimiter(final CharSequence chars) {
    int _length = chars.length();
    int _minus = (_length - 2);
    return chars.subSequence(0, _minus);
  }
  
  public String removeFileSepChars(final String filename) {
    String fn = filename;
    if ((fn.startsWith("\\") || fn.startsWith("/"))) {
      fn = fn.substring(1);
    }
    if ((fn.endsWith("\\") || fn.endsWith("/"))) {
      int _length = fn.length();
      int _minus = (_length - 1);
      fn = fn.substring(0, _minus);
    }
    return fn;
  }
  
  protected String getInputKeyName(final String inputName) {
    String _constantsName = this.getConstantsName(inputName);
    return ("INPUT_KEY_" + _constantsName);
  }
  
  protected boolean channelHasSize(final ChannelBehaviorDefinition channelBehaviorDefinition) {
    return this.channelHasSize(channelBehaviorDefinition.getParameters());
  }
  
  private boolean channelHasSize(final EList<BehavioralParameterDefinition> behavioralParameterDefinitions) {
    final Function1<BehavioralParameterDefinition, Boolean> _function = (BehavioralParameterDefinition p) -> {
      int _compareToIgnoreCase = p.getName().compareToIgnoreCase("size");
      return Boolean.valueOf((_compareToIgnoreCase == 0));
    };
    final BehavioralParameterDefinition sizeParameter = IterableExtensions.<BehavioralParameterDefinition>findFirst(behavioralParameterDefinitions, _function);
    if ((sizeParameter != null)) {
      return true;
    }
    return false;
  }
  
  protected CharSequence declareAttribute(final Attribute att, final boolean declareAsStatic) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((att != null)) {
        {
          boolean _isIsConst = att.isIsConst();
          if (_isIsConst) {
            {
              if (declareAsStatic) {
                _builder.append("static ");
              }
            }
            _builder.append("const ");
          }
        }
        String _cppDataTypeName = this.getCppDataTypeName(att);
        _builder.append(_cppDataTypeName);
        _builder.append(" ");
        {
          boolean _isIsConst_1 = att.isIsConst();
          if (_isIsConst_1) {
            String _constantsName = this.getConstantsName(att.getName());
            _builder.append(_constantsName);
          } else {
            String _name = att.getName();
            _builder.append(_name);
          }
        }
        {
          EList<ArrayDimension> _dimensions = att.getDimensions();
          for(final ArrayDimension dim : _dimensions) {
            _builder.append("[");
            int _size = dim.getSize();
            _builder.append(_size);
            _builder.append("]");
          }
        }
        {
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(att.getValueLiteral());
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            _builder.append(" = ");
            Object _value = this.getValue(att);
            _builder.append(_value);
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        {
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(att.getMaxValueLiteral());
          boolean _not_1 = (!_isNullOrEmpty_1);
          if (_not_1) {
            _builder.append("static const ");
            String _cppDataTypeName_1 = this.getCppDataTypeName(att);
            _builder.append(_cppDataTypeName_1);
            _builder.append(" MAX_");
            String _constantsName_1 = this.getConstantsName(att.getName());
            _builder.append(_constantsName_1);
            _builder.append(" = ");
            String _maxValueLiteral = att.getMaxValueLiteral();
            _builder.append(_maxValueLiteral);
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(att.getMinValueLiteral());
          boolean _not_2 = (!_isNullOrEmpty_2);
          if (_not_2) {
            _builder.append("static const ");
            String _cppDataTypeName_2 = this.getCppDataTypeName(att);
            _builder.append(_cppDataTypeName_2);
            _builder.append(" MIN_");
            String _constantsName_2 = this.getConstantsName(att.getName());
            _builder.append(_constantsName_2);
            _builder.append(" = ");
            String _minValueLiteral = att.getMinValueLiteral();
            _builder.append(_minValueLiteral);
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence getAttributesDeclaration(final EList<Attribute> attributes, final boolean declareAsStatic) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Attribute att : attributes) {
        CharSequence _declareAttribute = this.declareAttribute(att, declareAsStatic);
        _builder.append(_declareAttribute);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected EList<Attribute> getNestedAttributes(final Attribute att) {
    try {
      final Function1<Method, Boolean> _function = (Method m) -> {
        String _name = m.getName();
        return Boolean.valueOf((_name == "getAttributes"));
      };
      Method getAttMethodObj = IterableExtensions.<Method>findFirst(((Iterable<Method>)Conversions.doWrapArray(att.getTypeOf().getClass().getMethods())), _function);
      if ((getAttMethodObj != null)) {
        Object _invoke = getAttMethodObj.invoke(att.getTypeOf());
        return ((EList<Attribute>) _invoke);
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected int getConstAttributesCount(final EList<Attribute> attributes) {
    int ret = 0;
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(attributes);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      for (final Attribute att : attributes) {
        if (((!(att.getTypeOf() instanceof BasicTypeDefinition)) && 
          (!(att.getTypeOf() instanceof Enumeration)))) {
          int _ret = ret;
          int _constAttributesCount = this.getConstAttributesCount(this.getNestedAttributes(att));
          ret = (_ret + _constAttributesCount);
        } else {
          boolean _isIsConst = att.isIsConst();
          if (_isIsConst) {
            int _ret_1 = ret;
            ret = (_ret_1 + 1);
          }
        }
      }
    }
    return ret;
  }
  
  protected boolean hasAppropriateSize(final Attribute att) {
    return this.hasAppropriateSize(att, this.MAX_SERIALIZABLE_ARRAY_SIZE);
  }
  
  private boolean hasAppropriateSize(final Attribute att, final int max_size) {
    boolean _isArray = this.isArray(att);
    boolean _not = (!_isArray);
    if (_not) {
      return true;
    } else {
      boolean _is1DArray = this.is1DArray(att);
      if (_is1DArray) {
        int _size = att.getDimensions().get(0).getSize();
        return (_size <= max_size);
      } else {
        boolean _is2DArray = this.is2DArray(att);
        if (_is2DArray) {
          int _size_1 = att.getDimensions().get(0).getSize();
          int _size_2 = att.getDimensions().get(1).getSize();
          int _multiply = (_size_1 * _size_2);
          return (_multiply <= (max_size * max_size));
        }
      }
    }
    return false;
  }
  
  protected boolean isArray(final Attribute att) {
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(att.getDimensions());
    return (!_isNullOrEmpty);
  }
  
  protected boolean is1DArray(final Attribute att) {
    return (this.isArray(att) && (att.getDimensions().size() == 1));
  }
  
  protected boolean is2DArray(final Attribute att) {
    return (this.isArray(att) && (att.getDimensions().size() == 2));
  }
  
  protected Object getValue(final Attribute att) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(att.getValueLiteral());
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String ret = "";
      boolean _equalsIgnoreCase = att.getTypeOf().getName().equalsIgnoreCase(this.T_STRING_CHAR);
      if (_equalsIgnoreCase) {
        String _ret = ret;
        ret = (_ret + "\"");
      }
      String _ret_1 = ret;
      String _valueLiteral = att.getValueLiteral();
      ret = (_ret_1 + _valueLiteral);
      boolean _equalsIgnoreCase_1 = att.getTypeOf().getName().equalsIgnoreCase(this.T_STRING_CHAR);
      if (_equalsIgnoreCase_1) {
        String _ret_2 = ret;
        ret = (_ret_2 + "\"");
      }
      return ret;
    }
    return this.getDefaultValue(att);
  }
  
  protected Object getDefaultValue(final Attribute att) {
    return this.getDefaultValue(att, false);
  }
  
  protected Object getDefaultValue(final Attribute att, final boolean isTest) {
    return this.getDefaultValue(att, isTest, false);
  }
  
  protected Object getDefaultValue(final Attribute att, final boolean isTest, final boolean isConfigFile) {
    IType _typeOf = att.getTypeOf();
    if ((_typeOf instanceof Enumeration)) {
      IType _typeOf_1 = att.getTypeOf();
      final EnumerationImpl enumeration = ((EnumerationImpl) _typeOf_1);
      if (isConfigFile) {
        return Integer.valueOf(enumeration.getLiterals().get(0).getKeyNum());
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("DataTypes::");
        String _namespaceName = this.getNamespaceName(enumeration.getName());
        _builder.append(_namespaceName);
        _builder.append("::");
        String _name = enumeration.getName();
        _builder.append(_name);
        _builder.append("::");
        String _name_1 = enumeration.getLiterals().get(0).getName();
        _builder.append(_name_1);
        return _builder.toString();
      }
    } else {
      if (isTest) {
        return this.getDefaultValueForTest(att.getTypeOf().getName());
      } else {
        return this.getDefaultValue(att.getTypeOf().getName());
      }
    }
  }
  
  private Object getDefaultValue(final String typename) {
    boolean _matched = false;
    if (Objects.equal(typename, this.T_STRING_BOOL)) {
      _matched=true;
      return Boolean.valueOf(false);
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_CHAR)) {
        _matched=true;
        return "\"\"";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UCHAR)) {
        _matched=true;
        return "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_FLOAT)) {
        _matched=true;
        return "0.0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_DOUBLE)) {
        _matched=true;
        return "0.0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_INT)) {
        _matched=true;
        return "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_INT8_T)) {
        _matched=true;
        return "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_INT16_T)) {
        _matched=true;
        return "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_INT64_T)) {
        _matched=true;
        return "0L";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_LONG)) {
        _matched=true;
        return "0L";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UINT)) {
        _matched=true;
        return "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UINT8_T)) {
        _matched=true;
        return "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UINT16_T)) {
        _matched=true;
        return "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UINT64_T)) {
        _matched=true;
        return "0L";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_ULONG)) {
        _matched=true;
        return "0L";
      }
    }
    return "NULL";
  }
  
  private Object getDefaultValueForTest(final String typename) {
    boolean _matched = false;
    if (Objects.equal(typename, this.T_STRING_BOOL)) {
      _matched=true;
      return Boolean.valueOf(true);
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_CHAR)) {
        _matched=true;
        return "\"test string\"";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UCHAR)) {
        _matched=true;
        return "255";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_FLOAT)) {
        _matched=true;
        return "1.234";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_DOUBLE)) {
        _matched=true;
        return "1.234";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_INT)) {
        _matched=true;
        return "101112";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_INT8_T)) {
        _matched=true;
        return "255";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_INT16_T)) {
        _matched=true;
        return "8910";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_INT64_T)) {
        _matched=true;
        return "2147483647L";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_LONG)) {
        _matched=true;
        return "-2147483647L";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UINT)) {
        _matched=true;
        return "5678";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UINT8_T)) {
        _matched=true;
        return "256";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UINT16_T)) {
        _matched=true;
        return "1234";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_UINT64_T)) {
        _matched=true;
        return "4294967295L";
      }
    }
    if (!_matched) {
      if (Objects.equal(typename, this.T_STRING_ULONG)) {
        _matched=true;
        return "4294967295L";
      }
    }
    return "NULL";
  }
  
  protected Object getChannelParameterValue(final BehavioralParameterDefinition behavioralParameterDefinition) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(behavioralParameterDefinition.getValue());
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      EnumValueType _valueType = behavioralParameterDefinition.getValueType();
      boolean _tripleEquals = (_valueType == EnumValueType.STRING);
      if (_tripleEquals) {
        String _value = behavioralParameterDefinition.getValue();
        String _plus = ("\"" + _value);
        return (_plus + "\"");
      } else {
        return behavioralParameterDefinition.getValue();
      }
    } else {
      return this.getParameterDefaultValue(behavioralParameterDefinition);
    }
  }
  
  private Object getParameterDefaultValue(final BehavioralParameterDefinition behavioralParameterDefinition) {
    EnumValueType _valueType = behavioralParameterDefinition.getValueType();
    boolean _tripleEquals = (_valueType == EnumValueType.INTEGER);
    if (_tripleEquals) {
      return this.getDefaultValue(this.T_STRING_INT);
    } else {
      EnumValueType _valueType_1 = behavioralParameterDefinition.getValueType();
      boolean _tripleEquals_1 = (_valueType_1 == EnumValueType.FLOAT);
      if (_tripleEquals_1) {
        return this.getDefaultValue(this.T_STRING_FLOAT);
      } else {
        EnumValueType _valueType_2 = behavioralParameterDefinition.getValueType();
        boolean _tripleEquals_2 = (_valueType_2 == EnumValueType.STRING);
        if (_tripleEquals_2) {
          return this.getDefaultValue(this.T_STRING_CHAR);
        }
      }
    }
    return null;
  }
}
