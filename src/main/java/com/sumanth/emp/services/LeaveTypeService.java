package com.sumanth.emp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sumanth.emp.model.LeaveType;

@Service
public interface LeaveTypeService {
    List<LeaveType> getAllLeaveTypes();
    LeaveType getLeaveTypeById(Integer id);
    LeaveType saveLeaveType(LeaveType leaveType);
    void deleteLeaveType(Integer id);
}
