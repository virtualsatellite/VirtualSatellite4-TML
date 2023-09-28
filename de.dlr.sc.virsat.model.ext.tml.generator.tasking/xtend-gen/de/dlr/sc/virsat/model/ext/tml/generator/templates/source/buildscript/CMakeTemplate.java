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
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CMakeTemplate extends AbstractBuildScriptTemplate {
  protected TaskingEnvironment taskingEnvironment;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected IFileNameProvider fileNameProvider = new CppFileNameProvider();
  
  public CMakeTemplate(final TaskingEnvironment taskingEnvironment) {
    this.taskingEnvironment = taskingEnvironment;
  }
  
  @Override
  public String compileScript() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Automatically generated. Do not edit!");
    _builder.newLine();
    _builder.append("# Template: CMakeListsTemplate.xtend");
    _builder.newLine();
    _builder.append("cmake_minimum_required(VERSION 2.8)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("set(PROJECTNAME \"");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("project(\"");
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1);
    _builder.append("\" C CXX)");
    _builder.newLineIfNotEmpty();
    _builder.append("message(STATUS \"### ${PROJECT_NAME} ###\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("set(CMAKE_BUILD_TYPE Debug CACHE STRING \"Build Type: Debug or Flight\")");
    _builder.newLine();
    _builder.append("# Debugging information enabled");
    _builder.newLine();
    _builder.append("set(CMAKE_CXX_FLAGS \"${CMAKE_CXX_FLAGS} -g\")");
    _builder.newLine();
    _builder.append("set(CMAKE_CXX_FLAGS \"${CMAKE_CXX_FLAGS} -pedantic -Wall\")");
    _builder.newLine();
    _builder.append("# Coverage analysis");
    _builder.newLine();
    _builder.append("set(CMAKE_CXX_FLAGS \"${CMAKE_CXX_FLAGS} -fprofile-arcs -ftest-coverage\")");
    _builder.newLine();
    _builder.append("# Mutex support ISO C++ 2011");
    _builder.newLine();
    _builder.append("set(CMAKE_CXX_FLAGS \"${CMAKE_CXX_FLAGS} -std=c++11\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("set(CMAKE_EXE_LINKER_FLAGS \"${CMAKE_EXE_LINKER_FLAGS} -fprofile-arcs -ftest-coverage -lgcov\")");
    _builder.newLine();
    _builder.append("\t\t\t\t    ");
    _builder.newLine();
    _builder.append("find_package(Threads REQUIRED)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("include_directories(");
    _builder.newLine();
    _builder.append("\t");
    String _removeFileSepChars = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars, "\t");
    _builder.append("/Tasking/include");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_1 = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars_1, "\t");
    _builder.append("/Tasking/include/arch/linux");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_2 = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars_2, "\t");
    _builder.append("/Tasking/channels/include/channels");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        String _removeFileSepChars_3 = this.removeFileSepChars(this.gcp.getContribFolder());
        _builder.append(_removeFileSepChars_3, "\t");
        _builder.append("/");
        String _libconfigFolder = this.gcp.getLibconfigFolder();
        _builder.append(_libconfigFolder, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_4 = this.removeFileSepChars(this.gcp.getSrcPath());
    _builder.append(_removeFileSepChars_4, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_5 = this.removeFileSepChars(this.gcp.getSrcPath());
    _builder.append(_removeFileSepChars_5, "\t");
    _builder.append("/");
    String _removeFileSepChars_6 = this.removeFileSepChars(this.gcp.getTaskDefinitionFolder());
    _builder.append(_removeFileSepChars_6, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_7 = this.removeFileSepChars(this.gcp.getSrcPath());
    _builder.append(_removeFileSepChars_7, "\t");
    _builder.append("/");
    String _removeFileSepChars_8 = this.removeFileSepChars(this.gcp.getTypeDefinitionFolder());
    _builder.append(_removeFileSepChars_8, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_9 = this.removeFileSepChars(this.gcp.getSrcPath());
    _builder.append(_removeFileSepChars_9, "\t");
    _builder.append("/");
    String _removeFileSepChars_10 = this.removeFileSepChars(this.gcp.getChannelDefinitionFolder());
    _builder.append(_removeFileSepChars_10, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_11 = this.removeFileSepChars(this.gcp.getSrcGenPath());
    _builder.append(_removeFileSepChars_11, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_12 = this.removeFileSepChars(this.gcp.getSrcGenPath());
    _builder.append(_removeFileSepChars_12, "\t");
    _builder.append("/");
    String _removeFileSepChars_13 = this.removeFileSepChars(this.gcp.getTaskDefinitionFolder());
    _builder.append(_removeFileSepChars_13, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_14 = this.removeFileSepChars(this.gcp.getSrcGenPath());
    _builder.append(_removeFileSepChars_14, "\t");
    _builder.append("/");
    String _removeFileSepChars_15 = this.removeFileSepChars(this.gcp.getTypeDefinitionFolder());
    _builder.append(_removeFileSepChars_15, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _removeFileSepChars_16 = this.removeFileSepChars(this.gcp.getSrcGenPath());
    _builder.append(_removeFileSepChars_16, "\t");
    _builder.append("/");
    String _removeFileSepChars_17 = this.removeFileSepChars(this.gcp.getChannelDefinitionFolder());
    _builder.append(_removeFileSepChars_17, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("add_subdirectory(");
    String _removeFileSepChars_18 = this.removeFileSepChars(this.gcp.getContribFolder());
    _builder.append(_removeFileSepChars_18);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("add_subdirectory(src-gen)");
    _builder.newLine();
    _builder.append("add_subdirectory(src)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("# build test");
    _builder.newLine();
    _builder.append("enable_testing()");
    _builder.newLine();
    _builder.append("add_subdirectory(src-gen/test)");
    _builder.newLine();
    _builder.append("add_dependencies(test_${PROJECT_NAME} ${PROJECT_NAME})");
    _builder.newLine();
    return _builder.toString();
  }
}
