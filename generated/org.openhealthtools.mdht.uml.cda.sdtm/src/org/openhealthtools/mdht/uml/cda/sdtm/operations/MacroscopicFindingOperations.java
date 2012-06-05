/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Macroscopic Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MacroscopicFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MacroscopicFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingTemplateId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingTemplateId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.48')";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingTemplateId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingTemplateId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.48')
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingTemplateId(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
      return false;
    }
    return true;
  }

} // MacroscopicFindingOperations