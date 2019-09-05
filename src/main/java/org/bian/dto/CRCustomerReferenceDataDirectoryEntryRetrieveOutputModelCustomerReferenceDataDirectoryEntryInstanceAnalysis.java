package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis
 */
public class CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis   {
  private String customerReferenceDataDirectoryEntryInstanceAnalysisData = null;

  private String customerReferenceDataDirectoryEntryInstanceAnalysisReportType = null;

  private Object customerReferenceDataDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerReferenceDataDirectoryEntryInstanceAnalysisData
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceAnalysisData() {
    return customerReferenceDataDirectoryEntryInstanceAnalysisData;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceAnalysisData(String customerReferenceDataDirectoryEntryInstanceAnalysisData) {
    this.customerReferenceDataDirectoryEntryInstanceAnalysisData = customerReferenceDataDirectoryEntryInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerReferenceDataDirectoryEntryInstanceAnalysisReport
  **/

  public Object getCustomerReferenceDataDirectoryEntryInstanceAnalysisReport() {
    return customerReferenceDataDirectoryEntryInstanceAnalysisReport;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceAnalysisReport(Object customerReferenceDataDirectoryEntryInstanceAnalysisReport) {
    this.customerReferenceDataDirectoryEntryInstanceAnalysisReport = customerReferenceDataDirectoryEntryInstanceAnalysisReport;
  }


}

