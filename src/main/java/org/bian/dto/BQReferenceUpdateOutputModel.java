package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReferenceUpdateInputModelReferenceInstanceRecord;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQReferenceUpdateOutputModel
 */
public class BQReferenceUpdateOutputModel   {
  private CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType customerReferenceDataDirectoryEntryInstanceRecord = null;

  private BQReferenceUpdateInputModelReferenceInstanceRecord referenceInstanceRecord = null;

  private String referenceUpdateActionTaskReference = null;

  private Object referenceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerReferenceDataDirectoryEntryInstanceRecord
   * @return customerReferenceDataDirectoryEntryInstanceRecord
  **/

  public CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType customerReferenceDataDirectoryEntryInstanceRecord) {
    this.customerReferenceDataDirectoryEntryInstanceRecord = customerReferenceDataDirectoryEntryInstanceRecord;
  }


  /**
   * Get referenceInstanceRecord
   * @return referenceInstanceRecord
  **/

  public BQReferenceUpdateInputModelReferenceInstanceRecord getReferenceInstanceRecord() {
    return referenceInstanceRecord;
  }

  public void setReferenceInstanceRecord(BQReferenceUpdateInputModelReferenceInstanceRecord referenceInstanceRecord) {
    this.referenceInstanceRecord = referenceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return referenceUpdateActionTaskReference
  **/

  public String getReferenceUpdateActionTaskReference() {
    return referenceUpdateActionTaskReference;
  }

  public void setReferenceUpdateActionTaskReference(String referenceUpdateActionTaskReference) {
    this.referenceUpdateActionTaskReference = referenceUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return referenceUpdateActionTaskRecord
  **/

  public Object getReferenceUpdateActionTaskRecord() {
    return referenceUpdateActionTaskRecord;
  }

  public void setReferenceUpdateActionTaskRecord(Object referenceUpdateActionTaskRecord) {
    this.referenceUpdateActionTaskRecord = referenceUpdateActionTaskRecord;
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

