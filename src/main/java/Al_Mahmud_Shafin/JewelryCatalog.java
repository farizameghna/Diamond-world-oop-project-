package Al_Mahmud_Shafin;

import java.util.List;

public class JewelryCatalog {
    String category;
    List list;
    @javafx.fxml.FXML
    private TableView tablecolumnquantity;
    @javafx.fxml.FXML
    private Button buttonlogout;
    @javafx.fxml.FXML
    private TableColumn tablecolumnitemlist;
    @javafx.fxml.FXML
    private TableColumn tablecolumnname;
    @javafx.fxml.FXML
    private TableColumn tablecolumncategory;
    @javafx.fxml.FXML
    private TableColumn tablecolumncriteria;
    @javafx.fxml.FXML
    private Button buttonback;

    public JewelryCatalog(String category, List list) {
        this.category = category;
        this.list = list;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "JewelryCatalog{" +
                "category='" + category + '\'' +
                ", list=" + list +
                '}';
    }
}
