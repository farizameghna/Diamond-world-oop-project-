package Al_Mahmud_Shafin;

public class InventoryOrder {
    Integer quantity;
    String location;
    @javafx.fxml.FXML
    private TableView tablecolumnquantity;
    @javafx.fxml.FXML
    private Button buttonlogout;
    @javafx.fxml.FXML
    private TableColumn tablecolumnname;
    @javafx.fxml.FXML
    private TableColumn tablecolumnprice;
    @javafx.fxml.FXML
    private TableColumn tablecolumnestimate;
    @javafx.fxml.FXML
    private TableColumn tablecolumnlocation;
    @javafx.fxml.FXML
    private Button buttonback;

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
