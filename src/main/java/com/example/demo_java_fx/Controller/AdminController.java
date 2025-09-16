package com.example.demo_java_fx.Controller;

import com.example.demo_java_fx.Service.AdminService;
import com.example.demo_java_fx.Service.impl.AdminServiceImpl;
import com.example.demo_java_fx.dto.AdminDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AdminController {
    @FXML
    private TextField txtpassword;

    @FXML
    private TextField txtusename;

    @FXML
    void btnsave(ActionEvent event) {
        String username = txtusename.getText();
        String password = txtpassword.getText();

        AdminService adminService = new AdminServiceImpl();
        boolean saved = adminService.saveAdmin(new AdminDTO(username, password));

        if (saved){
            System.out.println("Employee Saved successfully");
        }else {
            System.out.println("Employee Data Saved failed");
        }

    }
}
