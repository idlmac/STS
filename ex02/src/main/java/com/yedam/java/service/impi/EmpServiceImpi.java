package com.yedam.java.service.impi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;


// service로 bean이 등록된다. 등록된 bean에 따라서 spring이 알아서 mvc패턴에 맞게 동작함
@Service 
public class EmpServiceImpi implements EmpService {
	
	@Autowired
	EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getEmpList() {
		return empMapper.getEmpList();
	}

	@Override
	public EmpVO getEmp(EmpVO empVO) {
		return empMapper.getEmp(empVO);
	}

	@Override
	public void insertEmp(EmpVO empVO) {
		empMapper.insertEmp(empVO);
	}

	@Override
	public void updateEmp(EmpVO empVO) {
		empMapper.updateEmp(empVO);
	}

	@Override
	public void deleteEmp(EmpVO empVO) {
		empMapper.deleteEmp(Integer.parseInt(empVO.getEmployeeId()));
	}

}
