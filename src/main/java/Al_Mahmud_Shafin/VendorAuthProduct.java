package Al_Mahmud_Shafin;

public class VendorAuthProduct {
    String name;
    Integer id;
    @javafx.fxml.FXML
    private Button buttonlogout;
    @javafx.fxml.FXML
    private TableColumn tablecolumnname;
    @javafx.fxml.FXML
    private TableColumn tablecomunproductid;
    @javafx.fxml.FXML
    private Button buttonback;
    @javafx.fxml.FXML
    private TableColumn tablecolumnimagefile;

    public VendorAuthProduct(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VendorAuthProduct{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
