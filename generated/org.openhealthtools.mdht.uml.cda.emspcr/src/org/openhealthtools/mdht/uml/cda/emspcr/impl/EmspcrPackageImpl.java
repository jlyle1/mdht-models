/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.DerivedCDASection;
import org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatch;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponse;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspcrPackageImpl extends EPackageImpl implements EmspcrPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patientCareReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsBillingSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass derivedCDASectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass derivedEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsInjuryIncidentDescriptionSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsCurrentMedicationSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsCardiacArrestEventSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsAdvanceDirectivesSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsAllergiesAndAdverseReactionsSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsPastMedicalHistoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsSocialHistoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsPhysicalAssessmentSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsMedicationsAdministeredSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsProceduresPerformedSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsPatientCareNarrativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsSceneSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsVitalSignsSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsDispatchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsResponseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsDispositionSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsPersonnelAdverseEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsProtocolSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsSituationSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsTimesSectionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EmspcrPackageImpl()
  {
    super(eNS_URI, EmspcrFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EmspcrPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EmspcrPackage init()
  {
    if (isInited) return (EmspcrPackage)EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI);

    // Obtain or create and register package
    EmspcrPackageImpl theEmspcrPackage = (EmspcrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmspcrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmspcrPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ConsolPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEmspcrPackage.createPackageContents();

    // Initialize created meta-data
    theEmspcrPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theEmspcrPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return EmspcrValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theEmspcrPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EmspcrPackage.eNS_URI, theEmspcrPackage);
    return theEmspcrPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatientCareReport()
  {
    return patientCareReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSBillingSection()
  {
    return emsBillingSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDerivedCDASection()
  {
    return derivedCDASectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDerivedEntry()
  {
    return derivedEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSInjuryIncidentDescriptionSection()
  {
    return emsInjuryIncidentDescriptionSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSCurrentMedicationSection()
  {
    return emsCurrentMedicationSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSCardiacArrestEventSection()
  {
    return emsCardiacArrestEventSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSAdvanceDirectivesSection()
  {
    return emsAdvanceDirectivesSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSAllergiesAndAdverseReactionsSection()
  {
    return emsAllergiesAndAdverseReactionsSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSPastMedicalHistory()
  {
    return emsPastMedicalHistoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSSocialHistory()
  {
    return emsSocialHistoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSPhysicalAssessmentSection()
  {
    return emsPhysicalAssessmentSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSMedicationsAdministeredSection()
  {
    return emsMedicationsAdministeredSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSProceduresPerformedSection()
  {
    return emsProceduresPerformedSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSPatientCareNarrative()
  {
    return emsPatientCareNarrativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSSceneSection()
  {
    return emsSceneSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSVitalSignsSection()
  {
    return emsVitalSignsSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSDispatch()
  {
    return emsDispatchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSResponse()
  {
    return emsResponseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSDispositionSection()
  {
    return emsDispositionSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSPersonnelAdverseEvent()
  {
    return emsPersonnelAdverseEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSProtocolSection()
  {
    return emsProtocolSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSSituationSection()
  {
    return emsSituationSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSTimesSection()
  {
    return emsTimesSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmspcrFactory getEmspcrFactory()
  {
    return (EmspcrFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    patientCareReportEClass = createEClass(PATIENT_CARE_REPORT);

    emsBillingSectionEClass = createEClass(EMS_BILLING_SECTION);

    derivedCDASectionEClass = createEClass(DERIVED_CDA_SECTION);

    derivedEntryEClass = createEClass(DERIVED_ENTRY);

    emsInjuryIncidentDescriptionSectionEClass = createEClass(EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);

    emsCurrentMedicationSectionEClass = createEClass(EMS_CURRENT_MEDICATION_SECTION);

    emsCardiacArrestEventSectionEClass = createEClass(EMS_CARDIAC_ARREST_EVENT_SECTION);

    emsAdvanceDirectivesSectionEClass = createEClass(EMS_ADVANCE_DIRECTIVES_SECTION);

    emsAllergiesAndAdverseReactionsSectionEClass = createEClass(EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);

    emsPastMedicalHistoryEClass = createEClass(EMS_PAST_MEDICAL_HISTORY);

    emsSocialHistoryEClass = createEClass(EMS_SOCIAL_HISTORY);

    emsPhysicalAssessmentSectionEClass = createEClass(EMS_PHYSICAL_ASSESSMENT_SECTION);

    emsMedicationsAdministeredSectionEClass = createEClass(EMS_MEDICATIONS_ADMINISTERED_SECTION);

    emsProceduresPerformedSectionEClass = createEClass(EMS_PROCEDURES_PERFORMED_SECTION);

    emsPatientCareNarrativeEClass = createEClass(EMS_PATIENT_CARE_NARRATIVE);

    emsSceneSectionEClass = createEClass(EMS_SCENE_SECTION);

    emsVitalSignsSectionEClass = createEClass(EMS_VITAL_SIGNS_SECTION);

    emsDispatchEClass = createEClass(EMS_DISPATCH);

    emsResponseEClass = createEClass(EMS_RESPONSE);

    emsDispositionSectionEClass = createEClass(EMS_DISPOSITION_SECTION);

    emsPersonnelAdverseEventEClass = createEClass(EMS_PERSONNEL_ADVERSE_EVENT);

    emsProtocolSectionEClass = createEClass(EMS_PROTOCOL_SECTION);

    emsSituationSectionEClass = createEClass(EMS_SITUATION_SECTION);

    emsTimesSectionEClass = createEClass(EMS_TIMES_SECTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
    CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    patientCareReportEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
    emsBillingSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    derivedCDASectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    derivedEntryEClass.getESuperTypes().add(theCDAPackage.getEntry());
    emsInjuryIncidentDescriptionSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsCurrentMedicationSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsCardiacArrestEventSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsAdvanceDirectivesSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsAllergiesAndAdverseReactionsSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsPastMedicalHistoryEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsSocialHistoryEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsPhysicalAssessmentSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsMedicationsAdministeredSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsProceduresPerformedSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsPatientCareNarrativeEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsSceneSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsVitalSignsSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsDispatchEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsResponseEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsDispositionSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsPersonnelAdverseEventEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsProtocolSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsSituationSectionEClass.getESuperTypes().add(this.getDerivedCDASection());
    emsTimesSectionEClass.getESuperTypes().add(this.getDerivedCDASection());

    // Initialize classes and features; add operations and parameters
    initEClass(patientCareReportEClass, PatientCareReport.class, "PatientCareReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportVersionNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportHumanAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportComponentOf", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportBilling", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSCurrentMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSCardiacArrestEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSAdvanceDirectives", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSAllergiesAndAdverseReactionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSPastMedicalHistory", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSSocialHistory", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSPhysicalAssessmentSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSMedicationsAdministeredSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSProceduresPerformedSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSPatientCareNarrative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportEMSSceneSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSBillingSection(), "getBilling", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSInjuryIncidentDescriptionSection(), "getSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSCurrentMedicationSection(), "getEMSCurrentMedication", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSCardiacArrestEventSection(), "getEMSCardiacArrestEvent", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSAdvanceDirectivesSection(), "getEMSAdvanceDirectives", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSAllergiesAndAdverseReactionsSection(), "getEMSAllergiesAndAdverseReactionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSPastMedicalHistory(), "getEMSPastMedicalHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSSocialHistory(), "getEMSSocialHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSPhysicalAssessmentSection(), "getEMSPhysicalAssessmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSMedicationsAdministeredSection(), "getEMSMedicationsAdministeredSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSProceduresPerformedSection(), "getEMSProceduresPerformedSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSPatientCareNarrative(), "getEMSPatientCareNarrative", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSSceneSection(), "getEMSSceneSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsBillingSectionEClass, EMSBillingSection.class, "EMSBillingSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionBillingConditionentry", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingSectionEClass, ecorePackage.getEBoolean(), "validateEMSBillingSectionLosentry", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(derivedCDASectionEClass, DerivedCDASection.class, "DerivedCDASection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(derivedCDASectionEClass, this.getDerivedEntry(), "getEntry1", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(derivedEntryEClass, DerivedEntry.class, "DerivedEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(derivedEntryEClass, ecorePackage.getEBoolean(), "validateDerivedEntryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(derivedEntryEClass, ecorePackage.getEBoolean(), "validateDerivedEntryTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsInjuryIncidentDescriptionSectionEClass, EMSInjuryIncidentDescriptionSection.class, "EMSInjuryIncidentDescriptionSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry7", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry8", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry9", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry10", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry11", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionSectionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionSectionEntry12", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsCurrentMedicationSectionEClass, EMSCurrentMedicationSection.class, "EMSCurrentMedicationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsCardiacArrestEventSectionEClass, EMSCardiacArrestEventSection.class, "EMSCardiacArrestEventSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventSectionEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsAdvanceDirectivesSectionEClass, EMSAdvanceDirectivesSection.class, "EMSAdvanceDirectivesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAdvanceDirectivesSectionEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsAllergiesAndAdverseReactionsSectionEClass, EMSAllergiesAndAdverseReactionsSection.class, "EMSAllergiesAndAdverseReactionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAllergiesAndAdverseReactionsSectionEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsPastMedicalHistoryEClass, EMSPastMedicalHistory.class, "EMSPastMedicalHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsPastMedicalHistoryEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistoryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistoryEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistoryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistoryEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistoryCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistoryEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistoryTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistoryEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistoryEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPastMedicalHistoryEClass, ecorePackage.getEBoolean(), "validateEMSPastMedicalHistoryEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsSocialHistoryEClass, EMSSocialHistory.class, "EMSSocialHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsSocialHistoryEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistoryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistoryEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistoryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistoryEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistoryCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistoryEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistoryTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistoryEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistoryEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSocialHistoryEClass, ecorePackage.getEBoolean(), "validateEMSSocialHistoryEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsPhysicalAssessmentSectionEClass, EMSPhysicalAssessmentSection.class, "EMSPhysicalAssessmentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPhysicalAssessmentSectionEClass, ecorePackage.getEBoolean(), "validateEMSPhysicalAssessmentSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsMedicationsAdministeredSectionEClass, EMSMedicationsAdministeredSection.class, "EMSMedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsMedicationsAdministeredSectionEClass, ecorePackage.getEBoolean(), "validateEMSMedicationsAdministeredSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsProceduresPerformedSectionEClass, EMSProceduresPerformedSection.class, "EMSProceduresPerformedSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProceduresPerformedSectionEClass, ecorePackage.getEBoolean(), "validateEMSProceduresPerformedSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsPatientCareNarrativeEClass, EMSPatientCareNarrative.class, "EMSPatientCareNarrative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsPatientCareNarrativeEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPatientCareNarrativeEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPatientCareNarrativeEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPatientCareNarrativeEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPatientCareNarrativeEClass, ecorePackage.getEBoolean(), "validateEMSPatientCareNarrativeTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsSceneSectionEClass, EMSSceneSection.class, "EMSSceneSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSceneSectionEClass, ecorePackage.getEBoolean(), "validateEMSSceneSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsVitalSignsSectionEClass, EMSVitalSignsSection.class, "EMSVitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateEMSVitalSignsSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsDispatchEClass, EMSDispatch.class, "EMSDispatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsDispatchEClass, ecorePackage.getEBoolean(), "validateEMSDispatchTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchEClass, ecorePackage.getEBoolean(), "validateEMSDispatchCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchEClass, ecorePackage.getEBoolean(), "validateEMSDispatchText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchEClass, ecorePackage.getEBoolean(), "validateEMSDispatchTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchEClass, ecorePackage.getEBoolean(), "validateEMSDispatchEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispatchEClass, ecorePackage.getEBoolean(), "validateEMSDispatchEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsResponseEClass, EMSResponse.class, "EMSResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsResponseEClass, ecorePackage.getEBoolean(), "validateEMSResponseEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsDispositionSectionEClass, EMSDispositionSection.class, "EMSDispositionSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry7", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsDispositionSectionEClass, ecorePackage.getEBoolean(), "validateEMSDispositionSectionEntry8", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsDispositionSectionEClass, this.getDerivedEntry(), "getEntry6", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsPersonnelAdverseEventEClass, EMSPersonnelAdverseEvent.class, "EMSPersonnelAdverseEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsPersonnelAdverseEventEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsPersonnelAdverseEventEClass, ecorePackage.getEBoolean(), "validateEMSPersonnelAdverseEventEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsProtocolSectionEClass, EMSProtocolSection.class, "EMSProtocolSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsProtocolSectionEClass, ecorePackage.getEBoolean(), "validateEMSProtocolSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsSituationSectionEClass, EMSSituationSection.class, "EMSSituationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry7", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsSituationSectionEClass, ecorePackage.getEBoolean(), "validateEMSSituationSectionEntry8", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsTimesSectionEClass, EMSTimesSection.class, "EMSTimesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry3", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry4", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry5", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry6", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry7", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry8", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsTimesSectionEClass, ecorePackage.getEBoolean(), "validateEMSTimesSectionEntry9", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.openhealthtools.org/mdht/uml/cda/annotation
    createAnnotationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole
    createEmspcrPatientCareReportEMSRecordTargetPatientRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient
    createEmspcrPatientCareReportEMSRecordTargetPatientRolePatientAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipation
    createEmspcrPatientCareReportEMSAuthoringDeviceParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRole
    createEmspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDevice
    createEmspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDeviceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRole
    createEmspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthor
    createEmspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntity
    createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPerson
    createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPersonAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganization
    createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganizationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEvent
    createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipation
    createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRole
    createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship
    createEmspcrPatientCareReportEMSParentDocumentRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation
    createEmspcrPatientCareReportEMSDestinationParticipantParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRole
    createEmspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSMedicalHistory
    createEmspcrPatientCareReportEMSMedicalHistoryAnnotations();
    // duplicates
    createDuplicatesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntry
    createEmspcrEMSBillingSectionBillingConditionEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntryBillingCondition
    createEmspcrEMSBillingSectionBillingConditionEntryBillingConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLOSDerivedEntry
    createEmspcrEMSBillingSectionLOSDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLOSDerivedEntryLevelOfService
    createEmspcrEMSBillingSectionLOSDerivedEntryLevelOfServiceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryCauseCategory
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryCauseCategoryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryMechanism
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryMechanismAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryTraumaCenterCriteria
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryTraumaCenterCriteriaAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryRiskFactor
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryRiskFactorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleImpactArea
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleImpactAreaAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryPatientLocationInVehicle
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryPatientLocationInVehicleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleOccupantSafetyEquipment
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleOccupantSafetyEquipmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryAirbagDeploymentStatus
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryAirbagDeploymentStatusAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryHeightOfFall
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryHeightOfFallAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryDisasterType
    createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryDisasterTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryCurrentlyOnMedication
    createEmspcrEMSCurrentMedicationSectionDerivedEntryCurrentlyOnMedicationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryPatientOnAnticoagulants
    createEmspcrEMSCurrentMedicationSectionDerivedEntryPatientOnAnticoagulantsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedication
    createEmspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedicationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug
    createEmspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrugAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntry
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistence
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationship
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTimingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationship
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCauseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipation
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationship
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProviderAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationship
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProviderAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationship
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythmAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationship
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationship
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm
    createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythmAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionDerivedEntryEMSAdvancedDirectiveObservation
    createEmspcrEMSAdvanceDirectivesSectionDerivedEntryEMSAdvancedDirectiveObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntry
    createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergies
    createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSExistenceOfDrugAllergy
    createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSExistenceOfDrugAllergyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergy
    createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity
    createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergies
    createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy
    createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy
    createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntry
    createEmspcrEMSPastMedicalHistoryDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditions
    createEmspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSExistenceOfHistoryOfCondition
    createEmspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSExistenceOfHistoryOfConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSHistoryOfCondition
    createEmspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSHistoryOfConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfProceduresEMSExistenceOfHistoryOfProcedures
    createEmspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfProceduresEMSExistenceOfHistoryOfProceduresAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntry
    createEmspcrEMSSocialHistoryDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntryEMSExistenceOfDrugUseIndicator
    createEmspcrEMSSocialHistoryDerivedEntryEMSExistenceOfDrugUseIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntryEMSDrugUseIndicator
    createEmspcrEMSSocialHistoryDerivedEntryEMSDrugUseIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntry
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizer
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerPatientBodyWeight
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerPatientBodyWeightAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClass
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClassAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSSkinAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSSkinAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeadAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeadAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSFaceAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSFaceAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeckAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeckAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSChestAndLungsAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSChestAndLungsAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeartAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeartAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSAbdomenAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSAbdomenAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSPelvicAndGenitourinaryAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSPelvicAndGenitourinaryAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSBackAndSpineAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSBackAndSpineAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSExtremitiesAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSExtremitiesAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSEyeAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSEyeAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSMentalStatusAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSMentalStatusAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeurologicalAssessment
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeurologicalAssessmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryPatientPregnancy
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryPatientPregnancyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryLastOralIntake
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryLastOralIntakeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPatientAge
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPatientAgeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSThrombolyticContraindications
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSThrombolyticContraindicationsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSBarriersToPatientCare
    createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSBarriersToPatientCareAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntry
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministered
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationship
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationshipMedicationNotAdministeredReasonObservation
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationshipMedicationNotAdministeredReasonObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumable
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrug
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrugAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationship
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservation
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationship
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservation
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipation
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRole
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationship
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorization
    createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorizationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntry
    createEmspcrEMSProceduresPerformedSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedure
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationship
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationship
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicator
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationship
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationship
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationship
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationship
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformer
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntity
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipant
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType
    createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntry
    createEmspcrEMSSceneSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSFirstUnitIndicator
    createEmspcrEMSSceneSectionDerivedEntryEMSFirstUnitIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSFirstUnitOnScene
    createEmspcrEMSSceneSectionDerivedEntryEMSFirstUnitOnSceneAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSScenePatientCount
    createEmspcrEMSSceneSectionDerivedEntryEMSScenePatientCountAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSMassCasualtyIndicator
    createEmspcrEMSSceneSectionDerivedEntryEMSMassCasualtyIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntry
    createEmspcrEMSVitalSignsSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizer
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPriorAidVitals
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPriorAidVitalsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCardiacRhythm
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCardiacRhythmAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSHeartRate
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSHeartRateAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSRespiratoryRate
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSRespiratoryRateAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBodyTemperature
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBodyTemperatureAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSOxygenSaturation
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSOxygenSaturationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonDioxide
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonDioxideAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonMonoxide
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonMonoxideAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBloodGlucose
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBloodGlucoseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSLevelOfResponsiveness
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSLevelOfResponsivenessAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPainScore
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPainScoreAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSStrokeScore
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSStrokeScoreAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScore
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowTotal
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowTotalAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowQualifier
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowQualifierAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowEye
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowEyeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowMotor
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowMotorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowVerbal
    createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowVerbalAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntry
    createEmspcrEMSDispatchDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntryEMSEmergencyMedicalDispatchObservation
    createEmspcrEMSDispatchDerivedEntryEMSEmergencyMedicalDispatchObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntryEMSComplaintReportedByDispatch
    createEmspcrEMSDispatchDerivedEntryEMSComplaintReportedByDispatchAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntry
    createEmspcrEMSResponseDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizer
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationship
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationship
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationship
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationship
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay
    createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelayAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizer
    createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship
    createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName
    createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationNameAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship
    createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude
    createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitudeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship
    createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude
    createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitudeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizer
    createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship
    createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading
    createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReadingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship
    createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading
    createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReadingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship
    createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading
    createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReadingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading
    createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReadingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseModeToScene
    createEmspcrEMSResponseDerivedEntryEMSResponseModeToSceneAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntry
    createEmspcrEMSDispositionSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSNumberOfPatientsObservation
    createEmspcrEMSDispositionSectionDerivedEntryEMSNumberOfPatientsObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSIncidentDispositionObservation
    createEmspcrEMSDispositionSectionDerivedEntryEMSIncidentDispositionObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSTransportModeObservation
    createEmspcrEMSDispositionSectionDerivedEntryEMSTransportModeObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSTransportMethodObservation
    createEmspcrEMSDispositionSectionDerivedEntryEMSTransportMethodObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSReasonForChoosingDestinationObservation
    createEmspcrEMSDispositionSectionDerivedEntryEMSReasonForChoosingDestinationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSPrearrivalActivationObservation
    createEmspcrEMSDispositionSectionDerivedEntryEMSPrearrivalActivationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSPatientConditionChangeAtDestinationObservation
    createEmspcrEMSDispositionSectionDerivedEntryEMSPatientConditionChangeAtDestinationObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntry
    createEmspcrEMSPersonnelAdverseEventDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventIndicator
    createEmspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventIndicatorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventTypeObservation
    createEmspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventTypeObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntry
    createEmspcrEMSProtocolSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSProtocolObservation
    createEmspcrEMSProtocolSectionDerivedEntryEMSProtocolObservationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSProtocolAgeCategory
    createEmspcrEMSProtocolSectionDerivedEntryEMSProtocolAgeCategoryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSCandidatePatientRegistryType
    createEmspcrEMSProtocolSectionDerivedEntryEMSCandidatePatientRegistryTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1
    createEmspcrEMSSituationSectionDerivedEntry1Annotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaint
    createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintTypeRelationshipEMSComplaintType
    createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintTypeRelationshipEMSComplaintTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintDurationRelationshipEMSComplaintDuration
    createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintDurationRelationshipEMSComplaintDurationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationship
    createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem
    createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystemAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry2
    createEmspcrEMSSituationSectionDerivedEntry2Annotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry2EMSSituationOnsetTime
    createEmspcrEMSSituationSectionDerivedEntry2EMSSituationOnsetTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry3
    createEmspcrEMSSituationSectionDerivedEntry3Annotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry3EMSPossibleInjury
    createEmspcrEMSSituationSectionDerivedEntry3EMSPossibleInjuryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry4
    createEmspcrEMSSituationSectionDerivedEntry4Annotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry4EMSProviderPrimaryImpression
    createEmspcrEMSSituationSectionDerivedEntry4EMSProviderPrimaryImpressionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry
    createEmspcrEMSSituationSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSPrimarySymptom
    createEmspcrEMSSituationSectionDerivedEntryEMSPrimarySymptomAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSOtherSymptoms
    createEmspcrEMSSituationSectionDerivedEntryEMSOtherSymptomsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSProviderSecondaryImpressions
    createEmspcrEMSSituationSectionDerivedEntryEMSProviderSecondaryImpressionsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSInitialPatientAcuity
    createEmspcrEMSSituationSectionDerivedEntryEMSInitialPatientAcuityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntry
    createEmspcrEMSTimesSectionDerivedEntryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSCallTime
    createEmspcrEMSTimesSectionDerivedEntryEMSCallTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitNotifiedTime
    createEmspcrEMSTimesSectionDerivedEntryEMSUnitNotifiedTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitEnRouteTime
    createEmspcrEMSTimesSectionDerivedEntryEMSUnitEnRouteTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitOnSceneTime
    createEmspcrEMSTimesSectionDerivedEntryEMSUnitOnSceneTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitAtPatienttTime
    createEmspcrEMSTimesSectionDerivedEntryEMSUnitAtPatienttTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitLeftSceneTime
    createEmspcrEMSTimesSectionDerivedEntryEMSUnitLeftSceneTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSPatientArrivedAtDestinationTime
    createEmspcrEMSTimesSectionDerivedEntryEMSPatientArrivedAtDestinationTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitBackInServiceTime
    createEmspcrEMSTimesSectionDerivedEntryEMSUnitBackInServiceTimeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSDispatchNotifiedTime
    createEmspcrEMSTimesSectionDerivedEntryEMSDispatchNotifiedTimeAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createAnnotationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";		
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientCareReportTemplateId PatientCareReportClassCode PatientCareReportMoodCode GeneralHeaderConstraintsCode PatientCareReportCode PatientCareReportId PatientCareReportTitle PatientCareReportRecordTarget PatientCareReportBilling PatientCareReportEMSCurrentMedication PatientCareReportEMSAllergiesAndAdverseReactionsSection PatientCareReportEMSPastMedicalHistory PatientCareReportEMSSocialHistory PatientCareReportEMSPhysicalAssessmentSection PatientCareReportEMSProceduresPerformedSection PatientCareReportEMSPatientCareNarrative PatientCareReportEMSSceneSection",
       "templateId.root", "2.16.840.1.113883.17.3.10.1",
       "classCode", "DOCCLIN",
       "moodCode", "EVN",
       "code.code", "67796-3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Patient Care Report",
       "constraints.validation.dependOn.GeneralHeaderConstraintsCode", "PatientCareReportCode",
       "constraints.validation.info", "PatientCareReportVersionNumber PatientCareReportHumanAuthor PatientCareReportComponentOf PatientCareReportSection PatientCareReportEMSCardiacArrestEvent PatientCareReportEMSMedicationsAdministeredSection",
       "title.mixed", "EMS Patient Care Report",
       "constraints.validation.warning", "PatientCareReportEMSAdvanceDirectives"
       });																																																																																																																																											
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSBillingSectionTemplateId EMSBillingSectionCode EMSBillingSectionBillingConditionentry EMSBillingSectionLosentry",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.5",
       "code.code", "67659-3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC"
       });																								
    addAnnotation
      (derivedEntryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryTemplateId DerivedEntryTypeCode",
       "templateId.root", "2.16.840.1.1133883.17.3.10.1.24",
       "typeCode", "DRIV"
       });										
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSInjuryIncidentDescriptionSectionTemplateId EMSInjuryIncidentDescriptionSectionCode EMSInjuryIncidentDescriptionSectionEntry3 EMSInjuryIncidentDescriptionSectionEntry4 EMSInjuryIncidentDescriptionSectionEntry5 EMSInjuryIncidentDescriptionSectionEntry6 EMSInjuryIncidentDescriptionSectionEntry7 EMSInjuryIncidentDescriptionSectionEntry8 EMSInjuryIncidentDescriptionSectionEntry9 EMSInjuryIncidentDescriptionSectionEntry10 EMSInjuryIncidentDescriptionSectionEntry11 EMSInjuryIncidentDescriptionSectionEntry12",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.17",
       "code.code", "11374-6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Injury incident description"
       });																																																												
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSCurrentMedicationSectionTemplateId EMSCurrentMedicationSectionCode EMSCurrentMedicationSectionEntry1 EMSCurrentMedicationSectionEntry2 EMSCurrentMedicationSectionEntry3",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.15",
       "code.code", "67844-1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Current Medications"
       });																										
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSCardiacArrestEventSectionTemplateId EMSCardiacArrestEventSectionCode EMSCardiacArrestEventSectionEntry1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.14",
       "code.code", "67799-7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS CARDIAC ARREST EVENT",
       "title.mixed", "EMS Cardiac Arrest Event",
       "constraints.validation.warning", "EMSCardiacArrestEventSectionTitle"
       });																																								
    addAnnotation
      (emsAdvanceDirectivesSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAdvanceDirectivesSectionTemplateId EMSAdvanceDirectivesSectionCode EMSAdvanceDirectivesSectionEntry1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.12",
       "code.code", "67840-9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Advance Directives",
       "title.mixed", "EMS Advance Directives",
       "constraints.validation.warning", "EMSAdvanceDirectivesSectionTitle"
       });																			
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAllergiesAndAdverseReactionsSectionTemplateId EMSAllergiesAndAdverseReactionsSectionCode EMSAllergiesAndAdverseReactionsSectionEntry1 EMSAllergiesAndAdverseReactionsSectionEntry2",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.13",
       "code.code", "67841?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Allergies and Adverse Reactions",
       "title.mixed", "EMS Allergies and Adverse Reactions",
       "constraints.validation.warning", "EMSAllergiesAndAdverseReactionsSectionTitle"
       });																														
    addAnnotation
      (emsPastMedicalHistoryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPastMedicalHistoryTemplateId EMSPastMedicalHistoryCode EMSPastMedicalHistoryCodeP EMSPastMedicalHistoryEntry1 EMSPastMedicalHistoryEntry2",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.19",
       "code.code", "67842?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS past medical history",
       "title.mixed", "EMS Past Medical History",
       "constraints.validation.warning", "EMSPastMedicalHistoryTitle"
       });																															
    addAnnotation
      (emsSocialHistoryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSSocialHistoryTemplateId EMSSocialHistoryCode EMSSocialHistoryCodeP EMSSocialHistoryEntry1 EMSSocialHistoryEntry2",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.22",
       "code.code", "67843?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Social History",
       "title.mixed", "EMS Social History",
       "constraints.validation.warning", "EMSSocialHistoryTitle"
       });																													
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPhysicalAssessmentSectionTemplateId EMSPhysicalAssessmentSectionCode EMSPhysicalAssessmentSectionCodeP EMSPhysicalAssessmentSectionText EMSPhysicalAssessmentSectionEntry1 EMSPhysicalAssessmentSectionEntry2 EMSPhysicalAssessmentSectionEntry3 EMSPhysicalAssessmentSectionEntry4 EMSPhysicalAssessmentSectionEntry5 EMSPhysicalAssessmentSectionEntry6",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.20",
       "code.code", "67668?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.warning", "EMSPhysicalAssessmentSectionTitle"
       });																																																																				
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationsAdministeredSectionTemplateId EMSMedicationsAdministeredSectionCode EMSMedicationsAdministeredSectionCodeP EMSMedicationsAdministeredSectionText EMSMedicationsAdministeredSectionTitle EMSMedicationsAdministeredSectionEntry1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.18",
       "code.code", "67849?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Medications administered",
       "constraints.validation.dependOn.EMSMedicationsAdministeredSectionCode", "EMSMedicationsAdministeredSectionCodeP"
       });																																											
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProceduresPerformedSectionTemplateId EMSProceduresPerformedSectionCode EMSProceduresPerformedSectionCodeP EMSProceduresPerformedSectionText EMSProceduresPerformedSectionTitle EMSProceduresPerformedSectionEntry1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.21",
       "code.code", "67802?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Procedures Performed",
       "title.mixed", "EMS Procedures Performed"
       });																																														
    addAnnotation
      (emsPatientCareNarrativeEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPatientCareNarrativeTemplateId EMSPatientCareNarrativeCode EMSPatientCareNarrativeCodeP EMSPatientCareNarrativeText EMSPatientCareNarrativeTitle",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.1",
       "code.code", "67781?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Patient Care Report Narrative",
       "title.mixed", "EMS Patient Care Report Narrative"
       });																						
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSSceneSectionTemplateId EMSSceneSectionCode EMSSceneSectionText EMSSceneSectionTitle EMSSceneSectionEntry1 EMSSceneSectionEntry2 EMSSceneSectionEntry3 EMSSceneSectionEntry4",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.8",
       "code.code", "67665?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Scene",
       "title.mixed", "EMS Scene"
       });																																							
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSVitalSignsSectionTemplateId EMSVitalSignsSectionCode EMSVitalSignsSectionEntry1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.23",
       "code.code", "67801?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Vital Signs",
       "title.mixed", "EMS Vital Signs",
       "constraints.validation.warning", "EMSVitalSignsSectionTitle"
       });																																								
    addAnnotation
      (emsDispatchEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDispatchTemplateId EMSDispatchCode EMSDispatchText EMSDispatchTitle EMSDispatchEntry1 EMSDispatchEntry2",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.2",
       "code.code", "67660?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Dispatch",
       "title.mixed", "EMS Dispatch"
       });																													
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseTemplateId EMSResponseCode EMSResponseCodeP EMSResponseText EMSResponseTitle EMSResponseEntry1 EMSResponseEntry2 EMSResponseEntry3 EMSResponseEntry4",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.3",
       "code.code", "67664?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Response",
       "title.mixed", "EMS Response"
       });																																																																		
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDispositionSectionTemplateId EMSDispositionSectionCode EMSDispositionSectionCodeP EMSDispositionSectionText EMSDispositionSectionTitle EMSDispositionSectionEntry1 EMSDispositionSectionEntry2 EMSDispositionSectionEntry3 EMSDispositionSectionEntry4 EMSDispositionSectionEntry5 EMSDispositionSectionEntry6 EMSDispositionSectionEntry7 EMSDispositionSectionEntry8",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.4",
       "code.code", "67796?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Disposition",
       "title.mixed", "EMS Disposition"
       });																																																																
    addAnnotation
      (emsPersonnelAdverseEventEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPersonnelAdverseEventTemplateId EMSPersonnelAdverseEventCode EMSPersonnelAdverseEventCodeP EMSPersonnelAdverseEventText EMSPersonnelAdverseEventTitle EMSPersonnelAdverseEventEntry1 EMSPersonnelAdverseEventEntry2",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.6",
       "code.code", "67658?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Exposures or injuries of EMS personnel",
       "title.mixed", "Exposures or Injuries of EMS Personnel"
       });																																	
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProtocolSectionTemplateId EMSProtocolSectionCode EMSProtocolSectionEntry1 EMSProtocolSectionEntry2 EMSProtocolSectionEntry3",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.7",
       "code.code", "67537?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Protocol"
       });																										
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSSituationSectionTemplateId EMSSituationSectionCode EMSSituationSectionCodeP EMSSituationSectionText EMSSituationSectionTitle EMSSituationSectionEntry1 EMSSituationSectionEntry2 EMSSituationSectionEntry3 EMSSituationSectionEntry4 EMSSituationSectionEntry5 EMSSituationSectionEntry6 EMSSituationSectionEntry7 EMSSituationSectionEntry8",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.9",
       "code.code", "67666?8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Situation"
       });																																																																							
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSTimesSectionTemplateId EMSTimesSectionCode EMSTimesSectionText EMSTimesSectionEntry1 EMSTimesSectionEntry2 EMSTimesSectionEntry3 EMSTimesSectionEntry4 EMSTimesSectionEntry5 EMSTimesSectionEntry6 EMSTimesSectionEntry7 EMSTimesSectionEntry8 EMSTimesSectionEntry9",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.10",
       "code.code", "67667-6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Times",
       "title.mixed", "EMS Times",
       "constraints.validation.warning", "EMSTimesSectionTitle"
       });																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSRecordTargetPatientRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole";			
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientRoleAddr"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSRecordTargetPatientRolePatientAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient";				
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "ethnicGroupCode.codeSystem", "2.16.840.1.113883.6.238",
       "ethnicGroupCode.codeSystemName", "Race and Ethnicity - CDC",
       "constraints.validation.error", "PatientEthnicGroupCode PatientRaceCode PatientSDTCRaceCode PatientAdministrativeGenderCode PatientAdministrativeGenderCodeP",
       "raceCode.codeSystem", "2.16.840.1.113883.6.238",
       "raceCode.codeSystemName", "Race and Ethnicity - CDC",
       "sDTCRaceCode.codeSystem", "2.16.840.1.113883.6.238",
       "sDTCRaceCode.codeSystemName", "Race and Ethnicity - CDC",
       "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1",
       "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSAuthoringDeviceParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipation";					
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "typeCode", "AUT",
       "constraints.validation.error", "EMSAuthoringDeviceParticipationTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRole";						
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "classCode", "ASSIGNED",
       "constraints.validation.error", "EMSAuthoringDeviceRoleClassCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDevice</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDeviceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDevice";							
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAuthoringDeviceManufacturerModelName EMSAuthoringDeviceSoftwareName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRole";								
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHumanAuthorRoleId EMSHumanAuthorRoleAddr EMSHumanAuthorRoleTelecom"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthor";									
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHumanAuthorName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship";										
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "EMSEncompassingEncounterRelationshipTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter";											
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EncompassingEncounterEffectiveTime"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation";												
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "LocationHealthCareFacility"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility";													
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "HealthCareFacilityId HealthCareFacilityCode HealthCareFacilityPlace",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace";														
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "PlaceName PlaceAddr",
       "classCode", "PLC",
       "constraints.validation.error", "PlaceClassCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntity</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntity";															
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AssociatedEntityAddr AssociatedEntityCode AssociatedEntityCodeP AssociatedEntityAssociatedPerson AssociatedEntityOrganization",
       "code.codeSystem", "2.16.840.1.113993.17.3.5.69",
       "code.codeSystemName", "Facility Type"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPerson</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPersonAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPerson";																
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PersonName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganization</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganizationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganization";																	
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "OrganizationName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEvent</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEvent";																		
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSServiceEventCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipation";																			
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "functionCode.codeSystem", "2.16.840.1.113883.6.1",
       "functionCode.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSPerformerParticipationFunctionCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSServiceEventParticipationEMSServiceEventEMSPerformerParticipationEMSPerformerRole";																				
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSPerformerRoleCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSParentDocumentRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship";																					
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RPLC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation";																						
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "typeCode", "DST"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipationEMSDestinationRole";																							
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSDestinationRoleCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSMedicalHistory</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSMedicalHistoryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSMedicalHistory";																								
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.code", "67842-5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS History of past illness",
       "constraints.validation.error", "EMSMedicalHistoryCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>duplicates</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createDuplicatesAnnotations()
  {
    String source = "duplicates";																									
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSBillingSectionBillingConditionEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntry";																																																																																																																																													
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "BillingConditionEntryObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntryBillingCondition</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSBillingSectionBillingConditionEntryBillingConditionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntryBillingCondition";																																																																																																																																														
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67556-1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "BillingConditionCode BillingConditionCodeVS BillingConditionCodeP BillingConditionValue BillingConditionValueP",
       "constraints.validation.dependOn.BillingConditionCode", "BillingConditionCodeP",
       "constraints.validation.dependOn.BillingConditionCodeVS", "BillingConditionCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLOSDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSBillingSectionLOSDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLOSDerivedEntry";																																																																																																																																															
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "LOSDerivedEntryObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLOSDerivedEntryLevelOfService</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSBillingSectionLOSDerivedEntryLevelOfServiceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLOSDerivedEntryLevelOfService";																																																																																																																																																
    addAnnotation
      (emsBillingSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69464-6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS level of service",
       "constraints.validation.error", "LevelOfServiceCode LevelOfServiceCodeP LevelOfServiceValue LevelOfServiceValueP",
       "constraints.validation.dependOn.LevelOfServiceCode", "LevelOfServiceCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryCauseCategory</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryCauseCategoryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryCauseCategory";																																																																																																																																																																													
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69543-7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Injury Cause",
       "constraints.validation.error", "InjuryCauseCategoryCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryMechanism</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryMechanismAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryMechanism";																																																																																																																																																																														
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67494-5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Injury Mechanism",
       "constraints.validation.error", "InjuryMechanismCode InjuryMechanismValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryTraumaCenterCriteria</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryTraumaCenterCriteriaAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryTraumaCenterCriteria";																																																																																																																																																																															
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67495-2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Trauma Center Critieria",
       "constraints.validation.error", "TraumaCenterCriteriaCode TraumaCenterCriteriaValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryRiskFactor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryRiskFactorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryRiskFactor";																																																																																																																																																																																
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67496-0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Other injury risk factors",
       "constraints.validation.error", "InjuryRiskFactorCode InjuryRiskFactorValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleImpactArea</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleImpactAreaAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleImpactArea";																																																																																																																																																																																	
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67497-8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Location of impact on the vehicle",
       "constraints.validation.error", "VehicleImpactAreaCode VehicleImpactAreaValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryPatientLocationInVehicle</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryPatientLocationInVehicleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryPatientLocationInVehicle";																																																																																																																																																																																		
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67498-6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Location of patient in vehicle",
       "constraints.validation.error", "PatientLocationInVehicleCode PatientLocationInVehicleValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleOccupantSafetyEquipment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleOccupantSafetyEquipmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleOccupantSafetyEquipment";																																																																																																																																																																																			
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67499-4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Safety equipment",
       "constraints.validation.error", "VehicleOccupantSafetyEquipmentCode VehicleOccupantSafetyEquipmentValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryAirbagDeploymentStatus</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryAirbagDeploymentStatusAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryAirbagDeploymentStatus";																																																																																																																																																																																				
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67500-9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Airbag deployment",
       "constraints.validation.error", "AirbagDeploymentStatusCode AirbagDeploymentStatusValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryHeightOfFall</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryHeightOfFallAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryHeightOfFall";																																																																																																																																																																																					
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67501-7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Height of fall",
       "constraints.validation.error", "HeightOfFallCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryDisasterType</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionSectionDerivedEntryDisasterTypeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryDisasterType";																																																																																																																																																																																						
    addAnnotation
      (emsInjuryIncidentDescriptionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69463-8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Suspected intentional or unintentional disaster",
       "constraints.validation.error", "DisasterTypeCode DisasterTypeValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryCurrentlyOnMedication</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCurrentMedicationSectionDerivedEntryCurrentlyOnMedicationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryCurrentlyOnMedication";																																																																																																																																																																																																																																								
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67791-4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Currently on medication",
       "constraints.validation.error", "CurrentlyOnMedicationCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryPatientOnAnticoagulants</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCurrentMedicationSectionDerivedEntryPatientOnAnticoagulantsAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryPatientOnAnticoagulants";																																																																																																																																																																																																																																									
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69749-0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "PatientOnAnticoagulantsCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedication</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedicationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedication";																																																																																																																																																																																																																																										
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "routeCode.codeSystem", "2.16.840.1.113883.6.1",
       "routeCode.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSCurrentMedicationRouteCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrugAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionDerivedEntryEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug";																																																																																																																																																																																																																																											
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.88",
       "code.codeSystemName", "RxNorm",
       "constraints.validation.error", "EMSCurrentMedicationDrugCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntry";																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryCardiacArrestExistence"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistence</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistence";																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "ASSERTION",
       "code.codeSystem", "2.16.840.1.113883.5.4",
       "code.codeSystemName", "HL7ActCode",
       "code.displayName", "ASSERTION",
       "constraints.validation.error", "CardiacArrestExistenceCode CardiacArrestExistenceValue",
       "value.code", "410429000",
       "value.codeSystem", "2.16.840.1.113883.6.96",
       "value.codeSystemName", "SNOMEDCT",
       "value.displayName", "cardiac arrest"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationship";																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "CardiacArrestTimingRelationshipInversionInd",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTimingAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming";																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67502-5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "CardiacArrestTimingCode CardiacArrestTimingValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationship";																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCauseAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause";																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67503-3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Cardiac arrest cause",
       "constraints.validation.error", "CardiacArrestCauseCode CardiacArrestCauseValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipation";																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "INF"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole";																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "AGNT",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "CardiacArrestInformantRoleCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationship";																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR";																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67506-6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "CPR prior to EMS arrival",
       "constraints.validation.error", "PriorCPRCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation";																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RESP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProviderAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider";																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "PriorCPRProviderCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationship";																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUseAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse";																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67508-2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "AED use prior to EMS arrival",
       "constraints.validation.error", "PriorAEDUseCode PriorAEDUseValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation";																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RESP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProviderAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider";																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "PriorAEDProviderCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationship";																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythmAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm";																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67512-4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "First monitored rhythm",
       "constraints.validation.error", "ArrestRhythmCode ArrestRhythmValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationship";																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation";																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67513-2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Return of spontaneous circulation",
       "constraints.validation.error", "ReturnOfSpontaneousCirculationCode ReturnOfSpontaneousCirculationValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationship";																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythmAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm";																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsCardiacArrestEventSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67519-9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Cardiac rhythm",
       "constraints.validation.error", "DestinationRhythmCode DestinationRhythmValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionDerivedEntryEMSAdvancedDirectiveObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAdvanceDirectivesSectionDerivedEntryEMSAdvancedDirectiveObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAdvanceDirectivesSectionDerivedEntryEMSAdvancedDirectiveObservation";																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsAdvanceDirectivesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67516-5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Advanced directive",
       "constraints.validation.error", "EMSAdvancedDirectiveObservationCode EMSAdvancedDirectiveObservationValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSMedicationAllergies"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergies</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergies";																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationAllergiesEMSExistenceOfDrugAllergy",
       "constraints.validation.info", "EMSMedicationAllergiesEMSDrugAllergy"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSExistenceOfDrugAllergy</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSExistenceOfDrugAllergyAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSExistenceOfDrugAllergy";																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67794?8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Existence of drug allergy",
       "constraints.validation.error", "EMSExistenceOfDrugAllergyCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergy</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergy";																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "value.code", "106190000",
       "value.codeSystem", "2.16.840.1.113883.6.96",
       "value.codeSystemName", "SNOMEDCT",
       "value.displayName", "allergy",
       "constraints.validation.error", "EMSDrugAllergyValue"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSMedicationAllergiesEMSDrugAllergyEMSDrugAllergyParticipationEMSDrugAllergyParticipantRoleEMSDrugAllergyEntity";																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.88",
       "code.codeSystemName", "RxNorm",
       "constraints.validation.error", "EMSDrugAllergyEntityCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergies</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergies";																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy",
       "constraints.validation.info", "EMSEnvironmentalAllergiesEMSEnvironmentalAllergy"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergyAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSExistenceOfEnvironmentalAllergy";																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69747?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Existence of environmental allergy",
       "constraints.validation.error", "EMSExistenceOfEnvironmentalAllergyCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergyAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSAllergiesAndAdverseReactionsSectionDerivedEntryEMSEnvironmentalAllergiesEMSEnvironmentalAllergy";																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsAllergiesAndAdverseReactionsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69748?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Known allergies to food or environmental agents",
       "constraints.validation.error", "EMSEnvironmentalAllergyCode EMSEnvironmentalAllergyValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPastMedicalHistoryDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntry";																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsPastMedicalHistoryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "DerivedEntryEMSHistoryOfConditions"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditions</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditions";																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsPastMedicalHistoryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHistoryOfConditionsEMSExistenceOfHistoryOfCondition",
       "constraints.validation.info", "EMSHistoryOfConditionsEMSHistoryOfCondition"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSExistenceOfHistoryOfCondition</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSExistenceOfHistoryOfConditionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSExistenceOfHistoryOfCondition";																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsPastMedicalHistoryEClass, 
       source, 
       new String[] 
       {
       "code.code", "67793?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Has the patient had any significant medical conditions",
       "constraints.validation.error", "EMSExistenceOfHistoryOfConditionCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSHistoryOfCondition</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSHistoryOfConditionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfConditionsEMSHistoryOfCondition";																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsPastMedicalHistoryEClass, 
       source, 
       new String[] 
       {
       "code.code", "68487?8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS History of Condition",
       "constraints.validation.error", "EMSHistoryOfConditionCode EMSHistoryOfConditionCodeP EMSHistoryOfConditionValue",
       "constraints.validation.dependOn.EMSHistoryOfConditionCode", "EMSHistoryOfConditionCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfProceduresEMSExistenceOfHistoryOfProcedures</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfProceduresEMSExistenceOfHistoryOfProceduresAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPastMedicalHistoryDerivedEntryEMSHistoryOfProceduresEMSExistenceOfHistoryOfProcedures";																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsPastMedicalHistoryEClass, 
       source, 
       new String[] 
       {
       "code.code", "67792?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS existence of history of procedures",
       "constraints.validation.error", "EMSExistenceOfHistoryOfProceduresCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSocialHistoryDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsSocialHistoryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSExistenceOfDrugUseIndicator",
       "constraints.validation.info", "DerivedEntryEMSDrugUseIndicator"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntryEMSExistenceOfDrugUseIndicator</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSocialHistoryDerivedEntryEMSExistenceOfDrugUseIndicatorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntryEMSExistenceOfDrugUseIndicator";																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsSocialHistoryEClass, 
       source, 
       new String[] 
       {
       "code.code", "69757?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Indications of drug or alcohol use by the patient",
       "constraints.validation.error", "EMSExistenceOfDrugUseIndicatorCode EMSExistenceOfDrugUseIndicatorCodeP",
       "constraints.validation.dependOn.EMSExistenceOfDrugUseIndicatorCode", "EMSExistenceOfDrugUseIndicatorCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntryEMSDrugUseIndicator</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSocialHistoryDerivedEntryEMSDrugUseIndicatorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistoryDerivedEntryEMSDrugUseIndicator";																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsSocialHistoryEClass, 
       source, 
       new String[] 
       {
       "code.code", "67669?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Alcohol - drug use",
       "constraints.validation.error", "EMSDrugUseIndicatorCode EMSDrugUseIndicatorValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSBarriersToPatientCare",
       "constraints.validation.info", "DerivedEntryEMSThrombolyticContraindications"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSPhysicalAssessmentOrganizerEffectiveTime",
       "constraints.validation.info", "EMSPhysicalAssessmentOrganizerPatientBodyWeight EMSPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClass EMSPhysicalAssessmentOrganizerEMSSkinAssessment EMSPhysicalAssessmentOrganizerEMSHeadAssessment EMSPhysicalAssessmentOrganizerEMSFaceAssessment EMSPhysicalAssessmentOrganizerEMSNeckAssessment EMSPhysicalAssessmentOrganizerEMSChestAndLungsAssessment EMSPhysicalAssessmentOrganizerEMSHeartAssessment EMSPhysicalAssessmentOrganizerEMSAbdomenAssessment EMSPhysicalAssessmentOrganizerEMSPelvicAndGenitourinaryAssessment EMSPhysicalAssessmentOrganizerEMSBackAndSpineAssessment EMSPhysicalAssessmentOrganizerEMSExtremitiesAssessment EMSPhysicalAssessmentOrganizerEMSEyeAssessment EMSPhysicalAssessmentOrganizerEMSMentalStatusAssessment EMSPhysicalAssessmentOrganizerEMSNeurologicalAssessment"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerPatientBodyWeight</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerPatientBodyWeightAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerPatientBodyWeight";																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "8335?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "PatientBodyWeightCode PatientBodyWeightValue"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClass</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClassAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClass";																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67670?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "LengthBasedPatientBodyWeightClassCode LengthBasedPatientBodyWeightClassCodeP LengthBasedPatientBodyWeightClassValue",
       "constraints.validation.dependOn.LengthBasedPatientBodyWeightClassCode", "LengthBasedPatientBodyWeightClassCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSSkinAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSSkinAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSSkinAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67524?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSSkinAssessmentCode EMSSkinAssessmentCodeP EMSSkinAssessmentValue EMSSkinAssessmentValueP",
       "constraints.validation.dependOn.EMSSkinAssessmentCode", "EMSSkinAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeadAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeadAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeadAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67525?6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSHeadAssessmentCode EMSHeadAssessmentCodeP EMSHeadAssessmentValue",
       "constraints.validation.dependOn.EMSHeadAssessmentCode", "EMSHeadAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSFaceAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSFaceAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSFaceAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67526?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSFaceAssessmentCode EMSFaceAssessmentCodeP EMSFaceAssessmentValue EMSFaceAssessmentValueP",
       "constraints.validation.dependOn.EMSFaceAssessmentCode", "EMSFaceAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeckAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeckAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeckAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67527?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Neck assessment finding",
       "constraints.validation.error", "EMSNeckAssessmentCode EMSNeckAssessmentValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSChestAndLungsAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSChestAndLungsAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSChestAndLungsAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67528?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Chest and lungs assessment",
       "constraints.validation.error", "EMSChestAndLungsAssessmentCode EMSChestAndLungsAssessmentValue",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeartAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeartAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeartAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67529?8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Heart assessment finding",
       "constraints.validation.error", "EMSHeartAssessmentCode EMSHeartAssessmentCodeP EMSHeartAssessmentValue EMSHeartAssessmentValueP",
       "constraints.validation.dependOn.EMSHeartAssessmentCode", "EMSHeartAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSAbdomenAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSAbdomenAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSAbdomenAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67530?6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Abdomen assessment",
       "constraints.validation.error", "EMSAbdomenAssessmentCode EMSAbdomenAssessmentValue EMSAbdomenAssessmentTargetSiteCode",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSPelvicAndGenitourinaryAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSPelvicAndGenitourinaryAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSPelvicAndGenitourinaryAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67531?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Pelvic and genitourinary assessment",
       "constraints.validation.error", "EMSPelvicAndGenitourinaryAssessmentCode EMSPelvicAndGenitourinaryAssessmentValue EMSPelvicAndGenitourinaryAssessmentValueP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSBackAndSpineAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSBackAndSpineAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSBackAndSpineAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67532?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Back and spine assessment",
       "constraints.validation.error", "EMSBackAndSpineAssessmentCode EMSBackAndSpineAssessmentCodeP EMSBackAndSpineAssessmentTargetSiteCode EMSBackAndSpineAssessmentTargetSiteCodeP EMSBackAndSpineAssessmentValue EMSBackAndSpineAssessmentValueP",
       "constraints.validation.dependOn.EMSBackAndSpineAssessmentCode", "EMSBackAndSpineAssessmentCodeP",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSExtremitiesAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSExtremitiesAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSExtremitiesAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67533?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Extremities assessment",
       "constraints.validation.error", "EMSExtremitiesAssessmentCode EMSExtremitiesAssessmentCodeP EMSExtremitiesAssessmentTargetSiteCode EMSExtremitiesAssessmentValue",
       "constraints.validation.dependOn.EMSExtremitiesAssessmentCode", "EMSExtremitiesAssessmentCodeP",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC",
       "constraints.validation.info", "EMSExtremitiesAssessmentTargetSiteCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSEyeAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSEyeAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSEyeAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67534?8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Eye assessment",
       "constraints.validation.error", "EMSEyeAssessmentCode EMSEyeAssessmentCodeP EMSEyeAssessmentTargetSiteCode EMSEyeAssessmentTargetSiteCodeP EMSEyeAssessmentValue EMSEyeAssessmentValueP",
       "constraints.validation.dependOn.EMSEyeAssessmentCode", "EMSEyeAssessmentCodeP",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSMentalStatusAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSMentalStatusAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSMentalStatusAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67535?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Mental status assessment",
       "constraints.validation.error", "EMSMentalStatusAssessmentCode EMSMentalStatusAssessmentValue",
       "constraints.validation.info", "EMSMentalStatusAssessmentCodeP",
       "constraints.validation.dependOn.EMSMentalStatusAssessmentCode", "EMSMentalStatusAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeurologicalAssessment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeurologicalAssessmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeurologicalAssessment";																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67536?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Neurological status assessment",
       "constraints.validation.error", "EMSNeurologicalAssessmentCode EMSNeurologicalAssessmentCodeP EMSNeurologicalAssessmentValue EMSNeurologicalAssessmentValueP",
       "constraints.validation.dependOn.EMSNeurologicalAssessmentCode", "EMSNeurologicalAssessmentCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryPatientPregnancy</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryPatientPregnancyAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryPatientPregnancy";																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67471?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Patient Pregnancy",
       "constraints.validation.error", "PatientPregnancyCode PatientPregnancyCodeP PatientPregnancyValue PatientPregnancyValueP",
       "constraints.validation.dependOn.PatientPregnancyCode", "PatientPregnancyCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryLastOralIntake</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryLastOralIntakeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryLastOralIntake";																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67517?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Last oral intake",
       "constraints.validation.error", "LastOralIntakeCode LastOralIntakeCodeP LastOralIntakeValue",
       "constraints.validation.dependOn.LastOralIntakeCode", "LastOralIntakeCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPatientAge</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPatientAgeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPatientAge";																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "30525?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Patient age",
       "constraints.validation.error", "EMSPatientAgeCode EMSPatientAgeCodeP EMSPatientAgeValue",
       "constraints.validation.dependOn.EMSPatientAgeCode", "EMSPatientAgeCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSThrombolyticContraindications</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSThrombolyticContraindicationsAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSThrombolyticContraindications";																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67523?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Contraindications to thrombolytic use",
       "constraints.validation.error", "EMSThrombolyticContraindicationsCode EMSThrombolyticContraindicationsCodeP EMSThrombolyticContraindicationsValue",
       "constraints.validation.dependOn.EMSThrombolyticContraindicationsCode", "EMSThrombolyticContraindicationsCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSBarriersToPatientCare</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPhysicalAssessmentSectionDerivedEntryEMSBarriersToPatientCareAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSBarriersToPatientCare";																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsPhysicalAssessmentSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67523?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Barriers to patient care",
       "constraints.validation.error", "EMSBarriersToPatientCareCode EMSBarriersToPatientCareCodeP EMSBarriersToPatientCareValue EMSBarriersToPatientCareValueP",
       "constraints.validation.dependOn.EMSBarriersToPatientCareCode", "EMSBarriersToPatientCareCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "DerivedEntryEMSMedicationAdministered"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministered</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministered";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "SBADM",
       "constraints.validation.error", "EMSMedicationAdministeredClassCode EMSMedicationAdministeredDoseQuantity EMSMedicationAdministeredEffectiveTime EMSMedicationAdministeredRouteCode EMSMedicationAdministeredRouteCodeP EMSMedicationAdministeredEMSMedicationConsumable EMSMedicationAdministeredMedicationAdministeredResponseRelationship EMSMedicationAdministeredEMSMedicationComplicationRelationship EMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship",
       "constraints.validation.info", "EMSMedicationAdministeredNegationInd EMSMedicationAdministeredMedicationNotAdministeredEntryRelationship EMSMedicationAdministeredEMSMedicationPerformerParticipation EMSMedicationAdministeredEMSMedicationAuthorizationRelationship",
       "routeCode.codeSystem", "2.16.840.1.113883.6.1",
       "routeCode.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSMedicationAdministeredRouteCode", "EMSMedicationAdministeredRouteCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "MedicationNotAdministeredEntryRelationshipInversionInd MedicationNotAdministeredEntryRelationshipTypeCode MedicationNotAdministeredEntryRelationshipTypeCodeP MedicationNotAdministeredEntryRelationshipMedicationNotAdministeredReasonObservation",
       "typeCode", "RSON",
       "constraints.validation.dependOn.MedicationNotAdministeredEntryRelationshipTypeCode", "MedicationNotAdministeredEntryRelationshipTypeCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationshipMedicationNotAdministeredReasonObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationshipMedicationNotAdministeredReasonObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredMedicationNotAdministeredEntryRelationshipMedicationNotAdministeredReasonObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "ASSERTION",
       "code.codeSystem", "2.16.840.1.113883.5.4",
       "code.codeSystemName", "HL7ActCode",
       "code.displayName", "Assertion",
       "constraints.validation.error", "MedicationNotAdministeredReasonObservationCode MedicationNotAdministeredReasonObservationValue MedicationNotAdministeredReasonObservationValueP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumable</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumable";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProduct";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationManfacturedProductEMSMedicationLabeledDrug"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrug</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrugAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredConsumableEMSMedicationManfacturedProductEMSMedicationLabeledDrug";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.88",
       "code.codeSystemName", "RxNorm",
       "constraints.validation.error", "EMSMedicationLabeledDrugCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationAdministeredResponseRelationshipMedicationResponseObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAdministeredResponseRelationshipMedicationResponseObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67540?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Response to medication",
       "constraints.validation.error", "MedicationResponseObservationCode MedicationResponseObservationCodeP MedicationResponseObservationValue",
       "constraints.validation.dependOn.MedicationResponseObservationCode", "MedicationResponseObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationComplicationRelationshipEMSMedicationComplicationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationComplicationRelationshipEMSMedicationComplicationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67541?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Medication complication",
       "constraints.validation.error", "EMSMedicationComplicationObservationCode EMSMedicationComplicationObservationCodeP EMSMedicationComplicationObservationValue EMSMedicationComplicationObservationValueP",
       "constraints.validation.dependOn.EMSMedicationComplicationObservationCode", "EMSMedicationComplicationObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPriorAdministrationRelationshipEMSMedicationPriorAdministrationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67539?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Prior administration",
       "constraints.validation.error", "EMSMedicationPriorAdministrationObservationCode EMSMedicationPriorAdministrationObservationCodeP EMSMedicationPriorAdministrationObservationValue",
       "constraints.validation.dependOn.EMSMedicationPriorAdministrationObservationCode", "EMSMedicationPriorAdministrationObservationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationPerformerParticipationEMSMedicationPerformerRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationPerformerParticipationEMSMedicationPerformerRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSMedicationPerformerRoleCode EMSMedicationPerformerRoleCodeP EMSMedicationPerformerRoleId"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMedicationAuthorizationRelationshipEMSMedicationAuthorization"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorization</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorizationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSMedicationsAdministeredSectionDerivedEntryEMSMedicationAdministeredEMSMedicationAuthorizationRelationshipEMSMedicationAuthorization";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsMedicationsAdministeredSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "INFRM",
       "constraints.validation.error", "EMSMedicationAuthorizationClassCode EMSMedicationAuthorizationClassCodeP EMSMedicationAuthorizationCode",
       "constraints.validation.dependOn.EMSMedicationAuthorizationClassCode", "EMSMedicationAuthorizationClassCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSProcedure"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedure</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedure";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedureTemplateId EMSProcedureCode EMSProcedureEffectiveTime EMSProcedureStatusCode EMSProcedureApproachSiteCode EMSProcedureEMSProcedurePriorRelationship EMSProcedureEMSProcedureNumberOfAttemptsRelationship EMSProcedureEMSProcedureSuccessfulRelationship EMSProcedureEMSProcedureComplicationsRelationship EMSProcedureEMSProcedurePatientResponseRelationship EMSProcedureEMSProcedurePerformer",
       "templateId.root", "null",
       "statusCode.code", "Aborted",
       "constraints.validation.info", "EMSProcedureStatusCodeP EMSProcedureApproachSiteCodeP EMSProcedureEMSAbandonedProcedureRelationship EMSProcedureEMSAirwayConfirmationRelationship EMSProcedureEMSAirwayDeviceParticipant",
       "constraints.validation.dependOn.EMSProcedureStatusCode", "EMSProcedureStatusCodeP",
       "approachSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "approachSiteCode.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSProcedureApproachSiteCode", "EMSProcedureApproachSiteCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "ASSERTION",
       "code.codeSystem", "2.16.840.1.113883.5.4",
       "code.codeSystemName", "HL7ActCode",
       "code.displayName", "Assertion",
       "constraints.validation.error", "EMSAbandonedProcedureReasonObservationCode EMSAbandonedProcedureReasonObservationCodeP EMSAbandonedProcedureReasonObservationValue EMSAbandonedProcedureReasonObservationValueP",
       "constraints.validation.dependOn.EMSAbandonedProcedureReasonObservationCode", "EMSAbandonedProcedureReasonObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedurePriorRelationshipEMSProcedurePriorIndicator"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicator</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicatorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicator";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67542?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Procedure performed prior to EMS arrival",
       "constraints.validation.error", "EMSProcedurePriorIndicatorCode EMSProcedurePriorIndicatorCodeP EMSProcedurePriorIndicatorValue",
       "constraints.validation.dependOn.EMSProcedurePriorIndicatorCode", "EMSProcedurePriorIndicatorCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67543?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Number of procedure attempts",
       "constraints.validation.error", "EMSProcedureNumberOfAttemptsObservationCode EMSProcedureNumberOfAttemptsObservationCodeP EMSProcedureNumberOfAttemptsObservationValue",
       "constraints.validation.dependOn.EMSProcedureNumberOfAttemptsObservationCode", "EMSProcedureNumberOfAttemptsObservationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67544?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Procedure successful indicator",
       "constraints.validation.error", "EMSProcedureSuccessfulObservationCode EMSProcedureSuccessfulObservationCodeP EMSProcedureSuccessfulObservationValue",
       "constraints.validation.dependOn.EMSProcedureSuccessfulObservationCode", "EMSProcedureSuccessfulObservationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedureComplicationsObservationTemplateId EMSProcedureComplicationsObservationCode EMSProcedureComplicationsObservationCodeP EMSProcedureComplicationsObservationValue",
       "templateId.root", "null",
       "code.code", "67545?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Procedure complication",
       "constraints.validation.dependOn.EMSProcedureComplicationsObservationCode", "EMSProcedureComplicationsObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67546?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Procedure patient response",
       "constraints.validation.error", "EMSProcedurePatientResponseObservationCode EMSProcedurePatientResponseObservationCodeP EMSProcedurePatientResponseObservationValue EMSProcedurePatientResponseObservationValueP",
       "constraints.validation.dependOn.EMSProcedurePatientResponseObservationCode", "EMSProcedurePatientResponseObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformerAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSProcedurePerformerEMSProcedurePerformerEntity"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntity</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntity";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSProcedurePerformerEntityCode EMSProcedurePerformerEntityCodeP EMSProcedurePerformerEntityId"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAirwayConfirmationObservationTemplateId EMSAirwayConfirmationObservationCode EMSAirwayConfirmationObservationCodeP EMSAirwayConfirmationObservationMethodCode EMSAirwayConfirmationObservationMethodCodeP EMSAirwayConfirmationObservationValue EMSAirwayConfirmationObservationEffectiveTime EMSAirwayConfirmationObservationEMSAirwayDeviceParticipant",
       "templateId.root", "null",
       "code.code", "TBD",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.EMSAirwayConfirmationObservationCode", "EMSAirwayConfirmationObservationCodeP",
       "methodCode.codeSystem", "2.16.840.1.113883.6.1",
       "methodCode.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipant</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipant";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantTypeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionDerivedEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsProceduresPerformedSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSAirwayDeviceParticipantTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSceneSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSMassCasualtyIndicator"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSFirstUnitIndicator</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSceneSectionDerivedEntryEMSFirstUnitIndicatorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSFirstUnitIndicator";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67665?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS reporter is first unit on scene",
       "constraints.validation.error", "EMSFirstUnitIndicatorCode EMSFirstUnitIndicatorCodeP EMSFirstUnitIndicatorValue",
       "constraints.validation.dependOn.EMSFirstUnitIndicatorCode", "EMSFirstUnitIndicatorCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSFirstUnitOnScene</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSceneSectionDerivedEntryEMSFirstUnitOnSceneAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSFirstUnitOnScene";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67481?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Name of first unit on scene",
       "constraints.validation.error", "EMSFirstUnitOnSceneCode EMSFirstUnitOnSceneCodeP EMSFirstUnitOnSceneValue",
       "constraints.validation.dependOn.EMSFirstUnitOnSceneCode", "EMSFirstUnitOnSceneCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSScenePatientCount</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSceneSectionDerivedEntryEMSScenePatientCountAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSScenePatientCount";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67489?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Count of patients at scene",
       "constraints.validation.error", "EMSScenePatientCountCode EMSScenePatientCountCodeP EMSScenePatientCountValue",
       "constraints.validation.dependOn.EMSScenePatientCountCode", "EMSScenePatientCountCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSMassCasualtyIndicator</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSceneSectionDerivedEntryEMSMassCasualtyIndicatorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSceneSectionDerivedEntryEMSMassCasualtyIndicator";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsSceneSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSMassCasualtyIndicatorCode EMSMassCasualtyIndicatorValue"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSVitalSignsOrganizer"
       });																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSVitalSignsOrganizerEffectiveTime EMSVitalSignsOrganizerEMSPriorAidVitals EMSVitalSignsOrganizerEMSCardiacRhythm EMSVitalSignsOrganizerEMSSystolicBloodPressure EMSVitalSignsOrganizerEMSRespiratoryRate EMSVitalSignsOrganizerEMSOxygenSaturation EMSVitalSignsOrganizerEMSCarbonDioxide EMSVitalSignsOrganizerEMSBloodGlucose EMSVitalSignsOrganizerEMSLevelOfResponsiveness EMSVitalSignsOrganizerEMSPainScore EMSVitalSignsOrganizerEMSStrokeScore EMSVitalSignsOrganizerEMSGlasgowComaScore",
       "constraints.validation.info", "EMSVitalSignsOrganizerEMSDiastolicBloodPressure EMSVitalSignsOrganizerEMSBodyTemperature EMSVitalSignsOrganizerEMSCarbonMonoxide",
       "constraints.validation.warning", "EMSVitalSignsOrganizerEMSHeartRate"
       });																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPriorAidVitals</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPriorAidVitalsAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPriorAidVitals";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67518?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Obtained prior to units EMS care",
       "constraints.validation.error", "EMSPriorAidVitalsCode"
       });																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCardiacRhythm</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCardiacRhythmAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCardiacRhythm";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67519?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Cardiac rhythm",
       "constraints.validation.error", "EMSCardiacRhythmCode EMSCardiacRhythmCodeP EMSCardiacRhythmMethodCode EMSCardiacRhythmMethodCodeP EMSCardiacRhythmValue EMSCardiacRhythmValueP",
       "constraints.validation.dependOn.EMSCardiacRhythmCode", "EMSCardiacRhythmCodeP",
       "methodCode.codeSystem", "2.16.840.1.113883.6.1",
       "methodCode.codeSystemName", "LOINC",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "8480?6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Intravascular systolic",
       "constraints.validation.error", "EMSSystolicBloodPressureCode EMSSystolicBloodPressureValue"
       });																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "8462-4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Intravascular diastolic",
       "constraints.validation.error", "EMSDiastolicBloodPressureCode EMSDiastolicBloodPressureValue"
       });																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSHeartRate</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSHeartRateAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSHeartRate";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "8867?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Heart rate",
       "constraints.validation.error", "EMSHeartRateCode EMSHeartRateCodeP EMSHeartRateValue",
       "constraints.validation.dependOn.EMSHeartRateCode", "EMSHeartRateCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSRespiratoryRate</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSRespiratoryRateAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSRespiratoryRate";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "9279?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Breaths",
       "constraints.validation.error", "EMSRespiratoryRateCode EMSRespiratoryRateValue"
       });																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBodyTemperature</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBodyTemperatureAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBodyTemperature";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "8310?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Body temperature",
       "constraints.validation.error", "EMSBodyTemperatureCode EMSBodyTemperatureValue"
       });																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSOxygenSaturation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSOxygenSaturationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSOxygenSaturation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "2710?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Oxygen saturation",
       "constraints.validation.error", "EMSOxygenSaturationCode EMSOxygenSaturationValue"
       });																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonDioxide</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonDioxideAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonDioxide";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "19889?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Carbon dioxide/Gas.total.at end expiration",
       "constraints.validation.error", "EMSCarbonDioxideCode EMSCarbonDioxideCodeP EMSCarbonDioxideValue",
       "constraints.validation.dependOn.EMSCarbonDioxideCode", "EMSCarbonDioxideCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonMonoxide</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonMonoxideAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonMonoxide";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "19911?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Diffusion capacity.carbon monoxide",
       "constraints.validation.error", "EMSCarbonMonoxideCode EMSCarbonMonoxideCodeP EMSCarbonMonoxideValue",
       "constraints.validation.dependOn.EMSCarbonMonoxideCode", "EMSCarbonMonoxideCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBloodGlucose</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBloodGlucoseAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBloodGlucose";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "2339?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Glucose",
       "constraints.validation.error", "EMSBloodGlucoseCode EMSBloodGlucoseCodeP EMSBloodGlucoseValue",
       "constraints.validation.dependOn.EMSBloodGlucoseCode", "EMSBloodGlucoseCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSLevelOfResponsiveness</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSLevelOfResponsivenessAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSLevelOfResponsiveness";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67775?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Level of responsiveness",
       "constraints.validation.error", "EMSLevelOfResponsivenessCode EMSLevelOfResponsivenessCodeP EMSLevelOfResponsivenessValue EMSLevelOfResponsivenessValueP",
       "constraints.validation.dependOn.EMSLevelOfResponsivenessCode", "EMSLevelOfResponsivenessCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPainScore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPainScoreAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPainScore";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "56840?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Pain severity verbal numeric scale",
       "constraints.validation.error", "EMSPainScoreCode"
       });																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSStrokeScore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSStrokeScoreAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSStrokeScore";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67520?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Stroke scale overall interpretation",
       "constraints.validation.error", "EMSStrokeScoreCode EMSStrokeScoreCodeP EMSStrokeScoreValue EMSStrokeScoreMethodCode EMSStrokeScoreMethodCodeP",
       "constraints.validation.dependOn.EMSStrokeScoreCode", "EMSStrokeScoreCodeP",
       "methodCode.codeSystem", "2.16.840.1.113883.6.1",
       "methodCode.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScore";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSGlasgowComaScoreEMSGlasgowEye EMSGlasgowComaScoreEMSGlasgowMotor EMSGlasgowComaScoreEMSGlasgowVerbal",
       "constraints.validation.info", "EMSGlasgowComaScoreEMSGlasgowQualifier",
       "constraints.validation.warning", "EMSGlasgowComaScoreEMSGlasgowTotal"
       });																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowTotal</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowTotalAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowTotal";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "9269?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Glasgow coma score.total",
       "constraints.validation.error", "EMSGlasgowTotalCode EMSGlasgowTotalCodeP EMSGlasgowTotalValue",
       "constraints.validation.dependOn.EMSGlasgowTotalCode", "EMSGlasgowTotalCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowQualifier</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowQualifierAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowQualifier";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "55285?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Glasgow coma score special circumstances",
       "constraints.validation.error", "EMSGlasgowQualifierCode EMSGlasgowQualifierCodeP",
       "constraints.validation.dependOn.EMSGlasgowQualifierCode", "EMSGlasgowQualifierCodeP",
       "constraints.validation.info", "EMSGlasgowQualifierValue"
       });																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowEye</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowEyeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowEye";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "9267?6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Glasgow coma score.eye opening",
       "constraints.validation.error", "EMSGlasgowEyeCode EMSGlasgowEyeCodeP EMSGlasgowEyeValue",
       "constraints.validation.dependOn.EMSGlasgowEyeCode", "EMSGlasgowEyeCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowMotor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowMotorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowMotor";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSGlasgowMotorTemplateId EMSGlasgowMotorCode EMSGlasgowMotorCodeP EMSGlasgowMotorValue",
       "templateId.root", "null",
       "code.code", "9268?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Glasgow coma score.motor",
       "constraints.validation.dependOn.EMSGlasgowMotorCode", "EMSGlasgowMotorCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowVerbal</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowVerbalAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowVerbal";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsVitalSignsSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "9270?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Glasgow coma score.verbal",
       "constraints.validation.error", "EMSGlasgowVerbalCode EMSGlasgowVerbalCodeP EMSGlasgowVerbalValue",
       "constraints.validation.dependOn.EMSGlasgowVerbalCode", "EMSGlasgowVerbalCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispatchDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsDispatchEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "DerivedEntryEMSComplaintReportedByDispatch"
       });																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntryEMSEmergencyMedicalDispatchObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispatchDerivedEntryEMSEmergencyMedicalDispatchObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntryEMSEmergencyMedicalDispatchObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsDispatchEClass, 
       source, 
       new String[] 
       {
       "code.code", "67488?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMDPerformed",
       "constraints.validation.error", "EMSEmergencyMedicalDispatchObservationCode EMSEmergencyMedicalDispatchObservationCodeP EMSEmergencyMedicalDispatchObservationValue EMSEmergencyMedicalDispatchObservationValueP",
       "constraints.validation.dependOn.EMSEmergencyMedicalDispatchObservationCode", "EMSEmergencyMedicalDispatchObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntryEMSComplaintReportedByDispatch</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispatchDerivedEntryEMSComplaintReportedByDispatchAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispatchDerivedEntryEMSComplaintReportedByDispatch";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsDispatchEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSComplaintReportedByDispatchCode EMSComplaintReportedByDispatchValue EMSComplaintReportedByDispatchValueP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSResponseModeToScene"
       });																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDelayOrganizerEMSDispatchDelayRelationship EMSDelayOrganizerEMSResponseDelayRelationship EMSDelayOrganizerEMSSceneDelayRelationship EMSDelayOrganizerEMSTransportDelayRelationship EMSDelayOrganizerEMSTurnaoundDelayRelationship"
       });																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDispatchDelayRelationshipEMSDispatchDelay"
       });																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelayAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67480?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Dispatch delay",
       "constraints.validation.error", "EMSDispatchDelayCode EMSDispatchDelayCodeP EMSDispatchDelayValue EMSDispatchDelayValueP",
       "constraints.validation.dependOn.EMSDispatchDelayCode", "EMSDispatchDelayCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseDelayRelationshipEMSResponseDelay"
       });																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelayAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67557?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Response delay",
       "constraints.validation.error", "EMSResponseDelayCode EMSResponseDelayCodeP EMSResponseDelayValue EMSResponseDelayValueP",
       "constraints.validation.dependOn.EMSResponseDelayCode", "EMSResponseDelayCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSSceneDelayRelationshipEMSSceneDelay"
       });																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelayAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67558?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Scene delay",
       "constraints.validation.error", "EMSSceneDelayCode EMSSceneDelayCodeP EMSSceneDelayValue EMSSceneDelayValueP",
       "constraints.validation.dependOn.EMSSceneDelayCode", "EMSSceneDelayCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSTransportDelayRelationshipEMSTransportDelay"
       });																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelayAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67559?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Transport delay",
       "constraints.validation.error", "EMSTransportDelayCode EMSTransportDelayCodeP EMSTransportDelayValue EMSTransportDelayValueP",
       "constraints.validation.dependOn.EMSTransportDelayCode", "EMSTransportDelayCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSTurnaoundDelayRelationshipEMSTurnaroundDelay"
       });																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelayAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67560?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Turnaround delay",
       "constraints.validation.error", "EMSTurnaroundDelayCode EMSTurnaroundDelayCodeP EMSTurnaroundDelayValue EMSTurnaroundDelayValueP",
       "constraints.validation.dependOn.EMSTurnaroundDelayCode", "EMSTurnaroundDelayCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "EMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLongtudeRelationship"
       });																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDispatchLocationNameRelationshipTemplateId EMSDispatchLocationNameRelationshipEMSDispatchLocationName",
       "templateId.root", "null"
       });																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationNameAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "69466?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Dispatch Location Name",
       "constraints.validation.error", "EMSDispatchLocationNameCode EMSDispatchLocationNameValue"
       });																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDispatchLocationLatitudeRelationshipTemplateId EMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude",
       "templateId.root", "null"
       });																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitudeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "52002?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Dispatch Location Latitude",
       "constraints.validation.error", "EMSDispatchLocationLatitudeCode EMSDispatchLocationLatitudeValue"
       });																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSDispatchLocationLongitudeRelationshipTemplateId",
       "templateId.root", "null"
       });																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitudeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "52003?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Dispatch Location Longitude",
       "constraints.validation.error", "EMSDispatchLocationLongitudeCode EMSDispatchLocationLongitudeValue"
       });																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "EMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship"
       });																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading"
       });																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReadingAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67484?6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Response odometer beginning reading",
       "constraints.validation.error", "EMSResponseBeginningOdometerReadingCode EMSResponseBeginningOdometerReadingCodeP EMSResponseBeginningOdometerReadingValue",
       "constraints.validation.dependOn.EMSResponseBeginningOdometerReadingCode", "EMSResponseBeginningOdometerReadingCodeP"
       });																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading"
       });																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReadingAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67485?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Response odometer on-scene reading",
       "constraints.validation.error", "EMSResponseOnSceneOdometerReadingCode EMSResponseOnSceneOdometerReadingCodeP EMSResponseOnSceneOdometerReadingValue",
       "constraints.validation.dependOn.EMSResponseOnSceneOdometerReadingCode", "EMSResponseOnSceneOdometerReadingCodeP"
       });																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading"
       });																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReadingAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67486?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Response odometer destination reading",
       "constraints.validation.error", "EMSResponseDestinationOdometerReadingCode EMSResponseDestinationOdometerReadingCodeP EMSResponseDestinationOdometerReadingValue",
       "constraints.validation.dependOn.EMSResponseDestinationOdometerReadingCode", "EMSResponseDestinationOdometerReadingCodeP"
       });																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReadingAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67487?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Response odometer ending reading",
       "constraints.validation.error", "EMSResponseEndingOdometerReadingCode EMSResponseEndingOdometerReadingCodeP EMSResponseEndingOdometerReadingValue",
       "constraints.validation.dependOn.EMSResponseEndingOdometerReadingCode", "EMSResponseEndingOdometerReadingCodeP"
       });																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseModeToScene</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSResponseDerivedEntryEMSResponseModeToSceneAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseModeToScene";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsResponseEClass, 
       source, 
       new String[] 
       {
       "code.code", "67482?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Response mode to scene",
       "constraints.validation.error", "EMSResponseModeToSceneCode EMSResponseModeToSceneCodeP EMSResponseModeToSceneValue EMSResponseModeToSceneValueP",
       "constraints.validation.dependOn.EMSResponseModeToSceneCode", "EMSResponseModeToSceneCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispositionSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSPatientConditionChangeAtDestinationObservation"
       });																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSNumberOfPatientsObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispositionSectionDerivedEntryEMSNumberOfPatientsObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSNumberOfPatientsObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67547?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Number of patients",
       "constraints.validation.error", "EMSNumberOfPatientsObservationCode EMSNumberOfPatientsObservationCodeP EMSNumberOfPatientsObservationValue",
       "constraints.validation.dependOn.EMSNumberOfPatientsObservationCode", "EMSNumberOfPatientsObservationCodeP"
       });																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSIncidentDispositionObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispositionSectionDerivedEntryEMSIncidentDispositionObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSIncidentDispositionObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67548?8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS incident disposition",
       "constraints.validation.error", "EMSIncidentDispositionObservationCode EMSIncidentDispositionObservationCodeP EMSIncidentDispositionObservationValue EMSIncidentDispositionObservationValueP",
       "constraints.validation.dependOn.EMSIncidentDispositionObservationCode", "EMSIncidentDispositionObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSTransportModeObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispositionSectionDerivedEntryEMSTransportModeObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSTransportModeObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67550?4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS transport mode",
       "constraints.validation.error", "EMSTransportModeObservationCode EMSTransportModeObservationCodeP EMSTransportModeObservationValue EMSTransportModeObservationValueP",
       "constraints.validation.dependOn.EMSTransportModeObservationCode", "EMSTransportModeObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSTransportMethodObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispositionSectionDerivedEntryEMSTransportMethodObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSTransportMethodObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67549?6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS transport method",
       "constraints.validation.error", "EMSTransportMethodObservationCode EMSTransportMethodObservationCodeP EMSTransportMethodObservationValue EMSTransportMethodObservationValueP",
       "constraints.validation.dependOn.EMSTransportMethodObservationCode", "EMSTransportMethodObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSReasonForChoosingDestinationObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispositionSectionDerivedEntryEMSReasonForChoosingDestinationObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSReasonForChoosingDestinationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67552?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS reason for choosing destination",
       "constraints.validation.error", "EMSReasonForChoosingDestinationObservationCode EMSReasonForChoosingDestinationObservationCodeP EMSReasonForChoosingDestinationObservationValue EMSReasonForChoosingDestinationObservationValueP",
       "constraints.validation.dependOn.EMSReasonForChoosingDestinationObservationCode", "EMSReasonForChoosingDestinationObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSPrearrivalActivationObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispositionSectionDerivedEntryEMSPrearrivalActivationObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSPrearrivalActivationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69462?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS prearrival activation performed",
       "constraints.validation.error", "EMSPrearrivalActivationObservationCode EMSPrearrivalActivationObservationCodeP EMSPrearrivalActivationObservationValue EMSPrearrivalActivationObservationEffectiveTime",
       "constraints.validation.dependOn.EMSPrearrivalActivationObservationCode", "EMSPrearrivalActivationObservationCodeP"
       });																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSPatientConditionChangeAtDestinationObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSDispositionSectionDerivedEntryEMSPatientConditionChangeAtDestinationObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDerivedEntryEMSPatientConditionChangeAtDestinationObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsDispositionSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67551?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS patient condition change at destination",
       "constraints.validation.error", "EMSPatientConditionChangeAtDestinationObservationCode EMSPatientConditionChangeAtDestinationObservationCodeP EMSPatientConditionChangeAtDestinationObservationValue EMSPatientConditionChangeAtDestinationObservationValueP",
       "constraints.validation.dependOn.EMSPatientConditionChangeAtDestinationObservationCode", "EMSPatientConditionChangeAtDestinationObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPersonnelAdverseEventDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsPersonnelAdverseEventEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSAdverseEventTypeObservation"
       });																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventIndicator</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventIndicatorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventIndicator";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsPersonnelAdverseEventEClass, 
       source, 
       new String[] 
       {
       "code.code", "67554?6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS personnel exposed or injured",
       "constraints.validation.error", "EMSAdverseEventIndicatorCode EMSAdverseEventIndicatorCodeP EMSAdverseEventIndicatorValue",
       "constraints.validation.dependOn.EMSAdverseEventIndicatorCode", "EMSAdverseEventIndicatorCodeP"
       });																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventTypeObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventTypeObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventDerivedEntryEMSAdverseEventTypeObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsPersonnelAdverseEventEClass, 
       source, 
       new String[] 
       {
       "code.code", "67555?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS personnel adverse event type",
       "constraints.validation.error", "EMSAdverseEventTypeObservationCode EMSAdverseEventTypeObservationCodeP EMSAdverseEventTypeObservationValue EMSAdverseEventTypeObservationValueP",
       "constraints.validation.dependOn.EMSAdverseEventTypeObservationCode", "EMSAdverseEventTypeObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProtocolSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSCandidatePatientRegistryType"
       });																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSProtocolObservation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProtocolSectionDerivedEntryEMSProtocolObservationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSProtocolObservation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67537?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS protocol",
       "constraints.validation.error", "EMSProtocolObservationCode EMSProtocolObservationCodeP EMSProtocolObservationValue EMSProtocolObservationValueP",
       "constraints.validation.dependOn.EMSProtocolObservationCode", "EMSProtocolObservationCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSProtocolAgeCategory</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProtocolSectionDerivedEntryEMSProtocolAgeCategoryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSProtocolAgeCategory";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67538?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Protocol age category",
       "constraints.validation.error", "EMSProtocolAgeCategoryCode EMSProtocolAgeCategoryCodeP EMSProtocolAgeCategoryValue EMSProtocolAgeCategoryValueP",
       "constraints.validation.dependOn.EMSProtocolAgeCategoryCode", "EMSProtocolAgeCategoryCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSCandidatePatientRegistryType</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSProtocolSectionDerivedEntryEMSCandidatePatientRegistryTypeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProtocolSectionDerivedEntryEMSCandidatePatientRegistryType";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsProtocolSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67553?8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS candidate patient registry",
       "constraints.validation.error", "EMSCandidatePatientRegistryTypeCode EMSCandidatePatientRegistryTypeCodeP EMSCandidatePatientRegistryTypeValue EMSCandidatePatientRegistryTypeValueP",
       "constraints.validation.dependOn.EMSCandidatePatientRegistryTypeCode", "EMSCandidatePatientRegistryTypeCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry1Annotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "DerivedEntry1EMSComplaint"
       });																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaint</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaint";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "10154?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS complaint",
       "constraints.validation.error", "EMSComplaintCode EMSComplaintCodeP EMSComplaintTargetSiteCode",
       "constraints.validation.dependOn.EMSComplaintCode", "EMSComplaintCodeP",
       "constraints.validation.info", "EMSComplaintValue EMSComplaintEMSComplaintDurationRelationship EMSComplaintEMSComplaintTypeRelationship",
       "targetSiteCode.codeSystem", "2.16.840.1.113883.6.1",
       "targetSiteCode.codeSystemName", "LOINC",
       "constraints.validation.warning", "EMSComplaintTargetSiteCodeP EMSComplaintEMSComplaintOrganSystemRelationship"
       });																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintTypeRelationshipEMSComplaintType</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintTypeRelationshipEMSComplaintTypeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintTypeRelationshipEMSComplaintType";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSComplaintTypeCode EMSComplaintTypeCodeP EMSComplaintTypeValue",
       "constraints.validation.dependOn.EMSComplaintTypeCode", "EMSComplaintTypeCodeP"
       });																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintDurationRelationshipEMSComplaintDuration</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintDurationRelationshipEMSComplaintDurationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintDurationRelationshipEMSComplaintDuration";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67491?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Complaint duration",
       "constraints.validation.error", "EMSComplaintDurationCode EMSComplaintDurationCodeP EMSComplaintDurationValue",
       "constraints.validation.dependOn.EMSComplaintDurationCode", "EMSComplaintDurationCodeP"
       });																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem"
       });																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystemAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry1EMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69468?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Organ system",
       "constraints.validation.error", "EMSComplaintOrganSystemCode EMSComplaintOrganSystemCodeP EMSComplaintOrganSystemValue EMSComplaintOrganSystemValueP",
       "constraints.validation.dependOn.EMSComplaintOrganSystemCode", "EMSComplaintOrganSystemCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry2</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry2Annotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry2";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntry2EMSSituationOnset"
       });																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry2EMSSituationOnsetTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry2EMSSituationOnsetTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry2EMSSituationOnsetTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "TBD",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.error", "EMSSituationOnsetTimeCode EMSSituationOnsetTimeCodeP EMSSituationOnsetTimeValue",
       "constraints.validation.dependOn.EMSSituationOnsetTimeCode", "EMSSituationOnsetTimeCodeP"
       });																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry3</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry3Annotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry3";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntry3EMSPossibleInjury"
       });																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry3EMSPossibleInjury</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry3EMSPossibleInjuryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry3EMSPossibleInjury";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69467?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Possible injury",
       "constraints.validation.error", "EMSPossibleInjuryCode EMSPossibleInjuryCodeP EMSPossibleInjuryValue",
       "constraints.validation.dependOn.EMSPossibleInjuryCode", "EMSPossibleInjuryCodeP"
       });																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry4</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry4Annotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry4";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntry4EMSProviderPrimaryImpression"
       });																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry4EMSProviderPrimaryImpression</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntry4EMSProviderPrimaryImpressionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry4EMSProviderPrimaryImpression";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67492?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Provider Primary Impression",
       "constraints.validation.error", "EMSProviderPrimaryImpressionCode EMSProviderPrimaryImpressionCodeP EMSProviderPrimaryImpressionValue EMSProviderPrimaryImpressionValueP",
       "constraints.validation.dependOn.EMSProviderPrimaryImpressionCode", "EMSProviderPrimaryImpressionCodeP",
       "value.code", "ADD ICD10 CM"
       });																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSInitialPatientAcuity"
       });																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSPrimarySymptom</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntryEMSPrimarySymptomAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSPrimarySymptom";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67774?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "EMS Primary Symptom",
       "constraints.validation.error", "EMSPrimarySymptomCode EMSPrimarySymptomCodeP EMSPrimarySymptomValue EMSPrimarySymptomValueP",
       "constraints.validation.dependOn.EMSPrimarySymptomCode", "EMSPrimarySymptomCodeP",
       "value.code", "ADD ICD 10"
       });																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSOtherSymptoms</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntryEMSOtherSymptomsAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSOtherSymptoms";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67776?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Other symptoms",
       "constraints.validation.error", "EMSOtherSymptomsCode EMSOtherSymptomsCodeP EMSOtherSymptomsValue EMSOtherSymptomsValueP",
       "constraints.validation.dependOn.EMSOtherSymptomsCode", "EMSOtherSymptomsCodeP",
       "value.code", "ADD ICD-10 CM"
       });																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSProviderSecondaryImpressions</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntryEMSProviderSecondaryImpressionsAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSProviderSecondaryImpressions";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69542-9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Provider Secondary Impressions",
       "constraints.validation.error", "EMSProviderSecondaryImpressionsCode EMSProviderSecondaryImpressionsCodeP EMSProviderSecondaryImpressionsValue EMSProviderSecondaryImpressionsValueP",
       "constraints.validation.dependOn.EMSProviderSecondaryImpressionsCode", "EMSProviderSecondaryImpressionsCodeP",
       "value.code", "ADD ICD 10 CM"
       });																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSInitialPatientAcuity</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSSituationSectionDerivedEntryEMSInitialPatientAcuityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionDerivedEntryEMSInitialPatientAcuity";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (emsSituationSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "67493?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Initial Patient Acuity",
       "constraints.validation.error", "EMSInitialPatientAcuityCode EMSInitialPatientAcuityCodeP EMSInitialPatientAcuityValue EMSInitialPatientAcuityValueP",
       "constraints.validation.dependOn.EMSInitialPatientAcuityCode", "EMSInitialPatientAcuityCodeP",
       "value.codeSystem", "2.16.840.1.113883.6.1",
       "value.codeSystemName", "LOINC"
       });																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntry</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntry";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DerivedEntryEMSDispatchNotifiedTime"
       });																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSCallTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSCallTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSCallTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69469?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Call time",
       "constraints.validation.error", "EMSCallTimeCode EMSCallTimeCodeP EMSCallTimeValue",
       "constraints.validation.dependOn.EMSCallTimeCode", "EMSCallTimeCodeP"
       });																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitNotifiedTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSUnitNotifiedTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitNotifiedTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69471?1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Unit notified time",
       "constraints.validation.error", "EMSUnitNotifiedTimeCode EMSUnitNotifiedTimeCodeP EMSUnitNotifiedTimeValue",
       "constraints.validation.dependOn.EMSUnitNotifiedTimeCode", "EMSUnitNotifiedTimeCodeP"
       });																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitEnRouteTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSUnitEnRouteTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitEnRouteTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69472?9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Unit en route time",
       "constraints.validation.error", "EMSUnitEnRouteTimeCode EMSUnitEnRouteTimeCodeP EMSUnitEnRouteTimeValue",
       "constraints.validation.dependOn.EMSUnitEnRouteTimeCode", "EMSUnitEnRouteTimeCodeP"
       });																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitOnSceneTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSUnitOnSceneTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitOnSceneTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69473?7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Unit on scene time",
       "constraints.validation.error", "EMSUnitOnSceneTimeCode EMSUnitOnSceneTimeCodeP EMSUnitOnSceneTimeValue",
       "constraints.validation.dependOn.EMSUnitOnSceneTimeCode", "EMSUnitOnSceneTimeCodeP"
       });																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitAtPatienttTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSUnitAtPatienttTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitAtPatienttTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69474?5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Unit at patient time",
       "constraints.validation.error", "EMSUnitAtPatienttTimeCode EMSUnitAtPatienttTimeCodeP EMSUnitAtPatienttTimeValue",
       "constraints.validation.dependOn.EMSUnitAtPatienttTimeCode", "EMSUnitAtPatienttTimeCodeP"
       });																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitLeftSceneTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSUnitLeftSceneTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitLeftSceneTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69475?2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Unit left scene time",
       "constraints.validation.error", "EMSUnitLeftSceneTimeCode EMSUnitLeftSceneTimeCodeP EMSUnitLeftSceneTimeValue",
       "constraints.validation.dependOn.EMSUnitLeftSceneTimeCode", "EMSUnitLeftSceneTimeCodeP"
       });																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSPatientArrivedAtDestinationTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSPatientArrivedAtDestinationTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSPatientArrivedAtDestinationTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69476?0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Patient arrived at destination time",
       "constraints.validation.error", "EMSPatientArrivedAtDestinationTimeCode EMSPatientArrivedAtDestinationTimeCodeP EMSPatientArrivedAtDestinationTimeValue",
       "constraints.validation.dependOn.EMSPatientArrivedAtDestinationTimeCode", "EMSPatientArrivedAtDestinationTimeCodeP"
       });																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitBackInServiceTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSUnitBackInServiceTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitBackInServiceTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69477?8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Unit back in service time",
       "constraints.validation.error", "EMSUnitBackInServiceTimeCode EMSUnitBackInServiceTimeCodeP EMSUnitBackInServiceTimeValue",
       "constraints.validation.dependOn.EMSUnitBackInServiceTimeCode", "EMSUnitBackInServiceTimeCodeP"
       });																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSDispatchNotifiedTime</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSTimesSectionDerivedEntryEMSDispatchNotifiedTimeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSDispatchNotifiedTime";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (emsTimesSectionEClass, 
       source, 
       new String[] 
       {
       "code.code", "69470?3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Dispatch notified time",
       "constraints.validation.error", "EMSDispatchNotifiedTimeCode EMSDispatchNotifiedTimeCodeP EMSDispatchNotifiedTimeValue",
       "constraints.validation.dependOn.EMSDispatchNotifiedTimeCode", "EMSDispatchNotifiedTimeCodeP"
       });																																																				
  }

} //EmspcrPackageImpl
