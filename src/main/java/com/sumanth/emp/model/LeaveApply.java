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
public class LeaveApply {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "leave_apply_id")
	private int leave_apply_Id;
	
	@ManyToOne
    @JoinColumn(name = "emp_id")
    private EmployeeDtls employeeDtls;
	
	@ManyToOne
    @JoinColumn(name = "leave_id")
    private LeaveType leaveType;

	@Column(name = "applied_on")
	private String applied_On;

	@Column(name = "reason")
	private String Reason;

	@Column(name = "status")
	private String Status;
	
	

	public int getLeave_apply_Id() {
		return leave_apply_Id;
	}

	public void setLeave_apply_Id(int leave_apply_Id) {
		this.leave_apply_Id = leave_apply_Id;
	}

	public String getApplied_On() {
		return applied_On;
	}

	public void setApplied_On(String applied_On) {
		this.applied_On = applied_On;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public EmployeeDtls getEmployeeDtls() {
		return employeeDtls;
	}

	public void setEmployeeDtls(EmployeeDtls employeeDtls) {
		this.employeeDtls = employeeDtls;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}	
}
