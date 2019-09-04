package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentEvaluateOutputModel
 */
public class CRInteractiveTransactionAssessmentEvaluateOutputModel   {
  private String interactiveTransactionAssessmentInstanceReference = null;

  private String interactiveTransactionAssessmentEvaluateActionReference = null;

  private Object interactiveTransactionAssessmentEvaluateActionRecord = null;

  private String interactiveTransactionAssessmentInstanceStatus = null;

  private String transactionAuthorizationGuidance = null;

  private String transactionAuthorizationResult = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return interactiveTransactionAssessmentEvaluateActionReference
  **/

  public String getInteractiveTransactionAssessmentEvaluateActionReference() {
    return interactiveTransactionAssessmentEvaluateActionReference;
  }

  public void setInteractiveTransactionAssessmentEvaluateActionReference(String interactiveTransactionAssessmentEvaluateActionReference) {
    this.interactiveTransactionAssessmentEvaluateActionReference = interactiveTransactionAssessmentEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return interactiveTransactionAssessmentEvaluateActionRecord
  **/

  public Object getInteractiveTransactionAssessmentEvaluateActionRecord() {
    return interactiveTransactionAssessmentEvaluateActionRecord;
  }

  public void setInteractiveTransactionAssessmentEvaluateActionRecord(Object interactiveTransactionAssessmentEvaluateActionRecord) {
    this.interactiveTransactionAssessmentEvaluateActionRecord = interactiveTransactionAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Interactive Transaction Assessment instance (e.g. initialised, pending, active) 
   * @return interactiveTransactionAssessmentInstanceStatus
  **/

  public String getInteractiveTransactionAssessmentInstanceStatus() {
    return interactiveTransactionAssessmentInstanceStatus;
  }

  public void setInteractiveTransactionAssessmentInstanceStatus(String interactiveTransactionAssessmentInstanceStatus) {
    this.interactiveTransactionAssessmentInstanceStatus = interactiveTransactionAssessmentInstanceStatus;
  }


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


}

