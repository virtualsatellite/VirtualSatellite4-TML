/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.scoping;

import de.dlr.sc.virsat.model.ext.tml.structural.declaration.scoping.AbstractTaskDefinitionScopeProvider;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition;
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil;
import java.util.List;
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
public class TaskDefinitionScopeProvider extends AbstractTaskDefinitionScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    boolean _contextOfInputOrOutput = this.contextOfInputOrOutput(context, reference);
    if (_contextOfInputOrOutput) {
      final List<DataType> dataTypes = this.getDMFDataTypeList(context);
      return Scopes.scopeFor(dataTypes, IScope.NULLSCOPE);
    }
    final IScope scopes = super.getScope(context, reference);
    return scopes;
  }
  
  private boolean contextOfInputOrOutput(final EObject context, final EReference reference) {
    boolean ret = ((context instanceof TaskInputDefinition) || (context instanceof TaskOutputDefinition));
    ret = (ret && 
      (reference.getName().equals(de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInputDefinition.PROPERTY_DATATYPE) || reference.getName().equals(de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutputDefinition.PROPERTY_DATATYPE)));
    return ret;
  }
  
  private List<DataType> getDMFDataTypeList(final EObject context) {
    final Set<EObject> dataTypes = ResourceUtil.getAllDObjectsInCurrentTree(context, DataType.class);
    final Function1<EObject, DataType> _function = (EObject d) -> {
      return ((DataType) d);
    };
    final Function1<DataType, Boolean> _function_1 = (DataType it) -> {
      boolean _isAbstractType = it.isAbstractType();
      return Boolean.valueOf((!_isAbstractType));
    };
    return IterableExtensions.<DataType>toList(IterableExtensions.<DataType>filter(IterableExtensions.<EObject, DataType>map(dataTypes, _function), _function_1));
  }
}
