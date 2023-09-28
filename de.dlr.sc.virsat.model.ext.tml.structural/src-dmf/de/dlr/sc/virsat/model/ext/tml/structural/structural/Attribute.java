/**
 */
package de.dlr.sc.virsat.model.ext.tml.structural.structural;

import org.eclipse.emf.common.util.EList;

import de.dlr.sc.virsat.model.ext.core.core.GenericCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getReferenceFrame <em>Reference Frame</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getTypeUnit <em>Type Unit</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#isIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getValueLiteral <em>Value Literal</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getMaxValueLiteral <em>Max Value Literal</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getMinValueLiteral <em>Min Value Literal</em>}</li>
 * </ul>
 *
 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends GenericCategory {
	/**
	 * Returns the value of the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of</em>' reference.
	 * @see #setTypeOf(IType)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute_TypeOf()
	 * @model
	 * @generated
	 */
	IType getTypeOf();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getTypeOf <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of</em>' reference.
	 * @see #getTypeOf()
	 * @generated
	 */
	void setTypeOf(IType value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dlr.sc.virsat.model.ext.tml.structural.structural.ArrayDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayDimension> getDimensions();

	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Frame</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Frame</em>' reference.
	 * @see #setReferenceFrame(ReferenceFrameDefinition)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute_ReferenceFrame()
	 * @model
	 * @generated
	 */
	ReferenceFrameDefinition getReferenceFrame();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getReferenceFrame <em>Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(ReferenceFrameDefinition value);

	/**
	 * Returns the value of the '<em><b>Type Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Unit</em>' reference.
	 * @see #setTypeUnit(UnitDefinition)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute_TypeUnit()
	 * @model
	 * @generated
	 */
	UnitDefinition getTypeUnit();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getTypeUnit <em>Type Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Unit</em>' reference.
	 * @see #getTypeUnit()
	 * @generated
	 */
	void setTypeUnit(UnitDefinition value);

	/**
	 * Returns the value of the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Const</em>' attribute.
	 * @see #setIsConst(boolean)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute_IsConst()
	 * @model
	 * @generated
	 */
	boolean isIsConst();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#isIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #isIsConst()
	 * @generated
	 */
	void setIsConst(boolean value);

	/**
	 * Returns the value of the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Literal</em>' attribute.
	 * @see #setValueLiteral(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute_ValueLiteral()
	 * @model
	 * @generated
	 */
	String getValueLiteral();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getValueLiteral <em>Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Literal</em>' attribute.
	 * @see #getValueLiteral()
	 * @generated
	 */
	void setValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Max Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Literal</em>' attribute.
	 * @see #setMaxValueLiteral(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute_MaxValueLiteral()
	 * @model
	 * @generated
	 */
	String getMaxValueLiteral();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getMaxValueLiteral <em>Max Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Literal</em>' attribute.
	 * @see #getMaxValueLiteral()
	 * @generated
	 */
	void setMaxValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Min Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Literal</em>' attribute.
	 * @see #setMinValueLiteral(String)
	 * @see de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage#getAttribute_MinValueLiteral()
	 * @model
	 * @generated
	 */
	String getMinValueLiteral();

	/**
	 * Sets the value of the '{@link de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute#getMinValueLiteral <em>Min Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Literal</em>' attribute.
	 * @see #getMinValueLiteral()
	 * @generated
	 */
	void setMinValueLiteral(String value);

} // Attribute
