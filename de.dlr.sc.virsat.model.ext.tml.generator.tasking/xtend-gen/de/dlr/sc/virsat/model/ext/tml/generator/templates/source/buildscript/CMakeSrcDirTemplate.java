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

import de.dlr.sc.virsat.model.ext.tml.generator.IFileNameProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.CppFileNameProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CMakeSrcDirTemplate extends AbstractBuildScriptTemplate {
  protected TaskingEnvironment taskingEnvironment;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected IFileNameProvider fileNameProvider = new CppFileNameProvider();
  
  protected TaskingEnvironmentHelper generationHelper = TaskingEnvironmentHelper.getInstance();
  
  public CMakeSrcDirTemplate(final TaskingEnvironment taskingEnvironment) {
    this.taskingEnvironment = taskingEnvironment;
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
    _builder.append("add_library(${PROJECTNAME} STATIC");
    _builder.newLine();
    _builder.append("    ");
    String _sourceFileName = this.fileNameProvider.getSourceFileName(this.taskingEnvironment.getName());
    _builder.append(_sourceFileName, "    ");
    _builder.newLineIfNotEmpty();
    {
      Set<TaskDefinition> _taskDefinitions = this.generationHelper.getTaskDefinitions();
      for(final TaskDefinition taskDefinition : _taskDefinitions) {
        _builder.append("    ");
        String _removeFileSepChars = this.removeFileSepChars(this.gcp.getTaskDefinitionFolder());
        _builder.append(_removeFileSepChars, "    ");
        _builder.append("/");
        String _sourceFileName_1 = this.fileNameProvider.getSourceFileName(taskDefinition.getName());
        _builder.append(_sourceFileName_1, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("target_link_libraries (${PROJECTNAME}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("gen_${PROJECTNAME}");
    _builder.newLine();
    _builder.append("    ");
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        _builder.append("libconfig_${PROJECTNAME}");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("tasking");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("tasking-channels");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("${CMAKE_THREAD_LIBS_INIT}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rt");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    return _builder.toString();
  }
}
