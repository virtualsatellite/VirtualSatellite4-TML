/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.model;

// *****************************************************************
// * Import Statements
// *****************************************************************


import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.dvlm.categories.CategoriesFactory;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import java.lang.Exception;


// *****************************************************************
// * Class Declaration
// *****************************************************************

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Instance of a TaskDefinition, contains a behavior that can configure inputs and outputs
 * 
 */	
public abstract class ATaskInstanceTest {
	
	protected Concept concept;
	
	@Before
	public void setUp() throws Exception {
		String conceptXmiPluginPath = "de.dlr.sc.virsat.model.ext.tml.structural/concept/concept.xmi";
		concept = de.dlr.sc.virsat.concept.unittest.util.ConceptXmiLoader.loadConceptFromPlugin(conceptXmiPluginPath);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	// *****************************************************************
	// * Constructor Test Cases
	// *****************************************************************
	
	@Test
	public void testTaskInstance() {
		TaskInstance testTaskInstance = new TaskInstance();
	
		assertNull("There is no internal DVLM object", testTaskInstance.getTypeInstance());
	}
	
	@Test
	public void testTaskInstanceConcept() {
		TaskInstance testTaskInstance = new TaskInstance(concept);
		
		assertNotNull("There is an internal DVLM object", testTaskInstance.getATypeInstance());
	}
	
	@Test
	public void testTaskInstanceCategoryAssignment() {
		CategoryAssignment testCa = CategoriesFactory.eINSTANCE.createCategoryAssignment();
		TaskInstance testTaskInstance = new TaskInstance(testCa);
		
		assertEquals("DVLM object has been set as specified", testCa, testTaskInstance.getTypeInstance());
	}
}
