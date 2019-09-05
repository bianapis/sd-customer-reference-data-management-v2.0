package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankRelationsUpdateInputModelBankRelationsInstanceRecord;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBankRelationsUpdateInputModel
 */
public class BQBankRelationsUpdateInputModel   {
  private CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String bankRelationsInstanceReference = null;

  private BQBankRelationsUpdateInputModelBankRelationsInstanceRecord bankRelationsInstanceRecord = null;

  private Object bankRelationsUpdateActionTaskRecord = null;

  private String bankRelationsUpdateActionRequest = null;


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
   * Get bankRelationsInstanceRecord
   * @return bankRelationsInstanceRecord
  **/

  public BQBankRelationsUpdateInputModelBankRelationsInstanceRecord getBankRelationsInstanceRecord() {
    return bankRelationsInstanceRecord;
  }

  public void setBankRelationsInstanceRecord(BQBankRelationsUpdateInputModelBankRelationsInstanceRecord bankRelationsInstanceRecord) {
    this.bankRelationsInstanceRecord = bankRelationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return bankRelationsUpdateActionTaskRecord
  **/

  public Object getBankRelationsUpdateActionTaskRecord() {
    return bankRelationsUpdateActionTaskRecord;
  }

  public void setBankRelationsUpdateActionTaskRecord(Object bankRelationsUpdateActionTaskRecord) {
    this.bankRelationsUpdateActionTaskRecord = bankRelationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return bankRelationsUpdateActionRequest
  **/

  public String getBankRelationsUpdateActionRequest() {
    return bankRelationsUpdateActionRequest;
  }

  public void setBankRelationsUpdateActionRequest(String bankRelationsUpdateActionRequest) {
    this.bankRelationsUpdateActionRequest = bankRelationsUpdateActionRequest;
  }


}

