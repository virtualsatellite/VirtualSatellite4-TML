/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp.AbstractCppTemplate

/**
 * @author nepa_ay
 *
 */
class CppAbstractChannelTemplate extends AbstractCppTemplate {
	
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	
	new () {
	}
	
	override String compileAbstractHeader() {
		throw new UnsupportedOperationException("No Abstract Source")
	}
	
	override compileAbstractSource() {
		throw new UnsupportedOperationException("No Abstract Source")
	}
	
	override compileHeader() '''
			#ifndef «getConstantsName(gcp.getAbstractChannelClassName())»_H_
			#define «getConstantsName(gcp.getAbstractChannelClassName())»_H_
			
			#include "taskChannel.h"
			
			namespace «gcp.projectName» {
			
				template <typename T>
				class «gcp.getAbstractChannelClassName()» : public Tasking::TaskChannel {
				public:
				    «gcp.getAbstractChannelClassName()»():TaskChannel(){}
				    virtual ~«gcp.getAbstractChannelClassName()»(){}
				    virtual T* allocate(void) = 0;
					virtual bool push(T* data) = 0;
					virtual bool push(T& data) = 0;
					virtual T* pop(void) = 0;
					virtual bool isEmpty(void) const = 0;
					virtual void push () {
					    Tasking::TaskChannel::push();
					}
				};
			}
			#endif /*  «getConstantsName(gcp.getAbstractChannelClassName())»_H_ */
		'''
	
	override compileSource() {
		throw new UnsupportedOperationException("No Concrete Source")
	}
	
}
	