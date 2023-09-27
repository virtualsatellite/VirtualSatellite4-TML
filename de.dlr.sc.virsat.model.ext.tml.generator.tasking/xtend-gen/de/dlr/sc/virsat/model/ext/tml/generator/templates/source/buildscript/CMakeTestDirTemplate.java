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
import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CMakeTestDirTemplate extends AbstractBuildScriptTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected ArrayList<String> testSourceFiles;
  
  public CMakeTestDirTemplate(final ArrayList<String> testSourceFiles) {
    this.testSourceFiles = testSourceFiles;
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
    _builder.append("\t");
    _builder.newLine();
    _builder.append("set(GTEST_PATH ../../");
    String _removeFileSepChars = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars);
    _builder.append("/Tasking/contrib)");
    _builder.newLineIfNotEmpty();
    _builder.append("set(GTEST_SRC ${GTEST_PATH}/gtest/gtest-all.cc)");
    _builder.newLine();
    _builder.append("set(GTEST_MAIN ${GTEST_PATH}/gtest/gtest_main.cc)");
    _builder.newLine();
    _builder.append("include_directories(");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("${GTEST_PATH}");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("add_executable( test_${PROJECT_NAME}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("${GTEST_SRC}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("${GTEST_MAIN}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      final Function1<String, Boolean> _function = (String f) -> {
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(f);
        return Boolean.valueOf((!_isNullOrEmpty));
      };
      Iterable<String> _filter = IterableExtensions.<String>filter(this.testSourceFiles, _function);
      for(final String filename : _filter) {
        _builder.append("\t");
        _builder.append(filename, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("target_link_libraries ( test_${PROJECT_NAME}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("${CMAKE_THREAD_LIBS_INIT}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("${PROJECTNAME}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("tasking");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("tasking-channels");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rt");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("${GTEST_LIBRARY_DEBUG} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("${GTEST_MAIN_LIBRARY_DEBUG}");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("add_test(tests-${PROJECT_NAME} test_${PROJECT_NAME} --gtest_output=xml:${CMAKE_CURRENT_BINARY_DIR}/xunit.xml)");
    _builder.newLine();
    _builder.append("# Adding custom test target \"check\" because it is the only way to show the full output of test errors on console");
    _builder.newLine();
    _builder.append("add_custom_target(check-${PROJECT_NAME} COMMAND ${CMAKE_CTEST_COMMAND} --force-new-ctest-process --output-on-failure)");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        _builder.append("file(COPY ");
        String _testConfigFilename = this.gcp.getTestConfigFilename();
        _builder.append(_testConfigFilename);
        _builder.append(" DESTINATION ${CMAKE_CURRENT_BINARY_DIR})");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
