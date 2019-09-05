package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDemographicsRetrieveOutputModelDemographicsInstanceReport
 */
public class BQDemographicsRetrieveOutputModelDemographicsInstanceReport   {
  private Object demographicsInstanceReportRecord = null;

  private String demographicsInstanceReportType = null;

  private String demographicsInstanceReportParameters = null;

  private Object demographicsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return demographicsInstanceReportRecord
  **/

  public Object getDemographicsInstanceReportRecord() {
    return demographicsInstanceReportRecord;
  }

  public void setDemographicsInstanceReportRecord(Object demographicsInstanceReportRecord) {
    this.demographicsInstanceReportRecord = demographicsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return demographicsInstanceReportType
  **/

  public String getDemographicsInstanceReportType() {
    return demographicsInstanceReportType;
  }

  public void setDemographicsInstanceReportType(String demographicsInstanceReportType) {
    this.demographicsInstanceReportType = demographicsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return demographicsInstanceReportParameters
  **/

  public String getDemographicsInstanceReportParameters() {
    return demographicsInstanceReportParameters;
  }

  public void setDemographicsInstanceReportParameters(String demographicsInstanceReportParameters) {
    this.demographicsInstanceReportParameters = demographicsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return demographicsInstanceReport
  **/

  public Object getDemographicsInstanceReport() {
    return demographicsInstanceReport;
  }

  public void setDemographicsInstanceReport(Object demographicsInstanceReport) {
    this.demographicsInstanceReport = demographicsInstanceReport;
  }


}

