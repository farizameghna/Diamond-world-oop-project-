package Montashir;

public class salesAssociate {
    public salesAssociate(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "salesAssociate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
