package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecordCustomerContactRecordActivityRecordCustomerContactDialogueRecord;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecordCustomerContactRecordActivityRecord
 */
public class CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecordCustomerContactRecordActivityRecord   {
  private String customerContactDialogueReference = null;

  private CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecordCustomerContactRecordActivityRecordCustomerContactDialogueRecord customerContactDialogueRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any contact session dialogue records created during the contact - there can be several 
   * @return customerContactDialogueReference
  **/

  public String getCustomerContactDialogueReference() {
    return customerContactDialogueReference;
  }

  public void setCustomerContactDialogueReference(String customerContactDialogueReference) {
    this.customerContactDialogueReference = customerContactDialogueReference;
  }


  /**
   * Get customerContactDialogueRecord
   * @return customerContactDialogueRecord
  **/

  public CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecordCustomerContactRecordActivityRecordCustomerContactDialogueRecord getCustomerContactDialogueRecord() {
    return customerContactDialogueRecord;
  }

  public void setCustomerContactDialogueRecord(CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecordCustomerContactRecordActivityRecordCustomerContactDialogueRecord customerContactDialogueRecord) {
    this.customerContactDialogueRecord = customerContactDialogueRecord;
  }


}

