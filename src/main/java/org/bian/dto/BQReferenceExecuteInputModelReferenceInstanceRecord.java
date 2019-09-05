package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReferenceExecuteInputModelReferenceInstanceRecordGovernmentIssuedDocumentDetails;
import org.bian.dto.BQReferenceUpdateInputModelReferenceInstanceRecordCompanyOfficerReference;

import javax.validation.Valid;
  
/**
 * BQReferenceExecuteInputModelReferenceInstanceRecord
 */
public class BQReferenceExecuteInputModelReferenceInstanceRecord   {
  private String customerLegalEntityReference = null;

  private String customerNameSalutation = null;

  private String governmentIssuedIdentityReference = null;

  private BQReferenceExecuteInputModelReferenceInstanceRecordGovernmentIssuedDocumentDetails governmentIssuedDocumentDetails = null;

  private String residencyStatus = null;

  private String dateofBirth = null;

  private String nationality = null;

  private String residentialAddress = null;

  private String eMailAddress = null;

  private String cellPhoneNumber = null;

  private String socialNetworkContacts = null;

  private String politicalExposureType = null;

  private Object politicalExposureDescriptionRecord = null;

  private String corporateCustomerReference = null;

  private String corporateCustomerLegalEntityReference = null;

  private String corporateAddress = null;

  private BQReferenceUpdateInputModelReferenceInstanceRecordCompanyOfficerReference companyOfficerReference = null;

  private String customerSinceDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the legal entity - enables the assembly of the legal relationship structure 
   * @return customerLegalEntityReference
  **/

  public String getCustomerLegalEntityReference() {
    return customerLegalEntityReference;
  }

  public void setCustomerLegalEntityReference(String customerLegalEntityReference) {
    this.customerLegalEntityReference = customerLegalEntityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The preferred salutation to be used 
   * @return customerNameSalutation
  **/

  public String getCustomerNameSalutation() {
    return customerNameSalutation;
  }

  public void setCustomerNameSalutation(String customerNameSalutation) {
    this.customerNameSalutation = customerNameSalutation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to government or agency issued identification (e.g. social security number) 
   * @return governmentIssuedIdentityReference
  **/

  public String getGovernmentIssuedIdentityReference() {
    return governmentIssuedIdentityReference;
  }

  public void setGovernmentIssuedIdentityReference(String governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
  }


  /**
   * Get governmentIssuedDocumentDetails
   * @return governmentIssuedDocumentDetails
  **/

  public BQReferenceExecuteInputModelReferenceInstanceRecordGovernmentIssuedDocumentDetails getGovernmentIssuedDocumentDetails() {
    return governmentIssuedDocumentDetails;
  }

  public void setGovernmentIssuedDocumentDetails(BQReferenceExecuteInputModelReferenceInstanceRecordGovernmentIssuedDocumentDetails governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The residency status and history as appropriate 
   * @return residencyStatus
  **/

  public String getResidencyStatus() {
    return residencyStatus;
  }

  public void setResidencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Give DoB 
   * @return dateofBirth
  **/

  public String getDateofBirth() {
    return dateofBirth;
  }

  public void setDateofBirth(String dateofBirth) {
    this.dateofBirth = dateofBirth;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer nationality and history as appropriate 
   * @return nationality
  **/

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Their given residential address 
   * @return residentialAddress
  **/

  public String getResidentialAddress() {
    return residentialAddress;
  }

  public void setResidentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The given email address 
   * @return eMailAddress
  **/

  public String getEMailAddress() {
    return eMailAddress;
  }

  public void setEMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any given phone contact numbers 
   * @return cellPhoneNumber
  **/

  public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any given social network identifiers 
   * @return socialNetworkContacts
  **/

  public String getSocialNetworkContacts() {
    return socialNetworkContacts;
  }

  public void setSocialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A politically exposed person indicator (PEP) (e.g. senior public figure, political position/exposure) 
   * @return politicalExposureType
  **/

  public String getPoliticalExposureType() {
    return politicalExposureType;
  }

  public void setPoliticalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Detail of the customer's political exposure 
   * @return politicalExposureDescriptionRecord
  **/

  public Object getPoliticalExposureDescriptionRecord() {
    return politicalExposureDescriptionRecord;
  }

  public void setPoliticalExposureDescriptionRecord(Object politicalExposureDescriptionRecord) {
    this.politicalExposureDescriptionRecord = politicalExposureDescriptionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the corporate entity (Company for company customers) 
   * @return corporateCustomerReference
  **/

  public String getCorporateCustomerReference() {
    return corporateCustomerReference;
  }

  public void setCorporateCustomerReference(String corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The legal entity reference (for company customers) 
   * @return corporateCustomerLegalEntityReference
  **/

  public String getCorporateCustomerLegalEntityReference() {
    return corporateCustomerLegalEntityReference;
  }

  public void setCorporateCustomerLegalEntityReference(String corporateCustomerLegalEntityReference) {
    this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The company registered address 
   * @return corporateAddress
  **/

  public String getCorporateAddress() {
    return corporateAddress;
  }

  public void setCorporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
  }


  /**
   * Get companyOfficerReference
   * @return companyOfficerReference
  **/

  public BQReferenceUpdateInputModelReferenceInstanceRecordCompanyOfficerReference getCompanyOfficerReference() {
    return companyOfficerReference;
  }

  public void setCompanyOfficerReference(BQReferenceUpdateInputModelReferenceInstanceRecordCompanyOfficerReference companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The start date for the relationship 
   * @return customerSinceDate
  **/

  public String getCustomerSinceDate() {
    return customerSinceDate;
  }

  public void setCustomerSinceDate(String customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
  }


}

