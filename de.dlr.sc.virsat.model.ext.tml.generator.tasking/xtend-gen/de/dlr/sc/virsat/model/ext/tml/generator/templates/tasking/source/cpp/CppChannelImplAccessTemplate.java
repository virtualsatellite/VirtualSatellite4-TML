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

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumStorageType;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.AbstractTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CppChannelImplAccessTemplate extends AbstractTemplate {
  public CharSequence getChannelDeclaration(final Channel channel) {
    Object _switchResult = null;
    EnumStorageType _storageType = channel.getChannelBehavior().getTypeOf().getStorageType();
    if (_storageType != null) {
      switch (_storageType) {
        case CUSTOM:
          return "";
        case DOUBLE_BUFFER:
          return this.getDoubleBufferDeclaration(channel);
        case EVENT_ONLY:
          _switchResult = null;
          break;
        case FIFO:
          _switchResult = null;
          break;
        case LIFO:
          _switchResult = null;
          break;
        default:
          break;
      }
    }
    return ((CharSequence)_switchResult);
  }
  
  public CharSequence getDoubleBufferDeclaration(final Channel channel) {
    StringConcatenation _builder = new StringConcatenation();
    String _className = this.getClassName(channel.getChannelBehavior().getTypeOf().getImplName());
    _builder.append(_className);
    _builder.append("<DataTypes::");
    String _name = channel.getDataType().getName();
    _builder.append(_name);
    _builder.append("> ");
    String _name_1 = channel.getName();
    _builder.append(_name_1);
    _builder.append(";\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence getFIFODeclaration(final Channel channel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
