package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDemographicsExecuteOutputModel
 */
public class BQDemographicsExecuteOutputModel   {
  private String demographicsExecuteActionTaskReference = null;

  private Object demographicsExecuteActionTaskRecord = null;

  private String demographicsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Demographics instance execute service call 
   * @return demographicsExecuteActionTaskReference
  **/

  public String getDemographicsExecuteActionTaskReference() {
    return demographicsExecuteActionTaskReference;
  }

  public void setDemographicsExecuteActionTaskReference(String demographicsExecuteActionTaskReference) {
    this.demographicsExecuteActionTaskReference = demographicsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return demographicsExecuteActionTaskRecord
  **/

  public Object getDemographicsExecuteActionTaskRecord() {
    return demographicsExecuteActionTaskRecord;
  }

  public void setDemographicsExecuteActionTaskRecord(Object demographicsExecuteActionTaskRecord) {
    this.demographicsExecuteActionTaskRecord = demographicsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Demographics execute transaction/record 
   * @return demographicsExecuteRecordReference
  **/

  public String getDemographicsExecuteRecordReference() {
    return demographicsExecuteRecordReference;
  }

  public void setDemographicsExecuteRecordReference(String demographicsExecuteRecordReference) {
    this.demographicsExecuteRecordReference = demographicsExecuteRecordReference;
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

