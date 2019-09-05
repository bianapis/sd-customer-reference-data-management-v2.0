package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDemographicsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord;
import org.bian.dto.BQDemographicsRetrieveOutputModelDemographicsInstanceAnalysis;
import org.bian.dto.BQDemographicsRetrieveOutputModelDemographicsInstanceReport;
import org.bian.dto.BQDemographicsUpdateInputModelDemographicsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDemographicsRetrieveOutputModel
 */
public class BQDemographicsRetrieveOutputModel   {
  private BQDemographicsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord = null;

  private BQDemographicsUpdateInputModelDemographicsInstanceRecord demographicsInstanceRecord = null;

  private String demographicsRetrieveActionTaskReference = null;

  private Object demographicsRetrieveActionTaskRecord = null;

  private String demographicsRetrieveActionResponse = null;

  private BQDemographicsRetrieveOutputModelDemographicsInstanceReport demographicsInstanceReport = null;

  private BQDemographicsRetrieveOutputModelDemographicsInstanceAnalysis demographicsInstanceAnalysis = null;


  /**
   * Get customerReferenceDataDirectoryEntryInstanceRecord
   * @return customerReferenceDataDirectoryEntryInstanceRecord
  **/

  public BQDemographicsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord getCustomerReferenceDataDirectoryEntryInstanceRecord() {
    return customerReferenceDataDirectoryEntryInstanceRecord;
  }

  public void setCustomerReferenceDataDirectoryEntryInstanceRecord(BQDemographicsRetrieveOutputModelCustomerReferenceDataDirectoryEntryInstanceRecord customerReferenceDataDirectoryEntryInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Demographics instance retrieve service call 
   * @return demographicsRetrieveActionTaskReference
  **/

  public String getDemographicsRetrieveActionTaskReference() {
    return demographicsRetrieveActionTaskReference;
  }

  public void setDemographicsRetrieveActionTaskReference(String demographicsRetrieveActionTaskReference) {
    this.demographicsRetrieveActionTaskReference = demographicsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return demographicsRetrieveActionTaskRecord
  **/

  public Object getDemographicsRetrieveActionTaskRecord() {
    return demographicsRetrieveActionTaskRecord;
  }

  public void setDemographicsRetrieveActionTaskRecord(Object demographicsRetrieveActionTaskRecord) {
    this.demographicsRetrieveActionTaskRecord = demographicsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return demographicsRetrieveActionResponse
  **/

  public String getDemographicsRetrieveActionResponse() {
    return demographicsRetrieveActionResponse;
  }

  public void setDemographicsRetrieveActionResponse(String demographicsRetrieveActionResponse) {
    this.demographicsRetrieveActionResponse = demographicsRetrieveActionResponse;
  }


  /**
   * Get demographicsInstanceReport
   * @return demographicsInstanceReport
  **/

  public BQDemographicsRetrieveOutputModelDemographicsInstanceReport getDemographicsInstanceReport() {
    return demographicsInstanceReport;
  }

  public void setDemographicsInstanceReport(BQDemographicsRetrieveOutputModelDemographicsInstanceReport demographicsInstanceReport) {
    this.demographicsInstanceReport = demographicsInstanceReport;
  }


  /**
   * Get demographicsInstanceAnalysis
   * @return demographicsInstanceAnalysis
  **/

  public BQDemographicsRetrieveOutputModelDemographicsInstanceAnalysis getDemographicsInstanceAnalysis() {
    return demographicsInstanceAnalysis;
  }

  public void setDemographicsInstanceAnalysis(BQDemographicsRetrieveOutputModelDemographicsInstanceAnalysis demographicsInstanceAnalysis) {
    this.demographicsInstanceAnalysis = demographicsInstanceAnalysis;
  }


}

