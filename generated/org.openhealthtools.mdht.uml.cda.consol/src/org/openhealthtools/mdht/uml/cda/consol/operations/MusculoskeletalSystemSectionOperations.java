/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Musculoskeletal System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MusculoskeletalSystemSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusculoskeletalSystemSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMusculoskeletalSystemSectionTemplateId(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionTemplateId(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.34')";

	/**
	 * The cached OCL invariant for the '{@link #validateMusculoskeletalSystemSectionTemplateId(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionTemplateId(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.34')
	 * @param musculoskeletalSystemSection The receiving '<em><b>Musculoskeletal System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMusculoskeletalSystemSectionTemplateId(
			MusculoskeletalSystemSection musculoskeletalSystemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION);
			try {
				VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			musculoskeletalSystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MUSCULOSKELETAL_SYSTEM_SECTION__MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MusculoskeletalSystemSectionTemplateId"),
					new Object[] { musculoskeletalSystemSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMusculoskeletalSystemSectionCode(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionCode(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.code = '11410-8' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMusculoskeletalSystemSectionCode(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionCode(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '11410-8' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param musculoskeletalSystemSection The receiving '<em><b>Musculoskeletal System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMusculoskeletalSystemSectionCode(
			MusculoskeletalSystemSection musculoskeletalSystemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION);
			try {
				VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			musculoskeletalSystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MUSCULOSKELETAL_SYSTEM_SECTION__MUSCULOSKELETAL_SYSTEM_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("MusculoskeletalSystemSectionCode"),
					new Object[] { musculoskeletalSystemSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMusculoskeletalSystemSectionProblemEntry(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionProblemEntry(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer))";

	/**
	 * The cached OCL invariant for the '{@link #validateMusculoskeletalSystemSectionProblemEntry(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionProblemEntry(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer))
	 * @param musculoskeletalSystemSection The receiving '<em><b>Musculoskeletal System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMusculoskeletalSystemSectionProblemEntry(
			MusculoskeletalSystemSection musculoskeletalSystemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION);
			try {
				VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			musculoskeletalSystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MUSCULOSKELETAL_SYSTEM_SECTION__MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY,
					ConsolPlugin.INSTANCE.getString("MusculoskeletalSystemSectionProblemEntry"),
					new Object[] { musculoskeletalSystemSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntry(MusculoskeletalSystemSection) <em>Get Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(MusculoskeletalSystemSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer))->asSequence()->first().oclAsType(consol::ProblemEntryReactionObservationContainer)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntry(MusculoskeletalSystemSection) <em>Get Problem Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(MusculoskeletalSystemSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemEntryReactionObservationContainer))->asSequence()->first().oclAsType(consol::ProblemEntryReactionObservationContainer)
	 * @param musculoskeletalSystemSection The receiving '<em><b>Musculoskeletal System Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemEntryReactionObservationContainer getProblemEntry(
			MusculoskeletalSystemSection musculoskeletalSystemSection) {
		if (GET_PROBLEM_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION,
				ConsolPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION.getEAllOperations().get(58));
			try {
				GET_PROBLEM_ENTRY__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY__EOCL_QRY);
		return (ProblemEntryReactionObservationContainer) query.evaluate(musculoskeletalSystemSection);
	}

} // MusculoskeletalSystemSectionOperations