package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.emp.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/allList") // java/emp.allList
	public String getEmpList(Model model) {
		model.addAttribute("empList", empService.getEmpList());
		return "emp/empList";
	}
}
