/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
 * Queue class template for fifo channel
 */
class CppQueueTemplate extends AbstractCppTemplate {
	
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	
	new () {
		
	}
		
	override String compileAbstractHeader() {
		throw new UnsupportedOperationException("No Abstract Header")
	}
	
	override compileAbstractSource() {
		throw new UnsupportedOperationException("No Abstract Source")
	}
	
	override compileHeader() '''
			#ifndef «getConstantsName(gcp.queueClassName)»_H_
			#define «getConstantsName(gcp.queueClassName)»_H_
			
			#include <stdint.h>
			#include <utility>
			
			namespace «gcp.projectName» {
				
				template <typename T, unsigned int SIZE>
				class «gcp.queueClassName» {
				
				public:
					«gcp.queueClassName»() {
						head=0;
						tail=0;
						emptyFlag = true;
					}
				
					virtual ~«gcp.queueClassName»(){
						
					};
				
					/**
					 * clears the complete list
					 */
					void clear() {
						head=0;
						tail=0;
						emptyFlag = true;
					}
				
					/**
					 * Pushes one element to the end of the queue
					 */
					bool enqueue(T* element) {
						if((head == tail) && (!emptyFlag))
						{
							tail = (tail + 1)%SIZE;
						}
						buffer[head] = element;
						head = (head + 1)%SIZE;
						emptyFlag = false;
						return true;
					}
				
					/**
					 * Removes and returns one element from the start of the queue
					 */
					T* dequeue() {
						T* result = std::move(buffer[tail]);
						if(!emptyFlag)
						{
							tail = (tail + 1)%SIZE;
							emptyFlag = tail == head;
						}
						return result;
					}
				
				    void rewind(int count) {
				        tail -= count;
				        if(tail<0)
				        {
				            tail += SIZE;
				        }
				    }
				
					bool isEmpty() const {
						return emptyFlag;
					}
				
					T* getElement(int32_t elementPos) {
						return buffer[(tail+elementPos)%SIZE];
					}
				
					int32_t getSize() {
						if(isEmpty()) return 0;
						if(head==tail && !emptyFlag) return SIZE;
				
						return ((head-tail)+SIZE)%SIZE;
					}
				
				private:
					int32_t head;
					int32_t tail;
				
					T* buffer [SIZE];
					bool emptyFlag;
				};
			}
			#endif /*  «getConstantsName(gcp.queueClassName)»_H_ */
		'''
	
	override compileSource() {
		throw new UnsupportedOperationException("No Concrete Source")
	}
	
}
	