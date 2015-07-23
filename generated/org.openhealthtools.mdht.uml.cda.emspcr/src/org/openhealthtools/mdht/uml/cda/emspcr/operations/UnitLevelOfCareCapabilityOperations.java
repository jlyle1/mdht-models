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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapability;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit Level Of Care Capability</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapability#validateUnitLevelOfCareCapabilityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapability#validateUnitLevelOfCareCapabilityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapability#validateUnitLevelOfCareCapabilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapability#validateUnitLevelOfCareCapabilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapability#validateUnitLevelOfCareCapabilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapability#validateUnitLevelOfCareCapabilityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitLevelOfCareCapabilityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitLevelOfCareCapabilityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLevelOfCareCapabilityTemplateId(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityTemplateId(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.190')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLevelOfCareCapabilityTemplateId(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityTemplateId(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLevelOfCareCapability The receiving '<em><b>Unit Level Of Care Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitLevelOfCareCapabilityTemplateId(UnitLevelOfCareCapability unitLevelOfCareCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEVEL_OF_CARE_CAPABILITY);
			try {
				VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitLevelOfCareCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_LEVEL_OF_CARE_CAPABILITY__UNIT_LEVEL_OF_CARE_CAPABILITY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("UnitLevelOfCareCapabilityUnitLevelOfCareCapabilityTemplateId"),
						 new Object [] { unitLevelOfCareCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLevelOfCareCapabilityCodeP(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityCodeP(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLevelOfCareCapabilityCodeP(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityCodeP(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLevelOfCareCapability The receiving '<em><b>Unit Level Of Care Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitLevelOfCareCapabilityCodeP(UnitLevelOfCareCapability unitLevelOfCareCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEVEL_OF_CARE_CAPABILITY);
			try {
				VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitLevelOfCareCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_LEVEL_OF_CARE_CAPABILITY__UNIT_LEVEL_OF_CARE_CAPABILITY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("UnitLevelOfCareCapabilityUnitLevelOfCareCapabilityCodeP"),
						 new Object [] { unitLevelOfCareCapability }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapabilityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapabilityCodeP", passToken);
				}
				passToken.add(unitLevelOfCareCapability);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLevelOfCareCapabilityCode(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityCode(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77156-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLevelOfCareCapabilityCode(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityCode(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLevelOfCareCapability The receiving '<em><b>Unit Level Of Care Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitLevelOfCareCapabilityCode(UnitLevelOfCareCapability unitLevelOfCareCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitLevelOfCareCapabilityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(unitLevelOfCareCapability)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEVEL_OF_CARE_CAPABILITY);
			try {
				VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitLevelOfCareCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_LEVEL_OF_CARE_CAPABILITY__UNIT_LEVEL_OF_CARE_CAPABILITY_CODE,
						 EmspcrPlugin.INSTANCE.getString("UnitLevelOfCareCapabilityUnitLevelOfCareCapabilityCode"),
						 new Object [] { unitLevelOfCareCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLevelOfCareCapabilityMoodCode(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityMoodCode(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLevelOfCareCapabilityMoodCode(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityMoodCode(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLevelOfCareCapability The receiving '<em><b>Unit Level Of Care Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitLevelOfCareCapabilityMoodCode(UnitLevelOfCareCapability unitLevelOfCareCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEVEL_OF_CARE_CAPABILITY);
			try {
				VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitLevelOfCareCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_LEVEL_OF_CARE_CAPABILITY__UNIT_LEVEL_OF_CARE_CAPABILITY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("UnitLevelOfCareCapabilityUnitLevelOfCareCapabilityMoodCode"),
						 new Object [] { unitLevelOfCareCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLevelOfCareCapabilityValue(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityValue(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LOINC_TBDA_501' or value.code = 'LOINC_TBDA_502' or value.code = 'LOINC_TBDA_503' or value.code = 'LOINC_TBDA_504' or value.code = 'LOINC_TBDA_505' or value.code = 'LOINC_TBDA_506' or value.code = 'LOINC_TBDA_507' or value.code = 'LOINC_TBDA_508' or value.code = 'LOINC_TBDA_509' or value.code = 'LOINC_TBDA_510' or value.code = 'LOINC_TBDA_511' or value.code = 'LOINC_TBDA_512')))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLevelOfCareCapabilityValue(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityValue(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLevelOfCareCapability The receiving '<em><b>Unit Level Of Care Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitLevelOfCareCapabilityValue(UnitLevelOfCareCapability unitLevelOfCareCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEVEL_OF_CARE_CAPABILITY);
			try {
				VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitLevelOfCareCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_LEVEL_OF_CARE_CAPABILITY__UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("UnitLevelOfCareCapabilityUnitLevelOfCareCapabilityValue"),
						 new Object [] { unitLevelOfCareCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLevelOfCareCapabilityValueP(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityValueP(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLevelOfCareCapabilityValueP(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Level Of Care Capability Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLevelOfCareCapabilityValueP(UnitLevelOfCareCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLevelOfCareCapability The receiving '<em><b>Unit Level Of Care Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateUnitLevelOfCareCapabilityValueP(UnitLevelOfCareCapability unitLevelOfCareCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEVEL_OF_CARE_CAPABILITY);
			try {
				VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unitLevelOfCareCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_LEVEL_OF_CARE_CAPABILITY__UNIT_LEVEL_OF_CARE_CAPABILITY_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("UnitLevelOfCareCapabilityUnitLevelOfCareCapabilityValueP"),
						 new Object [] { unitLevelOfCareCapability }));
			}
			 
			return false;
		}
		return true;
	}

} // UnitLevelOfCareCapabilityOperations