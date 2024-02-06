package com.sumanth.emp.services;

import java.util.List;

import com.sumanth.emp.model.LeaveApply;

public interface LeaveApplyService {
    List<LeaveApply> getAllLeaveApplications();
    LeaveApply getLeaveApplicationById(Integer leaveId);
    LeaveApply saveLeaveApplication(LeaveApply leaveApply);
    void deleteLeaveApplication(Integer leaveId);
}
