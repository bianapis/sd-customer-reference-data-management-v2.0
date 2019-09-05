package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankRelationsRetrieveInputModelBankRelationsInstanceAnalysis;
import org.bian.dto.BQBankRelationsRetrieveInputModelBankRelationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBankRelationsRetrieveInputModel
 */
public class BQBankRelationsRetrieveInputModel   {
  private Object bankRelationsRetrieveActionTaskRecord = null;

  private String bankRelationsRetrieveActionRequest = null;

  private BQBankRelationsRetrieveInputModelBankRelationsInstanceReport bankRelationsInstanceReport = null;

  private BQBankRelationsRetrieveInputModelBankRelationsInstanceAnalysis bankRelationsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return bankRelationsRetrieveActionTaskRecord
  **/

  public Object getBankRelationsRetrieveActionTaskRecord() {
    return bankRelationsRetrieveActionTaskRecord;
  }

  public void setBankRelationsRetrieveActionTaskRecord(Object bankRelationsRetrieveActionTaskRecord) {
    this.bankRelationsRetrieveActionTaskRecord = bankRelationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return bankRelationsRetrieveActionRequest
  **/

  public String getBankRelationsRetrieveActionRequest() {
    return bankRelationsRetrieveActionRequest;
  }

  public void setBankRelationsRetrieveActionRequest(String bankRelationsRetrieveActionRequest) {
    this.bankRelationsRetrieveActionRequest = bankRelationsRetrieveActionRequest;
  }


  /**
   * Get bankRelationsInstanceReport
   * @return bankRelationsInstanceReport
  **/

  public BQBankRelationsRetrieveInputModelBankRelationsInstanceReport getBankRelationsInstanceReport() {
    return bankRelationsInstanceReport;
  }

  public void setBankRelationsInstanceReport(BQBankRelationsRetrieveInputModelBankRelationsInstanceReport bankRelationsInstanceReport) {
    this.bankRelationsInstanceReport = bankRelationsInstanceReport;
  }


  /**
   * Get bankRelationsInstanceAnalysis
   * @return bankRelationsInstanceAnalysis
  **/

  public BQBankRelationsRetrieveInputModelBankRelationsInstanceAnalysis getBankRelationsInstanceAnalysis() {
    return bankRelationsInstanceAnalysis;
  }

  public void setBankRelationsInstanceAnalysis(BQBankRelationsRetrieveInputModelBankRelationsInstanceAnalysis bankRelationsInstanceAnalysis) {
    this.bankRelationsInstanceAnalysis = bankRelationsInstanceAnalysis;
  }


}

