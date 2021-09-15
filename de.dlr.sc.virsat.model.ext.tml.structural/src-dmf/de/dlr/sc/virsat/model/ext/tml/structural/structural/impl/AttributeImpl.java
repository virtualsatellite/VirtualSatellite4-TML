/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition;

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
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl#getReferenceFrame <em>Reference Frame</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl#getTypeUnit <em>Type Unit</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl#isIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl#getValueLiteral <em>Value Literal</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl#getMaxValueLiteral <em>Max Value Literal</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.AttributeImpl#getMinValueLiteral <em>Min Value Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends GenericCategoryImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getTypeOf() <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOf()
	 * @generated
	 * @ordered
	 */
	protected IType typeOf;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> dimensions;

	/**
	 * The cached value of the '{@link #getReferenceFrame() <em>Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrame()
	 * @generated
	 * @ordered
	 */
	protected ReferenceFrameDefinition referenceFrame;

	/**
	 * The cached value of the '{@link #getTypeUnit() <em>Type Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitDefinition typeUnit;

	/**
	 * The default value of the '{@link #isIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConst()
	 * @generated
	 * @ordered
	 */
	protected boolean isConst = IS_CONST_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueLiteral() <em>Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueLiteral() <em>Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String valueLiteral = VALUE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValueLiteral() <em>Max Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxValueLiteral() <em>Max Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String maxValueLiteral = MAX_VALUE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValueLiteral() <em>Min Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinValueLiteral() <em>Min Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String minValueLiteral = MIN_VALUE_LITERAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IType getTypeOf() {
		if (typeOf != null && typeOf.eIsProxy()) {
			InternalEObject oldTypeOf = (InternalEObject)typeOf;
			typeOf = (IType)eResolveProxy(oldTypeOf);
			if (typeOf != oldTypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.ATTRIBUTE__TYPE_OF, oldTypeOf, typeOf));
			}
		}
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType basicGetTypeOf() {
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOf(IType newTypeOf) {
		IType oldTypeOf = typeOf;
		typeOf = newTypeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ATTRIBUTE__TYPE_OF, oldTypeOf, typeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayDimension> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, StructuralPackage.ATTRIBUTE__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceFrameDefinition getReferenceFrame() {
		if (referenceFrame != null && referenceFrame.eIsProxy()) {
			InternalEObject oldReferenceFrame = (InternalEObject)referenceFrame;
			referenceFrame = (ReferenceFrameDefinition)eResolveProxy(oldReferenceFrame);
			if (referenceFrame != oldReferenceFrame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.ATTRIBUTE__REFERENCE_FRAME, oldReferenceFrame, referenceFrame));
			}
		}
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFrameDefinition basicGetReferenceFrame() {
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceFrame(ReferenceFrameDefinition newReferenceFrame) {
		ReferenceFrameDefinition oldReferenceFrame = referenceFrame;
		referenceFrame = newReferenceFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ATTRIBUTE__REFERENCE_FRAME, oldReferenceFrame, referenceFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitDefinition getTypeUnit() {
		if (typeUnit != null && typeUnit.eIsProxy()) {
			InternalEObject oldTypeUnit = (InternalEObject)typeUnit;
			typeUnit = (UnitDefinition)eResolveProxy(oldTypeUnit);
			if (typeUnit != oldTypeUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.ATTRIBUTE__TYPE_UNIT, oldTypeUnit, typeUnit));
			}
		}
		return typeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDefinition basicGetTypeUnit() {
		return typeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeUnit(UnitDefinition newTypeUnit) {
		UnitDefinition oldTypeUnit = typeUnit;
		typeUnit = newTypeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ATTRIBUTE__TYPE_UNIT, oldTypeUnit, typeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsConst() {
		return isConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConst(boolean newIsConst) {
		boolean oldIsConst = isConst;
		isConst = newIsConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ATTRIBUTE__IS_CONST, oldIsConst, isConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueLiteral() {
		return valueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueLiteral(String newValueLiteral) {
		String oldValueLiteral = valueLiteral;
		valueLiteral = newValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ATTRIBUTE__VALUE_LITERAL, oldValueLiteral, valueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxValueLiteral() {
		return maxValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxValueLiteral(String newMaxValueLiteral) {
		String oldMaxValueLiteral = maxValueLiteral;
		maxValueLiteral = newMaxValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ATTRIBUTE__MAX_VALUE_LITERAL, oldMaxValueLiteral, maxValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinValueLiteral() {
		return minValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinValueLiteral(String newMinValueLiteral) {
		String oldMinValueLiteral = minValueLiteral;
		minValueLiteral = newMinValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ATTRIBUTE__MIN_VALUE_LITERAL, oldMinValueLiteral, minValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralPackage.ATTRIBUTE__DIMENSIONS:
				return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
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
			case StructuralPackage.ATTRIBUTE__TYPE_OF:
				if (resolve) return getTypeOf();
				return basicGetTypeOf();
			case StructuralPackage.ATTRIBUTE__DIMENSIONS:
				return getDimensions();
			case StructuralPackage.ATTRIBUTE__REFERENCE_FRAME:
				if (resolve) return getReferenceFrame();
				return basicGetReferenceFrame();
			case StructuralPackage.ATTRIBUTE__TYPE_UNIT:
				if (resolve) return getTypeUnit();
				return basicGetTypeUnit();
			case StructuralPackage.ATTRIBUTE__IS_CONST:
				return isIsConst();
			case StructuralPackage.ATTRIBUTE__VALUE_LITERAL:
				return getValueLiteral();
			case StructuralPackage.ATTRIBUTE__MAX_VALUE_LITERAL:
				return getMaxValueLiteral();
			case StructuralPackage.ATTRIBUTE__MIN_VALUE_LITERAL:
				return getMinValueLiteral();
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
			case StructuralPackage.ATTRIBUTE__TYPE_OF:
				setTypeOf((IType)newValue);
				return;
			case StructuralPackage.ATTRIBUTE__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case StructuralPackage.ATTRIBUTE__REFERENCE_FRAME:
				setReferenceFrame((ReferenceFrameDefinition)newValue);
				return;
			case StructuralPackage.ATTRIBUTE__TYPE_UNIT:
				setTypeUnit((UnitDefinition)newValue);
				return;
			case StructuralPackage.ATTRIBUTE__IS_CONST:
				setIsConst((Boolean)newValue);
				return;
			case StructuralPackage.ATTRIBUTE__VALUE_LITERAL:
				setValueLiteral((String)newValue);
				return;
			case StructuralPackage.ATTRIBUTE__MAX_VALUE_LITERAL:
				setMaxValueLiteral((String)newValue);
				return;
			case StructuralPackage.ATTRIBUTE__MIN_VALUE_LITERAL:
				setMinValueLiteral((String)newValue);
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
			case StructuralPackage.ATTRIBUTE__TYPE_OF:
				setTypeOf((IType)null);
				return;
			case StructuralPackage.ATTRIBUTE__DIMENSIONS:
				getDimensions().clear();
				return;
			case StructuralPackage.ATTRIBUTE__REFERENCE_FRAME:
				setReferenceFrame((ReferenceFrameDefinition)null);
				return;
			case StructuralPackage.ATTRIBUTE__TYPE_UNIT:
				setTypeUnit((UnitDefinition)null);
				return;
			case StructuralPackage.ATTRIBUTE__IS_CONST:
				setIsConst(IS_CONST_EDEFAULT);
				return;
			case StructuralPackage.ATTRIBUTE__VALUE_LITERAL:
				setValueLiteral(VALUE_LITERAL_EDEFAULT);
				return;
			case StructuralPackage.ATTRIBUTE__MAX_VALUE_LITERAL:
				setMaxValueLiteral(MAX_VALUE_LITERAL_EDEFAULT);
				return;
			case StructuralPackage.ATTRIBUTE__MIN_VALUE_LITERAL:
				setMinValueLiteral(MIN_VALUE_LITERAL_EDEFAULT);
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
			case StructuralPackage.ATTRIBUTE__TYPE_OF:
				return typeOf != null;
			case StructuralPackage.ATTRIBUTE__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case StructuralPackage.ATTRIBUTE__REFERENCE_FRAME:
				return referenceFrame != null;
			case StructuralPackage.ATTRIBUTE__TYPE_UNIT:
				return typeUnit != null;
			case StructuralPackage.ATTRIBUTE__IS_CONST:
				return isConst != IS_CONST_EDEFAULT;
			case StructuralPackage.ATTRIBUTE__VALUE_LITERAL:
				return VALUE_LITERAL_EDEFAULT == null ? valueLiteral != null : !VALUE_LITERAL_EDEFAULT.equals(valueLiteral);
			case StructuralPackage.ATTRIBUTE__MAX_VALUE_LITERAL:
				return MAX_VALUE_LITERAL_EDEFAULT == null ? maxValueLiteral != null : !MAX_VALUE_LITERAL_EDEFAULT.equals(maxValueLiteral);
			case StructuralPackage.ATTRIBUTE__MIN_VALUE_LITERAL:
				return MIN_VALUE_LITERAL_EDEFAULT == null ? minValueLiteral != null : !MIN_VALUE_LITERAL_EDEFAULT.equals(minValueLiteral);
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
		result.append(" (isConst: ");
		result.append(isConst);
		result.append(", valueLiteral: ");
		result.append(valueLiteral);
		result.append(", maxValueLiteral: ");
		result.append(maxValueLiteral);
		result.append(", minValueLiteral: ");
		result.append(minValueLiteral);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
