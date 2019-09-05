package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankRelationsRetrieveOutputModelBankRelationsInstanceAnalysis;
import org.bian.dto.BQBankRelationsRetrieveOutputModelBankRelationsInstanceRecord;
import org.bian.dto.BQBankRelationsRetrieveOutputModelBankRelationsInstanceReport;
import org.bian.dto.BQBankRelationsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBankRelationsRetrieveOutputModel
 */
public class BQBankRelationsRetrieveOutputModel   {
  private BQBankRelationsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private BQBankRelationsRetrieveOutputModelBankRelationsInstanceRecord bankRelationsInstanceRecord = null;

  private String bankRelationsRetrieveActionTaskReference = null;

  private Object bankRelationsRetrieveActionTaskRecord = null;

  private String bankRelationsRetrieveActionResponse = null;

  private BQBankRelationsRetrieveOutputModelBankRelationsInstanceReport bankRelationsInstanceReport = null;

  private BQBankRelationsRetrieveOutputModelBankRelationsInstanceAnalysis bankRelationsInstanceAnalysis = null;


  /**
   * Get customerReferenceDataDirectoryEntryInstanceRecord
   * @return customerReferenceDataDirectoryEntryInstanceRecord
  **/

  public BQBankRelationsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(BQBankRelationsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord) {
    this.customerReferenceDataDirectoryEntryInstanceRecord = customerReferenceDataDirectoryEntryInstanceRecord;
  }


  /**
   * Get bankRelationsInstanceRecord
   * @return bankRelationsInstanceRecord
  **/

  public BQBankRelationsRetrieveOutputModelBankRelationsInstanceRecord getBankRelationsInstanceRecord() {
    return bankRelationsInstanceRecord;
  }

  public void setBankRelationsInstanceRecord(BQBankRelationsRetrieveOutputModelBankRelationsInstanceRecord bankRelationsInstanceRecord) {
    this.bankRelationsInstanceRecord = bankRelationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Relations instance retrieve service call 
   * @return bankRelationsRetrieveActionTaskReference
  **/

  public String getBankRelationsRetrieveActionTaskReference() {
    return bankRelationsRetrieveActionTaskReference;
  }

  public void setBankRelationsRetrieveActionTaskReference(String bankRelationsRetrieveActionTaskReference) {
    this.bankRelationsRetrieveActionTaskReference = bankRelationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return bankRelationsRetrieveActionTaskRecord
  **/

  public Object getBankRelationsRetrieveActionTaskRecord() {
    return bankRelationsRetrieveActionTaskRecord;
  }

  public void setBankRelationsRetrieveActionTaskRecord(Object bankRelationsRetrieveActionTaskRecord) {
    this.bankRelationsRetrieveActionTaskRecord = bankRelationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return bankRelationsRetrieveActionResponse
  **/

  public String getBankRelationsRetrieveActionResponse() {
    return bankRelationsRetrieveActionResponse;
  }

  public void setBankRelationsRetrieveActionResponse(String bankRelationsRetrieveActionResponse) {
    this.bankRelationsRetrieveActionResponse = bankRelationsRetrieveActionResponse;
  }


  /**
   * Get bankRelationsInstanceReport
   * @return bankRelationsInstanceReport
  **/

  public BQBankRelationsRetrieveOutputModelBankRelationsInstanceReport getBankRelationsInstanceReport() {
    return bankRelationsInstanceReport;
  }

  public void setBankRelationsInstanceReport(BQBankRelationsRetrieveOutputModelBankRelationsInstanceReport bankRelationsInstanceReport) {
    this.bankRelationsInstanceReport = bankRelationsInstanceReport;
  }


  /**
   * Get bankRelationsInstanceAnalysis
   * @return bankRelationsInstanceAnalysis
  **/

  public BQBankRelationsRetrieveOutputModelBankRelationsInstanceAnalysis getBankRelationsInstanceAnalysis() {
    return bankRelationsInstanceAnalysis;
  }

  public void setBankRelationsInstanceAnalysis(BQBankRelationsRetrieveOutputModelBankRelationsInstanceAnalysis bankRelationsInstanceAnalysis) {
    this.bankRelationsInstanceAnalysis = bankRelationsInstanceAnalysis;
  }


}

