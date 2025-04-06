package Montashir;

import java.util.Date;

public class Transaction {
    Integer id;
    Date datetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Transaction(Integer id, Date datetime) {
        this.id = id;
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", datetime=" + datetime +
                '}';
    }
}
