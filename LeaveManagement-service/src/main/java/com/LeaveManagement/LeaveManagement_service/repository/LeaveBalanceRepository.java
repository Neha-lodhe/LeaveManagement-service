package com.LeaveManagement.LeaveManagement_service.repository;

import com.LeaveManagement.LeaveManagement_service.entity.LeaveBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveBalanceRepository extends JpaRepository<LeaveBalance,Long> {
}
