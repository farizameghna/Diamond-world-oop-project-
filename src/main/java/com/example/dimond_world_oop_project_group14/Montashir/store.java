package com.example.dimond_world_oop_project_group14.Montashir;

public class store {
    Integer id;
    String name;

    public store(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
