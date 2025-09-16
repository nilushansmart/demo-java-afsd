package com.example.demo_java_fx.Service;

import com.example.demo_java_fx.dto.EmployeeDTO;

public interface EmployeeService {
    boolean saveEmployee(EmployeeDTO employeeDTO);
    boolean deleteEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO searchEmployee(EmployeeDTO employeeDTO);
    boolean update(EmployeeDTO employeeDTO);
}
