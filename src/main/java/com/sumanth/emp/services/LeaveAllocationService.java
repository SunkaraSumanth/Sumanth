package com.sumanth.emp.services;

import java.util.List;

import com.sumanth.emp.model.LeaveAllocation;

public interface LeaveAllocationService {
	
    List<LeaveAllocation> getAllLeaveAllocations();
    
    LeaveAllocation getLeaveAllocationById(Integer id);
    
    LeaveAllocation saveLeaveAllocation(LeaveAllocation leaveAllocation);
    
    void deleteLeaveAllocation(Integer id);
}