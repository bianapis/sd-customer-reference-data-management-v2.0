package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryRetrieveOutputModel
 */
public class CRCustomerReferenceDataDirectoryEntryRetrieveOutputModel   {
  private CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private String customerReferenceDataDirectoryEntryRetrieveActionTaskReference = null;

  private Object customerReferenceDataDirectoryEntryRetrieveActionTaskRecord = null;

  private String customerReferenceDataDirectoryEntryRetrieveActionResponse = null;

  private CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord customerReferenceDataDirectoryEntryInstanceReportRecord = null;

  private CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis customerReferenceDataDirectoryEntryInstanceAnalysis = null;


  /**
   * Get customerReferenceDataDirectoryEntryInstanceRecord
   * @return customerReferenceDataDirectoryEntryInstanceRecord
  **/

  public CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord) {
    this.customerReferenceDataDirectoryEntryInstanceRecord = customerReferenceDataDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Reference Data Directory Entry instance retrieve service call 
   * @return customerReferenceDataDirectoryEntryRetrieveActionTaskReference
  **/

  public String getCustomerReferenceDataDirectoryEntryRetrieveActionTaskReference() {
    return customerReferenceDataDirectoryEntryRetrieveActionTaskReference;
  }

  public void setCustomerReferenceDataDirectoryEntryRetrieveActionTaskReference(String customerReferenceDataDirectoryEntryRetrieveActionTaskReference) {
    this.customerReferenceDataDirectoryEntryRetrieveActionTaskReference = customerReferenceDataDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerReferenceDataDirectoryEntryRetrieveActionResponse
  **/

  public String getCustomerReferenceDataDirectoryEntryRetrieveActionResponse() {
    return customerReferenceDataDirectoryEntryRetrieveActionResponse;
  }

  public void setCustomerReferenceDataDirectoryEntryRetrieveActionResponse(String customerReferenceDataDirectoryEntryRetrieveActionResponse) {
    this.customerReferenceDataDirectoryEntryRetrieveActionResponse = customerReferenceDataDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get customerReferenceDataDirectoryEntryInstanceReportRecord
   * @return customerReferenceDataDirectoryEntryInstanceReportRecord
  **/

  public CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord getCustomerReferenceDataDirectoryEntryInstanceReportRecord() {
    return customerReferenceDataDirectoryEntryInstanceReportRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReportRecord(CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceReportRecord customerReferenceDataDirectoryEntryInstanceReportRecord) {
    this.customerReferenceDataDirectoryEntryInstanceReportRecord = customerReferenceDataDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get customerReferenceDataDirectoryEntryInstanceAnalysis
   * @return customerReferenceDataDirectoryEntryInstanceAnalysis
  **/

  public CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis getCustomerReferenceDataDirectoryEntryInstanceAnalysis() {
    return customerReferenceDataDirectoryEntryInstanceAnalysis;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceAnalysis(CRCustomerReferenceDataDirectoryEntryRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceAnalysis customerReferenceDataDirectoryEntryInstanceAnalysis) {
    this.customerReferenceDataDirectoryEntryInstanceAnalysis = customerReferenceDataDirectoryEntryInstanceAnalysis;
  }


}

