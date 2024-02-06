package com.sumanth.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumanth.emp.model.LeaveApply;
import com.sumanth.emp.services.LeaveApplyService;

@RestController
//@CrossOrigin(origins = " http://localhost:3000 ")

@RequestMapping("/api/leave-applications")
public class LeaveApplyController {

    private final LeaveApplyService leaveApplyService;

    @Autowired
    public LeaveApplyController(LeaveApplyService leaveApplyService) {
        this.leaveApplyService = leaveApplyService;
    }

    @GetMapping("/applys")
    public List<LeaveApply> getAllLeaveApplications() {
        return leaveApplyService.getAllLeaveApplications();
    }

    @GetMapping("/applys/{leaveId}")
    public LeaveApply getLeaveApplicationById(@PathVariable Integer leaveId) {
        return leaveApplyService.getLeaveApplicationById(leaveId);
    }

    @PostMapping("/applys")
    public LeaveApply saveLeaveApplication(@RequestBody LeaveApply leaveApply) {
        return leaveApplyService.saveLeaveApplication(leaveApply);
    }

    @PutMapping("/applys/{leaveId}")
    public LeaveApply updateLeaveApplication(@PathVariable Integer leaveId, @RequestBody LeaveApply leaveApply) {
    	LeaveApply existingLeaveApply = leaveApplyService.getLeaveApplicationById(leaveId);
        if (existingLeaveApply != null) {
            
            return leaveApplyService.saveLeaveApplication(existingLeaveApply);
        } else {
            return null;
        }
    }

    @DeleteMapping("/applys/{leaveId}")
    public void deleteLeaveApplication(@PathVariable Integer leaveId) {
        leaveApplyService.deleteLeaveApplication(leaveId);
    }
}