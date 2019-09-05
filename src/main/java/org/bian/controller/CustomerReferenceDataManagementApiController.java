/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Catalog;

@BianRestController
public class CustomerReferenceDataManagementApiController {

	@Autowired
	CustomerReferenceDataManagementApiService service;
	
	@Catalog.Activate
	public BianResponse<SDCustomerReferenceDataManagementActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerReferenceDataManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Catalog.Configure
	public BianResponse<SDCustomerReferenceDataManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerReferenceDataManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Control
	public BianResponse<CRCustomerReferenceDataDirectoryEntryControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerReferenceDataDirectoryEntryControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Catalog.Exchange
	public BianResponse<BQAssociationsExchangeOutputModel> exchangeAssociations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssociationsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAssociations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("bankrelations")
	@Catalog.Exchange
	public BianResponse<BQBankRelationsExchangeOutputModel> exchangeBankrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBankRelationsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeBankrelations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("demographics")
	@Catalog.Exchange
	public BianResponse<BQDemographicsExchangeOutputModel> exchangeDemographics(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDemographicsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDemographics(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reference")
	@Catalog.Exchange
	public BianResponse<BQReferenceExchangeOutputModel> exchangeReference(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReferenceExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeReference(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Exchange
	public BianResponse<CRCustomerReferenceDataDirectoryEntryExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerReferenceDataDirectoryEntryExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Catalog.Execute
	public BianResponse<BQAssociationsExecuteOutputModel> executeAssociations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssociationsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeAssociations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("bankrelations")
	@Catalog.Execute
	public BianResponse<BQBankRelationsExecuteOutputModel> executeBankrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBankRelationsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeBankrelations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("demographics")
	@Catalog.Execute
	public BianResponse<BQDemographicsExecuteOutputModel> executeDemographics(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDemographicsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeDemographics(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reference")
	@Catalog.Execute
	public BianResponse<BQReferenceExecuteOutputModel> executeReference(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReferenceExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeReference(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Feedback
	public BianResponse<SDCustomerReferenceDataManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerReferenceDataManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Initiate
	public BianResponse<CRCustomerReferenceDataDirectoryEntryInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerReferenceDataDirectoryEntryInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Request
	public BianResponse<CRCustomerReferenceDataDirectoryEntryRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerReferenceDataDirectoryEntryRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Catalog.Retrieve
	public BianResponse<BQAssociationsRetrieveOutputModel> retrieveAssociations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssociations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("bankrelations")
	@Catalog.Retrieve
	public BianResponse<BQBankRelationsRetrieveOutputModel> retrieveBankrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBankrelations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("demographics")
	@Catalog.Retrieve
	public BianResponse<BQDemographicsRetrieveOutputModel> retrieveDemographics(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDemographics(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reference")
	@Catalog.Retrieve
	public BianResponse<BQReferenceRetrieveOutputModel> retrieveReference(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReference(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Catalog.Retrieve
	public BianResponse<CRCustomerReferenceDataDirectoryEntryRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Catalog.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Catalog.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Catalog.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Catalog.RetrieveSD
	public BianResponse<SDCustomerReferenceDataManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Catalog.Update
	public BianResponse<CRCustomerReferenceDataDirectoryEntryUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerReferenceDataDirectoryEntryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Catalog.Update
	public BianResponse<BQAssociationsUpdateOutputModel> updateAssociations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssociationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssociations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("bankrelations")
	@Catalog.Update
	public BianResponse<BQBankRelationsUpdateOutputModel> updateBankrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBankRelationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBankrelations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("demographics")
	@Catalog.Update
	public BianResponse<BQDemographicsUpdateOutputModel> updateDemographics(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDemographicsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDemographics(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reference")
	@Catalog.Update
	public BianResponse<BQReferenceUpdateOutputModel> updateReference(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReferenceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReference(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
