package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRelationsRetrieveInputModelBankRelationsInstanceAnalysis
 */
public class BQBankRelationsRetrieveInputModelBankRelationsInstanceAnalysis   {
  private String bankRelationsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return bankRelationsInstanceAnalysisReference
  **/

  public String getBankRelationsInstanceAnalysisReference() {
    return bankRelationsInstanceAnalysisReference;
  }

  public void setBankRelationsInstanceAnalysisReference(String bankRelationsInstanceAnalysisReference) {
    this.bankRelationsInstanceAnalysisReference = bankRelationsInstanceAnalysisReference;
  }


}
