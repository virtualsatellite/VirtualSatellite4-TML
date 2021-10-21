/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.configuration.test;

// *****************************************************************
// * Import Statements
// *****************************************************************

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;

import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v1Test;
import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v6Test;
import de.dlr.sc.virsat.model.ext.tml.configuration.model.TaskingEnvironmentConfigurationTest;
import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v8Test;
import de.dlr.sc.virsat.model.ext.tml.configuration.model.TMLConfigurationTest;
import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v4Test;
import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v2Test;
import de.dlr.sc.virsat.model.ext.tml.configuration.validator.ConfigurationValidatorTest;
import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v0Test;
import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v7Test;
import de.dlr.sc.virsat.model.ext.tml.configuration.model.GenerationConfigurationTest;
import de.dlr.sc.virsat.model.ext.tml.configuration.model.ElementConfigurationTest;
import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v3Test;
import de.dlr.sc.virsat.model.ext.tml.configuration.migrator.Migrator1v5Test;

/**
 * 
 */
@RunWith(Suite.class)

@SuiteClasses({
	TMLConfigurationTest.class,
	GenerationConfigurationTest.class,
	ElementConfigurationTest.class,
	TaskingEnvironmentConfigurationTest.class,
	Migrator1v0Test.class,
	Migrator1v1Test.class,
	Migrator1v2Test.class,
	Migrator1v3Test.class,
	Migrator1v4Test.class,
	Migrator1v5Test.class,
	Migrator1v6Test.class,
	Migrator1v7Test.class,
	Migrator1v8Test.class,
	ConfigurationValidatorTest.class,
				})

/**
 * 
 * Test Collection
 *
 */
public class AllTestsGen {

	/**
	 * Constructor
	 */
	private AllTestsGen() {
	}
	
	/**
	 * Test Adapter
	 * @return Executable JUnit Tests
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests.class);
	}	
}
