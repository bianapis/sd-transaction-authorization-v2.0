package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveTransactionAssessmentExchangeInputModelInteractiveTransactionAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentExchangeInputModel
 */
public class CRInteractiveTransactionAssessmentExchangeInputModel   {
  private String transactionAuthorizationServicingSessionReference = null;

  private String interactiveTransactionAssessmentInstanceReference = null;

  private Object interactiveTransactionAssessmentExchangeActionTaskRecord = null;

  private CRInteractiveTransactionAssessmentExchangeInputModelInteractiveTransactionAssessmentExchangeActionRequest interactiveTransactionAssessmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return transactionAuthorizationServicingSessionReference
  **/

  public String getTransactionAuthorizationServicingSessionReference() {
    return transactionAuthorizationServicingSessionReference;
  }

  public void setTransactionAuthorizationServicingSessionReference(String transactionAuthorizationServicingSessionReference) {
    this.transactionAuthorizationServicingSessionReference = transactionAuthorizationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Interactive Transaction Assessment instance 
   * @return interactiveTransactionAssessmentInstanceReference
  **/

  public String getInteractiveTransactionAssessmentInstanceReference() {
    return interactiveTransactionAssessmentInstanceReference;
  }

  public void setInteractiveTransactionAssessmentInstanceReference(String interactiveTransactionAssessmentInstanceReference) {
    this.interactiveTransactionAssessmentInstanceReference = interactiveTransactionAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return interactiveTransactionAssessmentExchangeActionTaskRecord
  **/

  public Object getInteractiveTransactionAssessmentExchangeActionTaskRecord() {
    return interactiveTransactionAssessmentExchangeActionTaskRecord;
  }

  public void setInteractiveTransactionAssessmentExchangeActionTaskRecord(Object interactiveTransactionAssessmentExchangeActionTaskRecord) {
    this.interactiveTransactionAssessmentExchangeActionTaskRecord = interactiveTransactionAssessmentExchangeActionTaskRecord;
  }


  /**
   * Get interactiveTransactionAssessmentExchangeActionRequest
   * @return interactiveTransactionAssessmentExchangeActionRequest
  **/

  public CRInteractiveTransactionAssessmentExchangeInputModelInteractiveTransactionAssessmentExchangeActionRequest getInteractiveTransactionAssessmentExchangeActionRequest() {
    return interactiveTransactionAssessmentExchangeActionRequest;
  }

  public void setInteractiveTransactionAssessmentExchangeActionRequest(CRInteractiveTransactionAssessmentExchangeInputModelInteractiveTransactionAssessmentExchangeActionRequest interactiveTransactionAssessmentExchangeActionRequest) {
    this.interactiveTransactionAssessmentExchangeActionRequest = interactiveTransactionAssessmentExchangeActionRequest;
  }


}

