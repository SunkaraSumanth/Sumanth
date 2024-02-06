package com.sumanth.emp.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sumanth.emp.model.EmployeeDtls;

public interface EmployeeDetailsService {
    List<EmployeeDtls> getAllEmployeeDetails();
    EmployeeDtls getEmployeeDetailsById(Integer empId);
    EmployeeDtls saveEmployeeDetails(EmployeeDtls employeeDetails);
    void deleteEmployeeDetails(Integer empId);
}