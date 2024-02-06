package com.sumanth.emp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanth.emp.model.EmpBand;
import com.sumanth.emp.repository.EmpBandRepository;


@Service
public class EmpBandServiceImpl implements EmpBandService {
	private final EmpBandRepository empBandRepository;

    @Autowired
    public EmpBandServiceImpl(EmpBandRepository empBandRepository) {
        this.empBandRepository = empBandRepository;
    }


	@Override
	public List<EmpBand> getAllEmpBands() {
	return (List<EmpBand>) empBandRepository.findAll();
	}

	@Override
	public EmpBand getEmpBandById(Integer id) {
		 return empBandRepository.findById(id).orElse(null);
		
	}

	@Override
	public EmpBand saveEmpBand(EmpBand empBand) {

		return empBandRepository.save(empBand);
	
	}

	@Override
	public void deleteEmpBand(Integer id) {
		empBandRepository.deleteById(id);
	}

   

   
}
