package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryInitiateInputModel
 */
public class CRCustomerReferenceDataDirectoryEntryInitiateInputModel   {
  private String customerReferenceDataManagementServicingSessionReference = null;

  private Object customerReferenceDataDirectoryEntryInitiateActionRecord = null;

  private String customerReferenceDataDirectoryEntryInstanceStatus = null;

  private CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerReferenceDataDirectoryEntryInitiateActionRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryInitiateActionRecord() {
    return customerReferenceDataDirectoryEntryInitiateActionRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInitiateActionRecord(Object customerReferenceDataDirectoryEntryInitiateActionRecord) {
    this.customerReferenceDataDirectoryEntryInitiateActionRecord = customerReferenceDataDirectoryEntryInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Reference Data Directory Entry instance (e.g. initialised, pending, active) 
   * @return customerReferenceDataDirectoryEntryInstanceStatus
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceStatus() {
    return customerReferenceDataDirectoryEntryInstanceStatus;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceStatus(String customerReferenceDataDirectoryEntryInstanceStatus) {
    this.customerReferenceDataDirectoryEntryInstanceStatus = customerReferenceDataDirectoryEntryInstanceStatus;
  }


  /**
   * Get customerReferenceDataDirectoryEntryInstanceRecord
   * @return customerReferenceDataDirectoryEntryInstanceRecord
  **/

  public CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord) {
    this.customerReferenceDataDirectoryEntryInstanceRecord = customerReferenceDataDirectoryEntryInstanceRecord;
  }


}

