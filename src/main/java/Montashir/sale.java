package Montashir;

import java.util.Date;

public class sale {
    Integer id;
    Integer product;
    Integer quantity;
    Date datetime;

    public sale(Integer id, Integer product, Integer quantity, Date datetime) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.datetime = datetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "sale{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                ", datetime=" + datetime +
                '}';
    }
}
