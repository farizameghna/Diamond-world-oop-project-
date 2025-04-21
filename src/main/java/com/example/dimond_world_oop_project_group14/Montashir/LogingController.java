package com.example.dimond_world_oop_project_group14.Montashir;

public class LogingController {
    String Name;
    String Password;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "LogingController{" +
                "Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public LogingController(String name, String password) {
        Name = name;
        Password = password;
    }
}
