package com.LeaveManagement.LeaveManagement_service.service;
import com.LeaveManagement.LeaveManagement_service.entity.Employee;

import java.util.List;
public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void deleteEmployee(Long id);
}
