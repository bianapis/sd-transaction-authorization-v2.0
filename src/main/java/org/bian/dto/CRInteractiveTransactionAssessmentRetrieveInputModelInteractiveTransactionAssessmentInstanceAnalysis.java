package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceAnalysis
 */
public class CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceAnalysis   {
  private String interactiveTransactionAssessmentInstanceAnalysisReference = null;

  private String interactiveTransactionAssessmentInstanceAnalysisReportType = null;

  private String interactiveTransactionAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return interactiveTransactionAssessmentInstanceAnalysisReference
  **/

  public String getInteractiveTransactionAssessmentInstanceAnalysisReference() {
    return interactiveTransactionAssessmentInstanceAnalysisReference;
  }

  public void setInteractiveTransactionAssessmentInstanceAnalysisReference(String interactiveTransactionAssessmentInstanceAnalysisReference) {
    this.interactiveTransactionAssessmentInstanceAnalysisReference = interactiveTransactionAssessmentInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return interactiveTransactionAssessmentInstanceAnalysisParameters
  **/

  public String getInteractiveTransactionAssessmentInstanceAnalysisParameters() {
    return interactiveTransactionAssessmentInstanceAnalysisParameters;
  }

  public void setInteractiveTransactionAssessmentInstanceAnalysisParameters(String interactiveTransactionAssessmentInstanceAnalysisParameters) {
    this.interactiveTransactionAssessmentInstanceAnalysisParameters = interactiveTransactionAssessmentInstanceAnalysisParameters;
  }


}

