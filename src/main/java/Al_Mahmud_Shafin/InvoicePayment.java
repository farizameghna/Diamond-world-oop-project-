package Al_Mahmud_Shafin;

public class InvoicePayment {
    Integer id;
    String status;

    public InvoicePayment(String status, Integer id) {
        this.status = status;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InvoicePayment{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
