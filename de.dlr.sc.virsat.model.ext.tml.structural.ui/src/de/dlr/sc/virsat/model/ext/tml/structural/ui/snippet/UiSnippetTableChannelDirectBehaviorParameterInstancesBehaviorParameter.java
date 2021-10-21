/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.ui.snippet;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.dlr.sc.virsat.model.dvlm.categories.ATypeInstance;
import de.dlr.sc.virsat.model.dvlm.categories.Category;
import de.dlr.sc.virsat.model.dvlm.categories.CategoryAssignment;
import de.dlr.sc.virsat.model.dvlm.categories.propertydefinitions.AProperty;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ArrayInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.ComposedPropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.PropertyinstancesPackage;
import de.dlr.sc.virsat.model.dvlm.categories.util.CategoryInstantiator;
import de.dlr.sc.virsat.model.dvlm.concepts.Concept;
import de.dlr.sc.virsat.model.dvlm.concepts.util.ActiveConceptHelper;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.BehaviorParameter;
import de.dlr.sc.virsat.model.ext.tml.behavioral.model.BehavioralParameterDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.model.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.ui.diagram.Activator;
import de.dlr.sc.virsat.uiengine.ui.cellEditor.aproperties.ValuePropertyCellEditingSupport;
import de.dlr.sc.virsat.uiengine.ui.editor.snippets.AUiSnippetArrayInstanceCategoryTable;
import de.dlr.sc.virsat.uiengine.ui.editor.snippets.IUiSnippet;


/**
 * Auto Generated Abstract Generator Gap Class
 * 
 * Don't Manually modify this class
 * 
 * Instance of a channel behavior definition
 * 
 */	
public class UiSnippetTableChannelDirectBehaviorParameterInstancesBehaviorParameter extends AUiSnippetArrayInstanceCategoryTable implements IUiSnippet {

	/**
	 * 
	 */
	public UiSnippetTableChannelDirectBehaviorParameterInstancesBehaviorParameter() {
		super("de.dlr.sc.virsat.model.ext.tml.behavioral",
			"BehaviorParameter",
			"parameterInstances",
			"ChannelBehavior",
			"de.dlr.sc.virsat.model.ext.tml.behavioral.BehaviorParameter",
			STYLE_EDITOR_BUTTON);
		hideNameColumn = true;
		snippetImplementation.getPropertyInstanceValueSwitch().setShowLocationForReferenceValues(false);
	}
	
	@Override
	public void setDataBinding(DataBindingContext dbCtx, EditingDomain editingDomain, EObject model) {
		Channel channel = new Channel((CategoryAssignment) model);
		super.setDataBinding(dbCtx, editingDomain, channel.getChannelBehavior().getATypeInstance());
	}
	
	@Override
	public void createSwt(FormToolkit toolkit, EditingDomain editingDomain, Composite composite, EObject initModel) {
		Channel channel = new Channel((CategoryAssignment) initModel);
		super.createSwt(toolkit, editingDomain, composite, channel.getChannelBehavior().getATypeInstance());
	}
	
	@Override
	protected Command createAddCommand(EditingDomain editingDomain, Concept activeConcept) {
		return create(editingDomain, getArrayInstance(model),  ActiveConceptHelper.getCategory(activeConcept, "BehaviorParameter"));
	}
	
	public Command create(EditingDomain editingDomain, ArrayInstance arrayInstance, Category type) {
		ATypeInstance ati = new CategoryInstantiator().generateInstance(arrayInstance, type);
		return AddCommand.create(editingDomain, arrayInstance, PropertyinstancesPackage.Literals.ARRAY_INSTANCE__ARRAY_INSTANCES, ati);
	}
	
	@Override
	public boolean isActive(EObject model) {
		if (!(model instanceof CategoryAssignment)) {
			return false;
		}
		
		CategoryAssignment ca = (CategoryAssignment) model;
		String typeName = ca.getType().getName();
		
		return typeName.equals("Channel");
	}
	
	@Override
	protected EditingSupport createEditingSupport(EditingDomain editingDomain, AProperty property) {
		if (property.getFullQualifiedName().equals(BehaviorParameter.FULL_QUALIFIED_CATEGORY_NAME + "." + BehaviorParameter.PROPERTY_VALUE)) {
			return new ValuePropertyCellEditingSupport(editingDomain, columnViewer, property) {
				@Override
				protected void setValue(Object element, Object userInputValue) {
					ComposedPropertyInstance propInstance = (ComposedPropertyInstance) element;
					BehaviorParameter behaviorPram = new BehaviorParameter((CategoryAssignment) propInstance.getTypeInstance()); // Nested in a composed property instance in an array instance
					String expectedValueType = behaviorPram.getTypeOf().getValueType();
					
					try {
						switch (expectedValueType) {
							case BehavioralParameterDefinition.VALUETYPE_STRING_NAME:
								super.setValue(element, userInputValue);
								break;
							case BehavioralParameterDefinition.VALUETYPE_FLOAT_NAME:
								Double.parseDouble((String) userInputValue);	//If cannot parsed it throws a number format exception which is catched later
								super.setValue(element, userInputValue);
								break;	
							case BehavioralParameterDefinition.VALUETYPE_INTEGER_NAME:
								Integer.parseInt((String) userInputValue);	//If cannot parsed it throws a number format exception which is catched later
								super.setValue(element, userInputValue);
								break;
		
							default:
								super.setValue(element, userInputValue);
						}
					} catch (NumberFormatException e) {
						Activator.getDefault().getLog().warn("Could not parse value " + userInputValue + "! Ignoring!");
					}
				}
			};
		}
		return super.createEditingSupport(editingDomain, property);
	}
	
}
