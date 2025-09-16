package com.example.demo_java_fx.Service.impl;

import com.example.demo_java_fx.Service.EmployeeService;
import com.example.demo_java_fx.db.Database;
import com.example.demo_java_fx.dto.EmployeeDTO;
import com.example.demo_java_fx.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    public boolean saveEmployee(EmployeeDTO DTO) {
        Database.employees.add(new Employee(DTO.getIdNo(), DTO.getName(), DTO.getAddress(), DTO.getPosition()));
        return true;
    }

    @Override
    public boolean deleteEmployee(EmployeeDTO DTO) {
        for (Employee emp : Database.employees){
            if (emp.getIdNo() == DTO.getIdNo()){
                emp.setIdNo(0);
                emp.setName(null);
                emp.setAddress(null);
                emp.setPosition(null);
            }
        }
        return false;
    }

    @Override
    public EmployeeDTO searchEmployee(EmployeeDTO DTO) {
        for (Employee emp : Database.employees){
            if (emp.getIdNo() == DTO.getIdNo()){
                return new EmployeeDTO(emp.getIdNo(), emp.getName(), emp.getAddress(), emp.getPosition());
            }
        }
        return null;
    }

    @Override
    public boolean update(EmployeeDTO DTO) {
        for (Employee emp : Database.employees) {
            if (emp.getIdNo() == DTO.getIdNo()) {
                emp.setName(DTO.getName());
                emp.setAddress(DTO.getAddress());
                emp.setPosition(DTO.getPosition());
            }
        }
        return true;
    }
}
