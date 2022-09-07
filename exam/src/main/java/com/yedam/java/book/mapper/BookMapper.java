package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;

public interface BookMapper {
	public BookVO getBookNo();

	// 전체조회
	public List<BookVO> getBookList(BookVO bookVO);

	// 단건조회
	public BookVO getBookInfo(BookVO bookVO);

	// 등록
	public int insertBook(BookVO bookVO);

	// 수정
	public int updateBook(BookVO bookVO);

	// 삭제
	public int deleteBook(int BookNo);
}
