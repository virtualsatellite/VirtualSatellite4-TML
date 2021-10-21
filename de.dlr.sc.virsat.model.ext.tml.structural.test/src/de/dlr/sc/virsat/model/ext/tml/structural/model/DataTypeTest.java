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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// *****************************************************************
// * Import Statements
// *****************************************************************



// *****************************************************************
// * Class Declaration
// *****************************************************************

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Data type - describing a set of data
 * 
 */	
public class DataTypeTest extends ADataTypeTest {

	@Test
	public void testGetSize() {
		/*
		 * DataType dt1 {
		 * 		int[5] //5*4 = 20 bytes
		 * 		enum // 1b
		 * 		const double //0
		 * } //total 21
		 * 
		 * DataType dt2 {
		 * 		double //8
		 * 		enum[7] //7
		 * 		dt1[3] // 63
		 * } //total 78
		 * 
		 */
		//CHECKSTYLE:OFF
		
		BasicTypeDefinition dbl = new BasicTypeDefinition(concept);
		dbl.setSize(8);
		BasicTypeDefinition uint = new BasicTypeDefinition(concept);
		uint.setSize(4);
		
		Enumeration enm = new Enumeration(concept);
		
		DataType dt1 = new DataType(concept);
		Attribute intArrayAttr = new Attribute(concept);
		intArrayAttr.setTypeOf(uint);
		ArrayDimension intArrDim = new ArrayDimension(concept);
		intArrDim.setSize(5);
		intArrayAttr.getDimensions().add(intArrDim);
		dt1.getAttributes().add(intArrayAttr);

		Attribute enumAttr1 = new Attribute(concept);
		enumAttr1.setTypeOf(enm);
		dt1.getAttributes().add(enumAttr1);
		
		Attribute constAttr = new Attribute(concept);
		constAttr.setTypeOf(dbl);
		constAttr.setIsConst(true);
		dt1.getAttributes().add(constAttr);
		
		DataType dt2 = new DataType(concept);
		Attribute enumArrayAttr = new Attribute(concept);
		enumArrayAttr.setTypeOf(enm);
		ArrayDimension enmArrDim = new ArrayDimension(concept);
		enmArrDim.setSize(7);
		enumArrayAttr.getDimensions().add(enmArrDim);
		dt2.getAttributes().add(enumArrayAttr);
		
		Attribute doubleAttr = new Attribute(concept);
		doubleAttr.setTypeOf(dbl);
		dt2.getAttributes().add(doubleAttr);
		
		Attribute dt1ArrayAttr = new Attribute(concept);
		dt1ArrayAttr.setTypeOf(dt1);
		ArrayDimension dt1ArrDim = new ArrayDimension(concept);
		dt1ArrDim.setSize(3);
		dt1ArrayAttr.getDimensions().add(dt1ArrDim);
		dt2.getAttributes().add(dt1ArrayAttr);

		assertEquals(21, dt1.getSize());
		assertEquals(78, dt2.getSize());
	}
}
