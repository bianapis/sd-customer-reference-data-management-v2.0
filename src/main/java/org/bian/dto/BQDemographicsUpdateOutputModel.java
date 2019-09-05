package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDemographicsUpdateInputModelDemographicsInstanceRecord;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDemographicsUpdateOutputModel
 */
public class BQDemographicsUpdateOutputModel   {
  private CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private BQDemographicsUpdateInputModelDemographicsInstanceRecord demographicsInstanceRecord = null;

  private String demographicsUpdateActionTaskReference = null;

  private Object demographicsUpdateActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return demographicsUpdateActionTaskReference
  **/

  public String getDemographicsUpdateActionTaskReference() {
    return demographicsUpdateActionTaskReference;
  }

  public void setDemographicsUpdateActionTaskReference(String demographicsUpdateActionTaskReference) {
    this.demographicsUpdateActionTaskReference = demographicsUpdateActionTaskReference;
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

