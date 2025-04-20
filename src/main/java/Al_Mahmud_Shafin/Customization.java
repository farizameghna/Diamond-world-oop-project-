package Al_Mahmud_Shafin;

public class Customization {
    String file;
    @javafx.fxml.FXML
    private TableColumn tablecolumnfile;
    @javafx.fxml.FXML
    private Button buttonlogout;
    @javafx.fxml.FXML
    private TableColumn tablecolumnname;
    @javafx.fxml.FXML
    private TableColumn tablecolumnestimate;
    @javafx.fxml.FXML
    private Button buttonback;

    public Customization(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Customization{" +
                "file='" + file + '\'' +
                '}';
    }
}
