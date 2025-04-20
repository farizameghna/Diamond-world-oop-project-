package Al_Mahmud_Shafin;

public class PromotionProfile {
    String tier;
    String details;
    @javafx.fxml.FXML
    private Button buttonlogout;
    @javafx.fxml.FXML
    private TableColumn tablecolumndiscounttier;
    @javafx.fxml.FXML
    private TableColumn tablecolumnname;
    @javafx.fxml.FXML
    private Button buttonback;
    @javafx.fxml.FXML
    private TableColumn tablecomuncontactdetails;

    public PromotionProfile(String details, String tier) {
        this.details = details;
        this.tier = tier;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "PromotionProfile{" +
                "tier='" + tier + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
