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
 * Queue class template for fifo channel
 */
@SuppressWarnings("all")
public class CppQueueTemplate extends AbstractCppTemplate {
  protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.getInstance();
  
  public CppQueueTemplate() {
  }
  
  @Override
  public String compileAbstractHeader() {
    throw new UnsupportedOperationException("No Abstract Header");
  }
  
  @Override
  public String compileAbstractSource() {
    throw new UnsupportedOperationException("No Abstract Source");
  }
  
  @Override
  public String compileHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#ifndef ");
    String _constantsName = this.getConstantsName(this.gcp.getQueueClassName());
    _builder.append(_constantsName);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _constantsName_1 = this.getConstantsName(this.gcp.getQueueClassName());
    _builder.append(_constantsName_1);
    _builder.append("_H_");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#include <stdint.h>");
    _builder.newLine();
    _builder.append("#include <utility>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace ");
    String _projectName = this.gcp.getProjectName();
    _builder.append(_projectName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("template <typename T, unsigned int SIZE>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    String _queueClassName = this.gcp.getQueueClassName();
    _builder.append(_queueClassName, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t");
    String _queueClassName_1 = this.gcp.getQueueClassName();
    _builder.append(_queueClassName_1, "\t\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("head=0;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("tail=0;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("emptyFlag = true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("virtual ~");
    String _queueClassName_2 = this.gcp.getQueueClassName();
    _builder.append(_queueClassName_2, "\t\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* clears the complete list");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void clear() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("head=0;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("tail=0;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("emptyFlag = true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Pushes one element to the end of the queue");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool enqueue(T* element) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if((head == tail) && (!emptyFlag))");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("tail = (tail + 1)%SIZE;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("buffer[head] = element;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("head = (head + 1)%SIZE;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("emptyFlag = false;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Removes and returns one element from the start of the queue");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("T* dequeue() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("T* result = std::move(buffer[tail]);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(!emptyFlag)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("tail = (tail + 1)%SIZE;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("emptyFlag = tail == head;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("void rewind(int count) {");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("tail -= count;");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("if(tail<0)");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("tail += SIZE;");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool isEmpty() const {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return emptyFlag;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("T* getElement(int32_t elementPos) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return buffer[(tail+elementPos)%SIZE];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int32_t getSize() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(isEmpty()) return 0;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(head==tail && !emptyFlag) return SIZE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return ((head-tail)+SIZE)%SIZE;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int32_t head;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int32_t tail;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("T* buffer [SIZE];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool emptyFlag;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*  ");
    String _constantsName_2 = this.getConstantsName(this.gcp.getQueueClassName());
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
