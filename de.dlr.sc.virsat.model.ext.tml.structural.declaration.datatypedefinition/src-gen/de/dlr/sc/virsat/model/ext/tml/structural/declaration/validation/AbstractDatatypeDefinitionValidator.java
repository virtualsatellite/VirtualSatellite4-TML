/*
 * generated by Xtext 2.26.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.validation;

import de.dlr.sc.virsat.model.ext.tml.structural.validation.DeclarationLangaugeValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractDatatypeDefinitionValidator extends DeclarationLangaugeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.virsat.sc.dlr.de/dmf/v1.7/structural"));
		return result;
	}
}
