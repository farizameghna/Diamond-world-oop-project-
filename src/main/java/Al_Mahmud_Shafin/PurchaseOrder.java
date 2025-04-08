package Al_Mahmud_Shafin;

public class PurchaseOrder {
    Integer id;
    String code;

    public PurchaseOrder(String code, Integer id) {
        this.code = code;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
