/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface TransactionAuthorizationApiService {

	SDTransactionAuthorizationActivateOutputModel activate(SDTransactionAuthorizationActivateInputModel request);
	
	SDTransactionAuthorizationConfigureOutputModel configure(String sdReferenceId, SDTransactionAuthorizationConfigureInputModel request);
	
	CRInteractiveTransactionAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRInteractiveTransactionAssessmentEvaluateInputModel request);
	
	CRInteractiveTransactionAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentExchangeInputModel request);
	
	CRInteractiveTransactionAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentExecuteInputModel request);
	
	SDTransactionAuthorizationFeedbackOutputModel feedback(String sdReferenceId, SDTransactionAuthorizationFeedbackInputModel request);
	
	CRInteractiveTransactionAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentGrantInputModel request);
	
	CRInteractiveTransactionAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentRequestInputModel request);
	
	SDTransactionAuthorizationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRInteractiveTransactionAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRInteractiveTransactionAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRInteractiveTransactionAssessmentUpdateInputModel request);
	
}
