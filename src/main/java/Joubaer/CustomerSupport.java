package Joubaer;

import java.time.LocalDate;

public class CustomerSupport {
    public int supportId, customerId;
    public String customerName,supportType,issueDescription,status;
    public LocalDate dateSubmission;

    public CustomerSupport() {
    }

    public CustomerSupport(int supportId, int customerId, String customerName, String supportType, String issueDescription, String status, LocalDate dateSubmission) {
        this.supportId = supportId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.supportType = supportType;
        this.issueDescription = issueDescription;
        this.status = status;
        this.dateSubmission = dateSubmission;
    }


    public int getSupportId() {
        return supportId;
    }

    public void setSupportId(int supportId) {
        this.supportId = supportId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateSubmission() {
        return dateSubmission;
    }

    public void setDateSubmission(LocalDate dateSubmission) {
        this.dateSubmission = dateSubmission;
    }

    @Override
    public String toString() {
        return "CustomerSupport{" +
                "supportId=" + supportId +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", supportType='" + supportType + '\'' +
                ", issueDescription='" + issueDescription + '\'' +
                ", status='" + status + '\'' +
                ", dateSubmission=" + dateSubmission +
                '}';
    }
}
