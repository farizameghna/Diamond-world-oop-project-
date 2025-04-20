package Al_Mahmud_Shafin;

public class PurchaseOrder {
    Integer id;
    String code;
    @javafx.fxml.FXML
    private Button buttonlogout;
    @javafx.fxml.FXML
    private TableColumn tablecolumnitemlist;
    @javafx.fxml.FXML
    private TableColumn tablecolumnname;
    @javafx.fxml.FXML
    private TableColumn tablecolumntrackingid;
    @javafx.fxml.FXML
    private TableColumn tablecolumnorderid;
    @javafx.fxml.FXML
    private TableView tablecolumndiscountcode;
    @javafx.fxml.FXML
    private Button buttonback;

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
