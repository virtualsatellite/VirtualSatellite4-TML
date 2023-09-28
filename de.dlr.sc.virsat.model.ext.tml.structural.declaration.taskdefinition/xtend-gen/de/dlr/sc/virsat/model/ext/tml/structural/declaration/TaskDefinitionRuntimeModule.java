/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration;

import de.dlr.sc.virsat.model.ext.tml.resource.VirSatAwareXtextResourceSet;
import de.dlr.sc.virsat.model.ext.tml.resource.VirsatReferenceableXtextResource;
import de.dlr.sc.virsat.model.ext.tml.resource.VirsatTransientValueService;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class TaskDefinitionRuntimeModule extends AbstractTaskDefinitionRuntimeModule {
  @Override
  public Class<? extends ResourceSet> bindResourceSet() {
    return VirSatAwareXtextResourceSet.class;
  }
  
  @Override
  public Class<? extends XtextResourceSet> bindXtextResourceSet() {
    return VirSatAwareXtextResourceSet.class;
  }
  
  @Override
  public Class<? extends XtextResource> bindXtextResource() {
    return VirsatReferenceableXtextResource.class;
  }
  
  @Override
  public Class<? extends ITransientValueService> bindITransientValueService() {
    return VirsatTransientValueService.class;
  }
}
