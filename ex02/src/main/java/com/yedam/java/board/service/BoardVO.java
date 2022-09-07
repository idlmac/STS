package com.yedam.java.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regdate; // 최초등록일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedate; // 수정일
	private String image;
}
