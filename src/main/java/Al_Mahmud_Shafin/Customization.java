package Al_Mahmud_Shafin;

public class Customization {
    String file;

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
