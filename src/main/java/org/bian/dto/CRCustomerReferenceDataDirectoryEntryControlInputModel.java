package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryControlInputModelCustomerReferenceDataDirectoryEntryControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryControlInputModel
 */
public class CRCustomerReferenceDataDirectoryEntryControlInputModel   {
  private String customerReferenceDataManagementServicingSessionReference = null;

  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private Object customerReferenceDataDirectoryEntryControlActionTaskRecord = null;

  private CRCustomerReferenceDataDirectoryEntryControlInputModelCustomerReferenceDataDirectoryEntryControlActionRequest customerReferenceDataDirectoryEntryControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerReferenceDataDirectoryEntryControlActionTaskRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryControlActionTaskRecord() {
    return customerReferenceDataDirectoryEntryControlActionTaskRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryControlActionTaskRecord(Object customerReferenceDataDirectoryEntryControlActionTaskRecord) {
    this.customerReferenceDataDirectoryEntryControlActionTaskRecord = customerReferenceDataDirectoryEntryControlActionTaskRecord;
  }


  /**
   * Get customerReferenceDataDirectoryEntryControlActionRequest
   * @return customerReferenceDataDirectoryEntryControlActionRequest
  **/

  public CRCustomerReferenceDataDirectoryEntryControlInputModelCustomerReferenceDataDirectoryEntryControlActionRequest getCustomerReferenceDataDirectoryEntryControlActionRequest() {
    return customerReferenceDataDirectoryEntryControlActionRequest;
  }

  public void setCustomerReferenceDataDirectoryEntryControlActionRequest(CRCustomerReferenceDataDirectoryEntryControlInputModelCustomerReferenceDataDirectoryEntryControlActionRequest customerReferenceDataDirectoryEntryControlActionRequest) {
    this.customerReferenceDataDirectoryEntryControlActionRequest = customerReferenceDataDirectoryEntryControlActionRequest;
  }


}

