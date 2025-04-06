package com.example.dimond_world_oop_project_group14.Meghna;

import java.util.Date;

public class SalesReport {
    String data;
    String type;
    Date datetime;
    Integer id;

    public SalesReport(String data, String type, Date datetime, Integer id) {
        this.data = data;
        this.type = type;
        this.datetime = datetime;
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "data='" + data + '\'' +
                ", type='" + type + '\'' +
                ", datetime=" + datetime +
                ", id=" + id +
                '}';
    }
}
