/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dlr.sc.virsat.model.concept.types.IBeanName;
import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.IEventSource;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TimeEvent;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links.LinkDiagramDomainElement;

/**
 * 
 * @author nepa_ay
 *
 */
public class TMLDiagramUtil {
		
	public static final int PADDING = 10;
	
	/**
	 * Hidden constructor.
	 */
	private TMLDiagramUtil() {
		
	}
	
	/**
	 * 
	 * @param taskingEnvironment taskingEnvironment
	 * @return Connection bean objects.
	 */
	public static Map<String, LinkDiagramDomainElement> getConnectionBeans(TaskingEnvironment taskingEnvironment) {
		Map<String, LinkDiagramDomainElement> links = new HashMap<String, LinkDiagramDomainElement>();
		taskingEnvironment.getTimeEvents().forEach(trigger -> {
			trigger.getInputs().forEach(taskInput -> {
				links.put(LinkDiagramDomainElement.createUuid(trigger, taskInput), new LinkDiagramDomainElement(trigger, taskInput));
			});
		});
		
		List<TaskInput> taskInputs = new ArrayList<>();
		List<TaskOutput> taskOutputs = new ArrayList<>();
		taskingEnvironment.getTasks().forEach(task -> {
			taskInputs.addAll(task.getInputs());
			taskOutputs.addAll(task.getOutputs());
		});
		
		taskInputs.forEach(taskInput -> {
			IEventSource trigger = taskInput.getTrigger();
			links.put(LinkDiagramDomainElement.createUuid(trigger, taskInput), new LinkDiagramDomainElement(trigger, taskInput));
		});
		
		taskOutputs.forEach(taskOutput -> {
			taskOutput.getChannels().forEach(channel -> {
				links.put(LinkDiagramDomainElement.createUuid(taskOutput, channel), new LinkDiagramDomainElement(taskOutput, channel));
				channel.getInputs().forEach(taskInput -> {
					links.put(LinkDiagramDomainElement.createUuid(channel, taskInput), new LinkDiagramDomainElement(channel, taskInput));
				});
			});
		});
		
		return links;
	}
	
	/**
	 * Check if we can delete node from the diagram
	 * @param bo
	 * @return
	 */
	public static boolean isDeletableFromDiagram(Object bo) {
		return bo == null 
				|| bo instanceof TaskInstance
				|| bo instanceof Channel 
				|| bo instanceof TimeEvent;
	}
	
	/**
	 * Check if we can update node from the diagram
	 * @param bo
	 * @return
	 */
	public static boolean isUpdateableFromDiagram(Object bo) {
		return bo instanceof TaskInstance
				|| bo instanceof Channel 
				|| bo instanceof TimeEvent;
	}
	

	/**
	 * Check if we can rename node from the diagram
	 * @param bo
	 * @return
	 */
	public static boolean isRenameableFromDiagram(Object bo) {
		return bo instanceof IBeanName;
	}
	
 	/**
	 * Computes distance
	 * @param x1 coordinate 
	 * @param y1 coordinate
	 * @param x2 coordinate
	 * @param y2 coordinate
	 * @return distance
	 */
	public static double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
	/**
	 * Return call capital letters or an empty string is all char in the string are in lowercase.
	 * @param inString
	 * @return
	 */
	public static String getCapitalLetters(String inString) {
		return inString.chars().filter((c) -> Character.isUpperCase(c)).collect(StringBuilder::new, // supplier
																                StringBuilder::appendCodePoint, // accumulator
																                StringBuilder::append) // combiner
		        														.toString();
	}

	/**
	 * Creates alpha-numeric name.
	 * @param frontName Name to begin with.
	 * @param namesToAvoid Names to avoid - already existing names.
	 * @return A Unique name.
	 */
	public static String getUniqueName(String frontName, List<String> namesToAvoid) {
		List<String> namesToAvoidInLowercase = namesToAvoid.stream().map(t -> t.toLowerCase()).collect(Collectors.toList());
		String fullName = "";
		int counter = 0;
		do {
			fullName = frontName + counter;
			counter++;
		} while (namesToAvoidInLowercase.contains(fullName.toLowerCase()));
		return fullName;
	}

	
	/**
	 * Set first char to lower case.
	 * @param input Input string.
	 * @return String with first char lowercase.
	 */
	public static String getFirstCharLowercase(String input) {
		if (input.length() < 2) {
			return input.toLowerCase();
		}
		String firstChar = input.substring(0, 1).toLowerCase();
		return firstChar + input.substring(1, input.length());
	}

