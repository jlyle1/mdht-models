/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapability;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitLevelOfCareCapabilityOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Level Of Care Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnitLevelOfCareCapabilityImpl extends ObservationImpl implements UnitLevelOfCareCapability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitLevelOfCareCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.UNIT_LEVEL_OF_CARE_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLevelOfCareCapabilityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLevelOfCareCapabilityOperations.validateUnitLevelOfCareCapabilityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLevelOfCareCapabilityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLevelOfCareCapabilityOperations.validateUnitLevelOfCareCapabilityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLevelOfCareCapabilityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLevelOfCareCapabilityOperations.validateUnitLevelOfCareCapabilityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLevelOfCareCapabilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLevelOfCareCapabilityOperations.validateUnitLevelOfCareCapabilityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLevelOfCareCapabilityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLevelOfCareCapabilityOperations.validateUnitLevelOfCareCapabilityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLevelOfCareCapabilityValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLevelOfCareCapabilityOperations.validateUnitLevelOfCareCapabilityValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitLevelOfCareCapability init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitLevelOfCareCapability init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //UnitLevelOfCareCapabilityImpl
