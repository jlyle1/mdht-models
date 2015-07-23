/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Allergy Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerEMSDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer EMS Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerExistenceOfDrugAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Existence Of Drug Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#getEMSDrugAllergies() <em>Get EMS Drug Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#getExistenceOfDrugAllergyObservation() <em>Get Existence Of Drug Allergy Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrugAllergyOrganizerOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrugAllergyOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.183')";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugAllergyOrganizer The receiving '<em><b>Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer drugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_ALLERGY_ORGANIZER__DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DrugAllergyOrganizerDrugAllergyOrganizerTemplateId"),
						 new Object [] { drugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugAllergyOrganizerEMSDrugAllergy(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer EMS Drug Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerEMSDrugAllergy(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::DrugAllergy))";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugAllergyOrganizerEMSDrugAllergy(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer EMS Drug Allergy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerEMSDrugAllergy(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugAllergyOrganizer The receiving '<em><b>Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDrugAllergyOrganizerEMSDrugAllergy(DrugAllergyOrganizer drugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_ALLERGY_ORGANIZER__DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY,
						 EmspcrPlugin.INSTANCE.getString("DrugAllergyOrganizerDrugAllergyOrganizerEMSDrugAllergy"),
						 new Object [] { drugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugAllergyOrganizerExistenceOfDrugAllergyObservation(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Existence Of Drug Allergy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerExistenceOfDrugAllergyObservation(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugAllergyOrganizerExistenceOfDrugAllergyObservation(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Existence Of Drug Allergy Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerExistenceOfDrugAllergyObservation(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugAllergyOrganizer The receiving '<em><b>Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDrugAllergyOrganizerExistenceOfDrugAllergyObservation(DrugAllergyOrganizer drugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_ALLERGY_ORGANIZER__DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("DrugAllergyOrganizerDrugAllergyOrganizerExistenceOfDrugAllergyObservation"),
						 new Object [] { drugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEMSDrugAllergies(DrugAllergyOrganizer) <em>Get EMS Drug Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSDrugAllergies(DrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EMS_DRUG_ALLERGIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DrugAllergy)).oclAsType(emspcr::DrugAllergy)";

	/**
	 * The cached OCL query for the '{@link #getEMSDrugAllergies(DrugAllergyOrganizer) <em>Get EMS Drug Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSDrugAllergies(DrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EMS_DRUG_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<DrugAllergy> getEMSDrugAllergies(DrugAllergyOrganizer drugAllergyOrganizer) {
		if (GET_EMS_DRUG_ALLERGIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER, EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER.getEAllOperations().get(55));
			try {
				GET_EMS_DRUG_ALLERGIES__EOCL_QRY = helper.createQuery(GET_EMS_DRUG_ALLERGIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EMS_DRUG_ALLERGIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<DrugAllergy> result = (Collection<DrugAllergy>) query.evaluate(drugAllergyOrganizer);
		return new BasicEList.UnmodifiableEList<DrugAllergy>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getExistenceOfDrugAllergyObservation(DrugAllergyOrganizer) <em>Get Existence Of Drug Allergy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfDrugAllergyObservation(DrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfDrugAllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getExistenceOfDrugAllergyObservation(DrugAllergyOrganizer) <em>Get Existence Of Drug Allergy Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfDrugAllergyObservation(DrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExistenceOfDrugAllergyObservation getExistenceOfDrugAllergyObservation(DrugAllergyOrganizer drugAllergyOrganizer) {
		if (GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER, EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER.getEAllOperations().get(56));
			try {
				GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY);
		return (ExistenceOfDrugAllergyObservation) query.evaluate(drugAllergyOrganizer);
	}

} // DrugAllergyOrganizerOperations