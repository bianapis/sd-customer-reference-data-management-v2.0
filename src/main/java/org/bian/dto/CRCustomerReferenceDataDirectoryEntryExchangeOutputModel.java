package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryExchangeOutputModel
 */
public class CRCustomerReferenceDataDirectoryEntryExchangeOutputModel   {
  private String customerReferenceDataDirectoryEntryExchangeActionTaskReference = null;

  private Object customerReferenceDataDirectoryEntryExchangeActionTaskRecord = null;

  private String customerReferenceDataDirectoryEntryExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Reference Data Directory Entry instance exchange service call 
   * @return customerReferenceDataDirectoryEntryExchangeActionTaskReference
  **/

  public String getCustomerReferenceDataDirectoryEntryExchangeActionTaskReference() {
    return customerReferenceDataDirectoryEntryExchangeActionTaskReference;
  }

  public void setCustomerReferenceDataDirectoryEntryExchangeActionTaskReference(String customerReferenceDataDirectoryEntryExchangeActionTaskReference) {
    this.customerReferenceDataDirectoryEntryExchangeActionTaskReference = customerReferenceDataDirectoryEntryExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerReferenceDataDirectoryEntryExchangeActionResponse
  **/

  public String getCustomerReferenceDataDirectoryEntryExchangeActionResponse() {
    return customerReferenceDataDirectoryEntryExchangeActionResponse;
  }

  public void setCustomerReferenceDataDirectoryEntryExchangeActionResponse(String customerReferenceDataDirectoryEntryExchangeActionResponse) {
    this.customerReferenceDataDirectoryEntryExchangeActionResponse = customerReferenceDataDirectoryEntryExchangeActionResponse;
  }


}

