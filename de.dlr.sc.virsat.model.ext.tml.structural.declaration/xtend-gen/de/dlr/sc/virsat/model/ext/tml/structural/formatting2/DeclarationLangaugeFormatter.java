/**
 * generated by Xtext 2.10.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.formatting2;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.structural.services.DeclarationLangaugeGrammarAccess;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DeclarationLangaugeFormatter extends AbstractFormatter2 {
  @SuppressWarnings("all")
  @Inject
  @Extension
  private DeclarationLangaugeGrammarAccess _declarationLangaugeGrammarAccess;
  
  protected void _format(final Attribute attribute, @Extension final IFormattableDocument document) {
    EList<ArrayDimension> _dimensions = attribute.getDimensions();
    for (final ArrayDimension dimensions : _dimensions) {
      document.<ArrayDimension>format(dimensions);
    }
  }
  
  public void format(final Object attribute, final IFormattableDocument document) {
    if (attribute instanceof Attribute) {
      _format((Attribute)attribute, document);
      return;
    } else if (attribute instanceof XtextResource) {
      _format((XtextResource)attribute, document);
      return;
    } else if (attribute instanceof EObject) {
      _format((EObject)attribute, document);
      return;
    } else if (attribute == null) {
      _format((Void)null, document);
      return;
    } else if (attribute != null) {
      _format(attribute, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attribute, document).toString());
    }
  }
}