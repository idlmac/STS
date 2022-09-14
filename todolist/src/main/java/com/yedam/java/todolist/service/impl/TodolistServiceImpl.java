package com.yedam.java.todolist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todolist.mapper.TodoMapper;
import com.yedam.java.todolist.service.TodoService;
import com.yedam.java.todolist.service.TodoVO;

@Service
public class TodolistServiceImpl implements TodoService {

	@Autowired
	TodoMapper mapper;

	@Override
	public int getNo() {
		TodoVO vo = mapper.getNo();
		return vo.getNo();
	}

	@Override
	public List<TodoVO> getList() {
		return mapper.getList();
	}

	@Override
	public int insertList(TodoVO todoVO) {
		return mapper.insertList(todoVO);
	}

	@Override
	public int updateList(TodoVO todoVO) {
		return mapper.updateList(todoVO);
	}

	@Override
	public int deleteList(TodoVO todoVO) {
		return mapper.deleteList(todoVO);
	}

}
