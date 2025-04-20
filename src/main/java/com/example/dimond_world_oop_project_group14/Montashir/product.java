package com.example.dimond_world_oop_project_group14.Montashir;

public class product{
    Integer id;
    String name;
    String description;
    Integer Quantity;
    String category;
    String material;
    String gemstone;

    public product(Integer id, String name, String description, Integer quantity, String category, String material, String gemstone) {
        this.id = id;
        this.name = name;
        this.description = description;
        Quantity = quantity;
        this.category = category;
        this.material = material;
        this.gemstone = gemstone;
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

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGemstone() {
        return gemstone;
    }

    public void setGemstone(String gemstone) {
        this.gemstone = gemstone;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", Quantity=" + Quantity +
                ", category='" + category + '\'' +
                ", material='" + material + '\'' +
                ", gemstone='" + gemstone + '\'' +
                '}';
    }
}
