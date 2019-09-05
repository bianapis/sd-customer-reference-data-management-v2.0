package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDemographicsRetrieveInputModelDemographicsInstanceAnalysis;
import org.bian.dto.BQDemographicsRetrieveInputModelDemographicsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDemographicsRetrieveInputModel
 */
public class BQDemographicsRetrieveInputModel   {
  private Object demographicsRetrieveActionTaskRecord = null;

  private String demographicsRetrieveActionRequest = null;

  private BQDemographicsRetrieveInputModelDemographicsInstanceReport demographicsInstanceReport = null;

  private BQDemographicsRetrieveInputModelDemographicsInstanceAnalysis demographicsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return demographicsRetrieveActionRequest
  **/

  public String getDemographicsRetrieveActionRequest() {
    return demographicsRetrieveActionRequest;
  }

  public void setDemographicsRetrieveActionRequest(String demographicsRetrieveActionRequest) {
    this.demographicsRetrieveActionRequest = demographicsRetrieveActionRequest;
  }


  /**
   * Get demographicsInstanceReport
   * @return demographicsInstanceReport
  **/

  public BQDemographicsRetrieveInputModelDemographicsInstanceReport getDemographicsInstanceReport() {
    return demographicsInstanceReport;
  }

  public void setDemographicsInstanceReport(BQDemographicsRetrieveInputModelDemographicsInstanceReport demographicsInstanceReport) {
    this.demographicsInstanceReport = demographicsInstanceReport;
  }


  /**
   * Get demographicsInstanceAnalysis
   * @return demographicsInstanceAnalysis
  **/

  public BQDemographicsRetrieveInputModelDemographicsInstanceAnalysis getDemographicsInstanceAnalysis() {
    return demographicsInstanceAnalysis;
  }

  public void setDemographicsInstanceAnalysis(BQDemographicsRetrieveInputModelDemographicsInstanceAnalysis demographicsInstanceAnalysis) {
    this.demographicsInstanceAnalysis = demographicsInstanceAnalysis;
  }


}

