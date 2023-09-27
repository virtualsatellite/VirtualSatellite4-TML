/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.dvlm.general.IUuid;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ChannelImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ChannelImpl#getChannelBehavior <em>Channel Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends IEventSourceImpl implements Channel {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The cached value of the '{@link #getChannelBehavior() <em>Channel Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelBehavior()
	 * @generated
	 * @ordered
	 */
	protected de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior channelBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.CHANNEL__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.CHANNEL__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior getChannelBehavior() {
		return channelBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelBehavior(de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior newChannelBehavior, NotificationChain msgs) {
		de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior oldChannelBehavior = channelBehavior;
		channelBehavior = newChannelBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR, oldChannelBehavior, newChannelBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelBehavior(de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior newChannelBehavior) {
		if (newChannelBehavior != channelBehavior) {
			NotificationChain msgs = null;
			if (channelBehavior != null)
				msgs = ((InternalEObject)channelBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR, null, msgs);
			if (newChannelBehavior != null)
				msgs = ((InternalEObject)newChannelBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR, null, msgs);
			msgs = basicSetChannelBehavior(newChannelBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR, newChannelBehavior, newChannelBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR:
				return basicSetChannelBehavior(null, msgs);
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
			case StructuralPackage.CHANNEL__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR:
				return getChannelBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuralPackage.CHANNEL__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR:
				setChannelBehavior((de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior)newValue);
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
			case StructuralPackage.CHANNEL__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR:
				setChannelBehavior((de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehavior)null);
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
			case StructuralPackage.CHANNEL__DATA_TYPE:
				return dataType != null;
			case StructuralPackage.CHANNEL__CHANNEL_BEHAVIOR:
				return channelBehavior != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public boolean equals(Object channel){
		if(channel instanceof IUuid){
			return ((IUuid) channel).getUuid().toString().equals(getUuid().toString());
		}
		return false;
	}

} //ChannelImpl
