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

import org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Destination Ward</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DestinationWardOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationWardOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationWardTemplateId(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardTemplateId(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_WARD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.186')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationWardTemplateId(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardTemplateId(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DESTINATION_WARD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationWard The receiving '<em><b>Destination Ward</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDestinationWardTemplateId(DestinationWard destinationWard, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DESTINATION_WARD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_WARD);
			try {
				VALIDATE_DESTINATION_WARD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_WARD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_WARD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(destinationWard)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_WARD__DESTINATION_WARD_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DestinationWardDestinationWardTemplateId"),
						 new Object [] { destinationWard }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationWardClassCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardClassCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_WARD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationWardClassCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardClassCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DESTINATION_WARD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationWard The receiving '<em><b>Destination Ward</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDestinationWardClassCode(DestinationWard destinationWard, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DESTINATION_WARD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_WARD);
			try {
				VALIDATE_DESTINATION_WARD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_WARD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_WARD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(destinationWard)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_WARD__DESTINATION_WARD_CLASS_CODE,
						 EmspcrPlugin.INSTANCE.getString("DestinationWardDestinationWardClassCode"),
						 new Object [] { destinationWard }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationWardCodeP(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardCodeP(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_WARD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationWardCodeP(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardCodeP(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DESTINATION_WARD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationWard The receiving '<em><b>Destination Ward</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDestinationWardCodeP(DestinationWard destinationWard, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DESTINATION_WARD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_WARD);
			try {
				VALIDATE_DESTINATION_WARD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_WARD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_WARD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(destinationWard)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_WARD__DESTINATION_WARD_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("DestinationWardDestinationWardCodeP"),
						 new Object [] { destinationWard }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.DestinationWardCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.DestinationWardCodeP", passToken);
				}
				passToken.add(destinationWard);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationWardCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_WARD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77154-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationWardCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DESTINATION_WARD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationWard The receiving '<em><b>Destination Ward</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDestinationWardCode(DestinationWard destinationWard, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.DestinationWardCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(destinationWard)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_DESTINATION_WARD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_WARD);
			try {
				VALIDATE_DESTINATION_WARD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_WARD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_WARD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(destinationWard)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_WARD__DESTINATION_WARD_CODE,
						 EmspcrPlugin.INSTANCE.getString("DestinationWardDestinationWardCode"),
						 new Object [] { destinationWard }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationWardMoodCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardMoodCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_WARD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationWardMoodCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardMoodCode(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DESTINATION_WARD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationWard The receiving '<em><b>Destination Ward</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDestinationWardMoodCode(DestinationWard destinationWard, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DESTINATION_WARD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_WARD);
			try {
				VALIDATE_DESTINATION_WARD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_WARD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_WARD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(destinationWard)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_WARD__DESTINATION_WARD_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("DestinationWardDestinationWardMoodCode"),
						 new Object [] { destinationWard }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationWardValue(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardValue(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_WARD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LOINC_TBDA_301' or value.code = 'LOINC_TBDA_302' or value.code = 'LOINC_TBDA_303' or value.code = 'LOINC_TBDA_304' or value.code = 'LOINC_TBDA_305' or value.code = 'LOINC_TBDA_306' or value.code = 'LOINC_TBDA_307' or value.code = 'LOINC_TBDA_308' or value.code = 'LOINC_TBDA_309' or value.code = 'LOINC_TBDA_310' or value.code = 'LOINC_TBDA_311' or value.code = 'LOINC_TBDA_312' or value.code = 'LOINC_TBDA_313' or value.code = 'LOINC_TBDA_314' or value.code = 'LOINC_TBDA_315' or value.code = 'LOINC_TBDA_316' or value.code = 'LOINC_TBDA_317' or value.code = 'LOINC_TBDA_318' or value.code = 'LOINC_TBDA_319' or value.code = 'LOINC_TBDA_320' or value.code = 'LOINC_TBDA_321' or value.code = 'LOINC_TBDA_322' or value.code = 'LOINC_TBDA_323' or value.code = 'LOINC_TBDA_324' or value.code = 'LOINC_TBDA_325' or value.code = 'LOINC_TBDA_326' or value.code = 'LOINC_TBDA_327')))";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationWardValue(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationWardValue(DestinationWard, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DESTINATION_WARD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationWard The receiving '<em><b>Destination Ward</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDestinationWardValue(DestinationWard destinationWard, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DESTINATION_WARD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_WARD);
			try {
				VALIDATE_DESTINATION_WARD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_WARD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_WARD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(destinationWard)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_WARD__DESTINATION_WARD_VALUE,
						 EmspcrPlugin.INSTANCE.getString("DestinationWardDestinationWardValue"),
						 new Object [] { destinationWard }));
			}
			 
			return false;
		}
		return true;
	}

} // DestinationWardOperations