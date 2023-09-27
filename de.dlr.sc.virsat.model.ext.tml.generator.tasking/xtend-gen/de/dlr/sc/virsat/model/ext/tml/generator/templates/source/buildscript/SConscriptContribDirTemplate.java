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
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.AbstractBuildScriptTemplate;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SConscriptContribDirTemplate extends AbstractBuildScriptTemplate {
  protected IGenerationConfigurationProvider generationConfigurationProvider = GenerationConfigurationProvider.getInstance();
  
  public SConscriptContribDirTemplate() {
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
    _builder.append("envGlobal[\'CONTRIBPATH\'] = os.path.abspath(\'.\')");
    _builder.newLine();
    _builder.append("if \'TASKINGPATH\' not in envGlobal:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("envGlobal[\'TASKINGPATH\'] = os.path.join(envGlobal[\'CONTRIBPATH\'], \'Tasking\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("# Compile Tasking framework files -------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("envGlobal.SConscript([os.path.join(envGlobal[\'TASKINGPATH\'], \'SConscript\')], exports = \'envGlobal\')");
    _builder.newLine();
    _builder.append("#----------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _useLibconfig = this.generationConfigurationProvider.useLibconfig();
      if (_useLibconfig) {
        _builder.append("if \'LIBCONFIGPATH\' not in envGlobal:");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("envGlobal[\'LIBCONFIGPATH\'] = os.path.join(envGlobal[\'CONTRIBPATH\'], \'");
        String _libconfigFolder = this.generationConfigurationProvider.getLibconfigFolder();
        _builder.append(_libconfigFolder, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("env = envGlobal.Clone()");
        _builder.newLine();
        _builder.append("env[\'CFLAGS\'] = [\'-c\']");
        _builder.newLine();
        _builder.append("env[\'CCFLAGS\'] = [\'-g\', \'-pedantic\', \'-Wall\', \'-fprofile-arcs\', \'-ftest-coverage\', \'-std=c++11\', \'-lgcov\', \'-rdynamic\']");
        _builder.newLine();
        _builder.append("env[\'CPPPATH\'] = [env[\'LIBCONFIGPATH\'],]");
        _builder.newLine();
        _builder.newLine();
        _builder.append("# Compile LibConfig files ---------------------------------------------------------------------------------");
        _builder.newLine();
        _builder.append("configFiles = []");
        _builder.newLine();
        _builder.append("configFiles.append(Glob(os.path.join(env[\'LIBCONFIGPATH\'], \'*.c++\')))");
        _builder.newLine();
        _builder.append("configFiles.append(Glob(os.path.join(env[\'LIBCONFIGPATH\'], \'*.c\')))");
        _builder.newLine();
        _builder.newLine();
        _builder.append("libConfigLib = env.StaticLibrary(\'libConfig\', configFiles)    ");
        _builder.newLine();
        _builder.append("installLibConfig = env.Install(env[\'LIBPATH\'], libConfigLib)");
        _builder.newLine();
        _builder.append("#----------------------------------------------------------------------------------------------------------");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
