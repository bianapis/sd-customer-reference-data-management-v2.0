package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQReferenceExchangeInputModel
 */
public class BQReferenceExchangeInputModel   {
  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String referenceInstanceReference = null;

  private Object referenceExchangeActionTaskRecord = null;

  private CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest referenceExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reference instance 
   * @return referenceInstanceReference
  **/

  public String getReferenceInstanceReference() {
    return referenceInstanceReference;
  }

  public void setReferenceInstanceReference(String referenceInstanceReference) {
    this.referenceInstanceReference = referenceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return referenceExchangeActionTaskRecord
  **/

  public Object getReferenceExchangeActionTaskRecord() {
    return referenceExchangeActionTaskRecord;
  }

  public void setReferenceExchangeActionTaskRecord(Object referenceExchangeActionTaskRecord) {
    this.referenceExchangeActionTaskRecord = referenceExchangeActionTaskRecord;
  }


  /**
   * Get referenceExchangeActionRequest
   * @return referenceExchangeActionRequest
  **/

  public CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest getReferenceExchangeActionRequest() {
    return referenceExchangeActionRequest;
  }

  public void setReferenceExchangeActionRequest(CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest referenceExchangeActionRequest) {
    this.referenceExchangeActionRequest = referenceExchangeActionRequest;
  }


}

