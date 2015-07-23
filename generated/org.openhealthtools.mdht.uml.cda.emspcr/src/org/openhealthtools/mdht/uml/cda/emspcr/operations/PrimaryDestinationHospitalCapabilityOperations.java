/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Primary Destination Hospital Capability</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability#validatePrimaryDestinationHospitalCapabilityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability#validatePrimaryDestinationHospitalCapabilityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability#validatePrimaryDestinationHospitalCapabilityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability#validatePrimaryDestinationHospitalCapabilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability#validatePrimaryDestinationHospitalCapabilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapability#validatePrimaryDestinationHospitalCapabilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryDestinationHospitalCapabilityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryDestinationHospitalCapabilityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimaryDestinationHospitalCapabilityTemplateId(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityTemplateId(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.104')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimaryDestinationHospitalCapabilityTemplateId(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityTemplateId(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primaryDestinationHospitalCapability The receiving '<em><b>Primary Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrimaryDestinationHospitalCapabilityTemplateId(PrimaryDestinationHospitalCapability primaryDestinationHospitalCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primaryDestinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PrimaryDestinationHospitalCapabilityPrimaryDestinationHospitalCapabilityTemplateId"),
						 new Object [] { primaryDestinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimaryDestinationHospitalCapabilityClassCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityClassCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimaryDestinationHospitalCapabilityClassCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityClassCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primaryDestinationHospitalCapability The receiving '<em><b>Primary Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrimaryDestinationHospitalCapabilityClassCode(PrimaryDestinationHospitalCapability primaryDestinationHospitalCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primaryDestinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE,
						 EmspcrPlugin.INSTANCE.getString("PrimaryDestinationHospitalCapabilityPrimaryDestinationHospitalCapabilityClassCode"),
						 new Object [] { primaryDestinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimaryDestinationHospitalCapabilityCodeP(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityCodeP(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimaryDestinationHospitalCapabilityCodeP(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityCodeP(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primaryDestinationHospitalCapability The receiving '<em><b>Primary Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrimaryDestinationHospitalCapabilityCodeP(PrimaryDestinationHospitalCapability primaryDestinationHospitalCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primaryDestinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("PrimaryDestinationHospitalCapabilityPrimaryDestinationHospitalCapabilityCodeP"),
						 new Object [] { primaryDestinationHospitalCapability }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapabilityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapabilityCodeP", passToken);
				}
				passToken.add(primaryDestinationHospitalCapability);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimaryDestinationHospitalCapabilityCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77155-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimaryDestinationHospitalCapabilityCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primaryDestinationHospitalCapability The receiving '<em><b>Primary Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrimaryDestinationHospitalCapabilityCode(PrimaryDestinationHospitalCapability primaryDestinationHospitalCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.PrimaryDestinationHospitalCapabilityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(primaryDestinationHospitalCapability)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primaryDestinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_CODE,
						 EmspcrPlugin.INSTANCE.getString("PrimaryDestinationHospitalCapabilityPrimaryDestinationHospitalCapabilityCode"),
						 new Object [] { primaryDestinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimaryDestinationHospitalCapabilityMoodCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityMoodCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimaryDestinationHospitalCapabilityMoodCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityMoodCode(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primaryDestinationHospitalCapability The receiving '<em><b>Primary Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrimaryDestinationHospitalCapabilityMoodCode(PrimaryDestinationHospitalCapability primaryDestinationHospitalCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primaryDestinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("PrimaryDestinationHospitalCapabilityPrimaryDestinationHospitalCapabilityMoodCode"),
						 new Object [] { primaryDestinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimaryDestinationHospitalCapabilityValue(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityValue(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimaryDestinationHospitalCapabilityValue(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Destination Hospital Capability Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryDestinationHospitalCapabilityValue(PrimaryDestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primaryDestinationHospitalCapability The receiving '<em><b>Primary Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrimaryDestinationHospitalCapabilityValue(PrimaryDestinationHospitalCapability primaryDestinationHospitalCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primaryDestinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__PRIMARY_DESTINATION_HOSPITAL_CAPABILITY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("PrimaryDestinationHospitalCapabilityPrimaryDestinationHospitalCapabilityValue"),
						 new Object [] { primaryDestinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

} // PrimaryDestinationHospitalCapabilityOperations