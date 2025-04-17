package com.example.dimond_world_oop_project_group14.Meghna;

import java.util.Date;

public class Repair {
    Integer id;
    String description;
    Date datetime;

    public Repair(Integer id, String description, Date datetime) {
        this.id = id;
        this.description = description;
        this.datetime = datetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
