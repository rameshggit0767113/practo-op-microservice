package com.practo.op.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect
@JsonIgnoreProperties
public class Visit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Visit(Long visitId, String visitNumber, String tokenNo, String department, String patientId,
			String doctorId) {
		super();
		this.visitId = visitId;
		this.visitNumber = visitNumber;
		this.tokenNo = tokenNo;
		this.department = department;
		this.patientId = patientId;
		this.doctorId = doctorId;
	}

	private Long visitId;

	private String visitNumber;

	private String tokenNo;

	private String department;

	private String patientId;

	private String doctorId;

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public String getVisitNumber() {
		return visitNumber;
	}

	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}

	public String getTokenNo() {
		return tokenNo;
	}

	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}


}
