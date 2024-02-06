package com.sumanth.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumanth.emp.model.LeaveAllocation;

public interface LeaveAllocationRepository extends JpaRepository<LeaveAllocation, Integer> {

}
