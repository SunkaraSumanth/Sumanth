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

import com.sumanth.emp.model.LeaveAllocation;
import com.sumanth.emp.services.LeaveAllocationService;

@RestController
@CrossOrigin(origins = " http://localhost:3000 ")

@RequestMapping("/api/leave-allocations")
public class LeaveAllocationController {

    private final LeaveAllocationService leaveAllocationService;

    @Autowired
    public LeaveAllocationController(LeaveAllocationService leaveAllocationService) {
        this.leaveAllocationService = leaveAllocationService;
    }

    @GetMapping("/allocs")
    public List<LeaveAllocation> getAllLeaveAllocations() {
        return leaveAllocationService.getAllLeaveAllocations();
    }

    @GetMapping("/allocs/{id}")
    public LeaveAllocation getLeaveAllocationById(@PathVariable Integer id) {
        return leaveAllocationService.getLeaveAllocationById(id);
    }

    @PostMapping("/allocs")
    public LeaveAllocation saveLeaveAllocation(@RequestBody LeaveAllocation leaveAllocation) {
        return leaveAllocationService.saveLeaveAllocation(leaveAllocation);
    }

    @PutMapping("/allocs/{id}")
    public LeaveAllocation updateLeaveAllocation(@PathVariable Integer id, @RequestBody LeaveAllocation leaveAllocation) {
    	LeaveAllocation existingLeaveAllocation = leaveAllocationService.getLeaveAllocationById(id);
        if (existingLeaveAllocation != null) {
            return leaveAllocationService.saveLeaveAllocation(existingLeaveAllocation);
        } else {
            return null;
        }
    }

    @DeleteMapping("/allocs/{id}")
    public void deleteLeaveAllocation(@PathVariable Integer id) {
        leaveAllocationService.deleteLeaveAllocation(id);
    }
}