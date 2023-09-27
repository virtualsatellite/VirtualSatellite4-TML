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

import de.dlr.sc.virsat.model.ext.tml.generator.IFileNameProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.CppFileNameProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.AbstractBuildScriptTemplate;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SConstructTemplate extends AbstractBuildScriptTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected IFileNameProvider fileNameProvider;
  
  public SConstructTemplate() {
    CppFileNameProvider _cppFileNameProvider = new CppFileNameProvider();
    this.fileNameProvider = _cppFileNameProvider;
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
    _builder.append("## Define project paths -------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("root_path = os.path.abspath(\'.\')");
    _builder.newLine();
    _builder.append("build_path_prefix = root_path");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Set paths -------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("contrib_path = os.path.join(root_path, \'");
    String _contribFolder = this.gcp.getContribFolder();
    _builder.append(_contribFolder);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("tasking_path = os.path.join(contrib_path, \'Tasking\')");
    _builder.newLine();
    _builder.append("tool_path = os.path.join(tasking_path, \'conf/scons/site_tools\')");
    _builder.newLine();
    _builder.append("build_path = os.path.join(build_path_prefix, \'");
    String _buildGenPath = this.gcp.getBuildGenPath();
    _builder.append(_buildGenPath);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("#------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("## Define build options -------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("AddOption(");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'--dbg\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action  = \'store_true\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("help    = \'Debug build. Combinable with the --tc option\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("default = False)");
    _builder.newLine();
    _builder.append("#------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Check if scons build tools are available ------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("if not os.listdir(tool_path):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("print(\'scons: \\033[1;31m\' + \'Aborting build: \' + \'\\033[0m\' + \'Tools submodule not available.\')");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("quit(1)");
    _builder.newLine();
    _builder.append("#------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("# All environment settings are collected in env_options -----------------------------------------------------");
    _builder.newLine();
    _builder.append("env_options = {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'toolpath\'          : [tool_path],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'tools\'             : [\'default\',");
    _builder.newLine();
    _builder.append("                           ");
    _builder.append("\'utils_buildformat\',");
    _builder.newLine();
    _builder.append("                           ");
    _builder.append("\'utils_common\',");
    _builder.newLine();
    _builder.append("                           ");
    _builder.append("\'utils_git_submodules\',");
    _builder.newLine();
    _builder.append("                           ");
    _builder.append("\'compiler_hosted_gcc\', ],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'CXXFLAGS_language\' : [\'-std=c++11\',],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'ENV\'               : os.environ,");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Override the defaults. If debug build, add GDB info. Else optimize binary ---------------------------------");
    _builder.newLine();
    _builder.append("if GetOption(\'dbg\'):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("variant_dir = \'debug\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("env_options[\'CCFLAGS_optimize\'] = [\'-O0\', \'-ffunction-sections\', \'-fdata-sections\']");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("env_options[\'CCFLAGS_debug\'] = [\'-g\']");
    _builder.newLine();
    _builder.append("else:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("variant_dir = \'release\'");
    _builder.newLine();
    _builder.append("#------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Create the environment with the given configuration -------------------------------------------------------");
    _builder.newLine();
    _builder.append("envGlobal = Environment(**env_options)");
    _builder.newLine();
    _builder.append("envGlobal.Tool(\'settings_buildpath\')");
    _builder.newLine();
    _builder.append("#------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Set environment construction variables --------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("envGlobal[\'BASEPATH\'] = root_path");
    _builder.newLine();
    _builder.append("envGlobal[\'ROOTPATH\'] = root_path");
    _builder.newLine();
    _builder.append("envGlobal[\'SYSTEMPATH\'] = root_path");
    _builder.newLine();
    _builder.append("envGlobal[\'BUILDPATH\'] = os.path.join(build_path, variant_dir)");
    _builder.newLine();
    _builder.append("envGlobal[\'BINPATH\'] = os.path.join(envGlobal[\'BUILDPATH\'], \'bin\')");
    _builder.newLine();
    _builder.append("envGlobal[\'LIBINSTALLPATH\'] = os.path.join(envGlobal[\'BUILDPATH\'], \'lib\')");
    _builder.newLine();
    _builder.append("envGlobal[\'LIBPATH\'] = envGlobal[\'LIBINSTALLPATH\']");
    _builder.newLine();
    _builder.append("envGlobal[\'CONTRIBPATH\'] = contrib_path");
    _builder.newLine();
    _builder.append("envGlobal[\'TASKINGPATH\'] = tasking_path");
    _builder.newLine();
    _builder.append("#------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Call the source SConscripts -------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("envGlobal.SConscript(\'SConscript\', exports = \'envGlobal\', duplicate = 0)");
    _builder.newLine();
    _builder.append("#------------------------------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
