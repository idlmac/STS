package com.yedam.java.emp.service;

import java.util.List;

import com.yedam.java.user.service.UserVO;

import lombok.Data;

@Data
public class UserListVO {
	private List<UserVO> list;
}
