import java.util.Date;

public class Promotion {
    Integer id;
    String name;
    Date datetime;

    public Promotion(Integer id, String name, Date datetime) {
        this.id = id;
        this.name = name;
        this.datetime = datetime;
    }

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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
