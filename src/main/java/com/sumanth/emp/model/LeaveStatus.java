package com.sumanth.emp.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class LeaveStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="leave_id")
	private int leave_Id;
	@Column(name = "leave_name")
	private String leave_Name;
	@Column(name = "entitled")
	private int Entitled;
	@Column(name = "applied")
	private int Applied;
	@Column(name = "granted")
	private int Granted;
	@Column(name = "balance")
	private int Balance;
	public String getLeave_Name() {
		return leave_Name;
	}
	public void setLeave_Name(String leave_Name) {
		this.leave_Name = leave_Name;
	}
	public int getEntitled() {
		return Entitled;
	}
	public void setEntitled(int entitled) {
		Entitled = entitled;
	}
	public int getApplied() {
		return Applied;
	}
	public void setApplied(int applied) {
		Applied = applied;
	}
	public int getGranted() {
		return Granted;
	}
	public void setGranted(int granted) {
		Granted = granted;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
		
	}
	public int getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(int leave_Id) {
		this.leave_Id = leave_Id;
	}
	@OneToMany(mappedBy = "leaveStatus", cascade = CascadeType.ALL)
    private List<EmpBand> empBand;
}
	
	
	