/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.providers;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatDiagramFeatureProvider;
import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatMoveShapeFeature;
import de.dlr.sc.virsat.graphiti.ui.diagram.feature.VirSatRemoveFeature;
import de.dlr.sc.virsat.model.concept.types.structural.BeanStructuralElementInstance;
import de.dlr.sc.virsat.model.dvlm.Repository;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryAssignmentHelper;
import de.dlr.sc.virsat.model.dvlm.structural.StructuralElementInstance;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.model.IEventSource;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInstance;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutput;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.structural.model.TimeEvent;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.TMLDiagramUtil;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.canvas.TMLCanvasAddFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.canvas.TMLCanvasUpdateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.common.nodes.NodeDiagramDeleteFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links.LinkDiagramAddFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links.LinkDiagramCreateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links.LinkDiagramDeleteFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links.LinkDiagramUpdateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.taskports.TaskPortDiagramAddFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.taskports.TaskPortDiagramMoveFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.taskports.TaskPortDiagramResizeFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks.TaskDiagramAddFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks.TaskDiagramCreateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks.TaskDiagramLayoutFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks.TaskDiagramResizeFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.tasks.TaskDiagramUpdateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.triggers.TriggerDiagramAddFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.triggers.TriggerDiagramCreateFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.triggers.TriggerDiagramLayoutFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.triggers.TriggerDiagramResizeFeature;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.triggers.TriggerDiagramUpdateFeature;

/**
 * @author fran_tb
 *
 */
public class TMLDiagramFeatureProvider extends VirSatDiagramFeatureProvider {

	/**
	 * Constructor from super class
	 * @param dtp the diagram type provider
	 */
	public TMLDiagramFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		Object obj = context.getNewObject();
		if (context instanceof IAddConnectionContext) {
			IAddConnectionContext connectionContext = (IAddConnectionContext) context;
			Object source = getBusinessObjectForPictogramElement(connectionContext.getSourceAnchor());
			Object target = getBusinessObjectForPictogramElement(connectionContext.getTargetAnchor());
			if ((source instanceof TaskOutput && target instanceof Channel) 
				|| (source instanceof IEventSource && target instanceof TaskInput)) {
				return new LinkDiagramAddFeature(this);
			}
		} else {
			if (obj instanceof TaskingEnvironment) {
				return new TMLCanvasAddFeature(this);
			} else if (obj instanceof TaskInstance) {
				return new TaskDiagramAddFeature(this);
			} else if (obj instanceof TaskInput || obj instanceof TaskOutput) {
				return new TaskPortDiagramAddFeature(this);
			} else if (obj instanceof Channel || obj instanceof TimeEvent) {
				return new TriggerDiagramAddFeature(this);
			} 
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		Diagram diagram = getDiagramTypeProvider().getDiagram();
		Object obj = getBusinessObjectForPictogramElement(diagram);
		Set<ICreateFeature> createFeatures = new HashSet<ICreateFeature>();
		
		if (obj != null) {
			TaskingEnvironment taskingEnvironment = (TaskingEnvironment) obj;
			for (TaskDefinition taskDefinition : getTaskDefinitions(taskingEnvironment)) {
				createFeatures.add(new TaskDiagramCreateFeature(this, taskDefinition));
			}
			for (ChannelBehaviorDefinition channelBehaviorDefinition : getChannelTypes(taskingEnvironment)) {
				createFeatures.add(new TriggerDiagramCreateFeature(this, channelBehaviorDefinition));
			}
			createFeatures.add(new TriggerDiagramCreateFeature(this));
		}
		
		return createFeatures.stream().toArray(ICreateFeature[]::new);
	}
	
