/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.ui;

import de.dlr.sc.virsat.model.ext.tml.ui.resource.VirsatCategoryResourceForEditorInputFactory;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class ChannelDefinitionUiModule extends AbstractChannelDefinitionUiModule {
  @Override
  public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
    return VirsatCategoryResourceForEditorInputFactory.class;
  }
  
  public static final Logger LOGGER = Logger.getLogger(ChannelDefinitionUiModule.class);
  
  public ChannelDefinitionUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
