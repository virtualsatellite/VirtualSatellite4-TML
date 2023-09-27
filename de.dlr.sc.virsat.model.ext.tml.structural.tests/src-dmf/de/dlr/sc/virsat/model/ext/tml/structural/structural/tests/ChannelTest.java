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

import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChannelTest extends IEventSourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChannelTest.class);
	}

	/**
	 * Constructs a new Channel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Channel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Channel getFixture() {
		return (Channel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructuralFactory.eINSTANCE.createChannel());
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

} //ChannelTest
