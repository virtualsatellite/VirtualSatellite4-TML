/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.configuration.ui.snippet;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.dlr.sc.virsat.model.dvlm.categories.propertydefinitions.AProperty;
import de.dlr.sc.virsat.model.dvlm.categories.propertydefinitions.StringProperty;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.APropertyInstance;
import de.dlr.sc.virsat.model.dvlm.categories.propertyinstances.PropertyinstancesPackage;
import de.dlr.sc.virsat.model.ext.tml.generator.TMLGenerator;
import de.dlr.sc.virsat.uiengine.ui.editor.snippets.IUiSnippet;

/**
 * Auto Generated Class inheriting from Generator Gap Class
 * 
 * This class is generated once, do your changes here
 * 
 * Contains all generator related configuration
 * 
 */
@SuppressWarnings("deprecation")
public class UiSnippetSectionGenerationConfiguration extends AUiSnippetSectionGenerationConfiguration
		implements IUiSnippet {

	private static final String VERSION_PROPERTY_NAME = "taskingVersion";
	protected ComboViewer comboViewerVersion = null;
	protected Combo comboVersion = null;
	protected AProperty versionProperty = null;

	@Override
	protected void createStringPropertyWidgets(FormToolkit toolkit, Composite sectionBody, StringProperty property) {
		versionProperty = property;
		if (property.getName().equals(VERSION_PROPERTY_NAME)) {
			createVersionPropertyWidget(toolkit, sectionBody, property);
			// super.createStringPropertyWidgets(toolkit, sectionBody, property);
		} else {
			super.createStringPropertyWidgets(toolkit, sectionBody, property);
		}
	}

	/**
	 * Create a widget to select the tasking version from registered generators
	 * 
	 * @param toolkit
	 *            the toolkit which should be used to create the widgets
	 * @param sectionBody
	 *            the section body in which the widgets should be placed
	 * @param property
	 *            the property on which these widgets should act
	 */
	protected void createVersionPropertyWidget(FormToolkit toolkit, Composite sectionBody, StringProperty property) {
		comboViewerVersion = new ComboViewer(sectionBody, SWT.NONE);
		comboVersion = comboViewerVersion.getCombo();

		GridData gridData = createDefaultGridData();
		gridData.horizontalSpan = UI_LAYOUT_SPAN_COLUMNS_3;
		comboVersion.setLayoutData(gridData);
		comboViewerVersion.setContentProvider(new ArrayContentProvider());
		comboViewerVersion.setInput(TMLGenerator.getGeneratorList());
		

	}


	@SuppressWarnings({ "unchecked" })
	@Override
	public void setDataBinding(DataBindingContext dbCtx, EditingDomain editingDomain, EObject model) {
		APropertyInstance propertyInstance = null;
		for (APropertyInstance instance : caModel.getPropertyInstances()) {
			if (versionProperty.equals((AProperty) instance.getType())) {
				propertyInstance = instance;
			}
		}

		IValueProperty<EObject, ?> uvpiUnitProperty = EMFEditProperties.value(editingDomain,
				PropertyinstancesPackage.Literals.VALUE_PROPERTY_INSTANCE__VALUE);
		dbCtx.bindValue(ViewerProperties.singleSelection().observe(comboViewerVersion),
				uvpiUnitProperty.observe(propertyInstance));

		super.setDataBinding(dbCtx, editingDomain, model);

	}

}
