package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReferenceUpdateInputModelReferenceInstanceRecordCompanyOfficerReference
 */
public class BQReferenceUpdateInputModelReferenceInstanceRecordCompanyOfficerReference   {
  private String companyOfficerRole = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific role played by the identified officer/employee 
   * @return companyOfficerRole
  **/

  public String getCompanyOfficerRole() {
    return companyOfficerRole;
  }

  public void setCompanyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
  }


}

