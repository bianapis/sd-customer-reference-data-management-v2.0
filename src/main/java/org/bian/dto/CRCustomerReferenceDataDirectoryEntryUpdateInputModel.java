package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryUpdateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryUpdateInputModel
 */
public class CRCustomerReferenceDataDirectoryEntryUpdateInputModel   {
  private String customerReferenceDataManagementServicingSessionReference = null;

  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private CRCustomerReferenceDataDirectoryEntryUpdateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private Object customerReferenceDataDirectoryEntryUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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

  public CRCustomerReferenceDataDirectoryEntryUpdateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(CRCustomerReferenceDataDirectoryEntryUpdateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord) {
    this.customerReferenceDataDirectoryEntryInstanceRecord = customerReferenceDataDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerReferenceDataDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryUpdateActionTaskRecord() {
    return customerReferenceDataDirectoryEntryUpdateActionTaskRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryUpdateActionTaskRecord(Object customerReferenceDataDirectoryEntryUpdateActionTaskRecord) {
    this.customerReferenceDataDirectoryEntryUpdateActionTaskRecord = customerReferenceDataDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

