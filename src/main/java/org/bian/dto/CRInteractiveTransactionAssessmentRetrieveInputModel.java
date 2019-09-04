package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceAnalysis;
import org.bian.dto.CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentRetrieveInputModel
 */
public class CRInteractiveTransactionAssessmentRetrieveInputModel   {
  private Object interactiveTransactionAssessmentRetrieveActionTaskRecord = null;

  private String interactiveTransactionAssessmentRetrieveActionRequest = null;

  private CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceReportRecord interactiveTransactionAssessmentInstanceReportRecord = null;

  private CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceAnalysis interactiveTransactionAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return interactiveTransactionAssessmentRetrieveActionTaskRecord
  **/

  public Object getInteractiveTransactionAssessmentRetrieveActionTaskRecord() {
    return interactiveTransactionAssessmentRetrieveActionTaskRecord;
  }

  public void setInteractiveTransactionAssessmentRetrieveActionTaskRecord(Object interactiveTransactionAssessmentRetrieveActionTaskRecord) {
    this.interactiveTransactionAssessmentRetrieveActionTaskRecord = interactiveTransactionAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return interactiveTransactionAssessmentRetrieveActionRequest
  **/

  public String getInteractiveTransactionAssessmentRetrieveActionRequest() {
    return interactiveTransactionAssessmentRetrieveActionRequest;
  }

  public void setInteractiveTransactionAssessmentRetrieveActionRequest(String interactiveTransactionAssessmentRetrieveActionRequest) {
    this.interactiveTransactionAssessmentRetrieveActionRequest = interactiveTransactionAssessmentRetrieveActionRequest;
  }


  /**
   * Get interactiveTransactionAssessmentInstanceReportRecord
   * @return interactiveTransactionAssessmentInstanceReportRecord
  **/

  public CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceReportRecord getInteractiveTransactionAssessmentInstanceReportRecord() {
    return interactiveTransactionAssessmentInstanceReportRecord;
  }

  public void setInteractiveTransactionAssessmentInstanceReportRecord(CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceReportRecord interactiveTransactionAssessmentInstanceReportRecord) {
    this.interactiveTransactionAssessmentInstanceReportRecord = interactiveTransactionAssessmentInstanceReportRecord;
  }


  /**
   * Get interactiveTransactionAssessmentInstanceAnalysis
   * @return interactiveTransactionAssessmentInstanceAnalysis
  **/

  public CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceAnalysis getInteractiveTransactionAssessmentInstanceAnalysis() {
    return interactiveTransactionAssessmentInstanceAnalysis;
  }

  public void setInteractiveTransactionAssessmentInstanceAnalysis(CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceAnalysis interactiveTransactionAssessmentInstanceAnalysis) {
    this.interactiveTransactionAssessmentInstanceAnalysis = interactiveTransactionAssessmentInstanceAnalysis;
  }


}

