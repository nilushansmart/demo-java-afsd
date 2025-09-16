package com.example.demo_java_fx.Controller;

import com.example.demo_java_fx.Service.EmployeeService;
import com.example.demo_java_fx.Service.impl.EmployeeServiceImpl;
import com.example.demo_java_fx.db.Database;
import com.example.demo_java_fx.dto.EmployeeDTO;
import com.example.demo_java_fx.entity.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SaveEmployeeController {

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPosition;

    @FXML
    void delete(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());

        EmployeeService employeeService = new EmployeeServiceImpl();
        boolean sts = employeeService.deleteEmployee(new EmployeeDTO(id));

        if (sts) {
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("ID Not Found");
        }
    }

    @FXML
    void getall(ActionEvent event) {

        System.out.println("Id     | Name            | Address         | Position ");
        for (Employee emp : Database.employees){
            System.out.println(emp.getIdNo()+"    "+emp.getName()+"    "+emp.getAddress()+"    "+emp.getPosition());
        }
    }

    @FXML
    void save(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());  //convert integer
        String name = txtName.getText();
        String position = txtPosition.getText();
        String address = txtAddress.getText();

        EmployeeService service = new EmployeeServiceImpl();
        boolean saved = service.saveEmployee(new EmployeeDTO(id, name, address, position));

        if (saved) {
            System.out.println("Data saved successfully");
        } else {
            System.out.println("Data not saved");
        }
    }

    @FXML
    void search(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());

        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeDTO sts = employeeService.searchEmployee(new EmployeeDTO(id));

        if (sts == null){
            System.out.println("Employee not found");
        }else{
            System.out.println("Id     | Name            | Address         | Position ");
            System.out.println(sts.getIdNo()+"   "+sts.getName()+"    "+sts.getAddress()+"     "+sts.getPosition());
        }

    }

    @FXML
    void update(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String position = txtPosition.getText();
        String address = txtAddress.getText();

        EmployeeService employeeService = new EmployeeServiceImpl();
        boolean sts = employeeService.update(new EmployeeDTO(id, name,position,address));

        if (sts){
            System.out.println("Data Update successfully");
        }else {
            System.out.println("Employee Id Not found");
        }

    }
}
