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
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;

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
public  class DataType extends ADataType {
	
	/**
	 * Constructor of Concept Class
	 */
	public DataType() {
		super();
	}

	/**
	 * Constructor of Concept Class which will instantiate 
	 * a CategoryAssignment in the background from the given concept
	 * @param concept the concept where it will find the correct Category to instantiate from
	 */
	public DataType(Concept concept) {
		super(concept);
	}	

	/**
	 * Constructor of Concept Class that can be initialized manually by a given Category Assignment
	 * @param categoryAssignment The category Assignment to be used for background initialization of the Category bean
	 */
	public DataType(CategoryAssignment categoryAssignment) {
		super(categoryAssignment);
	}
	
	/**
	 * Gets the size of this datatype by recursively summing sizes of all attributes
	 * @return size in bytes
	 */
	public long getSize() {
		long size = 0;
		for (Attribute attr : getAttributes()) {
			if (!attr.getIsConst()) {
				long elementsQty = 1;
				for (ArrayDimension dim : attr.getDimensions()) {
					elementsQty *= dim.getSize();
				}
				IType type = attr.getTypeOf();
				long elementSize = 0;
				if (type instanceof BasicTypeDefinition) {
					elementSize = ((BasicTypeDefinition) type).getSize();
				} else if (type instanceof Enumeration) {
					elementSize = 1;
				} else if (type instanceof DataType) {
					elementSize = ((DataType) type).getSize();
				}
				size += elementsQty * elementSize;
			}
		}
		return size;
	}
}
