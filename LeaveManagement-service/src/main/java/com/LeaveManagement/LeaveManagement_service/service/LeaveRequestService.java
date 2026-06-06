package com.LeaveManagement.LeaveManagement_service.service;

import com.LeaveManagement.LeaveManagement_service.entity.LeaveRequest;

import java.util.List;
public interface LeaveRequestService {

    LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest);

    List<LeaveRequest> getAllLeaveRequests();

    LeaveRequest getLeaveRequestById(Long id);

    void deleteLeaveRequest(Long id);
}
