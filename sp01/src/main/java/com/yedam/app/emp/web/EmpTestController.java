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
	@ResponseBody // JSP가 아닌 데이터를 반환
	public EmpVO getEmpInfo(EmpVO empVO) {
		empVO.setEmployeeId(1000);
		return empVO;
	}
	
	@PostMapping("getTestEmp")
	@ResponseBody // JSP가 아닌 데이터를 반환
	public EmpVO getEmpInfoPost(EmpVO empVO) {
		empVO.setEmployeeId(9000);
		return empVO;
	}
	

	
	@GetMapping("paramTestEmp")
	@ResponseBody
	public Map<String, Object> 
				paramTestEmpGet(String name, Integer age){
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("age", age);
		return map;
	}
	
	@PostMapping("paramTestEmp")
	@ResponseBody
	public Map<String, Object> 
				paramTestEmpPost(@RequestParam String name, 
				@RequestParam(defaultValue = "20") Integer age){
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("age", age);
		return map;
	}
	
	@GetMapping("pathTestEmp/{id}/{password}")
	@ResponseBody
	public String pathTestEmpGet(@PathVariable String id,
					@PathVariable(name = "password") String pwd) {
		return id;
	}
	
	@PostMapping("jsonTestEmp")
	@ResponseBody
	public EmpVO jsonTestEmpPost(@RequestBody EmpVO empVO) {
		empVO.setEmployeeId(9000);
		return empVO;
	}

}
