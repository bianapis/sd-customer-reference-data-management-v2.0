package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssociationsUpdateInputModelAssociationsInstanceRecord;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssociationsUpdateInputModel
 */
public class BQAssociationsUpdateInputModel   {
  private CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String associationsInstanceReference = null;

  private BQAssociationsUpdateInputModelAssociationsInstanceRecord associationsInstanceRecord = null;

  private Object associationsUpdateActionTaskRecord = null;

  private String associationsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Associations instance 
   * @return associationsInstanceReference
  **/

  public String getAssociationsInstanceReference() {
    return associationsInstanceReference;
  }

  public void setAssociationsInstanceReference(String associationsInstanceReference) {
    this.associationsInstanceReference = associationsInstanceReference;
  }


  /**
   * Get associationsInstanceRecord
   * @return associationsInstanceRecord
  **/

  public BQAssociationsUpdateInputModelAssociationsInstanceRecord getAssociationsInstanceRecord() {
    return associationsInstanceRecord;
  }

  public void setAssociationsInstanceRecord(BQAssociationsUpdateInputModelAssociationsInstanceRecord associationsInstanceRecord) {
    this.associationsInstanceRecord = associationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return associationsUpdateActionTaskRecord
  **/

  public Object getAssociationsUpdateActionTaskRecord() {
    return associationsUpdateActionTaskRecord;
  }

  public void setAssociationsUpdateActionTaskRecord(Object associationsUpdateActionTaskRecord) {
    this.associationsUpdateActionTaskRecord = associationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return associationsUpdateActionRequest
  **/

  public String getAssociationsUpdateActionRequest() {
    return associationsUpdateActionRequest;
  }

  public void setAssociationsUpdateActionRequest(String associationsUpdateActionRequest) {
    this.associationsUpdateActionRequest = associationsUpdateActionRequest;
  }


}

