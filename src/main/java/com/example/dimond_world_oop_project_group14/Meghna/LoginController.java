package com.example.dimond_world_oop_project_group14.Meghna;

import javafx.scene.control.PasswordField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class LoginController {
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
        return "LoginController{" +
                "Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public LoginController(String name, String password) {
        Name = name;
        Password = password;


        public class LoginController
        {
            @javafx.fxml.FXML
            private PasswordField passwordTextField;
            @javafx.fxml.FXML
            private Label errorLabel;
            @javafx.fxml.FXML
            private TextField usernameTextField;

            @javafx.fxml.FXML
            public void initialize() {
            }

            @javafx.fxml.FXML
            public void login(ActionEvent actionEvent) throws IOException {
                String username = usernameTextField.getText();
                String password = passwordTextField.getText();

                for (User u : UserManagementController.userList) {
                    if (username.equals(u.getUsername())
                            && password.equals(u.getPassword())) {
                        errorLabel.setText("Log in successful");
                        // scene switching
                        SceneSwitcher.switchTo("dashboard.fxml");
                    } else {
                        errorLabel.setText("Incorrect username or password");
                    }
                }
            }
        }


    }


