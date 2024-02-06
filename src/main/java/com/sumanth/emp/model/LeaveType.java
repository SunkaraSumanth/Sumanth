package com.sumanth.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class LeaveType {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "leave_id")
	private int leave_Id;
	@Column(name = "leave_type")
	private String leave_Type;
	
	public int getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(int leave_Id) {
		this.leave_Id = leave_Id;
	}
	public String getLeave_Type() {
		return leave_Type;
	}
	public void setLeave_Type(String leave_Type) {
		this.leave_Type = leave_Type;
	}
	
	
}