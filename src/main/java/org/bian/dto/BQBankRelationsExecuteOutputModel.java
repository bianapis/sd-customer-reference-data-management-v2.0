package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRelationsExecuteOutputModel
 */
public class BQBankRelationsExecuteOutputModel   {
  private String bankRelationsExecuteActionTaskReference = null;

  private Object bankRelationsExecuteActionTaskRecord = null;

  private String bankRelationsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Relations instance execute service call 
   * @return bankRelationsExecuteActionTaskReference
  **/

  public String getBankRelationsExecuteActionTaskReference() {
    return bankRelationsExecuteActionTaskReference;
  }

  public void setBankRelationsExecuteActionTaskReference(String bankRelationsExecuteActionTaskReference) {
    this.bankRelationsExecuteActionTaskReference = bankRelationsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return bankRelationsExecuteActionTaskRecord
  **/

  public Object getBankRelationsExecuteActionTaskRecord() {
    return bankRelationsExecuteActionTaskRecord;
  }

  public void setBankRelationsExecuteActionTaskRecord(Object bankRelationsExecuteActionTaskRecord) {
    this.bankRelationsExecuteActionTaskRecord = bankRelationsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Bank Relations execute transaction/record 
   * @return bankRelationsExecuteRecordReference
  **/

  public String getBankRelationsExecuteRecordReference() {
    return bankRelationsExecuteRecordReference;
  }

  public void setBankRelationsExecuteRecordReference(String bankRelationsExecuteRecordReference) {
    this.bankRelationsExecuteRecordReference = bankRelationsExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

