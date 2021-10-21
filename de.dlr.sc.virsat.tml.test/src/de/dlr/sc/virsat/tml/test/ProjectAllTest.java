/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.tml.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 
 * @author fisc_ph
 *
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
				de.dlr.sc.virsat.test.ProjectAllTest.class,
				de.dlr.sc.virsat.model.ext.tml.behavioral.test.AllTests.class,
				de.dlr.sc.virsat.model.ext.tml.behavioral.test.AllTestsGen.class,
				de.dlr.sc.virsat.model.ext.tml.structural.test.AllTests.class,
				de.dlr.sc.virsat.model.ext.tml.structural.test.AllTestsGen.class,
				de.dlr.sc.virsat.model.ext.tml.configuration.test.AllTests.class,
				de.dlr.sc.virsat.model.ext.tml.configuration.test.AllTestsGen.class,
				})

/**
 * Test Class
 */
public class ProjectAllTest {   
}