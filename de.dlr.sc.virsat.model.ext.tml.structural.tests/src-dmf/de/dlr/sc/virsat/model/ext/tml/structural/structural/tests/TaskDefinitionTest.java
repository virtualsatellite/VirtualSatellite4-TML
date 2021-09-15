/**
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.tests;

import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDefinitionTest extends TestCase {

	/**
	 * The fixture for this Task Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDefinition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskDefinitionTest.class);
	}

	/**
	 * Constructs a new Task Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskDefinition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDefinition getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructuralFactory.eINSTANCE.createTaskDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TaskDefinitionTest
