package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveTransactionAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentGrantInputModel
 */
public class CRInteractiveTransactionAssessmentGrantInputModel   {
  private String transactionAuthorizationServicingSessionReference = null;

  private String interactiveTransactionAssessmentInstanceReference = null;

  private Object interactiveTransactionAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRInteractiveTransactionAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return transactionAuthorizationServicingSessionReference
  **/

  public String getTransactionAuthorizationServicingSessionReference() {
    return transactionAuthorizationServicingSessionReference;
  }

  public void setTransactionAuthorizationServicingSessionReference(String transactionAuthorizationServicingSessionReference) {
    this.transactionAuthorizationServicingSessionReference = transactionAuthorizationServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRInteractiveTransactionAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRInteractiveTransactionAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

