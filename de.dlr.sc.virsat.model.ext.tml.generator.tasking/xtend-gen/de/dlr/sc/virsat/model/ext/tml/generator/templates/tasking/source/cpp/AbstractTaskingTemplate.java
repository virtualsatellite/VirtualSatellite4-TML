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
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp.AbstractCppTemplate;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class AbstractTaskingTemplate extends AbstractCppTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  public String getGenerationAbstractHeaderDescription(final String templateName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*-----------------------------------------------------------------");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("AUTOMATICALLY GENERATED FROM TML-MODEL.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("PLEASE DO NOT EDIT THIS FILE.");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(c) 2013-2021 DLR Simulation and Software Technology");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Generator for tasking version: ");
    String _taskingVersion = this.gcp.getTaskingVersion();
    _builder.append(_taskingVersion, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Template: ");
    _builder.append(templateName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("------------------------------------------------------------------*/");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String getGenerationAbstractSourceDescription(final String templateName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*-----------------------------------------------------------------");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("AUTOMATICALLY GENERATED FROM TML-MODEL.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("PLEASE DO NOT EDIT THIS FILE.");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(c) 220212019 DLR Simulation and Software Technology");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Generator for tasking version: ");
    String _taskingVersion = this.gcp.getTaskingVersion();
    _builder.append(_taskingVersion, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Template: ");
    _builder.append(templateName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("------------------------------------------------------------------*/");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String getGenerationHeaderDescription(final String templateName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("This is an automatically generated stub file from the TML-Model.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("This file will only be generated when not found, and should be");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("edited as needed to implement the required features.");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(2021013-2019 DLR Simulation and Software Technology");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Template: ");
    _builder.append(templateName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("------------------------------------------------------------------*/");
    _builder.newLine();
    return _builder.toString();
  }
}
