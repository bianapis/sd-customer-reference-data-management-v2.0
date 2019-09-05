package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryExchangeInputModel
 */
public class CRCustomerReferenceDataDirectoryEntryExchangeInputModel   {
  private String customerReferenceDataManagementServicingSessionReference = null;

  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private Object customerReferenceDataDirectoryEntryExchangeActionTaskRecord = null;

  private CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest customerReferenceDataDirectoryEntryExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerReferenceDataDirectoryEntryExchangeActionTaskRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryExchangeActionTaskRecord() {
    return customerReferenceDataDirectoryEntryExchangeActionTaskRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryExchangeActionTaskRecord(Object customerReferenceDataDirectoryEntryExchangeActionTaskRecord) {
    this.customerReferenceDataDirectoryEntryExchangeActionTaskRecord = customerReferenceDataDirectoryEntryExchangeActionTaskRecord;
  }


  /**
   * Get customerReferenceDataDirectoryEntryExchangeActionRequest
   * @return customerReferenceDataDirectoryEntryExchangeActionRequest
  **/

  public CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest getCustomerReferenceDataDirectoryEntryExchangeActionRequest() {
    return customerReferenceDataDirectoryEntryExchangeActionRequest;
  }

  public void setCustomerReferenceDataDirectoryEntryExchangeActionRequest(CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest customerReferenceDataDirectoryEntryExchangeActionRequest) {
    this.customerReferenceDataDirectoryEntryExchangeActionRequest = customerReferenceDataDirectoryEntryExchangeActionRequest;
  }


}

