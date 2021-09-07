/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tasking Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getBasicTypeDefinitions <em>Basic Type Definitions</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getExternalTypes <em>External Types</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getChannelBehaviorDefinitions <em>Channel Behavior Definitions</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getTaskDefinitions <em>Task Definitions</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getReferenceFrames <em>Reference Frames</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition()
 * @model
 * @generated
 */
public interface TaskingDefinition extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Basic Type Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Type Definitions</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition_BasicTypeDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicTypeDefinition> getBasicTypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>External Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ExternalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Types</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition_ExternalTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalType> getExternalTypes();

	/**
	 * Returns the value of the '<em><b>Reference Frames</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Frames</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition_ReferenceFrames()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceFrameDefinition> getReferenceFrames();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitDefinition> getUnits();

	/**
	 * Returns the value of the '<em><b>Channel Behavior Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Behavior Definitions</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition_ChannelBehaviorDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChannelBehaviorDefinition> getChannelBehaviorDefinitions();

	/**
	 * Returns the value of the '<em><b>Task Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Definitions</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getTaskingDefinition_TaskDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskDefinition> getTaskDefinitions();

} // TaskingDefinition
