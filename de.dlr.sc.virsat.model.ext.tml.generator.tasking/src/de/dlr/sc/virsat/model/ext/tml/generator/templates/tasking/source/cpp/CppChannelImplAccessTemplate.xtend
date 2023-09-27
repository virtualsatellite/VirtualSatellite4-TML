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

import de.dlr.sc.virsat.model.ext.tml.generator.templates.AbstractTemplate
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel

class CppChannelImplAccessTemplate extends AbstractTemplate {

	def getChannelDeclaration(Channel channel) {
		switch (channel.channelBehavior.typeOf.storageType) {
			case CUSTOM: {
				return ""
			}
			case DOUBLE_BUFFER: {
				return getDoubleBufferDeclaration(channel)
			}
			case EVENT_ONLY: {
			}
			case FIFO: {
			}
			case LIFO: {
			}
		}
	}

	// TODO
	def getDoubleBufferDeclaration(Channel channel) '''
		«getClassName(channel.channelBehavior.typeOf.implName)»<DataTypes::«channel.dataType.name»> «channel.name»;	
	'''

	def getFIFODeclaration(Channel channel) '''
	
	'''
}
