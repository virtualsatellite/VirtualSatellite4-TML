/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehaviorParameter;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.TMLGenerator;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.AbstractTaskingTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TimeEvent;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TimeEventImpl;
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;
import java.util.function.Consumer;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CppEnvironmentTemplate extends AbstractTaskingTemplate {
  protected TaskingEnvironment taskingEnvironment;
  
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.getInstance();
  
  public CppEnvironmentTemplate(final TaskingEnvironment taskingEnvironment) {
    this.taskingEnvironment = taskingEnvironment;
    boolean _isInitilaized = this.taskingEnvironmentHelper.isInitilaized();
    boolean _not = (!_isInitilaized);
    if (_not) {
      this.taskingEnvironmentHelper.init(taskingEnvironment);
    }
    this.initIncludes();
  }
  
  protected void initIncludes() {
    final Consumer<TaskInstance> _function = (TaskInstance task) -> {
      String _elementName = this.getElementName(task.getTypeOf());
      String _plus = ("\"" + _elementName);
      String _plus_1 = (_plus + ".h\"");
      this.addIncludes(_plus_1);
    };
    this.taskingEnvironment.getTasks().forEach(_function);
    final Consumer<DataType> _function_1 = (DataType dt) -> {
      String _elementName = this.getElementName(dt);
      String _plus = ("\"" + _elementName);
      String _plus_1 = (_plus + ".h\"");
      this.addIncludes(_plus_1);
    };
    this.taskingEnvironmentHelper.getDataTypes().forEach(_function_1);
    final Consumer<Enumeration> _function_2 = (Enumeration dt) -> {
      String _elementName = this.getElementName(dt);
      String _plus = ("\"" + _elementName);
      String _plus_1 = (_plus + ".h\"");
      this.addIncludes(_plus_1);
    };
    this.taskingEnvironmentHelper.getEnumerations().forEach(_function_2);
    final Consumer<ChannelBehaviorDefinition> _function_3 = (ChannelBehaviorDefinition ch) -> {
      String _elementName = this.getElementName(ch);
      String _plus = ("\"" + _elementName);
      String _plus_1 = (_plus + ".h\"");
      this.addIncludes(_plus_1);
    };
    this.taskingEnvironmentHelper.getChannelBehaviorDefinitions().forEach(_function_3);
  }
  
  protected String getTaskInputName(final String taskName, final String inputName) {
    return ((taskName + "Input_") + inputName);
  }
  
  protected String getTaskParameterName(final String taskName) {
    String _className = this.getClassName(taskName);
    return ("parameters" + _className);
  }
  
  protected int getChannelSize(final Channel channel) {
    final EList<BehaviorParameter> behaviorParameters = channel.getChannelBehavior().getParameterInstances();
    final boolean hasSize = this.channelHasSize(channel.getChannelBehavior().getTypeOf());
    if (hasSize) {
      final Function1<BehaviorParameter, Boolean> _function = (BehaviorParameter p) -> {
        int _compareToIgnoreCase = p.getTypeOf().getName().compareToIgnoreCase("size");
        return Boolean.valueOf((_compareToIgnoreCase == 0));
      };
      final BehaviorParameter sizeParameter = IterableExtensions.<BehaviorParameter>findFirst(behaviorParameters, _function);
      if ((sizeParameter != null)) {
        String _value = sizeParameter.getValue();
        boolean _tripleEquals = (_value == null);
        if (_tripleEquals) {
          return this.getDefaultChannelSize(channel);
        } else {
          return Integer.parseInt(sizeParameter.getValue());
        }
      } else {
        return this.getDefaultChannelSize(channel);
      }
    }
    return (-1);
  }
  
  protected int getDefaultChannelSize(final Channel channel) {
    int defaultSize = 10;
    final Function1<BehavioralParameterDefinition, Boolean> _function = (BehavioralParameterDefinition p) -> {
      int _compareToIgnoreCase = p.getName().compareToIgnoreCase("size");
      return Boolean.valueOf((_compareToIgnoreCase == 0));
    };
    final BehavioralParameterDefinition sizeParameterDef = IterableExtensions.<BehavioralParameterDefinition>findFirst(channel.getChannelBehavior().getTypeOf().getParameters(), _function);
    String _value = sizeParameterDef.getValue();
    boolean _tripleEquals = (_value == null);
    if (_tripleEquals) {
      String _name = channel.getName();
      String _plus = ("CppEnvironmentTemplate: Channel parameter " + _name);
      String _plus_1 = (_plus + 
        " has no specified value or default value");
      Status status = new Status(Status.ERROR, TMLGenerator.GENERATION_EXTENSION_ID, _plus_1);
      StatusManager _manager = StatusManager.getManager();
      StatusAdapter _statusAdapter = new StatusAdapter(status);
      _manager.handle(_statusAdapter, (StatusManager.LOG | StatusManager.SHOW));
    }
    defaultSize = Integer.parseInt(sizeParameterDef.getValue());
    String _name_1 = channel.getName();
    String _plus_2 = ("Size parameter for channel (" + _name_1);
    String _plus_3 = (_plus_2 + ") not defined in model.");
    System.err.println(_plus_3);
    String _string = Integer.valueOf(defaultSize).toString();
    String _plus_4 = ("Continuing with default value: " + _string);
    System.err.println(_plus_4);
    return defaultSize;
  }
  
  protected String getTaskConstructorArgs(final TaskInstance task) {
    String str = "";
    String _taskParameterName = this.getTaskParameterName(task.getName());
    String _plus = ((str + "&") + _taskParameterName);
    str = _plus;
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(task.getOutputs());
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _str = str;
      str = (_str + ",");
      EList<TaskOutput> _outputs = task.getOutputs();
      for (final TaskOutput output : _outputs) {
        EList<Channel> _channels = output.getChannels();
        for (final Channel channel : _channels) {
          String _name = channel.getName();
          String _plus_1 = ((str + "&") + _name);
          String _plus_2 = (_plus_1 + ",");
          str = _plus_2;
        }
      }
    }
    boolean _endsWith = str.endsWith(",");
    if (_endsWith) {
      int _length = str.length();
      int _minus = (_length - 1);
      str = str.substring(0, _minus);
    }
    return str;
  }
  
  public CharSequence declareChannels() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Channel> _channels = this.taskingEnvironment.getChannels();
      for(final Channel channel : _channels) {
        final int ch_size = this.getChannelSize(channel);
        _builder.newLineIfNotEmpty();
        {
          if ((ch_size > 0)) {
            String _elementName = this.getElementName(channel.getChannelBehavior().getTypeOf());
            _builder.append(_elementName);
            _builder.append("<");
            String _elementName_1 = this.getElementName(channel.getDataType());
            _builder.append(_elementName_1);
            _builder.append(", ");
            _builder.append(ch_size);
            _builder.append("> ");
            String _name = channel.getName();
            _builder.append(_name);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            String _elementName_2 = this.getElementName(channel.getChannelBehavior().getTypeOf());
            _builder.append(_elementName_2);
            _builder.append("<");
            String _elementName_3 = this.getElementName(channel.getDataType());
            _builder.append(_elementName_3);
            _builder.append("> ");
            String _name_1 = channel.getName();
            _builder.append(_name_1);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence declareTaskEvents() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TimeEvent> _timeEvents = this.taskingEnvironment.getTimeEvents();
      for(final TimeEvent trigger : _timeEvents) {
        _builder.append("Tasking::TaskEvent ");
        String _name = trigger.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence declareTasks() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        String _elementName = this.getElementName(task.getTypeOf());
        _builder.append(_elementName);
        _builder.append(" ");
        String _name = task.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence declareTaskParameters() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        String _abstractName = this.getAbstractName(task.getTypeOf().getName());
        _builder.append(_abstractName);
        _builder.append("::Parameters ");
        String _taskParameterName = this.getTaskParameterName(task.getName());
        _builder.append(_taskParameterName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence declareTaskInputs() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        {
          EList<TaskInput> _inputs = task.getInputs();
          for(final TaskInput input : _inputs) {
            _builder.append("Tasking::TaskInput ");
            String _taskInputName = this.getTaskInputName(task.getName(), input.getName());
            _builder.append(_taskInputName);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence assignTaskInputs() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        {
          EList<TaskInput> _inputs = task.getInputs();
          for(final TaskInput input : _inputs) {
            String _taskInputName = this.getTaskInputName(task.getName(), input.getName());
            _builder.append(_taskInputName);
            _builder.append("(");
            int _activationThreshold = input.getActivationThreshold();
            _builder.append(_activationThreshold);
            _builder.append(", ");
            boolean _isIsFinal = input.isIsFinal();
            _builder.append(_isIsFinal);
            _builder.append("),");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public String getChannelName(final String inputName) {
    EList<Channel> _channels = this.taskingEnvironment.getChannels();
    for (final Channel channel : _channels) {
      EList<TaskInput> _inputs = channel.getInputs();
      for (final TaskInput input : _inputs) {
        boolean _equals = inputName.equals(input.getName());
        if (_equals) {
          return channel.getName();
        }
      }
    }
    return "";
  }
  
  public String getTimeEventName(final String inputName) {
    EList<TimeEvent> _timeEvents = this.taskingEnvironment.getTimeEvents();
    for (final TimeEvent timeevent : _timeEvents) {
      EList<TaskInput> _inputs = timeevent.getInputs();
      for (final TaskInput input : _inputs) {
        boolean _equals = inputName.equals(input.getName());
        if (_equals) {
          return timeevent.getName();
        }
      }
    }
    return "";
  }
  
  public CharSequence associateChannelsToTaskInputs() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        {
          EList<TaskInput> _inputs = task.getInputs();
          for(final TaskInput input : _inputs) {
            {
              IEventSource _trigger = input.getTrigger();
              if ((_trigger instanceof TimeEventImpl)) {
                String _taskInputName = this.getTaskInputName(task.getName(), input.getName());
                _builder.append(_taskInputName);
                _builder.append(".associate(&");
                String _timeEventName = this.getTimeEventName(input.getName());
                _builder.append(_timeEventName);
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              } else {
                String _taskInputName_1 = this.getTaskInputName(task.getName(), input.getName());
                _builder.append(_taskInputName_1);
                _builder.append(".associate(&");
                String _channelName = this.getChannelName(input.getName());
                _builder.append(_channelName);
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence addTaskInputsIntoTask() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        {
          EList<TaskInput> _inputs = task.getInputs();
          for(final TaskInput input : _inputs) {
            String _name = task.getName();
            _builder.append(_name);
            _builder.append(".add(");
            String _abstractName = this.getAbstractName(task.getTypeOf().getName());
            _builder.append(_abstractName);
            _builder.append("::");
            String _inputKeyName = this.getInputKeyName(input.getTypeOf().getName());
            _builder.append(_inputKeyName);
            _builder.append(", &");
            String _taskInputName = this.getTaskInputName(task.getName(), input.getName());
            _builder.append(_taskInputName);
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence initChannelInstances() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Channel> _channels = this.taskingEnvironment.getChannels();
      for(final Channel channel : _channels) {
        String _name = channel.getName();
        _builder.append(_name);
        _builder.append("(");
        {
          EList<BehaviorParameter> _parameterInstances = channel.getChannelBehavior().getParameterInstances();
          boolean _hasElements = false;
          for(final BehaviorParameter param : _parameterInstances) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _value = param.getValue();
            _builder.append(_value);
          }
        }
        _builder.append("),");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  public String compileAbstractHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _generationAbstractHeaderDescription = this.getGenerationAbstractHeaderDescription("CppEnvironmentTemplate.xtend");
    _builder.append(_generationAbstractHeaderDescription, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.getAbstractName(this.taskingEnvironment.getName()));
    _builder.append(_constantsName, "\t");
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.getAbstractName(this.taskingEnvironment.getName()));
    _builder.append(_constantsName_1, "\t");
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include <stdlib.h>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include <unistd.h>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include <time.h>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"tasking.h\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"task.h\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"taskEvent.h\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"taskInput.h\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _includes = this.getIncludes();
    _builder.append(_includes, "\t");
    _builder.newLineIfNotEmpty();
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        _builder.append("\t");
        _builder.append("#include \"");
        String _configurationLoaderClassName = this.gcp.getConfigurationLoaderClassName();
        _builder.append(_configurationLoaderClassName, "\t");
        _builder.append(".h\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("using namespace DataTypes;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("class ");
    String _abstractName = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName, "\t  ");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    _builder.append("protected:");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("//The Modules");
    _builder.newLine();
    _builder.append("\t    ");
    CharSequence _declareTasks = this.declareTasks();
    _builder.append(_declareTasks, "\t    ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("//The Channels");
    _builder.newLine();
    _builder.append("\t    ");
    CharSequence _declareChannels = this.declareChannels();
    _builder.append(_declareChannels, "\t    ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//The TaskEvents");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _declareTaskEvents = this.declareTaskEvents();
    _builder.append(_declareTaskEvents, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t   ");
    _builder.newLine();
    _builder.append("\t\t   ");
    _builder.append("//The TaskInputs");
    _builder.newLine();
    _builder.append("\t\t   ");
    CharSequence _declareTaskInputs = this.declareTaskInputs();
    _builder.append(_declareTaskInputs, "\t\t   ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("//The Task Parameters");
    _builder.newLine();
    _builder.append("\t    ");
    CharSequence _declareTaskParameters = this.declareTaskParameters();
    _builder.append(_declareTaskParameters, "\t    ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("//Configure the start configuration in the concrete class");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("virtual void setStartConfiguration()=0;");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("//Intialize Messages");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("virtual void initMessages()=0;");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("//Init software");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("void init");
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1, "\t    ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("//Start Execution");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("void start");
    String _projectName_2 = this.gcp.getProjectName();
    _builder.append(_projectName_2, "\t    ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* Constructor to set initial parameters from s-function");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* The parameters are for the Navigation filter (see ICD)");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param diagQ");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param diagRchi0");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param deltaRchi");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param diagRth");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param R_c2b");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param R_i2m");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param dt");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param simStartTime");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param x0");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* @param p0");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t    ");
    String _abstractName_1 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_1, "\t    ");
    _builder.append("(");
    {
      boolean _useLibconfig_1 = this.gcp.useLibconfig();
      if (_useLibconfig_1) {
        _builder.append("const char * configFile");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("virtual~");
    String _abstractName_2 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_2, "\t    ");
    _builder.append("(void);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("//Telecommand ");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("void tcReset");
    String _projectName_3 = this.gcp.getProjectName();
    _builder.append(_projectName_3, "\t   ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   \t\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("* Called when software is stopped.");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("virtual void terminate(void);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#ifdef PLAY_BACK");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("/// Manager for sleep time");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("// ATON::TimeManager timeManager;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#endif");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("}; /* End of ");
    String _abstractName_3 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_3, "\t  ");
    _builder.append(" */");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}/* namespace ");
    String _projectName_4 = this.gcp.getProjectName();
    _builder.append(_projectName_4, "\t");
    _builder.append(" */");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("#endif /* ");
    String _constantsName_2 = this.getConstantsName(this.getAbstractName(this.taskingEnvironment.getName()));
    _builder.append(_constantsName_2, "\t");
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileAbstractSource() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    String _generationAbstractSourceDescription = this.getGenerationAbstractSourceDescription("CppEnvironmentTemplate.xtend");
    _builder.append(_generationAbstractSourceDescription, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"stdlib.h\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include <sstream>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"");
    String _abstractName = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName, "\t");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#ifdef TIMESTOP_TASKING");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"TimeStop.h\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#endif");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#define WAIT_FOR_EXECUTION");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName, "\t");
    _builder.append("::");
    String _abstractName_1 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_1, "\t");
    _builder.append("::");
    String _abstractName_2 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_2, "\t");
    _builder.append("(");
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        _builder.append("const char * configFile");
      }
    }
    _builder.append(") :");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Modules");
    _builder.newLine();
    {
      EList<TaskInstance> _tasks = this.taskingEnvironment.getTasks();
      for(final TaskInstance task : _tasks) {
        _builder.append("\t");
        String _name = task.getName();
        _builder.append(_name, "\t");
        _builder.append("(");
        String _taskConstructorArgs = this.getTaskConstructorArgs(task);
        _builder.append(_taskConstructorArgs, "\t");
        _builder.append("),");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Channels");
    _builder.newLine();
    {
      EList<Channel> _channels = this.taskingEnvironment.getChannels();
      for(final Channel channel : _channels) {
        _builder.append("\t\t");
        String _name_1 = channel.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append("(");
        {
          EList<BehaviorParameter> _parameterInstances = channel.getChannelBehavior().getParameterInstances();
          boolean _hasElements = false;
          for(final BehaviorParameter param : _parameterInstances) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "\t\t");
            }
            String _value = param.getValue();
            _builder.append(_value, "\t\t");
          }
        }
        _builder.append("),");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//TaskEvents");
    _builder.newLine();
    {
      EList<TimeEvent> _timeEvents = this.taskingEnvironment.getTimeEvents();
      for(final TimeEvent trigger : _timeEvents) {
        _builder.append("\t\t");
        String _name_2 = trigger.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("(),");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TaskInputs");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _removeLastChar = this.removeLastChar(this.assignTaskInputs());
    _builder.append(_removeLastChar, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Set timing in TaskEvents");
    _builder.newLine();
    {
      EList<TimeEvent> _timeEvents_1 = this.taskingEnvironment.getTimeEvents();
      for(final TimeEvent trigger_1 : _timeEvents_1) {
        _builder.append("\t\t");
        String _name_3 = trigger_1.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(".setTiming(");
        int _period = trigger_1.getPeriod();
        _builder.append(_period, "\t\t");
        _builder.append(", ");
        int _offset = trigger_1.getOffset();
        _builder.append(_offset, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Associate channels to TaskInputs");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _associateChannelsToTaskInputs = this.associateChannelsToTaskInputs();
    _builder.append(_associateChannelsToTaskInputs, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Add TaskInputs to Tasks");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _addTaskInputsIntoTask = this.addTaskInputsIntoTask();
    _builder.append(_addTaskInputsIntoTask, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      boolean _useLibconfig_1 = this.gcp.useLibconfig();
      if (_useLibconfig_1) {
        _builder.append("\t\t");
        _builder.append("//Load Parameters");
        _builder.newLine();
        _builder.append("\t\t");
        String _className = this.getClassName(this.gcp.getConfigurationLoaderClassName());
        _builder.append(_className, "\t\t");
        _builder.append(" configurationLoader;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("configurationLoader.loadFile(configFile);");
        _builder.newLine();
        {
          EList<TaskInstance> _tasks_1 = this.taskingEnvironment.getTasks();
          for(final TaskInstance task_1 : _tasks_1) {
            _builder.append("\t\t");
            _builder.append("configurationLoader.getParameters(");
            String _taskParameterName = this.getTaskParameterName(task_1.getName());
            _builder.append(_taskParameterName, "\t\t");
            _builder.append(", \"");
            String _className_1 = this.getClassName(task_1.getName());
            _builder.append(_className_1, "\t\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Destructor");
    _builder.newLine();
    _builder.append("\t");
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1, "\t");
    _builder.append("::");
    String _abstractName_3 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_3, "\t");
    _builder.append("::~");
    String _abstractName_4 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_4, "\t");
    _builder.append("(void) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Init Software");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _projectName_2 = this.gcp.getProjectName();
    _builder.append(_projectName_2, "\t");
    _builder.append("::");
    String _abstractName_5 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_5, "\t");
    _builder.append("::init");
    String _projectName_3 = this.gcp.getProjectName();
    _builder.append(_projectName_3, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("std::cout << \"");
    String _projectName_4 = this.gcp.getProjectName();
    _builder.append(_projectName_4, "\t\t");
    _builder.append("::");
    String _abstractName_6 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_6, "\t\t");
    _builder.append("::init\\n\" << std::endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("Tasking::initialize();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Init modules");
    _builder.newLine();
    {
      EList<TaskInstance> _tasks_2 = this.taskingEnvironment.getTasks();
      for(final TaskInstance task_2 : _tasks_2) {
        {
          boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(task_2.getTypeOf().getInputs());
          if (_isNullOrEmpty) {
            _builder.append("\t\t");
            String _name_4 = task_2.getName();
            _builder.append(_name_4, "\t\t");
            _builder.append(".initialize();");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Start Software");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _projectName_5 = this.gcp.getProjectName();
    _builder.append(_projectName_5, "\t");
    _builder.append("::");
    String _abstractName_7 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_7, "\t");
    _builder.append("::start");
    String _projectName_6 = this.gcp.getProjectName();
    _builder.append(_projectName_6, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("Tasking::reset();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Tasking::start();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Start modules..");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Terminate Software");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void ");
    String _projectName_7 = this.gcp.getProjectName();
    _builder.append(_projectName_7, "\t");
    _builder.append("::");
    String _abstractName_8 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_8, "\t");
    _builder.append("::terminate(void){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("std::cout << \"");
    String _projectName_8 = this.gcp.getProjectName();
    _builder.append(_projectName_8, "\t\t");
    _builder.append("::");
    String _abstractName_9 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_9, "\t\t");
    _builder.append("::terminate\\n\" << std::endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Terminate all modules");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Terminate all tasks");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Tasking::terminate();");
    _builder.newLine();
    {
      EList<TaskInstance> _tasks_3 = this.taskingEnvironment.getTasks();
      for(final TaskInstance task_3 : _tasks_3) {
        _builder.append("\t\t");
        String _name_5 = task_3.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append(".terminate();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("#ifdef TIMESTOP_TASKING");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("TimeStop::writeFile();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#endif");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    String _generationHeaderDescription = this.getGenerationHeaderDescription("CppEnvironmentTemplate.xtend");
    _builder.append(_generationHeaderDescription, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.taskingEnvironment.getName());
    _builder.append(_constantsName, "\t");
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.taskingEnvironment.getName());
    _builder.append(_constantsName_1, "\t");
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#include \"");
    String _abstractName = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName, "\t");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName, "\t");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class ");
    String _name = this.taskingEnvironment.getName();
    _builder.append(_name, "\t\t");
    _builder.append(" : public ");
    String _abstractName_1 = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName_1, "\t\t");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("void setStartConfiguration();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("void initMessages();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    String _name_1 = this.taskingEnvironment.getName();
    _builder.append(_name_1, "\t\t\t\t");
    _builder.append("(");
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        _builder.append("const char * configFile");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("virtual ~");
    String _name_2 = this.taskingEnvironment.getName();
    _builder.append(_name_2, "\t\t\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("void configureStep(const double time);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("void start();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("void init();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#endif /* ");
    String _constantsName_2 = this.getConstantsName(this.taskingEnvironment.getName());
    _builder.append(_constantsName_2, "\t");
    _builder.append("_H_ */\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    StringConcatenation _builder = new StringConcatenation();
    String _generationHeaderDescription = this.getGenerationHeaderDescription("CppEnvironmentTemplate.xtend");
    _builder.append(_generationHeaderDescription);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include \"");
    String _name = this.taskingEnvironment.getName();
    _builder.append(_name);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append("::");
    String _name_1 = this.taskingEnvironment.getName();
    _builder.append(_name_1);
    _builder.append("::");
    String _name_2 = this.taskingEnvironment.getName();
    _builder.append(_name_2);
    _builder.append("(");
    {
      boolean _useLibconfig = this.gcp.useLibconfig();
      if (_useLibconfig) {
        _builder.append("const char * configFile");
      }
    }
    _builder.append(") : ");
    String _abstractName = this.getAbstractName(this.taskingEnvironment.getName());
    _builder.append(_abstractName);
    _builder.append("(");
    {
      boolean _useLibconfig_1 = this.gcp.useLibconfig();
      if (_useLibconfig_1) {
        _builder.append("configFile");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("setStartConfiguration();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String _projectName_1 = this.gcp.getProjectName();
    _builder.append(_projectName_1);
    _builder.append("::");
    String _name_3 = this.taskingEnvironment.getName();
    _builder.append(_name_3);
    _builder.append("::~");
    String _name_4 = this.taskingEnvironment.getName();
    _builder.append(_name_4);
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//terminate();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void ");
    String _projectName_2 = this.gcp.getProjectName();
    _builder.append(_projectName_2);
    _builder.append("::");
    String _name_5 = this.taskingEnvironment.getName();
    _builder.append(_name_5);
    _builder.append("::init(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//Prepare scheular for execution");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("init");
    String _projectName_3 = this.gcp.getProjectName();
    _builder.append(_projectName_3, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("initMessages();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Do custom init here (if needed)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void ");
    String _projectName_4 = this.gcp.getProjectName();
    _builder.append(_projectName_4);
    _builder.append("::");
    String _name_6 = this.taskingEnvironment.getName();
    _builder.append(_name_6);
    _builder.append("::start(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//Start schedular");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("start");
    String _projectName_5 = this.gcp.getProjectName();
    _builder.append(_projectName_5, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Do custom start here (if needed)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("void ");
    String _projectName_6 = this.gcp.getProjectName();
    _builder.append(_projectName_6);
    _builder.append("::");
    String _name_7 = this.taskingEnvironment.getName();
    _builder.append(_name_7);
    _builder.append("::setStartConfiguration(void) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void ");
    String _projectName_7 = this.gcp.getProjectName();
    _builder.append(_projectName_7);
    _builder.append("::");
    String _name_8 = this.taskingEnvironment.getName();
    _builder.append(_name_8);
    _builder.append("::initMessages(void) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
