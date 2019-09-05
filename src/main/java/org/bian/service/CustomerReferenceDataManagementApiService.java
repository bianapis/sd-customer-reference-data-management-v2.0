/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerReferenceDataManagementApiService {

	SDCustomerReferenceDataManagementActivateOutputModel activate(SDCustomerReferenceDataManagementActivateInputModel request);
	
	SDCustomerReferenceDataManagementConfigureOutputModel configure(String sdReferenceId, SDCustomerReferenceDataManagementConfigureInputModel request);
	
	CRCustomerReferenceDataDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerReferenceDataDirectoryEntryControlInputModel request);
	
	BQAssociationsExchangeOutputModel exchangeAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsExchangeInputModel request);
	
	BQBankRelationsExchangeOutputModel exchangeBankrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBankRelationsExchangeInputModel request);
	
	BQDemographicsExchangeOutputModel exchangeDemographics(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDemographicsExchangeInputModel request);
	
	BQReferenceExchangeOutputModel exchangeReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceExchangeInputModel request);
	
	CRCustomerReferenceDataDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerReferenceDataDirectoryEntryExchangeInputModel request);
	
	BQAssociationsExecuteOutputModel executeAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsExecuteInputModel request);
	
	BQBankRelationsExecuteOutputModel executeBankrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBankRelationsExecuteInputModel request);
	
	BQDemographicsExecuteOutputModel executeDemographics(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDemographicsExecuteInputModel request);
	
	BQReferenceExecuteOutputModel executeReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceExecuteInputModel request);
	
	SDCustomerReferenceDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerReferenceDataManagementFeedbackInputModel request);
	
	CRCustomerReferenceDataDirectoryEntryInitiateOutputModel initiate(String sdReferenceId, CRCustomerReferenceDataDirectoryEntryInitiateInputModel request);
	
	CRCustomerReferenceDataDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerReferenceDataDirectoryEntryRequestInputModel request);
	
	BQAssociationsRetrieveOutputModel retrieveAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQBankRelationsRetrieveOutputModel retrieveBankrelations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDemographicsRetrieveOutputModel retrieveDemographics(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReferenceRetrieveOutputModel retrieveReference(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCustomerReferenceDataDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerReferenceDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerReferenceDataDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerReferenceDataDirectoryEntryUpdateInputModel request);
	
	BQAssociationsUpdateOutputModel updateAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsUpdateInputModel request);
	
	BQBankRelationsUpdateOutputModel updateBankrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBankRelationsUpdateInputModel request);
	
	BQDemographicsUpdateOutputModel updateDemographics(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDemographicsUpdateInputModel request);
	
	BQReferenceUpdateOutputModel updateReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceUpdateInputModel request);
	
}
