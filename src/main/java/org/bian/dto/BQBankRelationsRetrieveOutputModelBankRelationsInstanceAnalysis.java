package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRelationsRetrieveOutputModelBankRelationsInstanceAnalysis
 */
public class BQBankRelationsRetrieveOutputModelBankRelationsInstanceAnalysis   {
  private Object bankRelationsInstanceAnalysisRecord = null;

  private String bankRelationsInstanceAnalysisReportType = null;

  private String bankRelationsInstanceAnalysisParameters = null;

  private Object bankRelationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return bankRelationsInstanceAnalysisRecord
  **/

  public Object getBankRelationsInstanceAnalysisRecord() {
    return bankRelationsInstanceAnalysisRecord;
  }

  public void setBankRelationsInstanceAnalysisRecord(Object bankRelationsInstanceAnalysisRecord) {
    this.bankRelationsInstanceAnalysisRecord = bankRelationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return bankRelationsInstanceAnalysisReportType
  **/

  public String getBankRelationsInstanceAnalysisReportType() {
    return bankRelationsInstanceAnalysisReportType;
  }

  public void setBankRelationsInstanceAnalysisReportType(String bankRelationsInstanceAnalysisReportType) {
    this.bankRelationsInstanceAnalysisReportType = bankRelationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return bankRelationsInstanceAnalysisParameters
  **/

  public String getBankRelationsInstanceAnalysisParameters() {
    return bankRelationsInstanceAnalysisParameters;
  }

  public void setBankRelationsInstanceAnalysisParameters(String bankRelationsInstanceAnalysisParameters) {
    this.bankRelationsInstanceAnalysisParameters = bankRelationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return bankRelationsInstanceAnalysisReport
  **/

  public Object getBankRelationsInstanceAnalysisReport() {
    return bankRelationsInstanceAnalysisReport;
  }

  public void setBankRelationsInstanceAnalysisReport(Object bankRelationsInstanceAnalysisReport) {
    this.bankRelationsInstanceAnalysisReport = bankRelationsInstanceAnalysisReport;
  }


}

