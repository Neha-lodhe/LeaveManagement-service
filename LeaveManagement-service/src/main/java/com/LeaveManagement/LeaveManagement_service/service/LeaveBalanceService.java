package com.LeaveManagement.LeaveManagement_service.service;

import com.LeaveManagement.LeaveManagement_service.entity.LeaveBalance;
import java.util.List;

public interface LeaveBalanceService {

    LeaveBalance saveLeaveBalance(LeaveBalance leaveBalance);

    List<LeaveBalance> getAllLeaveBalances();

    LeaveBalance getLeaveBalanceById(Long id);

    void deleteLeaveBalance(Long id);
}
