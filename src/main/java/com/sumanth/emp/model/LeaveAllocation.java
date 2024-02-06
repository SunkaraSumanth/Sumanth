package com.sumanth.emp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class LeaveAllocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "allocation_id")
	private int allocation_Id;
	
	@ManyToOne
    @JoinColumn(name = "leave_id")
    private LeaveType leaveType;
	
	 @ManyToOne
	 @JoinColumn(name = "band_id")
	 private EmpBand empBand;

	
	@Column(name = "total_leave")
	private int total_Leave;
	
	
	
    public int getAllocation_Id() {
		return allocation_Id;
	}

	public void setAllocation_Id(int allocation_Id) {
		this.allocation_Id = allocation_Id;
	}

	public int getTotal_Leave() {
		return total_Leave;
	}

	public void setTotal_Leave(int total_Leave) {
		this.total_Leave = total_Leave;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public EmpBand getEmpBand() {
		return empBand;
	}

	public void setEmpBand(EmpBand empBand) {
		this.empBand = empBand;
	}

}
