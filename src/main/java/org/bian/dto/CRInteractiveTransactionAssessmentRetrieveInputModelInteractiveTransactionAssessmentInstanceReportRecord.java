package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceReportRecord
 */
public class CRInteractiveTransactionAssessmentRetrieveInputModelInteractiveTransactionAssessmentInstanceReportRecord   {
  private String interactiveTransactionAssessmentInstanceReportReference = null;

  private String interactiveTransactionAssessmentInstanceReportType = null;

  private String interactiveTransactionAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return interactiveTransactionAssessmentInstanceReportReference
  **/

  public String getInteractiveTransactionAssessmentInstanceReportReference() {
    return interactiveTransactionAssessmentInstanceReportReference;
  }

  public void setInteractiveTransactionAssessmentInstanceReportReference(String interactiveTransactionAssessmentInstanceReportReference) {
    this.interactiveTransactionAssessmentInstanceReportReference = interactiveTransactionAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return interactiveTransactionAssessmentInstanceReportType
  **/

  public String getInteractiveTransactionAssessmentInstanceReportType() {
    return interactiveTransactionAssessmentInstanceReportType;
  }

  public void setInteractiveTransactionAssessmentInstanceReportType(String interactiveTransactionAssessmentInstanceReportType) {
    this.interactiveTransactionAssessmentInstanceReportType = interactiveTransactionAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return interactiveTransactionAssessmentInstanceReportParameters
  **/

  public String getInteractiveTransactionAssessmentInstanceReportParameters() {
    return interactiveTransactionAssessmentInstanceReportParameters;
  }

  public void setInteractiveTransactionAssessmentInstanceReportParameters(String interactiveTransactionAssessmentInstanceReportParameters) {
    this.interactiveTransactionAssessmentInstanceReportParameters = interactiveTransactionAssessmentInstanceReportParameters;
  }


}

