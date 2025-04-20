package com.example.dimond_world_oop_project_group14.Montashir;

public class SalesReport {
    Integer id;
    String name;
    String datatype;

    public SalesReport(Integer id, String name, String datatype) {
        this.id = id;
        this.name = name;
        this.datatype = datatype;
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

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datatype='" + datatype + '\'' +
                '}';
    }
}