	/**
	 * Get bean objects from diagram
	 * @param fp Feature provider
	 * @param parent Container 
	 * @param beanClass Bean type clazz
	 * @return Set of beans
	 */
	public static Set<IBeanCategoryAssignment> getBeanObjectsFromDiagram(IFeatureProvider fp, ContainerShape parent, Class<?> beanClass) {
		Set<IBeanCategoryAssignment> beans = parent.getChildren().stream()
															.map(shape -> fp.getBusinessObjectForPictogramElement(shape))
															.filter(bo -> bo instanceof IBeanCategoryAssignment)
															.map(bo -> (IBeanCategoryAssignment) bo)
															.filter(bo -> bo.getClass().isAssignableFrom(beanClass))
															.collect(Collectors.toSet());		
		return beans;
	}
	
	/**
	 * 
	 * @param beanClass beanClass
	 * @return List if bean object.
	 */
	public static Set<IBeanCategoryAssignment> getBeanObjectsFromDiagramRecursive(IFeatureProvider fp, ContainerShape root, Class<?> beanClass) {
		Set<IBeanCategoryAssignment> beanObjects = new HashSet<IBeanCategoryAssignment>();
		TreeIterator<EObject> allChildren = root.eAllContents();
		
		while (allChildren.hasNext()) {
			EObject eObj = allChildren.next();
			if (eObj instanceof Shape) {
				Shape shape = (Shape) eObj;	
				Object bo = fp.getBusinessObjectForPictogramElement(shape);
				if (bo != null && bo instanceof IBeanCategoryAssignment) {
					IBeanCategoryAssignment bean = (IBeanCategoryAssignment) bo;
					if (bean.getClass().isAssignableFrom(beanClass)) {
						beanObjects.add(bean);
					}
				}
			}
		}
		return beanObjects;
	}
	
	/**
	 * Iterate through pictogram elements and check if any of them need an update.
	 * @param pes List of pictogram elements
	 * @return True, if any of the pictogram element need an update
	 */
	public static boolean pictogramElementsNeedUpdate(IFeatureProvider fp, List<? extends PictogramElement> pes) {
		boolean updateNeeded = false;
		Iterator<? extends PictogramElement> iterator = pes.iterator();
		while (!updateNeeded && iterator.hasNext()) {
			updateNeeded |= pictogramElementNeedsUpdate(fp, iterator.next());
		}
		return updateNeeded;
	}
	
	/**
	 * Pictogram Element Needs Update
	 * @param pe Pictogram Element
	 * @return Boolean
	 */
	public static boolean pictogramElementNeedsUpdate(IFeatureProvider fp, PictogramElement pe) {
		UpdateContext context = new UpdateContext(pe);
		IUpdateFeature feature = fp.getUpdateFeature(context);
		if (feature != null) {
			return feature.updateNeeded(context).toBoolean();
		}
		return false;
	}
	
	/**
	 * Remove all pictogram elements whose domain-element do not exist anymore.
	 * @param pes List of pictogram elements
	 */
	public static boolean removeDeletedPictogramElements(IFeatureProvider fp, List<? extends PictogramElement> pes) {
		List<PictogramElement> toRemove = new ArrayList<>();
		Diagram diagram = fp.getDiagramTypeProvider().getDiagram();
		TaskingEnvironment taskingEnvironment = (TaskingEnvironment) fp.getBusinessObjectForPictogramElement(diagram);
		Map<String, LinkDiagramDomainElement> connectionBeans = TMLDiagramUtil.getConnectionBeans(taskingEnvironment);
		
		for (PictogramElement pe : pes) {
			if (fp.getBusinessObjectForPictogramElement(pe) == null) {
				toRemove.add(pe);
			}
			if (pe instanceof Connection) {
				Connection connection = (Connection) pe;
				
				Object sourceObj = fp.getBusinessObjectForPictogramElement(connection.getStart());
				Object targetObj = fp.getBusinessObjectForPictogramElement(connection.getEnd());
				
				IBeanCategoryAssignment sourceBean = null;
				if (sourceObj instanceof IBeanCategoryAssignment) {
					sourceBean = (IBeanCategoryAssignment) sourceObj;
				}
				IBeanCategoryAssignment targetBean = null;
				if (targetObj instanceof IBeanCategoryAssignment) {
					targetBean = (IBeanCategoryAssignment) targetObj;
				}
				
				if (sourceBean == null || targetBean == null) {
					toRemove.add(pe);
				} else {
					if (!connectionBeans.containsKey(LinkDiagramDomainElement.createUuid(sourceBean, targetBean))) {
						toRemove.add(pe);
					}
				}
			}
		}
		
		toRemove.stream().forEach(pe -> {
			RemoveContext removeContext = new RemoveContext(pe);
			IRemoveFeature feature = fp.getRemoveFeature(removeContext);
			feature.remove(removeContext);
		});
		
		return !toRemove.isEmpty();
	}
	
