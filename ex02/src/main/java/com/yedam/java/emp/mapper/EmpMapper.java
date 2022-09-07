package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	// 전체 조회
	public List<EmpVO> getEmpList();
	// 단건조회 : 조회단건 - EmpVO
	public EmpVO getEmp(EmpVO empVO);
	// 등록
	public int insertEmp(EmpVO empVO);
	// 수정 : 연봉 10프로인상
	public int updateSalary(@Param("empId")int employeeId);
	// mapper에서 empId라고 매개변수명을 사용가능 자동으로 employeeId로 마이바티스가 번역함
	
	// 수정 : 사원정보를 넘겨받아서 이름과 성, 이메일을 수정할 수 있는 메소드 만들기
	public int updateEmp(EmpVO empVO);
	
	// 삭제
	public int deleteEmp(int employeeId);
}
