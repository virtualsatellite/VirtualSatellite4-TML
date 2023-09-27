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
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CppEnumerationTemplate extends AbstractTaskingTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected Enumeration enumeration;
  
  public CppEnumerationTemplate(final Enumeration enumeration) {
    this.enumeration = enumeration;
  }
  
  private String inLineCommands() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//return the enum as integer");
    _builder.newLine();
    _builder.append("inline std::ostream& operator << (std::ostream& os, const ");
    String _name = this.enumeration.getName();
    _builder.append(_name);
    _builder.append("& obj)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("os << static_cast<std::underlying_type<");
    String _name_1 = this.enumeration.getName();
    _builder.append(_name_1, "   ");
    _builder.append(">::type>(obj);");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("return os;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("inline std::istream& operator >> (std::istream& is, ");
    String _name_2 = this.enumeration.getName();
    _builder.append(_name_2);
    _builder.append("& obj)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("unsigned int tmp = 0;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("if (is >> tmp)");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("obj = static_cast<");
    String _name_3 = this.enumeration.getName();
    _builder.append(_name_3, "     ");
    _builder.append(">(tmp);");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("return is;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("inline int toInt(const ");
    String _name_4 = this.enumeration.getName();
    _builder.append(_name_4);
    _builder.append("& obj){");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("return static_cast<std::underlying_type<");
    String _name_5 = this.enumeration.getName();
    _builder.append(_name_5, "   ");
    _builder.append(">::type>(obj);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("inline const char* getLiteralString(");
    String _name_6 = this.enumeration.getName();
    _builder.append(_name_6);
    _builder.append(" ");
    String _objectName = this.getObjectName(this.enumeration.getName());
    _builder.append(_objectName);
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("switch(");
    String _objectName_1 = this.getObjectName(this.enumeration.getName());
    _builder.append(_objectName_1, "\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<EnumerationLiteral> _literals = this.enumeration.getLiterals();
      for(final EnumerationLiteral literal : _literals) {
        _builder.append("\t \t\t");
        _builder.append("case ");
        String _name_7 = literal.getName();
        _builder.append(_name_7, "\t \t\t");
        _builder.append(": return \"");
        String _name_8 = literal.getName();
        _builder.append(_name_8, "\t \t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("default: return \"No valid value!\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private boolean allKeyDefined() {
    boolean ret = true;
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.enumeration.getLiterals());
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      int key = 0;
      EList<EnumerationLiteral> _literals = this.enumeration.getLiterals();
      for (final EnumerationLiteral literal : _literals) {
        {
          if (((literal.getKeyNum() == 0) && (key != 0))) {
            return false;
          }
          key++;
        }
      }
    } else {
      ret = false;
    }
    return ret;
  }
  
  private int getFirstKey() {
    int ret = 0;
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(this.enumeration.getLiterals());
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      ret = this.enumeration.getLiterals().get(0).getKeyNum();
    }
    return ret;
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.getAbstractName(this.enumeration.getName()));
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.getAbstractName(this.enumeration.getName()));
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generationHeaderDescription = this.getGenerationHeaderDescription("CppDataTypeTemplate.xtend");
    _builder.append(_generationHeaderDescription);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include <type_traits>");
    _builder.newLine();
    _builder.append("#include <ostream>");
    _builder.newLine();
    _builder.append("#include <stdint.h>");
    _builder.newLine();
    _builder.append("#include <iostream>");
    _builder.newLine();
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
    _builder.append("namespace ");
    String _namespaceName = this.getNamespaceName(this.enumeration.getName());
    _builder.append(_namespaceName, "\t\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("enum ");
    String _name = this.enumeration.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      boolean _allKeyDefined = this.allKeyDefined();
      if (_allKeyDefined) {
        {
          EList<EnumerationLiteral> _literals = this.enumeration.getLiterals();
          boolean _hasElements = false;
          for(final EnumerationLiteral literal : _literals) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t\t\t");
            }
            _builder.append("\t\t\t\t");
            String _name_1 = literal.getName();
            _builder.append(_name_1, "\t\t\t\t");
            _builder.append(" = ");
            int _keyNum = literal.getKeyNum();
            _builder.append(_keyNum, "\t\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t\t\t\t");
        int key = this.getFirstKey();
        _builder.newLineIfNotEmpty();
        {
          EList<EnumerationLiteral> _literals_1 = this.enumeration.getLiterals();
          boolean _hasElements_1 = false;
          for(final EnumerationLiteral literal_1 : _literals_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t\t\t");
            }
            _builder.append("\t\t\t\t");
            String _name_2 = literal_1.getName();
            _builder.append(_name_2, "\t\t\t\t");
            _builder.append(" = ");
            int _plusPlus = key++;
            _builder.append(_plusPlus, "\t\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _inLineCommands = this.inLineCommands();
    _builder.append(_inLineCommands, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*  ");
    String _constantsName_2 = this.getConstantsName(this.getAbstractName(this.enumeration.getName()));
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileAbstractHeader() {
    StringConcatenation _builder = new StringConcatenation();
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
