module com.example.dimond_world_oop_project_group14 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.dimond_world_oop_project_group14 to javafx.fxml;
    exports com.example.dimond_world_oop_project_group14;
}