/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyConcernAct2Operations;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyProblemActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Concern Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActAllergyObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2CDCodeAndCodeSystemValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 CD Code And Code System Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2AllergyProblemActCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Allergy Problem Act CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2AllergyProblemActCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Allergy Problem Act CD Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#getConsolAllergyObservation2s() <em>Get Consol Allergy Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyConcernAct2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyConcernAct2EffectiveTimeLow() {
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyConcernAct2EffectiveTimeHigh() {
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyConcernAct2AuthorParticipation() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2AuthorParticipationTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2AuthorParticipation(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActAllergyObservation2() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActAllergyObservation2TestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActAllergyObservation2",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActAllergyObservation2(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyConcernAct2IVLTSLow() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2IVLTSLowTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
				low.setValue(PRECISE_TO_DAY);
				target.getEffectiveTime().setLow(low);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2IVLTSLow(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyConcernAct2IVLTSHigh() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2IVLTSHighTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2IVLTSHigh(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyConcernAct2CDCodeAndCodeSystemValues() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2CDCodeAndCodeSystemValuesTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2CDCodeAndCodeSystemValues",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_CONCERN_ACT2_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyConcernAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD());
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyConcernAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID));
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyConcernAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("CONC", "2.16.840.1.113883.5.6"));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyConcernAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("48765-2", LOINC_ID));
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2CDCodeAndCodeSystemValues(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2CDCodeAndCodeSystemValuesTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyConcernAct2AllergyProblemActCDCode() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2AllergyProblemActCDCodeTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2AllergyProblemActCDCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_CONCERN_ACT2_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.getCode().setCode("mustExistOnly");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2AllergyProblemActCDCode(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2AllergyProblemActCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyConcernAct2AllergyProblemActCDCodeSystem() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2AllergyProblemActCDCodeSystemTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2AllergyProblemActCDCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_CONCERN_ACT2_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.getCode().setCodeSystem("mustExistOnly");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2AllergyProblemActCDCodeSystem(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2AllergyProblemActCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAllergyObservation2s() {

		AllergyConcernAct2 target = objectFactory.create();
		target.getConsolAllergyObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActTemplateId() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActTemplateIdTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActTemplateId(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCode() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCodeTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("CONC", "2.16.840.1.113883.5.6"));
			}

			@Override
			protected void setDependency(AllergyConcernAct2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergyProblemActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCode(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTime() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActEffectiveTimeTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActEffectiveTime(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyConcernAct2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<AllergyConcernAct2> {
		@Override
		public AllergyConcernAct2 create() {
			return ConsolFactory.eINSTANCE.createAllergyConcernAct2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends AllergyConcernAct2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AllergyConcernAct2Operations
