/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability;
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionNumberOfPatientsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionIncidentDispositionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Incident Disposition Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTransportModeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTransportMethodObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionReasonForChoosingDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPrearrivalActivationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Condition Change At Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPrimaryDestinationHospitalCapability(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Primary Destination Hospital Capability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionDestinationWard(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Destination Ward</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getNumberOfPatientsObservation() <em>Get Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getIncidentDispositionObservation() <em>Get Incident Disposition Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getTransportModeObservation() <em>Get Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getTransportMethodObservation() <em>Get Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getReasonForChoosingDestinationObservation() <em>Get Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPrearrivalActivationObservation() <em>Get Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPatientConditionChangeAtDestinationObservation() <em>Get Patient Condition Change At Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPrimaryDestinationHospitalCapability() <em>Get Primary Destination Hospital Capability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getDestinationWard() <em>Get Destination Ward</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSDispositionSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSDispositionSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTemplateId(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTemplateId"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67661-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionCode(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionCode"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionCodeP(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionCodeP"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Disposition')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTitle(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTitle"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionText(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionText"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Number Of Patients Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::NumberOfPatientsTransportedObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Number Of Patients Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionNumberOfPatientsObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionIncidentDispositionObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Incident Disposition Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionIncidentDispositionObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::IncidentDispositionObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionIncidentDispositionObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Incident Disposition Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionIncidentDispositionObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionIncidentDispositionObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionIncidentDispositionObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Mode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TransportModeObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Mode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTransportModeObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Method Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TransportMethodObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Method Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTransportMethodObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Reason For Choosing Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ReasonForChoosingDestinationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Reason For Choosing Destination Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionReasonForChoosingDestinationObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Prearrival Activation Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PrearrivalActivationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Prearrival Activation Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionPrearrivalActivationObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Condition Change At Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientConditionAtDestinationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Condition Change At Destination Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionPatientConditionChangeAtDestinationObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Primary Destination Hospital Capability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PrimaryDestinationHospitalCapability) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Primary Destination Hospital Capability</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionPrimaryDestinationHospitalCapability"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionDestinationWard(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Destination Ward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionDestinationWard(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DestinationWard) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionDestinationWard(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Destination Ward</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionDestinationWard(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionDestinationWard(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_DESTINATION_WARD,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionDestinationWard"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberOfPatientsObservation(EMSDispositionSection) <em>Get Number Of Patients Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPatientsObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::NumberOfPatientsTransportedObservation))->asSequence()->any(true).oclAsType(emspcr::NumberOfPatientsTransportedObservation)";

	/**
	 * The cached OCL query for the '{@link #getNumberOfPatientsObservation(EMSDispositionSection) <em>Get Number Of Patients Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPatientsObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NumberOfPatientsTransportedObservation getNumberOfPatientsObservation(EMSDispositionSection emsDispositionSection) {
		if (GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(69));
			try {
				GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY);
		return (NumberOfPatientsTransportedObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIncidentDispositionObservation(EMSDispositionSection) <em>Get Incident Disposition Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentDispositionObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::IncidentDispositionObservation))->asSequence()->any(true).oclAsType(emspcr::IncidentDispositionObservation)";

	/**
	 * The cached OCL query for the '{@link #getIncidentDispositionObservation(EMSDispositionSection) <em>Get Incident Disposition Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentDispositionObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  IncidentDispositionObservation getIncidentDispositionObservation(EMSDispositionSection emsDispositionSection) {
		if (GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(70));
			try {
				GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_QRY);
		return (IncidentDispositionObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTransportModeObservation(EMSDispositionSection) <em>Get Transport Mode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportModeObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRANSPORT_MODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TransportModeObservation))->asSequence()->any(true).oclAsType(emspcr::TransportModeObservation)";

	/**
	 * The cached OCL query for the '{@link #getTransportModeObservation(EMSDispositionSection) <em>Get Transport Mode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportModeObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TransportModeObservation getTransportModeObservation(EMSDispositionSection emsDispositionSection) {
		if (GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(71));
			try {
				GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TRANSPORT_MODE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY);
		return (TransportModeObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTransportMethodObservation(EMSDispositionSection) <em>Get Transport Method Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethodObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRANSPORT_METHOD_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TransportMethodObservation))->asSequence()->any(true).oclAsType(emspcr::TransportMethodObservation)";

	/**
	 * The cached OCL query for the '{@link #getTransportMethodObservation(EMSDispositionSection) <em>Get Transport Method Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethodObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TransportMethodObservation getTransportMethodObservation(EMSDispositionSection emsDispositionSection) {
		if (GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(72));
			try {
				GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TRANSPORT_METHOD_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY);
		return (TransportMethodObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForChoosingDestinationObservation(EMSDispositionSection) <em>Get Reason For Choosing Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForChoosingDestinationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ReasonForChoosingDestinationObservation))->asSequence()->any(true).oclAsType(emspcr::ReasonForChoosingDestinationObservation)";

	/**
	 * The cached OCL query for the '{@link #getReasonForChoosingDestinationObservation(EMSDispositionSection) <em>Get Reason For Choosing Destination Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForChoosingDestinationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ReasonForChoosingDestinationObservation getReasonForChoosingDestinationObservation(EMSDispositionSection emsDispositionSection) {
		if (GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(73));
			try {
				GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY);
		return (ReasonForChoosingDestinationObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrearrivalActivationObservation(EMSDispositionSection) <em>Get Prearrival Activation Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrearrivalActivationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PrearrivalActivationObservation))->asSequence()->any(true).oclAsType(emspcr::PrearrivalActivationObservation)";

	/**
	 * The cached OCL query for the '{@link #getPrearrivalActivationObservation(EMSDispositionSection) <em>Get Prearrival Activation Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrearrivalActivationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PrearrivalActivationObservation getPrearrivalActivationObservation(EMSDispositionSection emsDispositionSection) {
		if (GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(74));
			try {
				GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_QRY);
		return (PrearrivalActivationObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientConditionChangeAtDestinationObservation(EMSDispositionSection) <em>Get Patient Condition Change At Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientConditionChangeAtDestinationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientConditionAtDestinationObservation))->asSequence()->any(true).oclAsType(emspcr::PatientConditionAtDestinationObservation)";

	/**
	 * The cached OCL query for the '{@link #getPatientConditionChangeAtDestinationObservation(EMSDispositionSection) <em>Get Patient Condition Change At Destination Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientConditionChangeAtDestinationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PatientConditionAtDestinationObservation getPatientConditionChangeAtDestinationObservation(EMSDispositionSection emsDispositionSection) {
		if (GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(75));
			try {
				GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY);
		return (PatientConditionAtDestinationObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrimaryDestinationHospitalCapability(EMSDispositionSection) <em>Get Primary Destination Hospital Capability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDestinationHospitalCapability(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PrimaryDestinationHospitalCapability))->asSequence()->any(true).oclAsType(emspcr::PrimaryDestinationHospitalCapability)";

	/**
	 * The cached OCL query for the '{@link #getPrimaryDestinationHospitalCapability(EMSDispositionSection) <em>Get Primary Destination Hospital Capability</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDestinationHospitalCapability(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PrimaryDestinationHospitalCapability getPrimaryDestinationHospitalCapability(EMSDispositionSection emsDispositionSection) {
		if (GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(76));
			try {
				GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_QRY = helper.createQuery(GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_QRY);
		return (PrimaryDestinationHospitalCapability) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDestinationWard(EMSDispositionSection) <em>Get Destination Ward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationWard(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DESTINATION_WARD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DestinationWard))->asSequence()->any(true).oclAsType(emspcr::DestinationWard)";

	/**
	 * The cached OCL query for the '{@link #getDestinationWard(EMSDispositionSection) <em>Get Destination Ward</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationWard(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DESTINATION_WARD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DestinationWard getDestinationWard(EMSDispositionSection emsDispositionSection) {
		if (GET_DESTINATION_WARD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(77));
			try {
				GET_DESTINATION_WARD__EOCL_QRY = helper.createQuery(GET_DESTINATION_WARD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DESTINATION_WARD__EOCL_QRY);
		return (DestinationWard) query.evaluate(emsDispositionSection);
	}

} // EMSDispositionSectionOperations