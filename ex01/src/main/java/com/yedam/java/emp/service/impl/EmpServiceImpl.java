package com.yedam.java.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getEmpList() {
		// 데이터 연산
		return empMapper.getEmpList();
	}

	@Override
	public EmpVO getEmp(EmpVO empVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertEmp(EmpVO empVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmp(EmpVO empVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmp(EmpVO empVO) {
		// TODO Auto-generated method stub

	}

}
