package com.example.dimond_world_oop_project_group14.Meghna;

import java.util.Date;

public class MarketingCompaigh {
    String name;
    Integer id;
    Date datetime;
    String details;

    public MarketingCompaigh(String name, Integer id, Date datetime, String details) {
        this.name = name;
        this.id = id;
        this.datetime = datetime;
        this.details = details;
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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "MarketingCompaigh{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", datetime=" + datetime +
                ", details='" + details + '\'' +
                '}';
    }
}
