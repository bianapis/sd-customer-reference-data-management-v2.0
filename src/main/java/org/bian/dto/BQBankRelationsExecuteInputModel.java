package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankRelationsExecuteInputModelBankRelationsInstanceRecord;
import org.bian.dto.BQReferenceExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQBankRelationsExecuteInputModel
 */
public class BQBankRelationsExecuteInputModel   {
  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String bankRelationsInstanceReference = null;

  private BQBankRelationsExecuteInputModelBankRelationsInstanceRecord bankRelationsInstanceRecord = null;

  private Object bankRelationsExecuteActionTaskRecord = null;

  private BQReferenceExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQBankRelationsExecuteInputModelBankRelationsInstanceRecord getBankRelationsInstanceRecord() {
    return bankRelationsInstanceRecord;
  }

  public void setBankRelationsInstanceRecord(BQBankRelationsExecuteInputModelBankRelationsInstanceRecord bankRelationsInstanceRecord) {
    this.bankRelationsInstanceRecord = bankRelationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return bankRelationsExecuteActionTaskRecord
  **/

  public Object getBankRelationsExecuteActionTaskRecord() {
    return bankRelationsExecuteActionTaskRecord;
  }

  public void setBankRelationsExecuteActionTaskRecord(Object bankRelationsExecuteActionTaskRecord) {
    this.bankRelationsExecuteActionTaskRecord = bankRelationsExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQReferenceExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQReferenceExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

