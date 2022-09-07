package com.yedam.java.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

public class BookController {

	@Autowired
	BookService service;

	// 전체조회
	@GetMapping("/list")
	public String selectBookList(Model model, BookVO bookVO) {
		model.addAttribute("bookList", service.getBookList(bookVO));
		return "book/bookList";
	}
	
	//단건조회
//	@GetMapping("/info")
//	public String selectBookInfo(BookVO bookVO, Model model) {
//		
//	}

}
