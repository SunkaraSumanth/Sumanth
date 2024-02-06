package com.sumanth.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumanth.emp.model.EmployeeDtls;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDtls, Integer>{

}
