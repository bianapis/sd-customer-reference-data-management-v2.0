package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQAssociationsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord
 */
public class BQAssociationsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord   {
  private String customerReference = null;

  private CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

