package Joubaer;

public class CustomerSupport {
    public int supportId;
    public String customerName;
    public int solveProblem, pendingProblem;

    public CustomerSupport() {
    }

    public CustomerSupport(int supportId, String customerName, int solveProblem, int pendingProblem) {
        this.supportId = supportId;
        this.customerName = customerName;
        this.solveProblem = solveProblem;
        this.pendingProblem = pendingProblem;
    }

    public int getSupportId() {
        return supportId;
    }

    public void setSupportId(int supportId) {
        this.supportId = supportId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getSolveProblem() {
        return solveProblem;
    }

    public void setSolveProblem(int solveProblem) {
        this.solveProblem = solveProblem;
    }

    public int getPendingProblem() {
        return pendingProblem;
    }

    public void setPendingProblem(int pendingProblem) {
        this.pendingProblem = pendingProblem;
    }

    @Override
    public String toString() {
        return "CustomerSupport{" +
                "supportId=" + supportId +
                ", customerName='" + customerName + '\'' +
                ", solveProblem=" + solveProblem +
                ", pendingProblem=" + pendingProblem +
                '}';
    }
}
