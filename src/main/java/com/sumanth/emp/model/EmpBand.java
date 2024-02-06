package com.sumanth.emp.model;

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
public class EmpBand {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "band_id")
	private int band_Id;
	@Column(name = "band_name")
	private String band_Name;
	public int getBand_Id() {
		return band_Id;
	}
	public void setBand_Id(int band_Id) {
		this.band_Id = band_Id;
	}
	public String getBand_Name() {
		return band_Name;
	}
	public void setBand_Name(String band_Name) {
		this.band_Name = band_Name;
	}
	
	 @ManyToOne
	 @JoinColumn(name = "leave_id")
	 private LeaveStatus leaveStatus;

}
