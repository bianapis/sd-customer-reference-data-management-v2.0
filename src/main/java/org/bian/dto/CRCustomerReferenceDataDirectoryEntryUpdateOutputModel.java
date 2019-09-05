package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryUpdateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryUpdateOutputModel
 */
public class CRCustomerReferenceDataDirectoryEntryUpdateOutputModel   {
  private CRCustomerReferenceDataDirectoryEntryUpdateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private String customerReferenceDataDirectoryEntryUpdateActionTaskReference = null;

  private Object customerReferenceDataDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerReferenceDataDirectoryEntryInstanceRecord
   * @return customerReferenceDataDirectoryEntryInstanceRecord
  **/

  public CRCustomerReferenceDataDirectoryEntryUpdateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(CRCustomerReferenceDataDirectoryEntryUpdateInputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord) {
    this.customerReferenceDataDirectoryEntryInstanceRecord = customerReferenceDataDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerReferenceDataDirectoryEntryUpdateActionTaskReference
  **/

  public String getCustomerReferenceDataDirectoryEntryUpdateActionTaskReference() {
    return customerReferenceDataDirectoryEntryUpdateActionTaskReference;
  }

  public void setCustomerReferenceDataDirectoryEntryUpdateActionTaskReference(String customerReferenceDataDirectoryEntryUpdateActionTaskReference) {
    this.customerReferenceDataDirectoryEntryUpdateActionTaskReference = customerReferenceDataDirectoryEntryUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerReferenceDataDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getCustomerReferenceDataDirectoryEntryUpdateActionTaskRecord() {
    return customerReferenceDataDirectoryEntryUpdateActionTaskRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryUpdateActionTaskRecord(Object customerReferenceDataDirectoryEntryUpdateActionTaskRecord) {
    this.customerReferenceDataDirectoryEntryUpdateActionTaskRecord = customerReferenceDataDirectoryEntryUpdateActionTaskRecord;
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

