package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQDemographicsExchangeInputModel
 */
public class BQDemographicsExchangeInputModel   {
  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String demographicsInstanceReference = null;

  private Object demographicsExchangeActionTaskRecord = null;

  private CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest demographicsExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Reference Data Directory Entry instance 
   * @return customerReferenceDataDirectoryEntryInstanceReference
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceReference() {
    return customerReferenceDataDirectoryEntryInstanceReference;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReference(String customerReferenceDataDirectoryEntryInstanceReference) {
    this.customerReferenceDataDirectoryEntryInstanceReference = customerReferenceDataDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Demographics instance 
   * @return demographicsInstanceReference
  **/

  public String getDemographicsInstanceReference() {
    return demographicsInstanceReference;
  }

  public void setDemographicsInstanceReference(String demographicsInstanceReference) {
    this.demographicsInstanceReference = demographicsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return demographicsExchangeActionTaskRecord
  **/

  public Object getDemographicsExchangeActionTaskRecord() {
    return demographicsExchangeActionTaskRecord;
  }

  public void setDemographicsExchangeActionTaskRecord(Object demographicsExchangeActionTaskRecord) {
    this.demographicsExchangeActionTaskRecord = demographicsExchangeActionTaskRecord;
  }


  /**
   * Get demographicsExchangeActionRequest
   * @return demographicsExchangeActionRequest
  **/

  public CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest getDemographicsExchangeActionRequest() {
    return demographicsExchangeActionRequest;
  }

  public void setDemographicsExchangeActionRequest(CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest demographicsExchangeActionRequest) {
    this.demographicsExchangeActionRequest = demographicsExchangeActionRequest;
  }


}

