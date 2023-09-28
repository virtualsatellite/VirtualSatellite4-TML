/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.test;

// *****************************************************************
// * Import Statements
// *****************************************************************

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;

import de.dlr.sc.virsat.model.ext.tml.structural.migrator.Migrator1v3Test;
import de.dlr.sc.virsat.model.ext.tml.structural.model.AttributeTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInputTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ReferenceFrameDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TimeEventTest;
import de.dlr.sc.virsat.model.ext.tml.structural.migrator.Migrator1v2Test;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ChannelTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.DataTypeTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.EnumerationLiteralTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutputDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.structural.migrator.Migrator1v6Test;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstanceTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironmentTest;
import de.dlr.sc.virsat.model.ext.tml.structural.migrator.Migrator1v1Test;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutputTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.BasicTypeDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.structural.migrator.Migrator1v5Test;
import de.dlr.sc.virsat.model.ext.tml.structural.model.EnumerationTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.UnitDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInputDefinitionTest;
import de.dlr.sc.virsat.model.ext.tml.structural.migrator.Migrator1v7Test;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ArrayDimensionTest;
import de.dlr.sc.virsat.model.ext.tml.structural.validator.StructuralValidatorTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TMLRootTest;
import de.dlr.sc.virsat.model.ext.tml.structural.migrator.Migrator1v0Test;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ITypeTest;
import de.dlr.sc.virsat.model.ext.tml.structural.migrator.Migrator1v4Test;
import de.dlr.sc.virsat.model.ext.tml.structural.model.IEventSourceTest;
import de.dlr.sc.virsat.model.ext.tml.structural.model.ExternalTypeTest;

/**
 * 
 */
@RunWith(Suite.class)

@SuiteClasses({
	TaskingDefinitionTest.class,
	TaskingEnvironmentTest.class,
	IEventSourceTest.class,
	ITypeTest.class,
	TaskDefinitionTest.class,
	TaskInputDefinitionTest.class,
	TaskOutputDefinitionTest.class,
	BasicTypeDefinitionTest.class,
	ReferenceFrameDefinitionTest.class,
	UnitDefinitionTest.class,
	TaskInstanceTest.class,
	TaskInputTest.class,
	TaskOutputTest.class,
	TimeEventTest.class,
	ChannelTest.class,
	DataTypeTest.class,
	ExternalTypeTest.class,
	AttributeTest.class,
	ArrayDimensionTest.class,
	EnumerationTest.class,
	EnumerationLiteralTest.class,
	TMLRootTest.class,
	Migrator1v0Test.class,
	Migrator1v1Test.class,
	Migrator1v2Test.class,
	Migrator1v3Test.class,
	Migrator1v4Test.class,
	Migrator1v5Test.class,
	Migrator1v6Test.class,
	Migrator1v7Test.class,
	StructuralValidatorTest.class,
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
