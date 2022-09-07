package com.yedam.java.rent.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.rent.service.RentService;
import com.yedam.java.rent.service.RentVO;

public class RentController {
	
	@Autowired
	RentService service;
	
	@GetMapping("/list")
	public String selectRentList(Model model, RentVO rentVO) {
		model.addAttribute("RentList", service.getRentList(rentVO));
		return "rent/rentList";
	}
}