	/**
	 * 
	 * @param isLink Pictogram element is a link.
	 */
	public static boolean addMissingPorts(IFeatureProvider fp, ContainerShape container) {
		Object bo = fp.getBusinessObjectForPictogramElement(container);
		if (bo instanceof TaskInstance) {
			TaskInstance task = (TaskInstance) bo;
			
			// Add missing task inputs into the diagram
			Set<IBeanCategoryAssignment> taskInputsInDiagram = getBeanObjectsFromDiagram(fp, container, TaskInput.class);
			List<IBeanCategoryAssignment> missingTaskInputs = task.getInputs().stream()
																.filter(node -> !taskInputsInDiagram.contains(node))
																.collect(Collectors.toList());
			missingTaskInputs.forEach(port -> addNodePictogramElement(fp, container, port));	
	
			// Add missing task outputs into the diagram
			Set<IBeanCategoryAssignment> taskOutputsInDiagram = getBeanObjectsFromDiagram(fp, container, TaskOutput.class);
			List<IBeanCategoryAssignment> missingTaskOutputs = task.getOutputs().stream()
															.filter(node -> !taskOutputsInDiagram.contains(node))
															.collect(Collectors.toList());
			missingTaskOutputs.forEach(port -> addNodePictogramElement(fp, container, port));	
				
			return !missingTaskInputs.isEmpty() || !missingTaskOutputs.isEmpty();
		}
		return false;
	}
	
	/**
	 * 
	 * @param isLink Pictogram element is a link.
	 */
	public static boolean addMissingNodes(IFeatureProvider fp) {
		Diagram diagram = fp.getDiagramTypeProvider().getDiagram();
		TaskingEnvironment tasking = (TaskingEnvironment) fp.getBusinessObjectForPictogramElement(diagram);
		
		// Add missing task diagrams
		Set<IBeanCategoryAssignment> tasksInDiagram = getBeanObjectsFromDiagram(fp, diagram, TaskInstance.class);
		List<IBeanCategoryAssignment> missingTasks = tasking.getTasks().stream()
														.filter(node -> !tasksInDiagram.contains(node))
														.collect(Collectors.toList());
		missingTasks.forEach(node -> addNodePictogramElement(fp, diagram, node));	

		// Add missing channel diagrams
		Set<IBeanCategoryAssignment> channelsInDiagram = getBeanObjectsFromDiagram(fp, diagram, Channel.class);
		List<IBeanCategoryAssignment> missingChannels = tasking.getChannels().stream()
															.filter(node -> !channelsInDiagram.contains(node))
															.collect(Collectors.toList());
		missingChannels.forEach(node -> addNodePictogramElement(fp, diagram, node));	

		// Add missing time-event diagrams
		Set<IBeanCategoryAssignment> timeEventsInDiagram = getBeanObjectsFromDiagram(fp, diagram, TimeEvent.class);
		List<IBeanCategoryAssignment> missingEvents = tasking.getTimeEvents().stream()
															.filter(node -> !timeEventsInDiagram.contains(node))
															.collect(Collectors.toList());
		missingEvents.forEach(node -> addNodePictogramElement(fp, diagram, node));
		
		return !missingTasks.isEmpty() || !missingChannels.isEmpty() || !missingEvents.isEmpty();
	}
	
