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
import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SConscriptTestDirTemplate extends AbstractBuildScriptTemplate {
  protected IGenerationConfigurationProvider generationConfigurationProvider = GenerationConfigurationProvider.getInstance();
  
  protected ArrayList<String> testSourceFiles;
  
  public SConscriptTestDirTemplate(final ArrayList<String> testSourceFiles) {
    this.testSourceFiles = testSourceFiles;
  }
  
  @Override
  public String compileScript() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/usr/bin/env python");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import os, errno");
    _builder.newLine();
    _builder.append("import shutil");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("Import(\'envGlobal\')");
    _builder.newLine();
    _builder.append("testEnv = envGlobal.Clone()");
    _builder.newLine();
    {
      boolean _useLibconfig = this.generationConfigurationProvider.useLibconfig();
      if (_useLibconfig) {
        _builder.append("testEnv[\'CCFLAGS\'] = [\'-g\', \'-pedantic\', \'-Wall\', \'-fprofile-arcs\', \'-ftest-coverage\', \'-std=c++11\', \'-lgcov\', \'-rdynamic\']\t");
        _builder.newLine();
        _builder.append("try:");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("os.makedirs(envGlobal[\'BINPATH\'])");
        _builder.newLine();
        _builder.append("except OSError as e:");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if e.errno != errno.EEXIST:");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("raise");
        _builder.newLine();
        _builder.newLine();
        _builder.append("# Copy ");
        String _testConfigFilename = this.generationConfigurationProvider.getTestConfigFilename();
        _builder.append(_testConfigFilename);
        _builder.append(" to bin directory -------------------------------------------------------------------------");
        _builder.newLineIfNotEmpty();
        _builder.append("shutil.copy(os.path.join(envGlobal[\'TESTPATH\'], \'");
        String _testConfigFilename_1 = this.generationConfigurationProvider.getTestConfigFilename();
        _builder.append(_testConfigFilename_1);
        _builder.append("\'), os.path.join(envGlobal[\'BINPATH\'], \'");
        String _testConfigFilename_2 = this.generationConfigurationProvider.getTestConfigFilename();
        _builder.append(_testConfigFilename_2);
        _builder.append("\'))");
        _builder.newLineIfNotEmpty();
        _builder.append("#-------------------------------------------------------------------------------------------------------------------------");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("# Compile test files -----------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("testEnv.Append(CPPPATH=[envGlobal[\'TESTPATH\']])");
    _builder.newLine();
    _builder.append("testEnv.Append(CPPPATH=[os.path.join(testEnv[\'TASKINGPATH\'], \'contrib\')]) # Include gtest header file");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("testEnv.Append(LIBS=[\'gtest\', \'tasking\', \'pthread\', \'");
    String _projectName = this.generationConfigurationProvider.getProjectName();
    _builder.append(_projectName);
    _builder.append("\', ");
    {
      boolean _useLibconfig_1 = this.generationConfigurationProvider.useLibconfig();
      if (_useLibconfig_1) {
        _builder.append("\'libConfig\'");
      }
    }
    _builder.append("])");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("testfiles = []");
    _builder.newLine();
    {
      final Function1<String, Boolean> _function = (String f) -> {
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(f);
        return Boolean.valueOf((!_isNullOrEmpty));
      };
      Iterable<String> _filter = IterableExtensions.<String>filter(this.testSourceFiles, _function);
      for(final String filename : _filter) {
        _builder.append("testfiles.append(os.path.join(envGlobal[\'TESTPATH\'], \'");
        _builder.append(filename);
        _builder.append("\'))");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("program = testEnv.Program(\'test");
    String _projectName_1 = this.generationConfigurationProvider.getProjectName();
    _builder.append(_projectName_1);
    _builder.append("\', testfiles)");
    _builder.newLineIfNotEmpty();
    _builder.append("installTest = envGlobal.Install(envGlobal[\'BINPATH\'], program)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("envGlobal.Alias(\'test\', installTest)");
    _builder.newLine();
    _builder.append("envGlobal.Alias(\'install\', installTest)");
    _builder.newLine();
    _builder.append("#-------------------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    return _builder.toString();
  }
}
