package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryRequestInputModel
 */
public class CRCustomerReferenceDataDirectoryEntryRequestInputModel   {
  private String customerReferenceDataManagementServicingSessionReference = null;

  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private Object customerReferenceDataDirectoryEntryRequestActionTaskRecord = null;

  private CRCustomerReferenceDataDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerReferenceDataManagementServicingSessionReference
  **/

  public String getCustomerReferenceDataManagementServicingSessionReference() {
    return customerReferenceDataManagementServicingSessionReference;
  }

  public void setCustomerReferenceDataManagementServicingSessionReference(String customerReferenceDataManagementServicingSessionReference) {
    this.customerReferenceDataManagementServicingSessionReference = customerReferenceDataManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Reference Data Directory Entry instance 
   * @return customerReferenceDataDirectoryEntryInstanceReference
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceReference() {
    return customerReferenceDataDirectoryEntryInstanceReference;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReference(String customerReferenceDataDirectoryEntryInstanceReference) {
    this.customerReferenceDataDirectoryEntryInstanceReference = customerReferenceDataDirectoryEntryInstanceReference;
  }


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerReferenceDataDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerReferenceDataDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

