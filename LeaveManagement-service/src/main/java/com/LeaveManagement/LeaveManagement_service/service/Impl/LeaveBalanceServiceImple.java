package com.LeaveManagement.LeaveManagement_service.service.Impl;
import com.LeaveManagement.LeaveManagement_service.entity.LeaveBalance;
import com.LeaveManagement.LeaveManagement_service.repository.LeaveBalanceRepository;
import com.LeaveManagement.LeaveManagement_service.service.LeaveBalanceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveBalanceServiceImple implements LeaveBalanceService {

    private final LeaveBalanceRepository leaveBalanceRepository;

    public LeaveBalanceServiceImple(LeaveBalanceRepository leaveBalanceRepository) {
        this.leaveBalanceRepository = leaveBalanceRepository;
    }

    @Override
    public LeaveBalance saveLeaveBalance(LeaveBalance leaveBalance) {
        return leaveBalanceRepository.save(leaveBalance);
    }

    @Override
    public List<LeaveBalance> getAllLeaveBalances() {
        return leaveBalanceRepository.findAll();
    }

    @Override
    public LeaveBalance getLeaveBalanceById(Long id) {
        return leaveBalanceRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteLeaveBalance(Long id) {
        leaveBalanceRepository.deleteById(id);
    }
}