package com.yedam.java.rent.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface RentService {
	public List<RentVO> getRentList(RentVO rentVO);
}
