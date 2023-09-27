/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript;

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CMakeContribDirTemplate extends AbstractBuildScriptTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  public CMakeContribDirTemplate() {
  }
  
  @Override
  public String compileScript() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Configuration script for the folder.");
    _builder.newLine();
    _builder.append("# Execute cmake one level up to (re)generate the");
    _builder.newLine();
    _builder.append("# Projectfiles/Makefiles");
    _builder.newLine();
    _builder.newLine();
    _builder.append("add_subdirectory(Tasking)");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        _builder.append("include_directories(");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("../");
        String _removeFileSepChars = this.removeFileSepChars(this.gcp.getContribFolder());
        _builder.append(_removeFileSepChars, "\t");
        _builder.append("/");
        String _libconfigFolder = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append(")");
        _builder.newLine();
        _builder.newLine();
        _builder.append("add_library(libconfig_${PROJECTNAME} STATIC");
        _builder.newLine();
        _builder.append("\t");
        String _libconfigFolder_1 = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder_1, "\t");
        _builder.append("/grammar.c");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _libconfigFolder_2 = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder_2, "\t");
        _builder.append("/scanner.c");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _libconfigFolder_3 = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder_3, "\t");
        _builder.append("/scanctx.c");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _libconfigFolder_4 = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder_4, "\t");
        _builder.append("/strbuf.c");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _libconfigFolder_5 = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder_5, "\t");
        _builder.append("/libconfig.c");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _libconfigFolder_6 = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder_6, "\t");
        _builder.append("/libconfigcpp.c++");
        _builder.newLineIfNotEmpty();
        _builder.append(")");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
