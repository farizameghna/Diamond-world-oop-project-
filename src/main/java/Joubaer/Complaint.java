package Joubaer;

import java.time.LocalDate;

public class Complaint {
    public int complaintId,customerId;
    public String complaintTitle,complaintDetails,status;
    public LocalDate submissionDate;

    public Complaint() {
    }

    public Complaint(int complaintId, int customerId, String complaintTitle, String complaintDetails, String status, LocalDate submissionDate) {
        this.complaintId = complaintId;
        this.customerId = customerId;
        this.complaintTitle = complaintTitle;
        this.complaintDetails = complaintDetails;
        this.status = status;
        this.submissionDate = submissionDate;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getComplaintTitle() {
        return complaintTitle;
    }

    public void setComplaintTitle(String complaintTitle) {
        this.complaintTitle = complaintTitle;
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId=" + complaintId +
                ", customerId=" + customerId +
                ", complaintTitle='" + complaintTitle + '\'' +
                ", complaintDetails='" + complaintDetails + '\'' +
                ", status='" + status + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }
}
