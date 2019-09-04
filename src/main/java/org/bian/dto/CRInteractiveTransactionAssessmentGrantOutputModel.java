package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveTransactionAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentGrantOutputModel
 */
public class CRInteractiveTransactionAssessmentGrantOutputModel   {
  private String interactiveTransactionAssessmentGrantActionTaskReference = null;

  private Object interactiveTransactionAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRInteractiveTransactionAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interactive Transaction Assessment instance grant service call 
   * @return interactiveTransactionAssessmentGrantActionTaskReference
  **/

  public String getInteractiveTransactionAssessmentGrantActionTaskReference() {
    return interactiveTransactionAssessmentGrantActionTaskReference;
  }

  public void setInteractiveTransactionAssessmentGrantActionTaskReference(String interactiveTransactionAssessmentGrantActionTaskReference) {
    this.interactiveTransactionAssessmentGrantActionTaskReference = interactiveTransactionAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return interactiveTransactionAssessmentGrantActionTaskRecord
  **/

  public Object getInteractiveTransactionAssessmentGrantActionTaskRecord() {
    return interactiveTransactionAssessmentGrantActionTaskRecord;
  }

  public void setInteractiveTransactionAssessmentGrantActionTaskRecord(Object interactiveTransactionAssessmentGrantActionTaskRecord) {
    this.interactiveTransactionAssessmentGrantActionTaskRecord = interactiveTransactionAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRInteractiveTransactionAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRInteractiveTransactionAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

