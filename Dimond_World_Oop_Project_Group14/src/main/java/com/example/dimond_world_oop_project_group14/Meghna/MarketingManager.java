package com.example.dimond_world_oop_project_group14.Meghna;

public class MarketingManager {
    String name;
    Integer id;

    public MarketingManager(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MarketingManager{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
