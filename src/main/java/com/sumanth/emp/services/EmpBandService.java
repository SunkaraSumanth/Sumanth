package com.sumanth.emp.services;

import java.util.List;

import com.sumanth.emp.model.EmpBand;



public interface EmpBandService {
	List<EmpBand> getAllEmpBands();

	EmpBand getEmpBandById(Integer id);

	EmpBand saveEmpBand(EmpBand empBand);

	void deleteEmpBand(Integer id);

}
