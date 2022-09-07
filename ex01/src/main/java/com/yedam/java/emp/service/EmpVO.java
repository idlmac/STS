package com.yedam.java.emp.service;

import lombok.Data;

@Data
public class EmpVO {
	String employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String jobId;
	String hireDate;
	String salary;
	String departmentId;
	String commissionPct;
	String managerId;
}
