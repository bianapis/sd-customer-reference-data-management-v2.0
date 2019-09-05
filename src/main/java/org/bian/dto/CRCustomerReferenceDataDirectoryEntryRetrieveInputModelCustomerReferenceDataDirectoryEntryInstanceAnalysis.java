package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis
 */
public class CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis   {
  private String customerReferenceDataDirectoryEntryInstanceAnalysisReference = null;

  private String customerReferenceDataDirectoryEntryInstanceAnalysisReportType = null;

  private String customerReferenceDataDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerReferenceDataDirectoryEntryInstanceAnalysisReference
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceAnalysisReference() {
    return customerReferenceDataDirectoryEntryInstanceAnalysisReference;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceAnalysisReference(String customerReferenceDataDirectoryEntryInstanceAnalysisReference) {
    this.customerReferenceDataDirectoryEntryInstanceAnalysisReference = customerReferenceDataDirectoryEntryInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerReferenceDataDirectoryEntryInstanceAnalysisReportType
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceAnalysisReportType() {
    return customerReferenceDataDirectoryEntryInstanceAnalysisReportType;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceAnalysisReportType(String customerReferenceDataDirectoryEntryInstanceAnalysisReportType) {
    this.customerReferenceDataDirectoryEntryInstanceAnalysisReportType = customerReferenceDataDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerReferenceDataDirectoryEntryInstanceAnalysisParameters
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceAnalysisParameters() {
    return customerReferenceDataDirectoryEntryInstanceAnalysisParameters;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceAnalysisParameters(String customerReferenceDataDirectoryEntryInstanceAnalysisParameters) {
    this.customerReferenceDataDirectoryEntryInstanceAnalysisParameters = customerReferenceDataDirectoryEntryInstanceAnalysisParameters;
  }


}

