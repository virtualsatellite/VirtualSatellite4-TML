/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.config;

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IConfigFileTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.config.AbstractConfigFileTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author nepa_ay
 */
@SuppressWarnings("all")
public class ConfigFileTestTemplate extends AbstractConfigFileTemplate implements IConfigFileTemplate {
  private TaskingEnvironment taskingEnvironment;
  
  private IGenerationConfigurationProvider generationConfigurationProvider = GenerationConfigurationProvider.getInstance();
  
  public ConfigFileTestTemplate(final TaskingEnvironment taskingEnvironment) {
    this.taskingEnvironment = taskingEnvironment;
  }
  
  @Override
  public String compileFileContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#--------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("# ");
    String _projectName = this.generationConfigurationProvider.getProjectName();
    _builder.append(_projectName);
    _builder.append(" Configuration File for Testing");
    _builder.newLineIfNotEmpty();
    _builder.append("#--------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    String _printConfiguration = this.printConfiguration(this.taskingEnvironment.getName(), this.taskingEnvironment.getGlobalParameters(), true);
    _builder.append(_printConfiguration);
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        String _printConfiguration_1 = this.printConfiguration(this.getClassName(task.getName()), task.getTypeOf().getParameters(), true);
        _builder.append(_printConfiguration_1);
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
