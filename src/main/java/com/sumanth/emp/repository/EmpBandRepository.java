package com.sumanth.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumanth.emp.model.EmpBand;

public interface EmpBandRepository extends JpaRepository<EmpBand, Integer>{
}