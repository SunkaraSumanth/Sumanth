package com.sumanth.emp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class EmployeeDtls {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int emp_Id;

	@Column(name = "name")
	private String Name;

	@Column(name = "address")
	private String Address;

	@Column(name = "mobile_no")
	private String mobile_No;

	@Column(name = "email")
	private String Email;

	@Column(name = "designation")
	private String Designation;
	
	 @ManyToOne
	 @JoinColumn(name = "band_id")
	 private EmpBand empBand;
	
	
	
	public int getEmp_Id() {
		return emp_Id;
	}



	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getMobile_No() {
		return mobile_No;
	}



	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getDesignation() {
		return Designation;
	}



	public void setDesignation(String designation) {
		Designation = designation;
	}



	public EmpBand getEmpBand() {
		return empBand;
	}



	public void setEmpBand(EmpBand empBand) {
		this.empBand = empBand;
	}
}
