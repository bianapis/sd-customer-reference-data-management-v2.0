package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssociationsRetrieveOutputModelAssociationsInstanceRecordAssociateReference
 */
public class BQAssociationsRetrieveOutputModelAssociationsInstanceRecordAssociateReference   {
  private String associateType = null;

  private String associateObligationDependencyDescription = null;

  private String associationValidFromToDate = null;

  private String productInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of association with the customer (e.g. familial or corporate, includes household associations, for corporations allowed users/buyers) 
   * @return associateType
  **/

  public String getAssociateType() {
    return associateType;
  }

  public void setAssociateType(String associateType) {
    this.associateType = associateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the rights or obligations granted to the associate 
   * @return associateObligationDependencyDescription
  **/

  public String getAssociateObligationDependencyDescription() {
    return associateObligationDependencyDescription;
  }

  public void setAssociateObligationDependencyDescription(String associateObligationDependencyDescription) {
    this.associateObligationDependencyDescription = associateObligationDependencyDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The start and end dates for the association if appropriate 
   * @return associationValidFromToDate
  **/

  public String getAssociationValidFromToDate() {
    return associationValidFromToDate;
  }

  public void setAssociationValidFromToDate(String associationValidFromToDate) {
    this.associationValidFromToDate = associationValidFromToDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a product or service where the association is linked in some manner (e.g. guarantor) 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}

