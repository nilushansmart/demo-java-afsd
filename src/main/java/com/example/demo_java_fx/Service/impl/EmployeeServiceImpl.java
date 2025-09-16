package com.example.demo_java_fx.Service.impl;

import com.example.demo_java_fx.Service.EmployeeService;
import com.example.demo_java_fx.db.Database;
import com.example.demo_java_fx.dto.EmployeeDTO;
import com.example.demo_java_fx.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    public boolean saveEmployee(EmployeeDTO employeeDTO) {
        Database.employees.add(new Employee(employeeDTO.getIdNo(), employeeDTO.getName(), employeeDTO.getAddress(), employeeDTO.getPosition()));
        return true;
    }

    @Override
    public boolean deleteEmployee(EmployeeDTO employeeDTO) {
        for (Employee emp : Database.employees){
            if (emp.getIdNo() == employeeDTO.getIdNo()){
                emp.setIdNo(0);
                emp.setName(null);
                emp.setAddress(null);
                emp.setPosition(null);
            }
        }
        return false;
    }

    @Override
    public EmployeeDTO searchEmployee(EmployeeDTO employeeDTO) {
        for (Employee emp : Database.employees){
            if (emp.getIdNo() == employeeDTO.getIdNo()){
                return new EmployeeDTO(emp.getIdNo(), emp.getName(), emp.getAddress(), emp.getPosition());
            }
        }
        return null;
    }

    @Override
    public boolean update(EmployeeDTO employeeDTO) {
        for (Employee emp : Database.employees) {
            if (emp.getIdNo() == employeeDTO.getIdNo()) {
                emp.setName(employeeDTO.getName());
                emp.setAddress(employeeDTO.getAddress());
                emp.setPosition(employeeDTO.getPosition());
            }
        }
        return true;
    }
}
