package com.LeaveManagement.LeaveManagement_service.repository;

import com.LeaveManagement.LeaveManagement_service.entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest,Long> {
}
