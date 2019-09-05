package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryRequestOutputModel
 */
public class CRCustomerReferenceDataDirectoryEntryRequestOutputModel   {
  private CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private String customerReferenceDataDirectoryEntryRequestActionTaskReference = null;

  private Object customerReferenceDataDirectoryEntryRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerReferenceDataDirectoryEntryInstanceRecord
   * @return customerReferenceDataDirectoryEntryInstanceRecord
  **/

  public CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord) {
    this.customerReferenceDataDirectoryEntryInstanceRecord = customerReferenceDataDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Reference Data Directory Entry instance request service call 
   * @return customerReferenceDataDirectoryEntryRequestActionTaskReference
  **/

  public String getCustomerReferenceDataDirectoryEntryRequestActionTaskReference() {
    return customerReferenceDataDirectoryEntryRequestActionTaskReference;
  }

  public void setCustomerReferenceDataDirectoryEntryRequestActionTaskReference(String customerReferenceDataDirectoryEntryRequestActionTaskReference) {
    this.customerReferenceDataDirectoryEntryRequestActionTaskReference = customerReferenceDataDirectoryEntryRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerReferenceDataDirectoryEntryRequestActionTaskRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryRequestActionTaskRecord() {
    return customerReferenceDataDirectoryEntryRequestActionTaskRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryRequestActionTaskRecord(Object customerReferenceDataDirectoryEntryRequestActionTaskRecord) {
    this.customerReferenceDataDirectoryEntryRequestActionTaskRecord = customerReferenceDataDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

