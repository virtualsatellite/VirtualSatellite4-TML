/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.structural.presentation;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.properties.PropertySheetPage;

import de.dlr.sc.virsat.model.dvlm.DVLMPackage;
import de.dlr.sc.virsat.model.dvlm.calculation.provider.CalculationItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.categories.propertydefinitions.provider.PropertydefinitionsItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.provider.PropertyinstancesItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.categories.provider.CategoriesItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.concepts.provider.ConceptsItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.dmf.provider.DmfItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.general.provider.GeneralItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.inheritance.provider.InheritanceItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.provider.DVLMItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.qudv.provider.QudvItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.roles.provider.RolesItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.dvlm.units.provider.UnitsItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.provider.BehavioralItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.provider.StructuralItemProviderAdapterFactory;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;
import de.dlr.sc.virsat.project.editingDomain.VirSatEditingDomainRegistry;
import de.dlr.sc.virsat.project.resources.VirSatResourceSet;
import de.dlr.sc.virsat.project.resources.dmf.DmfResource;

/**
 * Class for customizations of generated tree editor of the configuration DMF model
 * @author fran_tb
 *
 */
public class StructuralEditorCustom extends StructuralEditor {

	@Override
	public void createModel() {

		URI resourceURI = EditUIUtil.getURI(getEditorInput(), editingDomain.getResourceSet().getURIConverter());
		IProject project = ResourceUtil.getFilefromEMFUri(resourceURI, editingDomain.getResourceSet()).getProject();
		ResourceSet resourceSet = VirSatResourceSet.getResourceSet(project);
		editingDomain = VirSatEditingDomainRegistry.INSTANCE.getEd(project);
		Exception exception = null;
		Resource resource = null;
		URI originalURI = resourceURI;
		try {
			if (resourceURI.fileExtension().equals(DVLMPackage.eNS_PREFIX)) {
				resourceURI = originalURI.appendFileExtension(DmfResource.DMF_FILENAME_EXTENSION);
			}
			resourceSet = editingDomain.getResourceSet();
			resource = resourceSet.getResource(resourceURI, true);
		} catch (Exception e) {
			exception = e;

			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
	}

	@Override
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new StructuralItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new DVLMItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(
				new de.dlr.sc.virsat.model.dvlm.structural.provider.StructuralItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new GeneralItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ConceptsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new RolesItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new UnitsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new CategoriesItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new PropertydefinitionsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new PropertyinstancesItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new QudvItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new CalculationItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new InheritanceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new DmfItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new BehavioralItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		ResourceUtil.registerDMFResourceFactory();

		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {
					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ((CommandStack) event.getSource()).getMostRecentCommand();
						if (mostRecentCommand != null) {
							setSelectionToViewer(mostRecentCommand.getAffectedObjects());
						}
						for (Iterator<PropertySheetPage> i = propertySheetPages.iterator(); i.hasNext();) {
							PropertySheetPage propertySheetPage = i.next();
							if (propertySheetPage.getControl().isDisposed()) {
								i.remove();
							} else {
								propertySheetPage.refresh();
							}
						}
					}
				});
			}
		});

		// Create the editing domain with a special command stack.
		//

		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
	}

}
