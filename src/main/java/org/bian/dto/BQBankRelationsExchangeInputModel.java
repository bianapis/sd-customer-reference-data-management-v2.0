package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQBankRelationsExchangeInputModel
 */
public class BQBankRelationsExchangeInputModel   {
  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String bankRelationsInstanceReference = null;

  private Object bankRelationsExchangeActionTaskRecord = null;

  private CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest bankRelationsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Bank Relations instance 
   * @return bankRelationsInstanceReference
  **/

  public String getBankRelationsInstanceReference() {
    return bankRelationsInstanceReference;
  }

  public void setBankRelationsInstanceReference(String bankRelationsInstanceReference) {
    this.bankRelationsInstanceReference = bankRelationsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return bankRelationsExchangeActionTaskRecord
  **/

  public Object getBankRelationsExchangeActionTaskRecord() {
    return bankRelationsExchangeActionTaskRecord;
  }

  public void setBankRelationsExchangeActionTaskRecord(Object bankRelationsExchangeActionTaskRecord) {
    this.bankRelationsExchangeActionTaskRecord = bankRelationsExchangeActionTaskRecord;
  }


  /**
   * Get bankRelationsExchangeActionRequest
   * @return bankRelationsExchangeActionRequest
  **/

  public CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest getBankRelationsExchangeActionRequest() {
    return bankRelationsExchangeActionRequest;
  }

  public void setBankRelationsExchangeActionRequest(CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest bankRelationsExchangeActionRequest) {
    this.bankRelationsExchangeActionRequest = bankRelationsExchangeActionRequest;
  }


}

