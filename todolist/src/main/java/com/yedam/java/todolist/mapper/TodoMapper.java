package com.yedam.java.todolist.mapper;

import java.util.List;

import com.yedam.java.todolist.service.TodoVO;

public interface TodoMapper {

	public TodoVO getNo();

	public List<TodoVO> getList();

	public int insertList(TodoVO todoVO);

	public int updateList(TodoVO todoVO);

	public int deleteList(TodoVO todoVO);
}
