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

import com.sumanth.emp.model.EmpBand;
import com.sumanth.emp.services.EmpBandService;

@RestController
@CrossOrigin(origins = " http://localhost:3000 ")

@RequestMapping("/api/emp-bands")
public class EmpBandController {

	private final EmpBandService empBandService;

	@Autowired
	public EmpBandController(EmpBandService empBandService) {
		this.empBandService = empBandService;
	}

	@GetMapping("/bands")
	public List<EmpBand> getAllEmpBands() {
		return empBandService.getAllEmpBands();
	}

	@GetMapping("/bands/{id}")
	public EmpBand getEmpBandById(@PathVariable Integer id) {
		return empBandService.getEmpBandById(id);
	}

	@PostMapping("/bands")
	public EmpBand saveEmpBand(@RequestBody EmpBand empBand) {
		return empBandService.saveEmpBand(empBand);
	}

	@PutMapping("/bands/{id}")
	public EmpBand updateEmpBand(@PathVariable Integer id, @RequestBody EmpBand empBand) {
		EmpBand existingEmpBand = empBandService.getEmpBandById(id);
		if (existingEmpBand != null) {
			return empBandService.saveEmpBand(existingEmpBand);
		} else {
			return null;
		}
	}

	@DeleteMapping("/bands/{id}")
	public void deleteEmpBand(@PathVariable Integer id) {
		empBandService.deleteEmpBand(id);
	}
}
