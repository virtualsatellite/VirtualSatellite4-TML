/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.source.config;

import de.dlr.sc.virsat.model.ext.tml.generator.templates.AbstractTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IConfigFileTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public abstract class AbstractConfigFileTemplate extends AbstractTemplate implements IConfigFileTemplate {
  public String printConfiguration(final String className, final EList<Attribute> attributes, final boolean isTestConfig) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(className);
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      for(final Attribute att : attributes) {
        _builder.append("\t");
        String _printConfiguration = this.printConfiguration(att, isTestConfig);
        _builder.append(_printConfiguration, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String printConfiguration(final Attribute att, final boolean isTestConfig) {
    String result = "";
    if ((this.hasAppropriateSize(att) && (!att.isIsConst()))) {
      if (((!(att.getTypeOf() instanceof BasicTypeDefinition)) && 
        (!(att.getTypeOf() instanceof Enumeration)))) {
        String _result = result;
        String _printConfiguration = this.printConfiguration(att.getName(), this.getNestedAttributes(att), isTestConfig);
        result = (_result + _printConfiguration);
      } else {
        String _result_1 = result;
        String _printLowLevelConfiguration = this.printLowLevelConfiguration(att, isTestConfig);
        result = (_result_1 + _printLowLevelConfiguration);
      }
    }
    return result;
  }
  
  public String printLowLevelConfiguration(final Attribute att, final boolean isTestConfig) {
    String result = "";
    boolean _isArray = this.isArray(att);
    boolean _not = (!_isArray);
    if (_not) {
      String _result = result;
      StringConcatenation _builder = new StringConcatenation();
      String _name = att.getName();
      _builder.append(_name);
      _builder.append(" = ");
      Object _defaultValue = this.getDefaultValue(att, isTestConfig, true);
      _builder.append(_defaultValue);
      _builder.append(";");
      result = (_result + _builder);
    } else {
      boolean _is1DArray = this.is1DArray(att);
      if (_is1DArray) {
        String _result_1 = result;
        StringConcatenation _builder_1 = new StringConcatenation();
        String _name_1 = att.getName();
        _builder_1.append(_name_1);
        _builder_1.append(" = [");
        CharSequence _defaultValueSequence = this.getDefaultValueSequence(att, isTestConfig);
        _builder_1.append(_defaultValueSequence);
        _builder_1.append("];");
        result = (_result_1 + _builder_1);
      } else {
        boolean _is2DArray = this.is2DArray(att);
        if (_is2DArray) {
          String _result_2 = result;
          StringConcatenation _builder_2 = new StringConcatenation();
          String _name_2 = att.getName();
          _builder_2.append(_name_2);
          _builder_2.append(" = (");
          {
            int _size = att.getDimensions().get(1).getSize();
            IntegerRange _upTo = new IntegerRange(1, _size);
            for(final Integer i : _upTo) {
              _builder_2.append("(");
              CharSequence _defaultValueSequence_1 = this.getDefaultValueSequence(att, isTestConfig);
              _builder_2.append(_defaultValueSequence_1);
              _builder_2.append(")");
              {
                int _size_1 = att.getDimensions().get(1).getSize();
                boolean _notEquals = (_size_1 != (i).intValue());
                if (_notEquals) {
                  _builder_2.append(",");
                }
              }
            }
          }
          _builder_2.append(");");
          result = (_result_2 + _builder_2);
        }
      }
    }
    return result;
  }
  
  public CharSequence getDefaultValueSequence(final Attribute att, final boolean isTestConfig) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = att.getDimensions().get(0).getSize();
      IntegerRange _upTo = new IntegerRange(1, _size);
      for(final Integer i : _upTo) {
        Object _defaultValue = this.getDefaultValue(att, isTestConfig, true);
        _builder.append(_defaultValue);
        {
          int _size_1 = att.getDimensions().get(0).getSize();
          boolean _notEquals = (_size_1 != (i).intValue());
          if (_notEquals) {
            _builder.append(",");
          }
        }
      }
    }
    return _builder;
  }
}
