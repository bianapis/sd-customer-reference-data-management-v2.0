package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDemographicsUpdateInputModelDemographicsInstanceRecord;
import org.bian.dto.BQReferenceExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDemographicsExecuteInputModel
 */
public class BQDemographicsExecuteInputModel   {
  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String demographicsInstanceReference = null;

  private BQDemographicsUpdateInputModelDemographicsInstanceRecord demographicsInstanceRecord = null;

  private Object demographicsExecuteActionTaskRecord = null;

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
   * Get demographicsInstanceRecord
   * @return demographicsInstanceRecord
  **/

  public BQDemographicsUpdateInputModelDemographicsInstanceRecord getDemographicsInstanceRecord() {
    return demographicsInstanceRecord;
  }

  public void setDemographicsInstanceRecord(BQDemographicsUpdateInputModelDemographicsInstanceRecord demographicsInstanceRecord) {
    this.demographicsInstanceRecord = demographicsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return demographicsExecuteActionTaskRecord
  **/

  public Object getDemographicsExecuteActionTaskRecord() {
    return demographicsExecuteActionTaskRecord;
  }

  public void setDemographicsExecuteActionTaskRecord(Object demographicsExecuteActionTaskRecord) {
    this.demographicsExecuteActionTaskRecord = demographicsExecuteActionTaskRecord;
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

