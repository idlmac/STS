package com.yedam.java.board.mapper;

import java.util.List;

import com.yedam.java.board.service.BoardVO;

public interface BoardMapper {

	// 게시글 번호 조회
	public BoardVO getBoardNo();

	// 전체조회
	public List<BoardVO> getBoardList();

	// 단건조회
	public BoardVO getBoardInfo(BoardVO boardVO);

	// 등록
	public int insertBoard(BoardVO boardBO);

	// 수정
	public int updateBoard(BoardVO boardVO);

	// 삭제
	public int deleteBoard(BoardVO boardVO);
}
