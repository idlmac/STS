package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller 
public class UserController {
	
	@RequestMapping("/inputForm") // method = {RequestMethod.Get, RequestMethod.POST} 인식못하면 강제로 집어넣기 가능
	public String inputForm() {
		return "inputForm";
	}
	
	
	@RequestMapping(value="/users") // method = RequestMethod.GET ==  @GetMapping
// 	public String process(UserVO userVO) {
//	public String process(@RequestParam("name") String temp, @RequestParam int age) {
	public String process(@RequestParam Map<String, Object> map) {
//		System.out.println(userVO.getName());
//		System.out.println(userVO.getAge());
//		System.out.println(temp + "," + age);
		System.out.println(map.get("name") + "," + map.get("age"));
		return "";
	}
	
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		for(String temp : name) {
			System.out.println(temp);
		}
		return "";
	}
	
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList = userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
		}
		return "";
	}
}
