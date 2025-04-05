package com.example.dimond_world_oop_project_group14.Meghna;

import java.util.Date;

public class Appraisal {
    Integer id;
    Date datetime;

    public Appraisal(Integer id, Date datetime) {
        this.id = id;
        this.datetime = datetime;
    }

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

    @Override
    public String toString() {
        return "Appraisal{" +
                "id=" + id +
                ", datetime=" + datetime +
                '}';
    }
}
