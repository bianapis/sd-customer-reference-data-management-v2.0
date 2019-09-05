package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryRetrieveInputModel
 */
public class CRCustomerReferenceDataDirectoryEntryRetrieveInputModel   {
  private Object customerReferenceDataDirectoryEntryRetrieveActionTaskRecord = null;

  private String customerReferenceDataDirectoryEntryRetrieveActionRequest = null;

  private CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord customerReferenceDataDirectoryEntryInstanceReportRecord = null;

  private CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis customerReferenceDataDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerReferenceDataDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryRetrieveActionTaskRecord() {
    return customerReferenceDataDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryRetrieveActionTaskRecord(Object customerReferenceDataDirectoryEntryRetrieveActionTaskRecord) {
    this.customerReferenceDataDirectoryEntryRetrieveActionTaskRecord = customerReferenceDataDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerReferenceDataDirectoryEntryRetrieveActionRequest
  **/

  public String getCustomerReferenceDataDirectoryEntryRetrieveActionRequest() {
    return customerReferenceDataDirectoryEntryRetrieveActionRequest;
  }

  public void setCustomerReferenceDataDirectoryEntryRetrieveActionRequest(String customerReferenceDataDirectoryEntryRetrieveActionRequest) {
    this.customerReferenceDataDirectoryEntryRetrieveActionRequest = customerReferenceDataDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get customerReferenceDataDirectoryEntryInstanceReportRecord
   * @return customerReferenceDataDirectoryEntryInstanceReportRecord
  **/

  public CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord getCustomerReferenceDataDirectoryEntryInstanceReportRecord() {
    return customerReferenceDataDirectoryEntryInstanceReportRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReportRecord(CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord customerReferenceDataDirectoryEntryInstanceReportRecord) {
    this.customerReferenceDataDirectoryEntryInstanceReportRecord = customerReferenceDataDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get customerReferenceDataDirectoryEntryInstanceAnalysis
   * @return customerReferenceDataDirectoryEntryInstanceAnalysis
  **/

  public CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis getCustomerReferenceDataDirectoryEntryInstanceAnalysis() {
    return customerReferenceDataDirectoryEntryInstanceAnalysis;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceAnalysis(CRCustomerReferenceDataDirectoryEntryRetrieveInputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis customerReferenceDataDirectoryEntryInstanceAnalysis) {
    this.customerReferenceDataDirectoryEntryInstanceAnalysis = customerReferenceDataDirectoryEntryInstanceAnalysis;
  }


}

