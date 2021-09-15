/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.util.dmf;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

public class TaskingEnvironmentHelper {
	
	private static TaskingEnvironmentHelper iINSTANCE = new TaskingEnvironmentHelper();

	private final Set<BasicTypeDefinition> basicTypeDefinitions = new HashSet<BasicTypeDefinition>();
	private final Set<Enumeration> enumerations = new HashSet<Enumeration>();
	private final Set<DataType> dataTypes = new HashSet<DataType>();
	private final Set<ChannelBehaviorDefinition> channelBehaviorDefinitions = new HashSet<ChannelBehaviorDefinition>();
	private final Set<TaskDefinition> taskDefinitions = new HashSet<TaskDefinition>();
	
	private boolean initialized = false;
	
	public final boolean isInitilaized() {
		return initialized;
	}
	
	public final Set<BasicTypeDefinition> getBasicTypeDefinitions() {
		return basicTypeDefinitions;
	}
	
	public final Set<Enumeration> getEnumerations() {
		return enumerations;
	}
	
	public final Set<DataType> getDataTypes() {
		return dataTypes;
	}
	
	public final Set<ChannelBehaviorDefinition> getChannelBehaviorDefinitions() {
		return channelBehaviorDefinitions;
	}
	
	public final Set<TaskDefinition> getTaskDefinitions() {
		return taskDefinitions;
	}
	
	private TaskingEnvironmentHelper() {
	}
		
	/**
	 * 
	 * @param taskingEnvironment
	 * @return
	 */
	public TaskingEnvironmentHelper init(TaskingEnvironment taskingEnvironment) {		
		if (!initialized && taskingEnvironment != null) {
			setBasicTypeDefinitions(taskingEnvironment);
			setDataTypes(taskingEnvironment);
			setEnumerations(taskingEnvironment);
			setChannelBehaviorDefinitions(taskingEnvironment);
			setTaskDefinitions(taskingEnvironment);
			initialized = true;
		}
		return getInstance();
	}

	/**
	 * Getter for the provider's instance
	 * @return instance
	 */
	public static TaskingEnvironmentHelper getInstance() {
		return iINSTANCE;
	}
	
	/**
	 * Set all DataType objects.
	 * 
	 */
	private void setBasicTypeDefinitions(TaskingEnvironment taskingEnv) {
		Set<BasicTypeDefinition> set = getBasicTypeDefinitions(taskingEnv);
		this.basicTypeDefinitions.clear();
		this.basicTypeDefinitions.addAll(set);
	}
	
	/**
	 * Set all DataType objects.
	 * 
	 */
	private void setDataTypes(TaskingEnvironment taskingEnv) {
		Set<DataType> set = getDataTypes(taskingEnv);
		this.dataTypes.clear();
		this.dataTypes.addAll(set);
	}
	
	/**
	 * Set all Enumeration objects.
	 * 
	 */
	private void setEnumerations(TaskingEnvironment taskingEnv) {
		Set<Enumeration> set = getEnumerations(taskingEnv);
		this.enumerations.clear();
		this.enumerations.addAll(set);
	}
	
	/**
	 * Set all ChannelBehaviorDefinition objects.
	 * 
	 */
	private void setChannelBehaviorDefinitions(TaskingEnvironment taskingEnv) {
		Set<ChannelBehaviorDefinition> set = getChannelBehaviorDefinitions(taskingEnv);
		this.channelBehaviorDefinitions.clear();
		this.channelBehaviorDefinitions.addAll(set);
	}
	
	/**
	 * Get all TaskDefinition objects.
	 * 
	 * @return Objects as list.
	 */
	private void setTaskDefinitions(TaskingEnvironment taskingEnv) {
		Set<TaskDefinition> set = getTaskDefinitions(taskingEnv);
		this.taskDefinitions.clear();
		this.taskDefinitions.addAll(set);
	}
	
	/**
	 * Set all DataType objects.
	 * 
	 */
	private Set<BasicTypeDefinition> getBasicTypeDefinitions(TaskingEnvironment taskingEnv) {
		return getAllTypeDefinitions(taskingEnv).stream()
										.filter(type -> type instanceof BasicTypeDefinition)
										.map(type -> (BasicTypeDefinition) type)
										.collect(Collectors.toSet());
	}
	
	/**
	 * Set all DataType objects.
	 * 
	 */
	private Set<DataType> getDataTypes(TaskingEnvironment taskingEnv) {
		return getAllTypeDefinitions(taskingEnv).stream()
					.filter(type -> type instanceof DataType)
					.map(type -> (DataType) type)
					.collect(Collectors.toSet());
	}
	
	/**
	 * Set all Enumeration objects.
	 * 
	 */
	private Set<Enumeration> getEnumerations(TaskingEnvironment taskingEnv) {
		return getAllTypeDefinitions(taskingEnv).stream()
					.filter(type -> type instanceof Enumeration)
					.map(type -> (Enumeration) type)
					.collect(Collectors.toSet());
	}
	
	/**
	 * Set all ChannelBehaviorDefinition objects.
	 * 
	 */
	private Set<ChannelBehaviorDefinition> getChannelBehaviorDefinitions(TaskingEnvironment taskingEnv) {
		return taskingEnv.getChannels().stream()
				.map(channel -> channel.getChannelBehavior().getTypeOf())
				.collect(Collectors.toSet());
	}
	
	/**
	 * Get all TaskDefinition objects.
	 * 
	 * @return Objects as list.
	 */
	private Set<TaskDefinition> getTaskDefinitions(TaskingEnvironment taskingEnv) {
		return taskingEnv.getTasks().stream()
				.map(task -> task.getTypeOf())
				.collect(Collectors.toSet());
	}

	/**
	 * Get all Datatype objects.
	 * 
	 * @return Objects as list.
	 */
	private Set<IType> getAllTypeDefinitions(TaskingEnvironment taskingEnv) {
		Set<IType> dataTypes = new HashSet<IType>();
		getTaskDefinitions(taskingEnv).forEach(taskDef -> {
			//Add fromt task inputs
			Set<IType> intypes = taskDef.getInputs().stream().map(in -> in.getDataType()).collect(Collectors.toSet());
			dataTypes.addAll(intypes);
			//Add from task outputs
			Set<IType> outtypes = taskDef.getInputs().stream().map(in -> in.getDataType()).collect(Collectors.toSet());
			dataTypes.addAll(outtypes);
		});
		
		//Adds from channel
		Set<IType> channelTypes = taskingEnv.getChannels().stream().map(channel -> channel.getDataType()).collect(Collectors.toSet());
		dataTypes.addAll(channelTypes);
		
		return dataTypes;
	}
	
}
