package com.LeaveManagement.LeaveManagement_service.controller;
import com.LeaveManagement.LeaveManagement_service.entity.LeaveBalance;
import com.LeaveManagement.LeaveManagement_service.service.LeaveBalanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leave-balances")
public class LeaveBalanceController {
    private final LeaveBalanceService leaveBalanceService;

    public LeaveBalanceController(LeaveBalanceService leaveBalanceService) {
        this.leaveBalanceService = leaveBalanceService;
    }

    @PostMapping
    public LeaveBalance saveLeaveBalance(@RequestBody LeaveBalance leaveBalance) {
        return leaveBalanceService.saveLeaveBalance(leaveBalance);
    }

    @GetMapping
    public List<LeaveBalance> getAllLeaveBalances() {
        return leaveBalanceService.getAllLeaveBalances();
    }

    @GetMapping("/{id}")
    public LeaveBalance getLeaveBalanceById(@PathVariable Long id) {
        return leaveBalanceService.getLeaveBalanceById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteLeaveBalance(@PathVariable Long id) {
        leaveBalanceService.deleteLeaveBalance(id);
        return "Leave Balance deleted successfully";
    }
}
