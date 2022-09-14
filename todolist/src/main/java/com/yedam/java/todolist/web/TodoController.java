package com.yedam.java.todolist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todolist.service.TodoService;
import com.yedam.java.todolist.service.TodoVO;

@RestController
@CrossOrigin(origins = "*" )
public class TodoController {

	@Autowired
	TodoService service;

	// 등록
	@PostMapping("/todo")
	public int insertList(TodoVO todoVO) {
		return service.insertList(todoVO);
	}

	// 전체조회
	@GetMapping("/todo")
	public List<TodoVO> selectList() {
		return service.getList();
	}

	// 수정
	@PutMapping("/todo")
	public int updateList(@RequestBody TodoVO todoVO) {
		return service.updateList(todoVO);
	}

	// 삭제
	@DeleteMapping("/todo")
	public int deleteList(@RequestBody TodoVO todoVO) {
		return service.deleteList(todoVO);
	}

}
