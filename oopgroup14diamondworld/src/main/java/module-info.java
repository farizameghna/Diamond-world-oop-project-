module com.example.oopgroup14diamondworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopgroup14diamondworld to javafx.fxml;
    exports com.example.oopgroup14diamondworld;
}