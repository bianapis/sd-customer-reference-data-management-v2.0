package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord
 */
public class CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord   {
  private String customerReferenceDataDirectoryEntryInstanceReportReference = null;

  private String customerReferenceDataDirectoryEntryInstanceReportType = null;

  private String customerReferenceDataDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerReferenceDataDirectoryEntryInstanceReportReference
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceReportReference() {
    return customerReferenceDataDirectoryEntryInstanceReportReference;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReportReference(String customerReferenceDataDirectoryEntryInstanceReportReference) {
    this.customerReferenceDataDirectoryEntryInstanceReportReference = customerReferenceDataDirectoryEntryInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerReferenceDataDirectoryEntryInstanceReportType
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceReportType() {
    return customerReferenceDataDirectoryEntryInstanceReportType;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReportType(String customerReferenceDataDirectoryEntryInstanceReportType) {
    this.customerReferenceDataDirectoryEntryInstanceReportType = customerReferenceDataDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerReferenceDataDirectoryEntryInstanceReportParameters
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceReportParameters() {
    return customerReferenceDataDirectoryEntryInstanceReportParameters;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReportParameters(String customerReferenceDataDirectoryEntryInstanceReportParameters) {
    this.customerReferenceDataDirectoryEntryInstanceReportParameters = customerReferenceDataDirectoryEntryInstanceReportParameters;
  }


}

