package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDemographicsRetrieveOutputModelDemographicsInstanceAnalysis
 */
public class BQDemographicsRetrieveOutputModelDemographicsInstanceAnalysis   {
  private Object demographicsInstanceAnalysisRecord = null;

  private String demographicsInstanceAnalysisReportType = null;

  private String demographicsInstanceAnalysisParameters = null;

  private Object demographicsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return demographicsInstanceAnalysisRecord
  **/

  public Object getDemographicsInstanceAnalysisRecord() {
    return demographicsInstanceAnalysisRecord;
  }

  public void setDemographicsInstanceAnalysisRecord(Object demographicsInstanceAnalysisRecord) {
    this.demographicsInstanceAnalysisRecord = demographicsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return demographicsInstanceAnalysisReportType
  **/

  public String getDemographicsInstanceAnalysisReportType() {
    return demographicsInstanceAnalysisReportType;
  }

  public void setDemographicsInstanceAnalysisReportType(String demographicsInstanceAnalysisReportType) {
    this.demographicsInstanceAnalysisReportType = demographicsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return demographicsInstanceAnalysisParameters
  **/

  public String getDemographicsInstanceAnalysisParameters() {
    return demographicsInstanceAnalysisParameters;
  }

  public void setDemographicsInstanceAnalysisParameters(String demographicsInstanceAnalysisParameters) {
    this.demographicsInstanceAnalysisParameters = demographicsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return demographicsInstanceAnalysisReport
  **/

  public Object getDemographicsInstanceAnalysisReport() {
    return demographicsInstanceAnalysisReport;
  }

  public void setDemographicsInstanceAnalysisReport(Object demographicsInstanceAnalysisReport) {
    this.demographicsInstanceAnalysisReport = demographicsInstanceAnalysisReport;
  }


}

