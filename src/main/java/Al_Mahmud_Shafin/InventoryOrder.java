package Al_Mahmud_Shafin;

public class InventoryOrder {
    Integer quantity;
    String location;

    public InventoryOrder(String location, Integer quantity) {
        this.location = location;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "InventoryOrder{" +
                "quantity=" + quantity +
                ", location='" + location + '\'' +
                '}';
    }
}
