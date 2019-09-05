package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDemographicsExchangeOutputModel
 */
public class BQDemographicsExchangeOutputModel   {
  private String demographicsExchangeActionTaskReference = null;

  private Object demographicsExchangeActionTaskRecord = null;

  private String demographicsExchangeActionResponse = null;

  private String demographicsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Demographics instance exchange service call 
   * @return demographicsExchangeActionTaskReference
  **/

  public String getDemographicsExchangeActionTaskReference() {
    return demographicsExchangeActionTaskReference;
  }

  public void setDemographicsExchangeActionTaskReference(String demographicsExchangeActionTaskReference) {
    this.demographicsExchangeActionTaskReference = demographicsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return demographicsExchangeActionTaskRecord
  **/

  public Object getDemographicsExchangeActionTaskRecord() {
    return demographicsExchangeActionTaskRecord;
  }

  public void setDemographicsExchangeActionTaskRecord(Object demographicsExchangeActionTaskRecord) {
    this.demographicsExchangeActionTaskRecord = demographicsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return demographicsExchangeActionResponse
  **/

  public String getDemographicsExchangeActionResponse() {
    return demographicsExchangeActionResponse;
  }

  public void setDemographicsExchangeActionResponse(String demographicsExchangeActionResponse) {
    this.demographicsExchangeActionResponse = demographicsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Demographics instance (e.g. accepted, rejected, verified) 
   * @return demographicsInstanceStatus
  **/

  public String getDemographicsInstanceStatus() {
    return demographicsInstanceStatus;
  }

  public void setDemographicsInstanceStatus(String demographicsInstanceStatus) {
    this.demographicsInstanceStatus = demographicsInstanceStatus;
  }


}

