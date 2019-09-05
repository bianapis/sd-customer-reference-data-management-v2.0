package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDemographicsUpdateInputModelDemographicsInstanceRecord
 */
public class BQDemographicsUpdateInputModelDemographicsInstanceRecord   {
  private String socioEconomicClassification = null;

  private String ethnicityReligion = null;

  private String employment = null;

  private String employmentHistory = null;

  private String educationHistory = null;

  private String servicingConstraints = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A bank defined classification of the socio-economic rating and prospect 
   * @return socioEconomicClassification
  **/

  public String getSocioEconomicClassification() {
    return socioEconomicClassification;
  }

  public void setSocioEconomicClassification(String socioEconomicClassification) {
    this.socioEconomicClassification = socioEconomicClassification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Where needed to ensure the bank's handling of the relationship follows legal and regulatory requirements 
   * @return ethnicityReligion
  **/

  public String getEthnicityReligion() {
    return ethnicityReligion;
  }

  public void setEthnicityReligion(String ethnicityReligion) {
    this.ethnicityReligion = ethnicityReligion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the customer's employer (company name) 
   * @return employment
  **/

  public String getEmployment() {
    return employment;
  }

  public void setEmployment(String employment) {
    this.employment = employment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the customer's employment history (e.g. employer, dates, job position, salary) 
   * @return employmentHistory
  **/

  public String getEmploymentHistory() {
    return employmentHistory;
  }

  public void setEmploymentHistory(String employmentHistory) {
    this.employmentHistory = employmentHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Customer's education (e.g. academic institutions attended, duration, qualifications and certifications) 
   * @return educationHistory
  **/

  public String getEducationHistory() {
    return educationHistory;
  }

  public void setEducationHistory(String educationHistory) {
    this.educationHistory = educationHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of any known constraints on servicing the customer (sight, hearing, religious considerations) 
   * @return servicingConstraints
  **/

  public String getServicingConstraints() {
    return servicingConstraints;
  }

  public void setServicingConstraints(String servicingConstraints) {
    this.servicingConstraints = servicingConstraints;
  }


}

