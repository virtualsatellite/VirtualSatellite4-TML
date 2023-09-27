/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.scoping;

import de.dlr.sc.virsat.model.ext.tml.structural.scoping.AbstractDeclarationLangaugeScopeProvider;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class DeclarationLangaugeScopeProvider extends AbstractDeclarationLangaugeScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if (((context instanceof Attribute) && 
      reference.getName().equals(de.dlr.sc.virsat.model.ext.tml.structural.model.Attribute.PROPERTY_REFERENCEFRAME))) {
      Set<EObject> allElements = this.getDMFFrameList(context);
      return Scopes.scopeFor(allElements, IScope.NULLSCOPE);
    } else {
      if (((context instanceof Attribute) && 
        reference.getName().equals(de.dlr.sc.virsat.model.ext.tml.structural.model.Attribute.PROPERTY_TYPEUNIT))) {
        Set<EObject> allElements_1 = this.getDMFUnitList(context);
        return Scopes.scopeFor(allElements_1, IScope.NULLSCOPE);
      } else {
        if ((context instanceof Attribute)) {
          Iterable<EObject> allElements_2 = this.getDMFTypeList(context);
          return Scopes.scopeFor(allElements_2, IScope.NULLSCOPE);
        }
      }
    }
    if ((context instanceof DataType)) {
      Set<EObject> allElements_3 = this.getDMFDataTypeList(context);
      allElements_3.add(((DataType)context).eContainer());
      return Scopes.scopeFor(allElements_3, IScope.NULLSCOPE);
    }
    final IScope scopes = super.getScope(context, reference);
    return scopes;
  }
  
  private Set<EObject> getDMFDataTypeList(final EObject context) {
    return ResourceUtil.getAllDObjectsInCurrentTree(context, DataType.class);
  }
  
  private Set<EObject> getDMFFrameList(final EObject context) {
    return ResourceUtil.getAllDObjectsInCurrentTree(context, ReferenceFrameDefinition.class);
  }
  
  private Iterable<EObject> getDMFTypeList(final EObject context) {
    Set<EObject> types = ResourceUtil.getAllDObjectsInCurrentTree(context, IType.class);
    final Function1<EObject, Boolean> _function = (EObject t) -> {
      if ((t instanceof DataType)) {
        boolean _isAbstractType = ((DataType)t).isAbstractType();
        return Boolean.valueOf((!_isAbstractType));
      }
      return Boolean.valueOf(true);
    };
    return IterableExtensions.<EObject>filter(types, _function);
  }
  
  private Set<EObject> getDMFUnitList(final EObject context) {
    return ResourceUtil.getAllDObjectsInCurrentTree(context, UnitDefinition.class);
  }
}
