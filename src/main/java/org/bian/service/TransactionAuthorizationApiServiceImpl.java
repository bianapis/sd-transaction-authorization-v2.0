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
public class TransactionAuthorizationApiServiceImpl implements TransactionAuthorizationApiService {

	public SDTransactionAuthorizationActivateOutputModel activate(SDTransactionAuthorizationActivateInputModel request){
		return JsonReader.read("activate-SDTransactionAuthorizationActivateOutputModel.json",new TypeReference<SDTransactionAuthorizationActivateOutputModel>(){});
	}
	
	public SDTransactionAuthorizationConfigureOutputModel configure(String sdReferenceId, SDTransactionAuthorizationConfigureInputModel request){
		return JsonReader.read("configure-SDTransactionAuthorizationConfigureOutputModel.json",new TypeReference<SDTransactionAuthorizationConfigureOutputModel>(){});
	}
	
	public CRInteractiveTransactionAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRInteractiveTransactionAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRInteractiveTransactionAssessmentEvaluateOutputModel.json",new TypeReference<CRInteractiveTransactionAssessmentEvaluateOutputModel>(){});
	}
	
	public CRInteractiveTransactionAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRInteractiveTransactionAssessmentExchangeOutputModel.json",new TypeReference<CRInteractiveTransactionAssessmentExchangeOutputModel>(){});
	}
	
	public CRInteractiveTransactionAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRInteractiveTransactionAssessmentExecuteOutputModel.json",new TypeReference<CRInteractiveTransactionAssessmentExecuteOutputModel>(){});
	}
	
	public SDTransactionAuthorizationFeedbackOutputModel feedback(String sdReferenceId, SDTransactionAuthorizationFeedbackInputModel request){
		return JsonReader.read("feedback-SDTransactionAuthorizationFeedbackOutputModel.json",new TypeReference<SDTransactionAuthorizationFeedbackOutputModel>(){});
	}
	
	public CRInteractiveTransactionAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRInteractiveTransactionAssessmentGrantOutputModel.json",new TypeReference<CRInteractiveTransactionAssessmentGrantOutputModel>(){});
	}
	
	public CRInteractiveTransactionAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentRequestInputModel request){
		return JsonReader.read("request-CRInteractiveTransactionAssessmentRequestOutputModel.json",new TypeReference<CRInteractiveTransactionAssessmentRequestOutputModel>(){});
	}
	
	public SDTransactionAuthorizationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDTransactionAuthorizationRetrieveOutputModel.json",new TypeReference<SDTransactionAuthorizationRetrieveOutputModel>(){});
	}
	
	public CRInteractiveTransactionAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRInteractiveTransactionAssessmentRetrieveOutputModel.json",new TypeReference<CRInteractiveTransactionAssessmentRetrieveOutputModel>(){});
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
	
	public CRInteractiveTransactionAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRInteractiveTransactionAssessmentUpdateOutputModel.json",new TypeReference<CRInteractiveTransactionAssessmentUpdateOutputModel>(){});
	}
	
}
