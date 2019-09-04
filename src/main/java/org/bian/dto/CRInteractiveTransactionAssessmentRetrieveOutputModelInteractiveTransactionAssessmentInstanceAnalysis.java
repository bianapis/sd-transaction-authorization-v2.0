package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentRetrieveOutputModelInteractiveTransactionAssessmentInstanceAnalysis
 */
public class CRInteractiveTransactionAssessmentRetrieveOutputModelInteractiveTransactionAssessmentInstanceAnalysis   {
  private String interactiveTransactionAssessmentInstanceAnalysisData = null;

  private String interactiveTransactionAssessmentInstanceAnalysisReportType = null;

  private Object interactiveTransactionAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return interactiveTransactionAssessmentInstanceAnalysisData
  **/

  public String getInteractiveTransactionAssessmentInstanceAnalysisData() {
    return interactiveTransactionAssessmentInstanceAnalysisData;
  }

  public void setInteractiveTransactionAssessmentInstanceAnalysisData(String interactiveTransactionAssessmentInstanceAnalysisData) {
    this.interactiveTransactionAssessmentInstanceAnalysisData = interactiveTransactionAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return interactiveTransactionAssessmentInstanceAnalysisReportType
  **/

  public String getInteractiveTransactionAssessmentInstanceAnalysisReportType() {
    return interactiveTransactionAssessmentInstanceAnalysisReportType;
  }

  public void setInteractiveTransactionAssessmentInstanceAnalysisReportType(String interactiveTransactionAssessmentInstanceAnalysisReportType) {
    this.interactiveTransactionAssessmentInstanceAnalysisReportType = interactiveTransactionAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return interactiveTransactionAssessmentInstanceAnalysisReport
  **/

  public Object getInteractiveTransactionAssessmentInstanceAnalysisReport() {
    return interactiveTransactionAssessmentInstanceAnalysisReport;
  }

  public void setInteractiveTransactionAssessmentInstanceAnalysisReport(Object interactiveTransactionAssessmentInstanceAnalysisReport) {
    this.interactiveTransactionAssessmentInstanceAnalysisReport = interactiveTransactionAssessmentInstanceAnalysisReport;
  }


}

