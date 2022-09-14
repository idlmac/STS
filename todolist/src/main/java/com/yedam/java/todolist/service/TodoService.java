package com.yedam.java.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TodoService {

	public int getNo();

	// 전체조회
	public List<TodoVO> getList();

	// 입력
	public int insertList(TodoVO todoVO);

	// 수정
	public int updateList(TodoVO todoVO);

	// 삭제
	public int deleteList(TodoVO todoVO);
}
