package Joubaer;

import java.time.LocalDate;

public class Refund {
    public int refundId,customerId,orderId;
    public double amount;
    public LocalDate refundDate;
    public String reason,status;

    public Refund() {
    }

    public Refund(int refundId, int customerId, int orderId, double amount, LocalDate refundDate, String reason, String status) {
        this.refundId = refundId;
        this.customerId = customerId;
        this.orderId = orderId;
        this.amount = amount;
        this.refundDate = refundDate;
        this.reason = reason;
        this.status = status;
    }

    public int getRefundId() {
        return refundId;
    }

    public void setRefundId(int refundId) {
        this.refundId = refundId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(LocalDate refundDate) {
        this.refundDate = refundDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "refundId=" + refundId +
                ", customerId=" + customerId +
                ", orderId=" + orderId +
                ", amount=" + amount +
                ", refundDate=" + refundDate +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
