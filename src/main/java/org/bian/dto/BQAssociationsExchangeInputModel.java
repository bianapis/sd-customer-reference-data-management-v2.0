package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAssociationsExchangeInputModel
 */
public class BQAssociationsExchangeInputModel   {
  private String customerReferenceDataDirectoryEntryInstanceReference = null;

  private String associationsInstanceReference = null;

  private Object associationsExchangeActionTaskRecord = null;

  private CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest associationsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return associationsExchangeActionTaskRecord
  **/

  public Object getAssociationsExchangeActionTaskRecord() {
    return associationsExchangeActionTaskRecord;
  }

  public void setAssociationsExchangeActionTaskRecord(Object associationsExchangeActionTaskRecord) {
    this.associationsExchangeActionTaskRecord = associationsExchangeActionTaskRecord;
  }


  /**
   * Get associationsExchangeActionRequest
   * @return associationsExchangeActionRequest
  **/

  public CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest getAssociationsExchangeActionRequest() {
    return associationsExchangeActionRequest;
  }

  public void setAssociationsExchangeActionRequest(CRCustomerReferenceDataDirectoryEntryExchangeInputModelCustomerReferenceDataDirectoryEntryExchangeActionRequest associationsExchangeActionRequest) {
    this.associationsExchangeActionRequest = associationsExchangeActionRequest;
  }


}

