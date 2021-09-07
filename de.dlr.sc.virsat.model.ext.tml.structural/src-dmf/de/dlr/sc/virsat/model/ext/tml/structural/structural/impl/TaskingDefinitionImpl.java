/**
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;

import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ExternalType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tasking Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl#getBasicTypeDefinitions <em>Basic Type Definitions</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl#getExternalTypes <em>External Types</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl#getChannelBehaviorDefinitions <em>Channel Behavior Definitions</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl#getTaskDefinitions <em>Task Definitions</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl#getReferenceFrames <em>Reference Frames</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TaskingDefinitionImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskingDefinitionImpl extends GenericCategoryImpl implements TaskingDefinition {
	/**
	 * The cached value of the '{@link #getBasicTypeDefinitions() <em>Basic Type Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicTypeDefinition> basicTypeDefinitions;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumerations;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * The cached value of the '{@link #getExternalTypes() <em>External Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalType> externalTypes;

	/**
	 * The cached value of the '{@link #getChannelBehaviorDefinitions() <em>Channel Behavior Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelBehaviorDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelBehaviorDefinition> channelBehaviorDefinitions;

	/**
	 * The cached value of the '{@link #getTaskDefinitions() <em>Task Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskDefinition> taskDefinitions;

	/**
	 * The cached value of the '{@link #getReferenceFrames() <em>Reference Frames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrames()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceFrameDefinition> referenceFrames;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitDefinition> units;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskingDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.TASKING_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicTypeDefinition> getBasicTypeDefinitions() {
		if (basicTypeDefinitions == null) {
			basicTypeDefinitions = new EObjectContainmentEList<BasicTypeDefinition>(BasicTypeDefinition.class, this, StructuralPackage.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS);
		}
		return basicTypeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enumeration> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, StructuralPackage.TASKING_DEFINITION__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, StructuralPackage.TASKING_DEFINITION__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalType> getExternalTypes() {
		if (externalTypes == null) {
			externalTypes = new EObjectContainmentEList<ExternalType>(ExternalType.class, this, StructuralPackage.TASKING_DEFINITION__EXTERNAL_TYPES);
		}
		return externalTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceFrameDefinition> getReferenceFrames() {
		if (referenceFrames == null) {
			referenceFrames = new EObjectContainmentEList<ReferenceFrameDefinition>(ReferenceFrameDefinition.class, this, StructuralPackage.TASKING_DEFINITION__REFERENCE_FRAMES);
		}
		return referenceFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnitDefinition> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<UnitDefinition>(UnitDefinition.class, this, StructuralPackage.TASKING_DEFINITION__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChannelBehaviorDefinition> getChannelBehaviorDefinitions() {
		if (channelBehaviorDefinitions == null) {
			channelBehaviorDefinitions = new EObjectContainmentEList<ChannelBehaviorDefinition>(ChannelBehaviorDefinition.class, this, StructuralPackage.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS);
		}
		return channelBehaviorDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskDefinition> getTaskDefinitions() {
		if (taskDefinitions == null) {
			taskDefinitions = new EObjectContainmentEList<TaskDefinition>(TaskDefinition.class, this, StructuralPackage.TASKING_DEFINITION__TASK_DEFINITIONS);
		}
		return taskDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralPackage.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS:
				return ((InternalEList<?>)getBasicTypeDefinitions()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_DEFINITION__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_DEFINITION__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_DEFINITION__EXTERNAL_TYPES:
				return ((InternalEList<?>)getExternalTypes()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS:
				return ((InternalEList<?>)getChannelBehaviorDefinitions()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_DEFINITION__TASK_DEFINITIONS:
				return ((InternalEList<?>)getTaskDefinitions()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_DEFINITION__REFERENCE_FRAMES:
				return ((InternalEList<?>)getReferenceFrames()).basicRemove(otherEnd, msgs);
			case StructuralPackage.TASKING_DEFINITION__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralPackage.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS:
				return getBasicTypeDefinitions();
			case StructuralPackage.TASKING_DEFINITION__ENUMERATIONS:
				return getEnumerations();
			case StructuralPackage.TASKING_DEFINITION__DATA_TYPES:
				return getDataTypes();
			case StructuralPackage.TASKING_DEFINITION__EXTERNAL_TYPES:
				return getExternalTypes();
			case StructuralPackage.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS:
				return getChannelBehaviorDefinitions();
			case StructuralPackage.TASKING_DEFINITION__TASK_DEFINITIONS:
				return getTaskDefinitions();
			case StructuralPackage.TASKING_DEFINITION__REFERENCE_FRAMES:
				return getReferenceFrames();
			case StructuralPackage.TASKING_DEFINITION__UNITS:
				return getUnits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuralPackage.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS:
				getBasicTypeDefinitions().clear();
				getBasicTypeDefinitions().addAll((Collection<? extends BasicTypeDefinition>)newValue);
				return;
			case StructuralPackage.TASKING_DEFINITION__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case StructuralPackage.TASKING_DEFINITION__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case StructuralPackage.TASKING_DEFINITION__EXTERNAL_TYPES:
				getExternalTypes().clear();
				getExternalTypes().addAll((Collection<? extends ExternalType>)newValue);
				return;
			case StructuralPackage.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS:
				getChannelBehaviorDefinitions().clear();
				getChannelBehaviorDefinitions().addAll((Collection<? extends ChannelBehaviorDefinition>)newValue);
				return;
			case StructuralPackage.TASKING_DEFINITION__TASK_DEFINITIONS:
				getTaskDefinitions().clear();
				getTaskDefinitions().addAll((Collection<? extends TaskDefinition>)newValue);
				return;
			case StructuralPackage.TASKING_DEFINITION__REFERENCE_FRAMES:
				getReferenceFrames().clear();
				getReferenceFrames().addAll((Collection<? extends ReferenceFrameDefinition>)newValue);
				return;
			case StructuralPackage.TASKING_DEFINITION__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends UnitDefinition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructuralPackage.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS:
				getBasicTypeDefinitions().clear();
				return;
			case StructuralPackage.TASKING_DEFINITION__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case StructuralPackage.TASKING_DEFINITION__DATA_TYPES:
				getDataTypes().clear();
				return;
			case StructuralPackage.TASKING_DEFINITION__EXTERNAL_TYPES:
				getExternalTypes().clear();
				return;
			case StructuralPackage.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS:
				getChannelBehaviorDefinitions().clear();
				return;
			case StructuralPackage.TASKING_DEFINITION__TASK_DEFINITIONS:
				getTaskDefinitions().clear();
				return;
			case StructuralPackage.TASKING_DEFINITION__REFERENCE_FRAMES:
				getReferenceFrames().clear();
				return;
			case StructuralPackage.TASKING_DEFINITION__UNITS:
				getUnits().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructuralPackage.TASKING_DEFINITION__BASIC_TYPE_DEFINITIONS:
				return basicTypeDefinitions != null && !basicTypeDefinitions.isEmpty();
			case StructuralPackage.TASKING_DEFINITION__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case StructuralPackage.TASKING_DEFINITION__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case StructuralPackage.TASKING_DEFINITION__EXTERNAL_TYPES:
				return externalTypes != null && !externalTypes.isEmpty();
			case StructuralPackage.TASKING_DEFINITION__CHANNEL_BEHAVIOR_DEFINITIONS:
				return channelBehaviorDefinitions != null && !channelBehaviorDefinitions.isEmpty();
			case StructuralPackage.TASKING_DEFINITION__TASK_DEFINITIONS:
				return taskDefinitions != null && !taskDefinitions.isEmpty();
			case StructuralPackage.TASKING_DEFINITION__REFERENCE_FRAMES:
				return referenceFrames != null && !referenceFrames.isEmpty();
			case StructuralPackage.TASKING_DEFINITION__UNITS:
				return units != null && !units.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskingDefinitionImpl
