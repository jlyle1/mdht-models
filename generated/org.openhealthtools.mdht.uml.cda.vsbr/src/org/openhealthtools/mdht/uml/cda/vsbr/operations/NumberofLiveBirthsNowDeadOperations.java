/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Live Births Now Dead</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberofLiveBirthsNowDeadOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberofLiveBirthsNowDeadOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsNowDeadTemplateId(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadTemplateId(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.38')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsNowDeadTemplateId(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadTemplateId(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLiveBirthsNowDead The receiving '<em><b>Numberof Live Births Now Dead</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLiveBirthsNowDeadTemplateId(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHS_NOW_DEAD);
			try {
				VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofLiveBirthsNowDead)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofLiveBirthsNowDeadTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofLiveBirthsNowDead, context) }), new Object[] { numberofLiveBirthsNowDead }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsNowDeadClassCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadClassCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsNowDeadClassCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadClassCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLiveBirthsNowDead The receiving '<em><b>Numberof Live Births Now Dead</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLiveBirthsNowDeadClassCode(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHS_NOW_DEAD);
			try {
				VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofLiveBirthsNowDead)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofLiveBirthsNowDeadClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofLiveBirthsNowDead, context) }), new Object[] { numberofLiveBirthsNowDead }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsNowDeadMoodCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadMoodCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsNowDeadMoodCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadMoodCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLiveBirthsNowDead The receiving '<em><b>Numberof Live Births Now Dead</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLiveBirthsNowDeadMoodCode(
			NumberofLiveBirthsNowDead numberofLiveBirthsNowDead, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHS_NOW_DEAD);
			try {
				VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofLiveBirthsNowDead)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofLiveBirthsNowDeadMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofLiveBirthsNowDead, context) }), new Object[] { numberofLiveBirthsNowDead }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsNowDeadCodeP(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadCodeP(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsNowDeadCodeP(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadCodeP(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLiveBirthsNowDead The receiving '<em><b>Numberof Live Births Now Dead</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLiveBirthsNowDeadCodeP(NumberofLiveBirthsNowDead numberofLiveBirthsNowDead,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHS_NOW_DEAD);
			try {
				VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofLiveBirthsNowDead)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofLiveBirthsNowDeadCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofLiveBirthsNowDead, context) }), new Object[] { numberofLiveBirthsNowDead }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsNowDeadCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '68496-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsNowDeadCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadCode(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLiveBirthsNowDead The receiving '<em><b>Numberof Live Births Now Dead</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLiveBirthsNowDeadCode(NumberofLiveBirthsNowDead numberofLiveBirthsNowDead,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHS_NOW_DEAD);
			try {
				VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofLiveBirthsNowDead)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofLiveBirthsNowDeadCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofLiveBirthsNowDead, context) }), new Object[] { numberofLiveBirthsNowDead }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLiveBirthsNowDeadValue(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadValue(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLiveBirthsNowDeadValue(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLiveBirthsNowDeadValue(NumberofLiveBirthsNowDead, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLiveBirthsNowDead The receiving '<em><b>Numberof Live Births Now Dead</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLiveBirthsNowDeadValue(NumberofLiveBirthsNowDead numberofLiveBirthsNowDead,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NUMBEROF_LIVE_BIRTHS_NOW_DEAD);
			try {
				VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberofLiveBirthsNowDead)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NUMBEROF_LIVE_BIRTHS_NOW_DEAD__NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NumberofLiveBirthsNowDeadValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									numberofLiveBirthsNowDead, context) }), new Object[] { numberofLiveBirthsNowDead }));
			}

			return false;
		}
		return true;
	}

} // NumberofLiveBirthsNowDeadOperations
