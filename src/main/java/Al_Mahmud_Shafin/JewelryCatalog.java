package Al_Mahmud_Shafin;

import java.util.List;

public class JewelryCatalog {
    String category;
    List list;

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
