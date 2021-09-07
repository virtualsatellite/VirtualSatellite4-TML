/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural.impl;

import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumerationLiteral;
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
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationImpl#getSerializedDefinition <em>Serialized Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends ITypeImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> literals;

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
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationLiteral> getLiterals() {
		if (literals == null) {
			literals = new EObjectContainmentEList<EnumerationLiteral>(EnumerationLiteral.class, this, StructuralPackage.ENUMERATION__LITERALS);
		}
		return literals;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.ENUMERATION__SERIALIZED_DEFINITION, oldSerializedDefinition, serializedDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralPackage.ENUMERATION__LITERALS:
				return ((InternalEList<?>)getLiterals()).basicRemove(otherEnd, msgs);
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
			case StructuralPackage.ENUMERATION__LITERALS:
				return getLiterals();
			case StructuralPackage.ENUMERATION__SERIALIZED_DEFINITION:
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
			case StructuralPackage.ENUMERATION__LITERALS:
				getLiterals().clear();
				getLiterals().addAll((Collection<? extends EnumerationLiteral>)newValue);
				return;
			case StructuralPackage.ENUMERATION__SERIALIZED_DEFINITION:
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
			case StructuralPackage.ENUMERATION__LITERALS:
				getLiterals().clear();
				return;
			case StructuralPackage.ENUMERATION__SERIALIZED_DEFINITION:
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
			case StructuralPackage.ENUMERATION__LITERALS:
				return literals != null && !literals.isEmpty();
			case StructuralPackage.ENUMERATION__SERIALIZED_DEFINITION:
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
		result.append(" (serializedDefinition: ");
		result.append(serializedDefinition);
		result.append(')');
		return result.toString();
	}

} //EnumerationImpl
