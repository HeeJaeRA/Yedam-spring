package com.yedam.java.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpReqVO {
	private String employeeId;
	private String[] dept;
	private String jobId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date sdt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date edt;
	
}
