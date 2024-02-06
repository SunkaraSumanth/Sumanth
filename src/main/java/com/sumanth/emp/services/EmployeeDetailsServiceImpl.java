package com.sumanth.emp.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanth.emp.model.EmployeeDtls;
import com.sumanth.emp.repository.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

    private final EmployeeDetailsRepository employeeDetailsRepository;

    @Autowired
    public EmployeeDetailsServiceImpl(EmployeeDetailsRepository employeeDetailsRepository) {
        this.employeeDetailsRepository = employeeDetailsRepository;
    }

    @Override
	public List<EmployeeDtls> getAllEmployeeDetails() {
		 return employeeDetailsRepository.findAll();

	}

	@Override
	public EmployeeDtls getEmployeeDetailsById(Integer empId) {
        return employeeDetailsRepository.findById(empId).orElse(null);

	}

	@Override
	public EmployeeDtls saveEmployeeDetails(EmployeeDtls employeeDetails) {
        return employeeDetailsRepository.save(employeeDetails);

	}

	@Override
	public void deleteEmployeeDetails(Integer empId) {
        employeeDetailsRepository.deleteById(empId);
	
	}
	
	}