package com.yedam.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Scanner;

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
	
	
	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO empVO : findList) {
			System.out.println(empVO.getLastName());
		}
	}
	
	public void empInfoTest( ) {
		EmpVO info = new EmpVO();
		info.setEmployeeId("207");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
	}
	
	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("가빈");
		info.setLastName("김");
		info.setEmail("gabin@naver.com");
		info.setJobId("IT_PROG");
		info.setSalary("100000");
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(), 207);
		
	}
	
	
	public void empUpdateSalaryTest() {
		int result = empMapper.updateSalary(207);
		assertEquals(result, 1);
	}
	
	@Test
	public void empUpdateNameEmailTest() {
		EmpVO info = new EmpVO();
		Scanner sc = new Scanner(System.in);
		System.out.println("employeeId입력");
		info.setEmployeeId(sc.nextLine());
		System.out.println("이름입력");
		info.setFirstName(sc.nextLine());
		System.out.println("성입력");
		info.setLastName(sc.nextLine());
		System.out.println("이메일입력");
		info.setEmail(sc.nextLine());
		
		empMapper.updateEmp(info);
		EmpVO newInfo = empMapper.getEmp(info);
		System.out.println(newInfo.toString());
		
		// 이메일
	
		// 이름
		
		// 성
		
		// 쿼리문 -> 특정정보를 뽑아내야한다.
		
		
		
	}
	
	public void empDeleteTest() {
		int result = empMapper.deleteEmp(207);
		assertEquals(result, 1);
	}
	
	
}
