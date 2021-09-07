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
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.AbstractBuildScriptTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CMakeSrcGenDirTemplate extends AbstractBuildScriptTemplate {
  protected TaskingEnvironment taskingEnvironment;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected IFileNameProvider fileNameProvider = new CppFileNameProvider();
  
  protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.getInstance();
  
  public CMakeSrcGenDirTemplate(final TaskingEnvironment taskingEnvironment) {
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
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("include_directories(");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("../");
    String _removeFileSepChars = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars, "\t");
    _builder.append("/Tasking/include");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("../");
    String _removeFileSepChars_1 = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars_1, "\t");
    _builder.append("/Tasking/include/arch/linux");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("../");
    String _removeFileSepChars_2 = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars_2, "\t");
    _builder.append("/Tasking/channels/include/channels");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        _builder.append("../");
        String _removeFileSepChars_3 = this.removeFileSepChars(this.gcp.getContribFolder());
        _builder.append(_removeFileSepChars_3, "\t");
        _builder.append("/");
        String _libconfigFolder = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("../");
    String _removeFileSepChars_4 = this.removeFileSepChars(this.gcp.getSrcPath());
    _builder.append(_removeFileSepChars_4, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("../");
    String _removeFileSepChars_5 = this.removeFileSepChars(this.gcp.getSrcPath());
    _builder.append(_removeFileSepChars_5, "\t");
    _builder.append("/");
    String _removeFileSepChars_6 = this.removeFileSepChars(this.gcp.getTaskDefinitionFolder());
    _builder.append(_removeFileSepChars_6, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("../");
    String _removeFileSepChars_7 = this.removeFileSepChars(this.gcp.getSrcPath());
    _builder.append(_removeFileSepChars_7, "\t");
    _builder.append("/");
    String _removeFileSepChars_8 = this.removeFileSepChars(this.gcp.getTypeDefinitionFolder());
    _builder.append(_removeFileSepChars_8, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("../");
    String _removeFileSepChars_9 = this.removeFileSepChars(this.gcp.getSrcPath());
    _builder.append(_removeFileSepChars_9, "\t");
    _builder.append("/");
    String _removeFileSepChars_10 = this.removeFileSepChars(this.gcp.getChannelDefinitionFolder());
    _builder.append(_removeFileSepChars_10, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_11 = this.removeFileSepChars(this.gcp.getTaskDefinitionFolder());
    _builder.append(_removeFileSepChars_11, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_12 = this.removeFileSepChars(this.gcp.getTypeDefinitionFolder());
    _builder.append(_removeFileSepChars_12, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_13 = this.removeFileSepChars(this.gcp.getChannelDefinitionFolder());
    _builder.append(_removeFileSepChars_13, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("add_library(gen_${PROJECTNAME} STATIC");
    _builder.newLine();
    _builder.append("\t");
    String _abstractSourceFileName = this.fileNameProvider.getAbstractSourceFileName(this.taskingEnvironment.getName());
    _builder.append(_abstractSourceFileName, "\t");
    _builder.newLineIfNotEmpty();
    {
      Set<TaskDefinition> _taskDefinitions = this.taskingEnvironmentHelper.getTaskDefinitions();
      for(final TaskDefinition taskDefinition : _taskDefinitions) {
        _builder.append("\t");
        String _removeFileSepChars_14 = this.removeFileSepChars(this.gcp.getTaskDefinitionFolder());
        _builder.append(_removeFileSepChars_14, "\t");
        _builder.append("/");
        String _abstractSourceFileName_1 = this.fileNameProvider.getAbstractSourceFileName(taskDefinition.getName());
        _builder.append(_abstractSourceFileName_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    {
      boolean _useLibconfig_1 = this.gcp.useLibconfig();
      if (_useLibconfig_1) {
        String _configurationLoaderClassName = this.gcp.getConfigurationLoaderClassName();
        _builder.append(_configurationLoaderClassName, "\t");
        _builder.append(".cpp");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("target_link_libraries (gen_${PROJECTNAME}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("${PROJECTNAME}");
    _builder.newLine();
    _builder.append("    ");
    {
      boolean _useLibconfig_2 = this.gcp.useLibconfig();
      if (_useLibconfig_2) {
        _builder.append("libconfig_${PROJECTNAME}");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    return _builder.toString();
  }
}
