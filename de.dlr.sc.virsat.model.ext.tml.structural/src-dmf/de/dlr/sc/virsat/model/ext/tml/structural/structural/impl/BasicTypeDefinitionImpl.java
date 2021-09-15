/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumValueType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.BasicTypeDefinitionImpl#isCustomSource <em>Custom Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicTypeDefinitionImpl extends ITypeImpl implements BasicTypeDefinition {
	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumValueType VALUE_TYPE_EDEFAULT = EnumValueType.INTEGER;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected EnumValueType valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCustomSource() <em>Custom Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOM_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomSource() <em>Custom Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomSource()
	 * @generated
	 * @ordered
	 */
	protected boolean customSource = CUSTOM_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.BASIC_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValueType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueType(EnumValueType newValueType) {
		EnumValueType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.BASIC_TYPE_DEFINITION__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.BASIC_TYPE_DEFINITION__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.BASIC_TYPE_DEFINITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCustomSource() {
		return customSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomSource(boolean newCustomSource) {
		boolean oldCustomSource = customSource;
		customSource = newCustomSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.BASIC_TYPE_DEFINITION__CUSTOM_SOURCE, oldCustomSource, customSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralPackage.BASIC_TYPE_DEFINITION__VALUE_TYPE:
				return getValueType();
			case StructuralPackage.BASIC_TYPE_DEFINITION__SIZE:
				return getSize();
			case StructuralPackage.BASIC_TYPE_DEFINITION__SOURCE:
				return getSource();
			case StructuralPackage.BASIC_TYPE_DEFINITION__CUSTOM_SOURCE:
				return isCustomSource();
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
			case StructuralPackage.BASIC_TYPE_DEFINITION__VALUE_TYPE:
				setValueType((EnumValueType)newValue);
				return;
			case StructuralPackage.BASIC_TYPE_DEFINITION__SIZE:
				setSize((Integer)newValue);
				return;
			case StructuralPackage.BASIC_TYPE_DEFINITION__SOURCE:
				setSource((String)newValue);
				return;
			case StructuralPackage.BASIC_TYPE_DEFINITION__CUSTOM_SOURCE:
				setCustomSource((Boolean)newValue);
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
			case StructuralPackage.BASIC_TYPE_DEFINITION__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case StructuralPackage.BASIC_TYPE_DEFINITION__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case StructuralPackage.BASIC_TYPE_DEFINITION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case StructuralPackage.BASIC_TYPE_DEFINITION__CUSTOM_SOURCE:
				setCustomSource(CUSTOM_SOURCE_EDEFAULT);
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
			case StructuralPackage.BASIC_TYPE_DEFINITION__VALUE_TYPE:
				return valueType != VALUE_TYPE_EDEFAULT;
			case StructuralPackage.BASIC_TYPE_DEFINITION__SIZE:
				return size != SIZE_EDEFAULT;
			case StructuralPackage.BASIC_TYPE_DEFINITION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case StructuralPackage.BASIC_TYPE_DEFINITION__CUSTOM_SOURCE:
				return customSource != CUSTOM_SOURCE_EDEFAULT;
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
		result.append(" (valueType: ");
		result.append(valueType);
		result.append(", size: ");
		result.append(size);
		result.append(", source: ");
		result.append(source);
		result.append(", customSource: ");
		result.append(customSource);
		result.append(')');
		return result.toString();
	}

} //BasicTypeDefinitionImpl
