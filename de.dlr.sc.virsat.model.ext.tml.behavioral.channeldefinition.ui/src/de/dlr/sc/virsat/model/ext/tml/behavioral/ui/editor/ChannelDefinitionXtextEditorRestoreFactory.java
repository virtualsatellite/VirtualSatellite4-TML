/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.ui.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;

/**
 * 
 * @author fran_tb
 *
 */
public class ChannelDefinitionXtextEditorRestoreFactory implements IElementFactory {

	public static final String FACTORY_ID = "de.dlr.sc.virsat.model.ext.tml.behavioral.ui.editor.ChannelDefinitionXtextEditorRestoreFactory";

	@Override
	public IAdaptable createElement(IMemento memento) {
		String uriString = memento.getString(ChannelDefinitionEditorInput.MEMENTO_ID_URI);
		
		URI platformUri = URI.createPlatformResourceURI(uriString, true);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformUri.toPlatformString(true)));
		
		IEditorInput editorInput = new ChannelDefinitionEditorInput(file, platformUri, null, null);
		
		return editorInput;
	}
}
