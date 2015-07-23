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
import org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PrimaryDestinationHospitalCapabilityOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Destination Hospital Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrimaryDestinationHospitalCapabilityImpl extends ObservationImpl implements PrimaryDestinationHospitalCapability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryDestinationHospitalCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryDestinationHospitalCapabilityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimaryDestinationHospitalCapabilityOperations.validatePrimaryDestinationHospitalCapabilityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryDestinationHospitalCapabilityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimaryDestinationHospitalCapabilityOperations.validatePrimaryDestinationHospitalCapabilityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryDestinationHospitalCapabilityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimaryDestinationHospitalCapabilityOperations.validatePrimaryDestinationHospitalCapabilityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryDestinationHospitalCapabilityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimaryDestinationHospitalCapabilityOperations.validatePrimaryDestinationHospitalCapabilityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryDestinationHospitalCapabilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimaryDestinationHospitalCapabilityOperations.validatePrimaryDestinationHospitalCapabilityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryDestinationHospitalCapabilityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrimaryDestinationHospitalCapabilityOperations.validatePrimaryDestinationHospitalCapabilityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryDestinationHospitalCapability init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimaryDestinationHospitalCapability init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PrimaryDestinationHospitalCapabilityImpl
