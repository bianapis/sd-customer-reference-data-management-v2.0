package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRelationsExchangeOutputModel
 */
public class BQBankRelationsExchangeOutputModel   {
  private String bankRelationsExchangeActionTaskReference = null;

  private Object bankRelationsExchangeActionTaskRecord = null;

  private String bankRelationsExchangeActionResponse = null;

  private String bankRelationsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Relations instance exchange service call 
   * @return bankRelationsExchangeActionTaskReference
  **/

  public String getBankRelationsExchangeActionTaskReference() {
    return bankRelationsExchangeActionTaskReference;
  }

  public void setBankRelationsExchangeActionTaskReference(String bankRelationsExchangeActionTaskReference) {
    this.bankRelationsExchangeActionTaskReference = bankRelationsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return bankRelationsExchangeActionTaskRecord
  **/

  public Object getBankRelationsExchangeActionTaskRecord() {
    return bankRelationsExchangeActionTaskRecord;
  }

  public void setBankRelationsExchangeActionTaskRecord(Object bankRelationsExchangeActionTaskRecord) {
    this.bankRelationsExchangeActionTaskRecord = bankRelationsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return bankRelationsExchangeActionResponse
  **/

  public String getBankRelationsExchangeActionResponse() {
    return bankRelationsExchangeActionResponse;
  }

  public void setBankRelationsExchangeActionResponse(String bankRelationsExchangeActionResponse) {
    this.bankRelationsExchangeActionResponse = bankRelationsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Bank Relations instance (e.g. accepted, rejected, verified) 
   * @return bankRelationsInstanceStatus
  **/

  public String getBankRelationsInstanceStatus() {
    return bankRelationsInstanceStatus;
  }

  public void setBankRelationsInstanceStatus(String bankRelationsInstanceStatus) {
    this.bankRelationsInstanceStatus = bankRelationsInstanceStatus;
  }


}

