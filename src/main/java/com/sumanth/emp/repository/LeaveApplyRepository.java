package com.sumanth.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumanth.emp.model.LeaveApply;

public interface LeaveApplyRepository extends JpaRepository<LeaveApply, Integer> {

}
