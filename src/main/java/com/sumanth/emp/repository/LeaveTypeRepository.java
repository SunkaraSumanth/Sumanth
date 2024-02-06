package com.sumanth.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumanth.emp.model.LeaveType;


public interface LeaveTypeRepository extends JpaRepository<LeaveType, Integer> {

}
