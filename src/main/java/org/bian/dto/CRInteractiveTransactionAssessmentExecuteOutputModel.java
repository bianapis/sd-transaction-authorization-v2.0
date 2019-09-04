package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentExecuteOutputModel
 */
public class CRInteractiveTransactionAssessmentExecuteOutputModel   {
  private String transactionAuthorizationGuidance = null;

  private String transactionAuthorizationResult = null;

  private String interactiveTransactionAssessmentExecuteActionTaskReference = null;

  private Object interactiveTransactionAssessmentExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interactive Transaction Assessment instance execute service call 
   * @return interactiveTransactionAssessmentExecuteActionTaskReference
  **/

  public String getInteractiveTransactionAssessmentExecuteActionTaskReference() {
    return interactiveTransactionAssessmentExecuteActionTaskReference;
  }

  public void setInteractiveTransactionAssessmentExecuteActionTaskReference(String interactiveTransactionAssessmentExecuteActionTaskReference) {
    this.interactiveTransactionAssessmentExecuteActionTaskReference = interactiveTransactionAssessmentExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return interactiveTransactionAssessmentExecuteActionTaskRecord
  **/

  public Object getInteractiveTransactionAssessmentExecuteActionTaskRecord() {
    return interactiveTransactionAssessmentExecuteActionTaskRecord;
  }

  public void setInteractiveTransactionAssessmentExecuteActionTaskRecord(Object interactiveTransactionAssessmentExecuteActionTaskRecord) {
    this.interactiveTransactionAssessmentExecuteActionTaskRecord = interactiveTransactionAssessmentExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

