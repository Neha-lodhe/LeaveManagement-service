package com.LeaveManagement.LeaveManagement_service.repository;

import com.LeaveManagement.LeaveManagement_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
