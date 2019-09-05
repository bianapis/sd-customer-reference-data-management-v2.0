package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDemographicsRetrieveInputModelDemographicsInstanceAnalysis
 */
public class BQDemographicsRetrieveInputModelDemographicsInstanceAnalysis   {
  private String demographicsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return demographicsInstanceAnalysisReference
  **/

  public String getDemographicsInstanceAnalysisReference() {
    return demographicsInstanceAnalysisReference;
  }

  public void setDemographicsInstanceAnalysisReference(String demographicsInstanceAnalysisReference) {
    this.demographicsInstanceAnalysisReference = demographicsInstanceAnalysisReference;
  }


}

