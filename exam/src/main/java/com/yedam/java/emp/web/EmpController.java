package com.yedam.java.emp.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.java.emp.service.EmpReqVO;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Controller
public class EmpController {

	Logger logger = LoggerFactory.getLogger(EmpController.class);

	@Autowired
	EmpService service;

	// 단건조회
	@RequestMapping("/emp")
	public String emp(EmpVO vo, Model model, HttpServletRequest request) {
		logger.info("파라미터:" + vo.toString());
		model.addAttribute("emp", service.getEmp(vo));
		return "emp/emp";
	}

	// 목록
	@RequestMapping("/empList")
	public String empList(Model model, EmpReqVO vo) {
		model.addAttribute("list", service.getEmpList(vo));
		return "emp/empList";
	}

	// 등록페이지 이동
	@GetMapping("/empInsert")
	public String empInsert() {
		return "emp/empInsert";
	}

	// 등록처리
	// @PostMapping("/empInsert")
	@RequestMapping(value = "/empInsert", method = RequestMethod.POST)
	public String empInsertProc(EmpVO vo) {
		// 커맨드객체
		logger.debug(vo.toString());
		System.out.println(vo);
		service.insert(vo);
		System.out.println(vo.getEmployeeId() + "사번 등록");
		return "rediect:empList";
	}

	// 수정페이지
	@RequestMapping("/empUpdate/{id}")
	public String empUpdateForm(Model model, EmpVO vo, @PathVariable String id) {
		vo.setEmployeeId(id);
		model.addAttribute("emp", service.getEmp(vo));
		return "emp/empUpdate";
	}

	// 수정처리
	@PostMapping("/empUpdate")
	public String empUpdateProc(EmpVO vo) {
		// mapper.update(vo);
		return "redirect:empList";
	}

}
