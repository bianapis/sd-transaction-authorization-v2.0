package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentRetrieveOutputModelInteractiveTransactionAssessmentInstanceReportRecord
 */
public class CRInteractiveTransactionAssessmentRetrieveOutputModelInteractiveTransactionAssessmentInstanceReportRecord   {
  private String interactiveTransactionAssessmentInstanceReportData = null;

  private String interactiveTransactionAssessmentInstanceReportType = null;

  private Object interactiveTransactionAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return interactiveTransactionAssessmentInstanceReportData
  **/

  public String getInteractiveTransactionAssessmentInstanceReportData() {
    return interactiveTransactionAssessmentInstanceReportData;
  }

  public void setInteractiveTransactionAssessmentInstanceReportData(String interactiveTransactionAssessmentInstanceReportData) {
    this.interactiveTransactionAssessmentInstanceReportData = interactiveTransactionAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return interactiveTransactionAssessmentInstanceReport
  **/

  public Object getInteractiveTransactionAssessmentInstanceReport() {
    return interactiveTransactionAssessmentInstanceReport;
  }

  public void setInteractiveTransactionAssessmentInstanceReport(Object interactiveTransactionAssessmentInstanceReport) {
    this.interactiveTransactionAssessmentInstanceReport = interactiveTransactionAssessmentInstanceReport;
  }


}

