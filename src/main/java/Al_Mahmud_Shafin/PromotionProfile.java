package Al_Mahmud_Shafin;

public class PromotionProfile {
    String tier;
    String details;

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
