package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord
 */
public class CRCustomerReferenceDataDirectoryEntryInitiateOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord   {
  private CRCustomerReferenceDataDirectoryEntryInitiateInputModelCustomerReferenceDataDirectoryEntryInstanceRecordDateType dateType = null;


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

