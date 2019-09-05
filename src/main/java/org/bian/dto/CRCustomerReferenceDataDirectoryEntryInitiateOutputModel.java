package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryInitiateOutputModel
 */
public class CRCustomerReferenceDataDirectoryEntryInitiateOutputModel   {
  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String customerReferenceDataDirectoryEntryInitiateActionReference = null;

  private Object customerReferenceDataDirectoryEntryInitiateActionRecord = null;

  private String customerReferenceDataDirectoryEntryInstanceStatus = null;

  private CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Reference Data Directory Entry instance 
   * @return customerReferenceDataDirectoryEntryInstanceReference
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceReference() {
    return customerReferenceDataDirectoryEntryInstanceReference;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceReference(String customerReferenceDataDirectoryEntryInstanceReference) {
    this.customerReferenceDataDirectoryEntryInstanceReference = customerReferenceDataDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerReferenceDataDirectoryEntryInitiateActionReference
  **/

  public String getCustomerReferenceDataDirectoryEntryInitiateActionReference() {
    return customerReferenceDataDirectoryEntryInitiateActionReference;
  }

  public void setCustomerReferenceDataDirectoryEntryInitiateActionReference(String customerReferenceDataDirectoryEntryInitiateActionReference) {
    this.customerReferenceDataDirectoryEntryInitiateActionReference = customerReferenceDataDirectoryEntryInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerReferenceDataDirectoryEntryInitiateActionRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryInitiateActionRecord() {
    return customerReferenceDataDirectoryEntryInitiateActionRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInitiateActionRecord(Object customerReferenceDataDirectoryEntryInitiateActionRecord) {
    this.customerReferenceDataDirectoryEntryInitiateActionRecord = customerReferenceDataDirectoryEntryInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Reference Data Directory Entry instance (e.g. initialised, pending, active) 
   * @return customerReferenceDataDirectoryEntryInstanceStatus
  **/

  public String getCustomerReferenceDataDirectoryEntryInstanceStatus() {
    return customerReferenceDataDirectoryEntryInstanceStatus;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceStatus(String customerReferenceDataDirectoryEntryInstanceStatus) {
    this.customerReferenceDataDirectoryEntryInstanceStatus = customerReferenceDataDirectoryEntryInstanceStatus;
  }


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


}

