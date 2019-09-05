package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRelationsRetrieveOutputModelBankRelationsInstanceRecord
 */
public class BQBankRelationsRetrieveOutputModelBankRelationsInstanceRecord   {
  private String bankRelationType = null;

  private String businessUnitEmployeeReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of relationship (e.g. relationship manager) 
   * @return bankRelationType
  **/

  public String getBankRelationType() {
    return bankRelationType;
  }

  public void setBankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated employee or unit 
   * @return businessUnitEmployeeReference
  **/

  public String getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
  }


}

