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

import de.dlr.sc.virsat.model.ext.tml.structural.structural.IEventSource;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IEvent Source</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IEventSourceTest extends TestCase {

	/**
	 * The fixture for this IEvent Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEventSource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IEventSourceTest.class);
	}

	/**
	 * Constructs a new IEvent Source test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEventSourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this IEvent Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IEventSource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this IEvent Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEventSource getFixture() {
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
		setFixture(StructuralFactory.eINSTANCE.createIEventSource());
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

} //IEventSourceTest
