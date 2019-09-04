package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecord;

import javax.validation.Valid;
  
/**
 * CRInteractiveTransactionAssessmentEvaluateInputModel
 */
public class CRInteractiveTransactionAssessmentEvaluateInputModel   {
  private String transactionAuthorizationServicingSessionReference = null;

  private Object interactiveTransactionAssessmentEvaluateActionRecord = null;

  private String interactiveTransactionAssessmentInstanceStatus = null;

  private String customerReference = null;

  private String employeeReference = null;

  private String productReference = null;

  private String productInstanceReference = null;

  private String proposedTransactionType = null;

  private String proposedTransactionValue = null;

  private String customerContactRecordReference = null;

  private CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecord customerContactRecord = null;

  private String customerContactRecordDuration = null;

  private Object customerContactActivityRecord = null;

  private String customerContactResult = null;

  private String channelActivityHistoryReportReference = null;

  private String channelActivityHistoryReportFromto = null;

  private Object channelActivityHistoryReport = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer requesting the transaction 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The servicing resource for assisted customer exchanges 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The type of product involved 
   * @return productReference
  **/

  public String getProductReference() {
    return productReference;
  }

  public void setProductReference(String productReference) {
    this.productReference = productReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the specific product accessed by the proposed transaction 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The general type of action proposed (e.g. balance report, payment, change of address) 
   * @return proposedTransactionType
  **/

  public String getProposedTransactionType() {
    return proposedTransactionType;
  }

  public void setProposedTransactionType(String proposedTransactionType) {
    this.proposedTransactionType = proposedTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details key values in the transaction (e.g. amount for a payment, dates for reporting, counterparties) 
   * @return proposedTransactionValue
  **/

  public String getProposedTransactionValue() {
    return proposedTransactionValue;
  }

  public void setProposedTransactionValue(String proposedTransactionValue) {
    this.proposedTransactionValue = proposedTransactionValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the contact record for the active contact where the transaction is sourced 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * Get customerContactRecord
   * @return customerContactRecord
  **/

  public CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecord getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(CRInteractiveTransactionAssessmentEvaluateInputModelCustomerContactRecord customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Records the start and end date times for the contact 
   * @return customerContactRecordDuration
  **/

  public String getCustomerContactRecordDuration() {
    return customerContactRecordDuration;
  }

  public void setCustomerContactRecordDuration(String customerContactRecordDuration) {
    this.customerContactRecordDuration = customerContactRecordDuration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Description of all actions performed during the contact, including all sessions 
   * @return customerContactActivityRecord
  **/

  public Object getCustomerContactActivityRecord() {
    return customerContactActivityRecord;
  }

  public void setCustomerContactActivityRecord(Object customerContactActivityRecord) {
    this.customerContactActivityRecord = customerContactActivityRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The interim result of the contact (subject to transaction approval) 
   * @return customerContactResult
  **/

  public String getCustomerContactResult() {
    return customerContactResult;
  }

  public void setCustomerContactResult(String customerContactResult) {
    this.customerContactResult = customerContactResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a channel activity report extracted for the customer 
   * @return channelActivityHistoryReportReference
  **/

  public String getChannelActivityHistoryReportReference() {
    return channelActivityHistoryReportReference;
  }

  public void setChannelActivityHistoryReportReference(String channelActivityHistoryReportReference) {
    this.channelActivityHistoryReportReference = channelActivityHistoryReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The period for the channel activity report 
   * @return channelActivityHistoryReportFromto
  **/

  public String getChannelActivityHistoryReportFromto() {
    return channelActivityHistoryReportFromto;
  }

  public void setChannelActivityHistoryReportFromto(String channelActivityHistoryReportFromto) {
    this.channelActivityHistoryReportFromto = channelActivityHistoryReportFromto;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of the report extracting recent channel activity records to support the transaction authorization decision 
   * @return channelActivityHistoryReport
  **/

  public Object getChannelActivityHistoryReport() {
    return channelActivityHistoryReport;
  }

  public void setChannelActivityHistoryReport(Object channelActivityHistoryReport) {
    this.channelActivityHistoryReport = channelActivityHistoryReport;
  }


}

