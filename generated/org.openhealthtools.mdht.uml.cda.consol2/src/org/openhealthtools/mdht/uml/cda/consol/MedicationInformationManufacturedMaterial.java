/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Material;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Information Manufactured Material</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationInformationManufacturedMaterial()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.warning='MedicationInformationManufacturedMaterialCodeOriginalText MedicationInformationManufacturedMaterialReference' constraints.validation.info='MedicationInformationManufacturedMaterialCodeTranslation' code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.error='MedicationInformationManufacturedMaterialCode'"
 * @generated
 */
public interface MedicationInformationManufacturedMaterial extends Material {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* not self.code.oclIsUndefined() implies self.code.originalText->size() = 1
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() implies self.code.originalText->size() = 1'"
	* @generated
	*/
	boolean validateMedicationInformationManufacturedMaterialCodeOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.code.originalText->size() = 1 implies not self.code.originalText.reference.value.oclIsUndefined()
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code.originalText->size() = 1 implies not self.code.originalText.reference.value.oclIsUndefined()'"
	* @generated
	*/
	boolean validateMedicationInformationManufacturedMaterialReference(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.code->size() = 1 implies self.code.translation->size() > 0
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->size() = 1 implies self.code.translation->size() > 0'"
	* @generated
	*/
	boolean validateMedicationInformationManufacturedMaterialCodeTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.88' and not value.code.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.88\' and not value.code.oclIsUndefined())'"
	* @generated
	*/
	boolean validateMedicationInformationManufacturedMaterialCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationInformationManufacturedMaterial init();
} // MedicationInformationManufacturedMaterial
