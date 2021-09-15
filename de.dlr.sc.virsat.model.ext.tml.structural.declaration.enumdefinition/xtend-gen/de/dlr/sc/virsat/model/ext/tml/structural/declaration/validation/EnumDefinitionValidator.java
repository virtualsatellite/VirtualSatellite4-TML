/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.validation;

import de.dlr.sc.virsat.model.dvlm.general.GeneralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.validation.AbstractEnumDefinitionValidator;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class EnumDefinitionValidator extends AbstractEnumDefinitionValidator {
  public static final String INVALID_NAME = "invalidName";
  
  @Check
  public void checkGreetingStartsWithCapital(final Enumeration enumeration) {
    boolean _isUpperCase = Character.isUpperCase(enumeration.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with a capital", 
        GeneralPackage.Literals.INAME__NAME, 
        EnumDefinitionValidator.INVALID_NAME);
    }
  }
}
