package Al_Mahmud_Shafin;

public class FeedbackLoyalty {
    String tier;
    String text;

    public FeedbackLoyalty(String text, String tier) {
        this.text = text;
        this.tier = tier;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "FeedbackLoyalty{" +
                "tier='" + tier + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
