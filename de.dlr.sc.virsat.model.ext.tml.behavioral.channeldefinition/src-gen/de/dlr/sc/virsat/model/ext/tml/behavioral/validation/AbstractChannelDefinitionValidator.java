/*
 * generated by Xtext 2.26.0
 */
package de.dlr.sc.virsat.model.ext.tml.behavioral.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractChannelDefinitionValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.virsat.sc.dlr.de/dmf/v1.2/behavioral"));
		return result;
	}
}