	/**
	 * Get all relevant task definitions 
	 * @param businesObject the diagram object
	 * @return a set of tasks
	 */
	public Set<TaskDefinition> getTaskDefinitions(TaskingEnvironment businesObject) {
		Set<TaskDefinition> tasks = new HashSet<TaskDefinition>();
		Repository repo = CategoryAssignmentHelper.getRepository(businesObject.getTypeInstance());
		for (StructuralElementInstance sei : repo.getRootEntities()) {
			BeanStructuralElementInstance bean = new BeanStructuralElementInstance(sei);
			tasks.addAll(bean.getAll(TaskDefinition.class));
			for (TaskingDefinition taskDef : bean.getAll(TaskingDefinition.class)) {
				tasks.addAll(taskDef.getTaskDefinitions());
			}
			for (StructuralElementInstance treeSei : sei.getDeepChildren()) {
				bean = new BeanStructuralElementInstance(treeSei);
				tasks.addAll(bean.getAll(TaskDefinition.class));
				for (TaskingDefinition taskDef : bean.getAll(TaskingDefinition.class)) {
					tasks.addAll(taskDef.getTaskDefinitions());
				}
			}
			
		}
		return tasks;
	}

	
	/**
	 * Get all relevant task definitions 
	 * @param businesObject the diagram object
	 * @return a set of tasks
	 */
	public Set<ChannelBehaviorDefinition> getChannelTypes(TaskingEnvironment businesObject) {
		Set<ChannelBehaviorDefinition> tasks = new HashSet<ChannelBehaviorDefinition>();
		Repository repo = CategoryAssignmentHelper.getRepository(businesObject.getTypeInstance());
		for (StructuralElementInstance sei : repo.getRootEntities()) {
			BeanStructuralElementInstance bean = new BeanStructuralElementInstance(sei);
			for (TaskingDefinition taskDef : bean.getAll(TaskingDefinition.class)) {
				tasks.addAll(taskDef.getChannelBehaviorDefinitions());
			}
			for (StructuralElementInstance treeSei : sei.getDeepChildren()) {
				bean = new BeanStructuralElementInstance(treeSei);
				for (TaskingDefinition taskDef : bean.getAll(TaskingDefinition.class)) {
					tasks.addAll(taskDef.getChannelBehaviorDefinitions());
				}
			}
			
		}
		return tasks;
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		Diagram diagram = getDiagramTypeProvider().getDiagram();
		Object obj = getBusinessObjectForPictogramElement(diagram);
		Set<ICreateConnectionFeature> createLinkFeatures = new HashSet<ICreateConnectionFeature>();
		if (obj != null) {
			createLinkFeatures.add(new LinkDiagramCreateFeature(this));
		}		
		return createLinkFeatures.stream().toArray(ICreateConnectionFeature[]::new);
	}
	
	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {	
		PictogramElement pe = context.getPictogramElement();
		if (pe instanceof Connection) {
			return new LinkDiagramUpdateFeature(this);
		} else {
			Object obj = getBusinessObjectForPictogramElement(pe);
			if (obj instanceof TaskingEnvironment) {
				return new TMLCanvasUpdateFeature(this);
			} else if (obj instanceof TaskInstance) {
				return new TaskDiagramUpdateFeature(this);
			} else if (obj instanceof Channel || obj instanceof TimeEvent) {
				return new TriggerDiagramUpdateFeature(this);
			}
		}
		return super.getUpdateFeature(context);
	}
	
	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return super.getCustomFeatures(context);
	}

	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		return new VirSatRemoveFeature(this);
	}

	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (pe instanceof Connection) {
			return new LinkDiagramDeleteFeature(this);
		} else {
			Object bo = getBusinessObjectForPictogramElement(pe);
			if (TMLDiagramUtil.isDeletableFromDiagram(bo)) {
				return new NodeDiagramDeleteFeature(this);
			}
		}	
		return null;
	}
	
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		Object obj = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (obj instanceof TaskInstance) {
			return new TaskDiagramLayoutFeature(this);
		} else if (obj instanceof Channel || obj instanceof TimeEvent) {
			return new TriggerDiagramLayoutFeature(this);
		}
		return super.getLayoutFeature(context);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Object obj = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (obj instanceof TaskInstance) {
			return new TaskDiagramResizeFeature(this);
		} else if (obj instanceof TaskInput || obj instanceof TaskOutput) {
			return new TaskPortDiagramResizeFeature(this);
		} else if (obj instanceof Channel || obj instanceof TimeEvent) {
			return new TriggerDiagramResizeFeature(this);
		}
		return super.getResizeShapeFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Object obj = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (obj instanceof TaskInput || obj instanceof TaskOutput) {
			return new TaskPortDiagramMoveFeature(this);
		}
		return new VirSatMoveShapeFeature(this);
	}
	
	@Override
	public IReconnectionFeature getReconnectionFeature(IReconnectionContext context) {
		return null;
	}
}
