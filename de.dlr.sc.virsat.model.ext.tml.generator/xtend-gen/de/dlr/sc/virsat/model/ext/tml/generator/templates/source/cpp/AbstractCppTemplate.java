/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp;

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.AbstractTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ISourceTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import java.util.ArrayList;

@SuppressWarnings("all")
public abstract class AbstractCppTemplate extends AbstractTemplate implements ISourceTemplate {
  protected ArrayList<String> includes = new ArrayList<String>();
  
  protected String getIncludes() {
    String includeString = "";
    for (final String inc : this.includes) {
      String _includeString = includeString;
      includeString = (_includeString + (("#include " + inc) + " \n"));
    }
    return includeString;
  }
  
  protected void addIncludes(final String header) {
    boolean _contains = this.includes.contains(header);
    boolean _not = (!_contains);
    if (_not) {
      this.includes.add(header);
    }
  }
  
  protected void includeType(final IType type, final IGenerationConfigurationProvider gcp) {
    if ((type instanceof BasicTypeDefinition)) {
      boolean _isCustomSource = ((BasicTypeDefinition)type).isCustomSource();
      boolean _not = (!_isCustomSource);
      if (_not) {
        String _source = ((BasicTypeDefinition)type).getSource();
        boolean _tripleNotEquals = (_source != null);
        if (_tripleNotEquals) {
          String _source_1 = ((BasicTypeDefinition)type).getSource();
          String _plus = ("<" + _source_1);
          final String header = (_plus + ">");
          boolean _contains = this.includes.contains(header);
          boolean _not_1 = (!_contains);
          if (_not_1) {
            this.includes.add(header);
          }
        }
      } else {
        String _source_2 = ((BasicTypeDefinition)type).getSource();
        boolean _tripleNotEquals_1 = (_source_2 != null);
        if (_tripleNotEquals_1) {
          String _source_3 = ((BasicTypeDefinition)type).getSource();
          String _plus_1 = ("\"" + _source_3);
          final String header_1 = (_plus_1 + ".h\"");
          boolean _contains_1 = this.includes.contains(header_1);
          boolean _not_2 = (!_contains_1);
          if (_not_2) {
            this.includes.add(header_1);
          }
        }
      }
    } else {
      String _name = type.getName();
      String _plus_2 = ("\"" + _name);
      final String header_2 = (_plus_2 + ".h\"");
      boolean _contains_2 = this.includes.contains(header_2);
      boolean _not_3 = (!_contains_2);
      if (_not_3) {
        this.includes.add(header_2);
      }
    }
  }
}
