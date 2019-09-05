package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssociationsRetrieveOutputModelAssociationsInstanceRecordAssociateReference;

import javax.validation.Valid;
  
/**
 * BQAssociationsRetrieveOutputModelAssociationsInstanceRecord
 */
public class BQAssociationsRetrieveOutputModelAssociationsInstanceRecord   {
  private String employeeReference = null;

  private BQAssociationsRetrieveOutputModelAssociationsInstanceRecordAssociateReference associateReference = null;

  private String preferredBeneficiary = null;

  private String proxyRepresentativePowerofAttorneyReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a contact at the customer's employer 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * Get associateReference
   * @return associateReference
  **/

  public BQAssociationsRetrieveOutputModelAssociationsInstanceRecordAssociateReference getAssociateReference() {
    return associateReference;
  }

  public void setAssociateReference(BQAssociationsRetrieveOutputModelAssociationsInstanceRecordAssociateReference associateReference) {
    this.associateReference = associateReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A potentially complex and structured list of identified beneficiaries with associated contact and payment details as needed 
   * @return preferredBeneficiary
  **/

  public String getPreferredBeneficiary() {
    return preferredBeneficiary;
  }

  public void setPreferredBeneficiary(String preferredBeneficiary) {
    this.preferredBeneficiary = preferredBeneficiary;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to individuals with specific representation rights (e.g. a lawyer with power of attorney) 
   * @return proxyRepresentativePowerofAttorneyReference
  **/

  public String getProxyRepresentativePowerofAttorneyReference() {
    return proxyRepresentativePowerofAttorneyReference;
  }

  public void setProxyRepresentativePowerofAttorneyReference(String proxyRepresentativePowerofAttorneyReference) {
    this.proxyRepresentativePowerofAttorneyReference = proxyRepresentativePowerofAttorneyReference;
  }


}

