package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDemographicsUpdateInputModelDemographicsInstanceRecord;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDemographicsUpdateInputModel
 */
public class BQDemographicsUpdateInputModel   {
  private CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String demographicsInstanceReference = null;

  private BQDemographicsUpdateInputModelDemographicsInstanceRecord demographicsInstanceRecord = null;

  private Object demographicsUpdateActionTaskRecord = null;

  private String demographicsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return demographicsUpdateActionTaskRecord
  **/

  public Object getDemographicsUpdateActionTaskRecord() {
    return demographicsUpdateActionTaskRecord;
  }

  public void setDemographicsUpdateActionTaskRecord(Object demographicsUpdateActionTaskRecord) {
    this.demographicsUpdateActionTaskRecord = demographicsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return demographicsUpdateActionRequest
  **/

  public String getDemographicsUpdateActionRequest() {
    return demographicsUpdateActionRequest;
  }

  public void setDemographicsUpdateActionRequest(String demographicsUpdateActionRequest) {
    this.demographicsUpdateActionRequest = demographicsUpdateActionRequest;
  }


}

