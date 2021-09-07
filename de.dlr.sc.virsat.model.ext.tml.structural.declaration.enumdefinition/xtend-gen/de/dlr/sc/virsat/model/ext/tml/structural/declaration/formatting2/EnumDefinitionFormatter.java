/**
 * This file is part of the VirSat project.
 * 
 * Copyright (c) 2008-2016
 * German Aerospace Center (DLR), Simulation and Software Technology, Germany
 * All rights reserved
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.formatting2;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.EnumDefinitionGrammarAccess;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EnumDefinitionFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private EnumDefinitionGrammarAccess _enumDefinitionGrammarAccess;
  
  protected void _format(final Enumeration enumeration, @Extension final IFormattableDocument document) {
    EList<EnumerationLiteral> _literals = enumeration.getLiterals();
    for (final EnumerationLiteral literals : _literals) {
      document.<EnumerationLiteral>format(literals);
    }
  }
  
  public void format(final Object enumeration, final IFormattableDocument document) {
    if (enumeration instanceof Enumeration) {
      _format((Enumeration)enumeration, document);
      return;
    } else if (enumeration instanceof XtextResource) {
      _format((XtextResource)enumeration, document);
      return;
    } else if (enumeration instanceof EObject) {
      _format((EObject)enumeration, document);
      return;
    } else if (enumeration == null) {
      _format((Void)null, document);
      return;
    } else if (enumeration != null) {
      _format(enumeration, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(enumeration, document).toString());
    }
  }
}
