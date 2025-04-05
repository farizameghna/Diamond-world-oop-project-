package com.example.dimond_world_oop_project_group14.Meghna;

public class Product {
    Integer id;
    String name;
    String description;
    String material;
    Integer quantity;

    public Product(Integer id, String name, String description, String material, Integer quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.material = material;
        this.quantity = quantity;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", material='" + material + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
