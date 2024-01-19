package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookMapper bookmapper;
	
	@Override
	public List<BookVO> getBookAll() {
		return bookmapper.selectBookList();
	}
	
	@Override
	public int insertBookInfo(BookVO bookVO) {
		int result = bookmapper.insertBook(bookVO);
		
		if (result == 1) {
			return bookVO.getBookNo();
		} else {
			return -1;
		}
	}
	
	@Override
	public List<BookVO> getRentAll() {
		return bookmapper.selectRentList();
	}
}
