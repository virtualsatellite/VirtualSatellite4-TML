/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv;

import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

import de.dlr.sc.virsat.graphiti.ui.diagram.editor.VirsatDiagramEditor;
import de.dlr.sc.virsat.model.concept.types.IBeanName;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers.TMLDiagramTypeProvider;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;

/**
 * 
 * @author fran_tb
 *
 */
public class TMLDiagramEditor extends VirsatDiagramEditor {

	public static final String DIAGRAM_EDITOR_ID = "de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLStructuralEditor";
	public static final String DIAGRAM_FILE_EXTENSION = ".tmld";
			
	public static final String DIAGRAM_PROVIDER_ID = TMLDiagramTypeProvider.PROVIDER_ID;
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		try {
			if (input instanceof IFileEditorInput) {
				IFileEditorInput file = (IFileEditorInput) input;
				URI uri = ResourceUtil.getFileURI(file.getFile());
				super.init(site, new DiagramEditorInput(uri, DIAGRAM_PROVIDER_ID));
			} else {
				super.init(site, input);
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
	public IBeanName getRootObject() {
		Diagram diagram = getDiagramTypeProvider().getDiagram();
		Object obj = getDiagramTypeProvider().getFeatureProvider().getBusinessObjectForPictogramElement(diagram);
		return (IBeanName) obj;
	}

	@Override
	public final String getPartName() {
		String name = getRootObject() == null ? "Sequence Graph" : getRootObject().getName();
		return name;
	}
	
	@Override
	protected DiagramBehavior createDiagramBehavior() {
		return new TMLDiagramBehavior(this);
	}
}
