package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord
 */
public class CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord   {
  private String customerReferenceDataDirectoryEntryInstanceReportData = null;

  private String customerReferenceDataDirectoryEntryInstanceReportType = null;

  private Object customerReferenceDataDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerReferenceDataDirectoryEntryInstanceReportData
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceReportData() {
    return customerReferenceDataDirectoryEntryInstanceReportData;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReportData(String customerReferenceDataDirectoryEntryInstanceReportData) {
    this.customerReferenceDataDirectoryEntryInstanceReportData = customerReferenceDataDirectoryEntryInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerReferenceDataDirectoryEntryInstanceReport
  **/

  public Object getCustomerReferenceDataDirectoryEntryInstanceReport() {
    return customerReferenceDataDirectoryEntryInstanceReport;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReport(Object customerReferenceDataDirectoryEntryInstanceReport) {
    this.customerReferenceDataDirectoryEntryInstanceReport = customerReferenceDataDirectoryEntryInstanceReport;
  }


}

