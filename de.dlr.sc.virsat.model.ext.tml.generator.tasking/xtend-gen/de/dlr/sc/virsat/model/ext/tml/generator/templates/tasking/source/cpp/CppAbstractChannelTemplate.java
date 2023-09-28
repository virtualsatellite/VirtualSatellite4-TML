/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp;

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp.AbstractCppTemplate;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author nepa_ay
 */
@SuppressWarnings("all")
public class CppAbstractChannelTemplate extends AbstractCppTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  public CppAbstractChannelTemplate() {
  }
  
  @Override
  public String compileAbstractHeader() {
    throw new UnsupportedOperationException("No Abstract Source");
  }
  
  @Override
  public String compileAbstractSource() {
    throw new UnsupportedOperationException("No Abstract Source");
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.gcp.getAbstractChannelClassName());
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.gcp.getAbstractChannelClassName());
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include \"taskChannel.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("template <typename T>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    String _abstractChannelClassName = this.gcp.getAbstractChannelClassName();
    _builder.append(_abstractChannelClassName, "\t");
    _builder.append(" : public Tasking::TaskChannel {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t    ");
    String _abstractChannelClassName_1 = this.gcp.getAbstractChannelClassName();
    _builder.append(_abstractChannelClassName_1, "\t    ");
    _builder.append("():TaskChannel(){}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("virtual ~");
    String _abstractChannelClassName_2 = this.gcp.getAbstractChannelClassName();
    _builder.append(_abstractChannelClassName_2, "\t    ");
    _builder.append("(){}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("virtual T* allocate(void) = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("virtual bool push(T* data) = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("virtual bool push(T& data) = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("virtual T* pop(void) = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("virtual bool isEmpty(void) const = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("virtual void push () {");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("Tasking::TaskChannel::push();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*  ");
    String _constantsName_2 = this.getConstantsName(this.gcp.getAbstractChannelClassName());
    _builder.append(_constantsName_2);
    _builder.append("_H_ */");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
  public String compileSource() {
    throw new UnsupportedOperationException("No Concrete Source");
  }
}