	/**
	 * 
	 * @param isLink Pictogram element is a link.
	 */
	public static boolean addMissingLinks(IFeatureProvider fp) {
		Diagram diagram = fp.getDiagramTypeProvider().getDiagram();
		TaskingEnvironment tasking = (TaskingEnvironment) fp.getBusinessObjectForPictogramElement(diagram);
		
		Map<String, LinkDiagramDomainElement> connectionBeans = TMLDiagramUtil.getConnectionBeans(tasking);
		List<Connection> connections = diagram.getConnections();
		
		boolean madeChanges = false;
		
		for (Map.Entry<String, LinkDiagramDomainElement> pair : connectionBeans.entrySet()) {
			boolean noneMatch = connections.stream().noneMatch(connection -> { 
				IBeanCategoryAssignment sourceBean = null;
				IBeanCategoryAssignment targetBean = null;
				if (fp.getBusinessObjectForPictogramElement(connection.getStart()) != null) {
					sourceBean = (IBeanCategoryAssignment) fp.getBusinessObjectForPictogramElement(connection.getStart());
				}
				if (fp.getBusinessObjectForPictogramElement(connection.getEnd()) != null) {
					targetBean = (IBeanCategoryAssignment) fp.getBusinessObjectForPictogramElement(connection.getEnd());
				}
				if (sourceBean != null || targetBean != null) {
					return pair.getValue().getSourceBean().equals(sourceBean) && pair.getValue().getTargetBean().equals(targetBean);
				}
				return false;
			});
			if (noneMatch) {
				addConnection(fp, pair.getValue().getSourceBean(), pair.getValue().getTargetBean());
				madeChanges = true;
			}
		}
		
		return madeChanges;
	}

	/**
	 * Add node pictogram element.
	 * @param bean Bean object.
	 */
	public static void addNodePictogramElement(IFeatureProvider fp, ContainerShape container, IBeanCategoryAssignment bean) {
		AddContext addContext = new AddContext();
		addContext.setNewObject(bean);
		addContext.setLocation(PADDING, PADDING);
		addContext.setTargetContainer(container);
		fp.addIfPossible(addContext);	
	}
	
	/**
	 * Add a link
	 * @param sourceBean Source bean object.
	 * @param targetBean Target bean object.
	 */
	public static void addConnection(IFeatureProvider fp, IBeanCategoryAssignment sourceBean, IBeanCategoryAssignment targetBean) {
		Anchor sourceAnchor = null;
		Anchor targetAnchor = null;
		
		Diagram diagram = fp.getDiagramTypeProvider().getDiagram();
		
		IBeanCategoryAssignment[] linkObjects = { sourceBean, targetBean };
		final PictogramElement[] pictogramElements = fp.getDiagramTypeProvider()
														.getNotificationService()
														.calculateRelatedPictogramElements(linkObjects);
		
		for (PictogramElement pe : pictogramElements) {
			if (pe instanceof Anchor) {
				IBeanCategoryAssignment bean = (IBeanCategoryAssignment) fp.getBusinessObjectForPictogramElement(pe);
				if (bean.getUuid().equals(sourceBean.getUuid())) {
					sourceAnchor = (Anchor) pe;
				}
				if (bean.getUuid().equals(targetBean.getUuid())) {
					targetAnchor = (Anchor) pe;
				}
			}
		}
		
		if (sourceAnchor != null && targetAnchor != null) {
			AddConnectionContext addConnectionContext = new AddConnectionContext(sourceAnchor, targetAnchor);
			addConnectionContext.setTargetContainer(diagram);
			addConnectionContext.setNewObject(sourceBean);
			fp.addIfPossible(addConnectionContext);
		}
	}
	
	/**
	 * Update pictogram elements, if needed.
	 * @param pes List of pictogram elements.
	 */
	public static boolean updatePictogramElementsIfNeeded(IFeatureProvider fp, List<? extends PictogramElement> pes) {
		boolean madeChanges = false;
		for (PictogramElement pe : pes) {
			UpdateContext context = new UpdateContext(pe);
			IUpdateFeature feature = fp.getUpdateFeature(context);
			if (feature != null) {
				if (feature.updateNeeded(context).toBoolean()) {
					feature.update(context);
					madeChanges = true;
				}
			}
		}
		return madeChanges;
	}
}
