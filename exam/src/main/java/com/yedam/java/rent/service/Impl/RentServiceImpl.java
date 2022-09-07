package com.yedam.java.rent.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.rent.mapper.RentMapper;
import com.yedam.java.rent.service.RentService;
import com.yedam.java.rent.service.RentVO;

@Service
public class RentServiceImpl implements RentService {

	@Autowired
	RentMapper mapper;
	
	@Override
	public List<RentVO> getRentList(RentVO rentVO) {
		return mapper.getRentList(rentVO);
	}

}
