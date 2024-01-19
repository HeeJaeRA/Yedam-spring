package com.yedam.java.emp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpReqVO;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpMapper mapper;

	@Override
	public EmpVO getEmp(EmpVO vo) {
		return mapper.getEmp(vo);
	}

	@Override
	public List<EmpVO> getEmpList(EmpReqVO vo) {
		return mapper.getEmpList(vo);
	}

	@Override
	public List<EmpVO> getEmpByDept(String[] dept) {
		return mapper.getEmpByDept(dept);
	}

	@Override
	public int insert(EmpVO vo) {
		return mapper.insert(vo);
	}

}
