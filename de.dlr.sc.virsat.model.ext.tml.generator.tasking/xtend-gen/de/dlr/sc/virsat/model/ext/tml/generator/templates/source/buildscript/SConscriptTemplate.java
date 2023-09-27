/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
public class SConscriptTemplate extends AbstractBuildScriptTemplate {
  protected IGenerationConfigurationProvider generationConfigurationProvider = GenerationConfigurationProvider.getInstance();
  
  public SConscriptTemplate() {
  }
  
  @Override
  public String compileScript() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/usr/bin/env python");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import os");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Import(\'envGlobal\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if \'CONTRIBPATH\' not in envGlobal:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("envGlobal[\'CONTRIBPATH\'] = os.path.join(envGlobal[\'ROOTPATH\'], \'");
    String _contribFolder = this.generationConfigurationProvider.getContribFolder();
    _builder.append(_contribFolder, "\t");
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("if \'TASKINGPATH\' not in envGlobal:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("envGlobal[\'TASKINGPATH\'] = os.path.join(envGlobal[\'CONTRIBPATH\'], \'Tasking\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("envGlobal[\'SRCPATH\'] = os.path.join(envGlobal[\'ROOTPATH\'], \'");
    String _srcPath = this.generationConfigurationProvider.getSrcPath();
    _builder.append(_srcPath);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("envGlobal[\'SRCGENPATH\'] = os.path.join(envGlobal[\'ROOTPATH\'], \'");
    String _srcGenPath = this.generationConfigurationProvider.getSrcGenPath();
    _builder.append(_srcGenPath);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("envGlobal[\'TESTPATH\'] = os.path.join(envGlobal[\'SRCGENPATH\'], \'");
    String _testPath = this.generationConfigurationProvider.getTestPath();
    _builder.append(_testPath);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Define dependencies -------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("# Add subdirectories");
    _builder.newLine();
    _builder.append("envGlobal.SConscript([os.path.join(envGlobal[\'CONTRIBPATH\'], \'SConscript\')], exports = \'envGlobal\')");
    _builder.newLine();
    _builder.append("#----------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Compile source files ------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("envGlobal.Append(CPPPATH=[envGlobal[\'SRCPATH\']])");
    _builder.newLine();
    _builder.append("envGlobal.Append(CPPPATH=[os.path.join(envGlobal[\'SRCPATH\'], \'");
    String _typeDefinitionFolder = this.generationConfigurationProvider.getTypeDefinitionFolder();
    _builder.append(_typeDefinitionFolder);
    _builder.append("\')])");
    _builder.newLineIfNotEmpty();
    _builder.append("envGlobal.Append(CPPPATH=[os.path.join(envGlobal[\'SRCPATH\'], \'");
    String _channelDefinitionFolder = this.generationConfigurationProvider.getChannelDefinitionFolder();
    _builder.append(_channelDefinitionFolder);
    _builder.append("\')])");
    _builder.newLineIfNotEmpty();
    _builder.append("envGlobal.Append(CPPPATH=[os.path.join(envGlobal[\'SRCPATH\'], \'");
    String _taskDefinitionFolder = this.generationConfigurationProvider.getTaskDefinitionFolder();
    _builder.append(_taskDefinitionFolder);
    _builder.append("\')])");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("envGlobal.Append(CPPPATH=[envGlobal[\'SRCGENPATH\']])");
    _builder.newLine();
    _builder.append("envGlobal.Append(CPPPATH=[os.path.join(envGlobal[\'SRCGENPATH\'], \'");
    String _typeDefinitionFolder_1 = this.generationConfigurationProvider.getTypeDefinitionFolder();
    _builder.append(_typeDefinitionFolder_1);
    _builder.append("\')])");
    _builder.newLineIfNotEmpty();
    _builder.append("envGlobal.Append(CPPPATH=[os.path.join(envGlobal[\'SRCGENPATH\'], \'");
    String _channelDefinitionFolder_1 = this.generationConfigurationProvider.getChannelDefinitionFolder();
    _builder.append(_channelDefinitionFolder_1);
    _builder.append("\')])");
    _builder.newLineIfNotEmpty();
    _builder.append("envGlobal.Append(CPPPATH=[os.path.join(envGlobal[\'SRCGENPATH\'], \'");
    String _taskDefinitionFolder_1 = this.generationConfigurationProvider.getTaskDefinitionFolder();
    _builder.append(_taskDefinitionFolder_1);
    _builder.append("\')])");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("sourcefiles = []");
    _builder.newLine();
    _builder.append("sourcefiles.append(Glob(os.path.join(envGlobal[\'SRCPATH\'], \'*.c*\')))");
    _builder.newLine();
    _builder.append("sourcefiles.append(Glob(os.path.join(envGlobal[\'SRCPATH\'], \'");
    String _taskDefinitionFolder_2 = this.generationConfigurationProvider.getTaskDefinitionFolder();
    _builder.append(_taskDefinitionFolder_2);
    _builder.append("\', \'*.c*\')))");
    _builder.newLineIfNotEmpty();
    _builder.append("sourcefiles.append(Glob(os.path.join(envGlobal[\'SRCGENPATH\'], \'*.c*\')))");
    _builder.newLine();
    _builder.append("sourcefiles.append(Glob(os.path.join(envGlobal[\'SRCGENPATH\'], \'");
    String _taskDefinitionFolder_3 = this.generationConfigurationProvider.getTaskDefinitionFolder();
    _builder.append(_taskDefinitionFolder_3);
    _builder.append("\', \'*.c*\')))");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("library = envGlobal.StaticLibrary(target = \'");
    String _projectName = this.generationConfigurationProvider.getProjectName();
    _builder.append(_projectName);
    _builder.append("\', source = sourcefiles)");
    _builder.newLineIfNotEmpty();
    _builder.append("install_lib = envGlobal.Install(envGlobal[\'LIBPATH\'], library)");
    _builder.newLine();
    _builder.append("envGlobal.Alias(\'install\', install_lib)");
    _builder.newLine();
    _builder.append("#----------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Compile test files --------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("envGlobal.SConscript([os.path.join(envGlobal[\'TESTPATH\'], \'SConscript\')], exports = \'envGlobal\')");
    _builder.newLine();
    _builder.append("#----------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Finalize aliases ----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("envGlobal.Alias(\'all\', \'install\')");
    _builder.newLine();
    _builder.append("envGlobal.Default([\'all\'])");
    _builder.newLine();
    _builder.append("#----------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    return _builder.toString();
  }
}
