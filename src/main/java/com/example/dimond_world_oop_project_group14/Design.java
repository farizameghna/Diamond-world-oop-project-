package com.example.dimond_world_oop_project_group14;

public class Design {
    String name;
    String material;
    String description;
    Integer id;

    public Design(String name, String material, String description, Integer id) {
        this.name = name;
        this.material = material;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Design{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}
