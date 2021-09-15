/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl#isAbstractType <em>Abstract Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl#isIsTMType <em>Is TM Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.DataTypeImpl#getSerializedDefinition <em>Serialized Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends ITypeImpl implements DataType {
	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected DataType superType;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The default value of the '{@link #isAbstractType() <em>Abstract Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstractType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstractType() <em>Abstract Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstractType()
	 * @generated
	 * @ordered
	 */
	protected boolean abstractType = ABSTRACT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTMType() <em>Is TM Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTMType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TM_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTMType() <em>Is TM Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTMType()
	 * @generated
	 * @ordered
	 */
	protected boolean isTMType = IS_TM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerializedDefinition() <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIALIZED_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerializedDefinition() <em>Serialized Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedDefinition()
	 * @generated
	 * @ordered
	 */
	protected String serializedDefinition = SERIALIZED_DEFINITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (DataType)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.DATA_TYPE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperType(DataType newSuperType) {
		DataType oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.DATA_TYPE__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, StructuralPackage.DATA_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstractType() {
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractType(boolean newAbstractType) {
		boolean oldAbstractType = abstractType;
		abstractType = newAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.DATA_TYPE__ABSTRACT_TYPE, oldAbstractType, abstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTMType() {
		return isTMType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTMType(boolean newIsTMType) {
		boolean oldIsTMType = isTMType;
		isTMType = newIsTMType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.DATA_TYPE__IS_TM_TYPE, oldIsTMType, isTMType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerializedDefinition() {
		return serializedDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerializedDefinition(String newSerializedDefinition) {
		String oldSerializedDefinition = serializedDefinition;
		serializedDefinition = newSerializedDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.DATA_TYPE__SERIALIZED_DEFINITION, oldSerializedDefinition, serializedDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralPackage.DATA_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case StructuralPackage.DATA_TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case StructuralPackage.DATA_TYPE__ATTRIBUTES:
				return getAttributes();
			case StructuralPackage.DATA_TYPE__ABSTRACT_TYPE:
				return isAbstractType();
			case StructuralPackage.DATA_TYPE__IS_TM_TYPE:
				return isIsTMType();
			case StructuralPackage.DATA_TYPE__SERIALIZED_DEFINITION:
				return getSerializedDefinition();
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
			case StructuralPackage.DATA_TYPE__SUPER_TYPE:
				setSuperType((DataType)newValue);
				return;
			case StructuralPackage.DATA_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case StructuralPackage.DATA_TYPE__ABSTRACT_TYPE:
				setAbstractType((Boolean)newValue);
				return;
			case StructuralPackage.DATA_TYPE__IS_TM_TYPE:
				setIsTMType((Boolean)newValue);
				return;
			case StructuralPackage.DATA_TYPE__SERIALIZED_DEFINITION:
				setSerializedDefinition((String)newValue);
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
			case StructuralPackage.DATA_TYPE__SUPER_TYPE:
				setSuperType((DataType)null);
				return;
			case StructuralPackage.DATA_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case StructuralPackage.DATA_TYPE__ABSTRACT_TYPE:
				setAbstractType(ABSTRACT_TYPE_EDEFAULT);
				return;
			case StructuralPackage.DATA_TYPE__IS_TM_TYPE:
				setIsTMType(IS_TM_TYPE_EDEFAULT);
				return;
			case StructuralPackage.DATA_TYPE__SERIALIZED_DEFINITION:
				setSerializedDefinition(SERIALIZED_DEFINITION_EDEFAULT);
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
			case StructuralPackage.DATA_TYPE__SUPER_TYPE:
				return superType != null;
			case StructuralPackage.DATA_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case StructuralPackage.DATA_TYPE__ABSTRACT_TYPE:
				return abstractType != ABSTRACT_TYPE_EDEFAULT;
			case StructuralPackage.DATA_TYPE__IS_TM_TYPE:
				return isTMType != IS_TM_TYPE_EDEFAULT;
			case StructuralPackage.DATA_TYPE__SERIALIZED_DEFINITION:
				return SERIALIZED_DEFINITION_EDEFAULT == null ? serializedDefinition != null : !SERIALIZED_DEFINITION_EDEFAULT.equals(serializedDefinition);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (abstractType: ");
		result.append(abstractType);
		result.append(", isTMType: ");
		result.append(isTMType);
		result.append(", serializedDefinition: ");
		result.append(serializedDefinition);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
