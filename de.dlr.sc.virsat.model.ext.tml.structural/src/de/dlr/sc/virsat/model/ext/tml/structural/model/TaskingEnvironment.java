/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.model;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
// *****************************************************************
// * Import Statements
// *****************************************************************
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehaviorDefinition;

// *****************************************************************
// * Class Declaration
// *****************************************************************

/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Overall Container to describe a task model
 * 
 */	
public  class TaskingEnvironment extends ATaskingEnvironment {
	
	/**
	 * Constructor of Concept Class
	 */
	public TaskingEnvironment() {
		super();
	}

	/**
	 * Constructor of Concept Class which will instantiate 
	 * a CategoryAssignment in the background from the given concept
	 * @param concept the concept where it will find the correct Category to instantiate from
	 */
	public TaskingEnvironment(Concept concept) {
		super(concept);
	}	

	/**
	 * Constructor of Concept Class that can be initialized manually by a given Category Assignment
	 * @param categoryAssignment The category Assignment to be used for background initialization of the Category bean
	 */
	public TaskingEnvironment(CategoryAssignment categoryAssignment) {
		super(categoryAssignment);
	}
	
	/**
	 * Get all TaskDefinition objects.
	 * 
	 * @return Objects as list.
	 */
	public Set<TaskDefinition> getTaskDefinitions() {
		return getTasks().stream().map(task -> task.getTypeOf()).collect(Collectors.toSet());
	}

	/**
	 * Get all Datatype objects.
	 * 
	 * @return Objects as list.
	 */
	public Set<IType> getAllTypeDefinitions() {
		Set<IType> dataTypes = new HashSet<IType>();
		getTaskDefinitions().forEach(taskDef -> {
			//Add fromt task inputs
			Set<IType> intypes = taskDef.getInputs().stream().map(in -> in.getDataType()).collect(Collectors.toSet());
			dataTypes.addAll(intypes);
			//Add from task outputs
			Set<IType> outtypes = taskDef.getInputs().stream().map(in -> in.getDataType()).collect(Collectors.toSet());
			dataTypes.addAll(outtypes);
		});
		
		//Adds from channel
		Set<IType> channelTypes = getChannels().stream().map(channel -> channel.getDataType()).collect(Collectors.toSet());
		dataTypes.addAll(channelTypes);
		
		return dataTypes;
	}

	/**
	 * Get all DataType objects.
	 * 
	 * @return Objects as list.
	 */
	public Set<DataType> getBasicTypeDefinitions() {
		return getAllTypeDefinitions().stream()
					.filter(type -> type instanceof DataType)
					.map(type -> (DataType) type)
					.collect(Collectors.toSet());
	}
	
	/**
	 * Get all DataType objects.
	 * 
	 * @return Objects as list.
	 */
	public Set<DataType> getDataTypes() {
		return getAllTypeDefinitions().stream()
					.filter(type -> type instanceof DataType)
					.map(type -> (DataType) type)
					.collect(Collectors.toSet());
	}
	
	/**
	 * Get all Enumeration objects.
	 * 
	 * @return Objects as list.
	 */
	public Set<Enumeration> getEnumerations() {
		return getAllTypeDefinitions().stream()
					.filter(type -> type instanceof Enumeration)
					.map(type -> (Enumeration) type)
					.collect(Collectors.toSet());
	}
	
	/**
	 * Get all ChannelBehaviorDefinition objects.
	 * 
	 * @return Objects as list.
	 */
	public Set<ChannelBehaviorDefinition> getChannelBehaviorDefinitions() {
		return getChannels().stream().map(channel -> channel.getChannelBehavior().getTypeOf()).collect(Collectors.toSet());
	}
}
