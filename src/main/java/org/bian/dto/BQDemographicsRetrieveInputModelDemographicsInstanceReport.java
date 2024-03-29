package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDemographicsRetrieveInputModelDemographicsInstanceReport
 */
public class BQDemographicsRetrieveInputModelDemographicsInstanceReport   {
  private String demographicsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return demographicsInstanceReportReference
  **/

  public String getDemographicsInstanceReportReference() {
    return demographicsInstanceReportReference;
  }

  public void setDemographicsInstanceReportReference(String demographicsInstanceReportReference) {
    this.demographicsInstanceReportReference = demographicsInstanceReportReference;
  }


}

