/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerReferenceDataManagementApiServiceImpl implements CustomerReferenceDataManagementApiService {

	public SDCustomerReferenceDataManagementActivateOutputModel activate(SDCustomerReferenceDataManagementActivateInputModel request){
		return JsonReader.read("activate-SDCustomerReferenceDataManagementActivateOutputModel.json",new TypeReference<SDCustomerReferenceDataManagementActivateOutputModel>(){});
	}
	
	public SDCustomerReferenceDataManagementConfigureOutputModel configure(String sdReferenceId, SDCustomerReferenceDataManagementConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerReferenceDataManagementConfigureOutputModel.json",new TypeReference<SDCustomerReferenceDataManagementConfigureOutputModel>(){});
	}
	
	public CRCustomerReferenceDataDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerReferenceDataDirectoryEntryControlInputModel request){
		return JsonReader.read("control-CRCustomerReferenceDataDirectoryEntryControlOutputModel.json",new TypeReference<CRCustomerReferenceDataDirectoryEntryControlOutputModel>(){});
	}
	
	public BQAssociationsExchangeOutputModel exchangeAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsExchangeInputModel request){
		return JsonReader.read("exchange-BQAssociationsExchangeOutputModel.json",new TypeReference<BQAssociationsExchangeOutputModel>(){});
	}
	
	public BQBankRelationsExchangeOutputModel exchangeBankrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBankRelationsExchangeInputModel request){
		return JsonReader.read("exchange-BQBankRelationsExchangeOutputModel.json",new TypeReference<BQBankRelationsExchangeOutputModel>(){});
	}
	
	public BQDemographicsExchangeOutputModel exchangeDemographics(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDemographicsExchangeInputModel request){
		return JsonReader.read("exchange-BQDemographicsExchangeOutputModel.json",new TypeReference<BQDemographicsExchangeOutputModel>(){});
	}
	
	public BQReferenceExchangeOutputModel exchangeReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceExchangeInputModel request){
		return JsonReader.read("exchange-BQReferenceExchangeOutputModel.json",new TypeReference<BQReferenceExchangeOutputModel>(){});
	}
	
	public CRCustomerReferenceDataDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerReferenceDataDirectoryEntryExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerReferenceDataDirectoryEntryExchangeOutputModel.json",new TypeReference<CRCustomerReferenceDataDirectoryEntryExchangeOutputModel>(){});
	}
	
	public BQAssociationsExecuteOutputModel executeAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsExecuteInputModel request){
		return JsonReader.read("execute-BQAssociationsExecuteOutputModel.json",new TypeReference<BQAssociationsExecuteOutputModel>(){});
	}
	
	public BQBankRelationsExecuteOutputModel executeBankrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBankRelationsExecuteInputModel request){
		return JsonReader.read("execute-BQBankRelationsExecuteOutputModel.json",new TypeReference<BQBankRelationsExecuteOutputModel>(){});
	}
	
	public BQDemographicsExecuteOutputModel executeDemographics(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDemographicsExecuteInputModel request){
		return JsonReader.read("execute-BQDemographicsExecuteOutputModel.json",new TypeReference<BQDemographicsExecuteOutputModel>(){});
	}
	
	public BQReferenceExecuteOutputModel executeReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceExecuteInputModel request){
		return JsonReader.read("execute-BQReferenceExecuteOutputModel.json",new TypeReference<BQReferenceExecuteOutputModel>(){});
	}
	
	public SDCustomerReferenceDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerReferenceDataManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerReferenceDataManagementFeedbackOutputModel.json",new TypeReference<SDCustomerReferenceDataManagementFeedbackOutputModel>(){});
	}
	
	public CRCustomerReferenceDataDirectoryEntryInitiateOutputModel initiate(String sdReferenceId, CRCustomerReferenceDataDirectoryEntryInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerReferenceDataDirectoryEntryInitiateOutputModel.json",new TypeReference<CRCustomerReferenceDataDirectoryEntryInitiateOutputModel>(){});
	}
	
	public CRCustomerReferenceDataDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerReferenceDataDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRCustomerReferenceDataDirectoryEntryRequestOutputModel.json",new TypeReference<CRCustomerReferenceDataDirectoryEntryRequestOutputModel>(){});
	}
	
	public BQAssociationsRetrieveOutputModel retrieveAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssociationsRetrieveOutputModel.json",new TypeReference<BQAssociationsRetrieveOutputModel>(){});
	}
	
	public BQBankRelationsRetrieveOutputModel retrieveBankrelations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBankRelationsRetrieveOutputModel.json",new TypeReference<BQBankRelationsRetrieveOutputModel>(){});
	}
	
	public BQDemographicsRetrieveOutputModel retrieveDemographics(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDemographicsRetrieveOutputModel.json",new TypeReference<BQDemographicsRetrieveOutputModel>(){});
	}
	
	public BQReferenceRetrieveOutputModel retrieveReference(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReferenceRetrieveOutputModel.json",new TypeReference<BQReferenceRetrieveOutputModel>(){});
	}
	
	public CRCustomerReferenceDataDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerReferenceDataDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRCustomerReferenceDataDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerReferenceDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerReferenceDataManagementRetrieveOutputModel.json",new TypeReference<SDCustomerReferenceDataManagementRetrieveOutputModel>(){});
	}
	
	public CRCustomerReferenceDataDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerReferenceDataDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRCustomerReferenceDataDirectoryEntryUpdateOutputModel.json",new TypeReference<CRCustomerReferenceDataDirectoryEntryUpdateOutputModel>(){});
	}
	
	public BQAssociationsUpdateOutputModel updateAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsUpdateInputModel request){
		return JsonReader.read("update-BQAssociationsUpdateOutputModel.json",new TypeReference<BQAssociationsUpdateOutputModel>(){});
	}
	
	public BQBankRelationsUpdateOutputModel updateBankrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBankRelationsUpdateInputModel request){
		return JsonReader.read("update-BQBankRelationsUpdateOutputModel.json",new TypeReference<BQBankRelationsUpdateOutputModel>(){});
	}
	
	public BQDemographicsUpdateOutputModel updateDemographics(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDemographicsUpdateInputModel request){
		return JsonReader.read("update-BQDemographicsUpdateOutputModel.json",new TypeReference<BQDemographicsUpdateOutputModel>(){});
	}
	
	public BQReferenceUpdateOutputModel updateReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceUpdateInputModel request){
		return JsonReader.read("update-BQReferenceUpdateOutputModel.json",new TypeReference<BQReferenceUpdateOutputModel>(){});
	}
	
}
