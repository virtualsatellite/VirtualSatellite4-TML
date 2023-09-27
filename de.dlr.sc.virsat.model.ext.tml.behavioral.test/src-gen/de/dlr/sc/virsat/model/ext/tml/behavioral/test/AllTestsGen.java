/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.test;

// *****************************************************************
// * Import Statements
// *****************************************************************

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;

import de.dlr.sc.virsat.model.ext.tml.behavioral.model.BehaviorParameterTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.BehavioralParameterDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.validator.BehavioralValidatorTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehaviorDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.TaskBehaviorTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.BehaviorDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.TimeEventBehaviorDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehaviorTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.migrator.Migrator1v0Test;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.BehaviorDefintionStorageTest;
import de.dlr.sc.virsat.model.ext.tml.behavioral.migrator.Migrator1v1Test;

/**
 * 
 */
@RunWith(Suite.class)

@SuiteClasses({
	BehavioralParameterDefinitionTest.class,
	ChannelBehaviorDefinitionTest.class,
	BehaviorDefintionStorageTest.class,
	BehaviorDefinitionTest.class,
	TimeEventBehaviorDefinitionTest.class,
	TaskBehaviorTest.class,
	BehaviorParameterTest.class,
	ChannelBehaviorTest.class,
	Migrator1v0Test.class,
	Migrator1v1Test.class,
	BehavioralValidatorTest.class,
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
