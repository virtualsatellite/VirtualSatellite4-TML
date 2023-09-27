/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.formatting2;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ChannelDefinitionFormatter extends AbstractFormatter2 {
  protected void _format(final ChannelBehaviorDefinition channelBehaviorDefinition, @Extension final IFormattableDocument document) {
    EList<BehavioralParameterDefinition> _parameters = channelBehaviorDefinition.getParameters();
    for (final BehavioralParameterDefinition parameters : _parameters) {
      document.<BehavioralParameterDefinition>format(parameters);
    }
  }
  
  public void format(final Object channelBehaviorDefinition, final IFormattableDocument document) {
    if (channelBehaviorDefinition instanceof ChannelBehaviorDefinition) {
      _format((ChannelBehaviorDefinition)channelBehaviorDefinition, document);
      return;
    } else if (channelBehaviorDefinition instanceof XtextResource) {
      _format((XtextResource)channelBehaviorDefinition, document);
      return;
    } else if (channelBehaviorDefinition instanceof EObject) {
      _format((EObject)channelBehaviorDefinition, document);
      return;
    } else if (channelBehaviorDefinition == null) {
      _format((Void)null, document);
      return;
    } else if (channelBehaviorDefinition != null) {
      _format(channelBehaviorDefinition, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(channelBehaviorDefinition, document).toString());
    }
  }
}
