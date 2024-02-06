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

import com.sumanth.emp.model.LeaveType;
import com.sumanth.emp.services.LeaveTypeService;


@RestController
//@CrossOrigin(origins = " http://localhost:3000 ")

@RequestMapping("/api/leave-types")
public class LeaveTypeController {

    private final LeaveTypeService leaveTypeService;

    @Autowired
    public LeaveTypeController(LeaveTypeService leaveTypeService) {
        this.leaveTypeService = leaveTypeService;
    }

    @GetMapping("/leaves")
    public List<LeaveType> getAllLeaveTypes() {
        return leaveTypeService.getAllLeaveTypes();
    }

    @GetMapping("/leaves/{id}")
    public LeaveType getLeaveTypeById(@PathVariable Integer id) {
        return leaveTypeService.getLeaveTypeById(id);
    }

    @PostMapping("/leaves")
    public LeaveType saveLeaveType(@RequestBody LeaveType leaveType) {
        return leaveTypeService.saveLeaveType(leaveType);
    }

    @PutMapping("/leaves/{id}")
    public LeaveType updateLeaveType(@PathVariable Integer id, @RequestBody LeaveType leaveType) {
    	LeaveType existingLeaveType = leaveTypeService.getLeaveTypeById(id);
        if (existingLeaveType != null) {
            return leaveTypeService.saveLeaveType(existingLeaveType);
        } else {
  
            return null;
        }
    }

    @DeleteMapping("/leaves/{id}")
    public void deleteLeaveType(@PathVariable Integer id) {
        leaveTypeService.deleteLeaveType(id);
    }
}
