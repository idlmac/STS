package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService empService;

	@GetMapping("/allList")
	public String getEmpList(Model model) {
		model.addAttribute("empList", empService.getEmpList());
		return "emp/empList";
		// java/emp/allList
	}

	@GetMapping("/getInfo")
	public String getEmpInfo(Model model, EmpVO empVO) {
		model.addAttribute("empInfo", empService.getEmp(empVO));
		return "emp/empInfo";
	}

	@PostMapping("/updateEmp")
	public String updateEmpInfo(EmpVO empVO) {
		empService.updateEmp(empVO);
		return "redirect:allList";
	}

	@GetMapping("/deleteInfo/{employeeId}")
	public String deleteEmpInfo(@PathVariable String employeeId) {
		System.out.println(employeeId);
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		empService.deleteEmp(empVO);
		return "redirect:/emp/allList";
	}

	@PostMapping("/insertEmp")
	public String insertEmpInfo(EmpVO empVO) {
		empService.insertEmp(empVO);
		return "redirect:allList";
	}

	@GetMapping("/insertForm")
	public String insertEmpForm() {
		return "emp/empInsert";
	}
	
	@PostMapping("/insertInfo")
	public String insertEmpInfo1(EmpVO empVO) {
		empService.insertEmp(empVO);
		return "redirect:allList";
	}
}
