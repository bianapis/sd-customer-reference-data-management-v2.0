package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankRelationsUpdateInputModelBankRelationsInstanceRecord;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBankRelationsUpdateOutputModel
 */
public class BQBankRelationsUpdateOutputModel   {
  private CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private BQBankRelationsUpdateInputModelBankRelationsInstanceRecord bankRelationsInstanceRecord = null;

  private String bankRelationsUpdateActionTaskReference = null;

  private Object bankRelationsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return bankRelationsUpdateActionTaskReference
  **/

  public String getBankRelationsUpdateActionTaskReference() {
    return bankRelationsUpdateActionTaskReference;
  }

  public void setBankRelationsUpdateActionTaskReference(String bankRelationsUpdateActionTaskReference) {
    this.bankRelationsUpdateActionTaskReference = bankRelationsUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

