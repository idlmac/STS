package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {

	@Autowired
	EmpMapper empMapper;

	public void EmpListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for (EmpVO findVO : findList) {
			System.out.println(findVO.getLastName());
		}
	}

	public void empInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("207");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
	}

	@Test
	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("멍중이");
		info.setLastName("어");
		info.setEmail("dj1dw1nd@j1db1c1.com");
		info.setHireDate("SYSDATE");
		info.setJobId("IT_PROG");
		info.setSalary("20000");
		System.out.println(empMapper.insertEmp(info));
		assertEquals(info.getEmployeeId(), "209");
	}

	public void empUpdateTest() {
		int result = empMapper.updateSalary(100);
		assertEquals(result, 1);
	}

//	public void empDeleteTest() {
//		EmpVO info = new EmpVO();
//		info.setEmployeeId("208");
//		empMapper.deleteEmp(info);
//	}

	public void empUpdate() {
		EmpVO info = new EmpVO();
		info.setFirstName("엉띠");
		info.setLastName("엄");
		info.setEmail("djdDDI@djdDDI.com");
		info.setEmployeeId("100");
		int result = empMapper.updateEmp(info);
		assertEquals(result, 1);

	}
}
