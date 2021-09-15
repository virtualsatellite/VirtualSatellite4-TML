/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.taskingenv.features.links;

import de.dlr.sc.virsat.model.concept.types.category.IBeanCategoryAssignment;

/**
 * This class represents the link domain object of tml-diagram.
 * @author nepa_ay
 *
 */
public class LinkDiagramDomainElement {

	private IBeanCategoryAssignment sourceBean;
	private IBeanCategoryAssignment targetBean;
	private String uuid;
	
	/**
	 * Constructor for TML diagram link object.
	 * @param sourceBean Source bean object of the link.
	 * @param targetBean Target bean object of the link.
	 */
	public LinkDiagramDomainElement(IBeanCategoryAssignment sourceBean, IBeanCategoryAssignment targetBean) {
		this.sourceBean = sourceBean;
		this.targetBean = targetBean;
		this.uuid = createUuid(sourceBean, targetBean);
	}
	
	/**
	 * Get source bean object of the link.
	 * @return Source bean object.
	 */
	public IBeanCategoryAssignment getSourceBean() {
		return this.sourceBean;
	}
	
	/**
	 * Get target bean obejct of the link.
	 * @return Target bean object.
	 */
	public IBeanCategoryAssignment getTargetBean() {
		return this.targetBean;
	}
		
	/**
	 * 
	 * @return Uuid of the link object.
	 */
	public String getUuid() {
		return uuid;
	}
	
	/**
	 * 
	 * @param sourceBean Source bean object of the link.
	 * @param targetBean Target bean object of the link.
	 * @return Uuid of the link.
	 */
	public static String createUuid(IBeanCategoryAssignment sourceBean, IBeanCategoryAssignment targetBean) {
		return sourceBean.getUuid() + "_" + targetBean.getUuid();
	}
			
	/**
	 * 
	 * @param link TML diagram link object.
	 * @return True if source and destination of two links are same.
	 */
	public boolean isSame(LinkDiagramDomainElement link) {
		return link.getSourceBean().getUuid().equals(sourceBean.getUuid()) 
				&& link.getTargetBean().getUuid().equals(targetBean.getUuid());
	}
	
	/**
	 * Compare if the source bean object and the target bean object are of this link.
	 * @param sourceBean Source bean object.
	 * @param targetBean Target bean object.
	 * @return True if source and destination of two links are same.
	 */
	public boolean isSame(IBeanCategoryAssignment sourceBean, IBeanCategoryAssignment targetBean) {
		return sourceBean.getUuid().equals(this.sourceBean.getUuid()) 
				&& targetBean.getUuid().equals(this.targetBean.getUuid());
	}
	
}
