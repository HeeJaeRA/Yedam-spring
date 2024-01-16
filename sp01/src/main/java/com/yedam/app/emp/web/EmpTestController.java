package com.yedam.app.emp.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpTestController {
	
	@GetMapping("getTestEmp")
	@ResponseBody	// JSP(페이지)가 아닌 데이터를 반환, ajax 대용 
	public EmpVO getEmpInfo(EmpVO empVO) {
		empVO.setEmployeeId(1000);
		return empVO;
	}
	
	@PostMapping("getTestEmp")
	@ResponseBody
	public EmpVO getEmpInfoPost(EmpVO empVO) {
		empVO.setEmployeeId(9000);
		return empVO;
	}
	
//	RequestParam get 방식
//	http://localhost:8080/app/paramTestEmp?name=Lee
	@GetMapping("paramTestEmp")
	@ResponseBody
	// @RequestParam 생략 가능
	public Map<String, Object> paramTestEmpGet(String name, Integer age) {
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("age", age);
		return map;
	}

//	RequestParam post 방식
//	http://localhost:8080/app/paramTestEmp / body > x-www-form-urlencoded
	@PostMapping("paramTestEmp")
	@ResponseBody
	// 변수 앞에 @RequestParam 명시하면 호출 시 모든 값이 필수(name, age), require = false 하거나 defaultValue (값 타입은 String) 설정
	public Map<String, Object> paramTestEmpPost(@RequestParam String name, @RequestParam(defaultValue = "20") Integer age) {
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("age", age);
		return map;
	}
	
// @PathVariable 경로에 들어온 값 사용, 경로에 들어온 이름 변경해서 사용하려면 name 속성으로 재정의
//	http://localhost:8080/app/pathTestEmp/spring/1234
	@GetMapping("pathTestEmp/{id}/{password}")
	@ResponseBody
	public String pathTestEmpGet(@PathVariable String id, @PathVariable(name = "password") String pwd) {
		return id;
	}
	
// @RequestBody 클라이언트가 json 형식 (Object, Array) 으로 보냈을때 처리하는 방법, 쿼리스트링 방식과 다름
// json은 날짜 처리 방식이 다르기 때문에 DateTimeFormat 관계 없이 - 형식으로 날짜 처리
//	http://localhost:8080/app/jsonTestEmp / body > raw > json
	@PostMapping("jsonTestEmp")
	@ResponseBody
	public EmpVO jsonTestEmpPost(@RequestBody EmpVO empVO) {
		empVO.setEmployeeId(9000);
		return empVO;
	}
}
