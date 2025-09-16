package com.example.demo_java_fx.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPwd;

    @FXML
    void login(ActionEvent event) {
        String email = txtEmail.getText();
        String password = txtPwd.getText();

        System.out.println(email + "------------" + password);
    }
}