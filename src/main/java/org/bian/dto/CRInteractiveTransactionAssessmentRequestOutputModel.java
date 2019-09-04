package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentRequestOutputModel
 */
public class CRInteractiveTransactionAssessmentRequestOutputModel   {
  private String transactionAuthorizationGuidance = null;

  private String transactionAuthorizationResult = null;

  private String interactiveTransactionAssessmentRequestActionTaskReference = null;

  private Object interactiveTransactionAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: In case of failure, the guidance explains reason and details if additional information can be considered 
   * @return transactionAuthorizationGuidance
  **/

  public String getTransactionAuthorizationGuidance() {
    return transactionAuthorizationGuidance;
  }

  public void setTransactionAuthorizationGuidance(String transactionAuthorizationGuidance) {
    this.transactionAuthorizationGuidance = transactionAuthorizationGuidance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Indicates success or failure or required increased authentication level to be acquired for authorization 
   * @return transactionAuthorizationResult
  **/

  public String getTransactionAuthorizationResult() {
    return transactionAuthorizationResult;
  }

  public void setTransactionAuthorizationResult(String transactionAuthorizationResult) {
    this.transactionAuthorizationResult = transactionAuthorizationResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interactive Transaction Assessment instance request service call 
   * @return interactiveTransactionAssessmentRequestActionTaskReference
  **/

  public String getInteractiveTransactionAssessmentRequestActionTaskReference() {
    return interactiveTransactionAssessmentRequestActionTaskReference;
  }

  public void setInteractiveTransactionAssessmentRequestActionTaskReference(String interactiveTransactionAssessmentRequestActionTaskReference) {
    this.interactiveTransactionAssessmentRequestActionTaskReference = interactiveTransactionAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return interactiveTransactionAssessmentRequestActionTaskRecord
  **/

  public Object getInteractiveTransactionAssessmentRequestActionTaskRecord() {
    return interactiveTransactionAssessmentRequestActionTaskRecord;
  }

  public void setInteractiveTransactionAssessmentRequestActionTaskRecord(Object interactiveTransactionAssessmentRequestActionTaskRecord) {
    this.interactiveTransactionAssessmentRequestActionTaskRecord = interactiveTransactionAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

