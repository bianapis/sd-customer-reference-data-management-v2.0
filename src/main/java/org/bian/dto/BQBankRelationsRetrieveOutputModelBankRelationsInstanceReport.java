package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRelationsRetrieveOutputModelBankRelationsInstanceReport
 */
public class BQBankRelationsRetrieveOutputModelBankRelationsInstanceReport   {
  private Object bankRelationsInstanceReportRecord = null;

  private String bankRelationsInstanceReportType = null;

  private String bankRelationsInstanceReportParameters = null;

  private Object bankRelationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return bankRelationsInstanceReportRecord
  **/

  public Object getBankRelationsInstanceReportRecord() {
    return bankRelationsInstanceReportRecord;
  }

  public void setBankRelationsInstanceReportRecord(Object bankRelationsInstanceReportRecord) {
    this.bankRelationsInstanceReportRecord = bankRelationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return bankRelationsInstanceReportType
  **/

  public String getBankRelationsInstanceReportType() {
    return bankRelationsInstanceReportType;
  }

  public void setBankRelationsInstanceReportType(String bankRelationsInstanceReportType) {
    this.bankRelationsInstanceReportType = bankRelationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return bankRelationsInstanceReportParameters
  **/

  public String getBankRelationsInstanceReportParameters() {
    return bankRelationsInstanceReportParameters;
  }

  public void setBankRelationsInstanceReportParameters(String bankRelationsInstanceReportParameters) {
    this.bankRelationsInstanceReportParameters = bankRelationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return bankRelationsInstanceReport
  **/

  public Object getBankRelationsInstanceReport() {
    return bankRelationsInstanceReport;
  }

  public void setBankRelationsInstanceReport(Object bankRelationsInstanceReport) {
    this.bankRelationsInstanceReport = bankRelationsInstanceReport;
  }


}

