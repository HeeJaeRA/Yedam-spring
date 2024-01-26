package com.example.demo.emp.mapper;

import java.util.List;

import com.example.demo.emp.service.EmpVO;

public interface EmpMapper {
	 public List<EmpVO> getEmpList(EmpVO empVO);
}
