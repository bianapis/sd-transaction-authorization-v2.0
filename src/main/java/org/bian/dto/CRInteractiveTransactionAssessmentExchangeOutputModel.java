package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentExchangeOutputModel
 */
public class CRInteractiveTransactionAssessmentExchangeOutputModel   {
  private String interactiveTransactionAssessmentExchangeActionTaskReference = null;

  private Object interactiveTransactionAssessmentExchangeActionTaskRecord = null;

  private String interactiveTransactionAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interactive Transaction Assessment instance exchange service call 
   * @return interactiveTransactionAssessmentExchangeActionTaskReference
  **/

  public String getInteractiveTransactionAssessmentExchangeActionTaskReference() {
    return interactiveTransactionAssessmentExchangeActionTaskReference;
  }

  public void setInteractiveTransactionAssessmentExchangeActionTaskReference(String interactiveTransactionAssessmentExchangeActionTaskReference) {
    this.interactiveTransactionAssessmentExchangeActionTaskReference = interactiveTransactionAssessmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return interactiveTransactionAssessmentExchangeActionResponse
  **/

  public String getInteractiveTransactionAssessmentExchangeActionResponse() {
    return interactiveTransactionAssessmentExchangeActionResponse;
  }

  public void setInteractiveTransactionAssessmentExchangeActionResponse(String interactiveTransactionAssessmentExchangeActionResponse) {
    this.interactiveTransactionAssessmentExchangeActionResponse = interactiveTransactionAssessmentExchangeActionResponse;
  }


}

