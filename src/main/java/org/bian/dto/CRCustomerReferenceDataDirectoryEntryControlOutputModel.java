package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryControlOutputModel
 */
public class CRCustomerReferenceDataDirectoryEntryControlOutputModel   {
  private String customerReferenceDataDirectoryEntryControlActionTaskReference = null;

  private Object customerReferenceDataDirectoryEntryControlActionTaskRecord = null;

  private String customerReferenceDataDirectoryEntryControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Reference Data Directory Entry instance control processing service call 
   * @return customerReferenceDataDirectoryEntryControlActionTaskReference
  **/

  public String getCustomerReferenceDataDirectoryEntryControlActionTaskReference() {
    return customerReferenceDataDirectoryEntryControlActionTaskReference;
  }

  public void setCustomerReferenceDataDirectoryEntryControlActionTaskReference(String customerReferenceDataDirectoryEntryControlActionTaskReference) {
    this.customerReferenceDataDirectoryEntryControlActionTaskReference = customerReferenceDataDirectoryEntryControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerReferenceDataDirectoryEntryControlActionResponse
  **/

  public String getCustomerReferenceDataDirectoryEntryControlActionResponse() {
    return customerReferenceDataDirectoryEntryControlActionResponse;
  }

  public void setCustomerReferenceDataDirectoryEntryControlActionResponse(String customerReferenceDataDirectoryEntryControlActionResponse) {
    this.customerReferenceDataDirectoryEntryControlActionResponse = customerReferenceDataDirectoryEntryControlActionResponse;
  }


}

