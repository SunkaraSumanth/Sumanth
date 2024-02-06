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

import com.sumanth.emp.model.EmployeeDtls;
import com.sumanth.emp.services.EmployeeDetailsService;

@RestController
//@CrossOrigin(origins = " http://localhost:3000 ")

@RequestMapping("/api/employee-details")
public class EmployeeDetailsController {

    private final EmployeeDetailsService employeeDetailsService;

    @Autowired
    public EmployeeDetailsController(EmployeeDetailsService employeeDetailsService) {
        this.employeeDetailsService = employeeDetailsService;
    }

    @GetMapping("/emps")
    public List<EmployeeDtls> getAllEmployeeDetails() {
        return employeeDetailsService.getAllEmployeeDetails();
    }

    @GetMapping("/emps/{empId}")
    public EmployeeDtls getEmployeeDetailsById(@PathVariable Integer empId) {
        return employeeDetailsService.getEmployeeDetailsById(empId);
    }

    @PostMapping("/emps")
    public EmployeeDtls saveEmployeeDetails(@RequestBody EmployeeDtls employeeDetails) {
        return employeeDetailsService.saveEmployeeDetails(employeeDetails);
    }

    @PutMapping("/{empId}")
    public EmployeeDtls updateEmployeeDetails(@PathVariable Integer empId, @RequestBody EmployeeDtls employeeDetails) {
    	EmployeeDtls existingEmployeeDetails = employeeDetailsService.getEmployeeDetailsById(empId);
        if (existingEmployeeDetails != null) {
            return employeeDetailsService.saveEmployeeDetails(existingEmployeeDetails);
        } else {
            return null;
        }
    }

    @DeleteMapping("/emp/{Id}")
    public void deleteEmployeeDetails(@PathVariable Integer empId) {
        int intValue = empId.intValue();
        employeeDetailsService.deleteEmployeeDetails(intValue);
    }
}