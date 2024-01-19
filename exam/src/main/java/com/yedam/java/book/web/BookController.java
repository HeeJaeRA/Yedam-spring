package com.yedam.java.book.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;


@Controller
public class BookController {
	
	@Autowired
	BookService bookservice;

	@GetMapping("bookList")
	public String bookList(Model model) {
		List<BookVO> list = bookservice.getBookAll();
		model.addAttribute("bookList", list);
		return "book/bookList";
	}
	
	@GetMapping("bookInsert")
	public String bookInsert() {
		return "book/bookInsert";
	}
	
	@PostMapping("bookInsert")
	public String bookInsertProc(BookVO vo) {
		bookservice.insertBookInfo(vo);
		return "redirect:bookList";
	}
	
	@GetMapping("rentList")
	public String rentList(Model model) {
		List<BookVO> list = bookservice.getRentAll();
		model.addAttribute("rentList", list);
		return "book/rentList";
	}
}
