package com.yedam.app.emp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getEmpAll() {
		return empMapper.selectEmpList();
	}

	@Override
	public EmpVO getEmpInfo(EmpVO empVO) {
		return empMapper.selectEmpInfo(empVO);
	}

	@Override
	public int insertEmpInfo(EmpVO empVO) {
		int result = empMapper.insertEmpInfo(empVO);
		
		if (result == 1) {
			return empVO.getEmployeeId();
		} else {
			return -1;			
		}
	}

	@Override
	public Map<String, Object> updateEmpInfo(EmpVO empVO) {
		Map<String, Object> map = new HashMap<>();
		boolean isSuccessed = false;
		
		int result = empMapper.updateEmpInfo(empVO);
		
		if (result == 1) {
			isSuccessed = true;
		}
		
		map.put("result", isSuccessed);
		map.put("target", empVO);
		
		return map;
	}

	@Override
	public boolean deleteEmpInfo(int empId) {
		int result = empMapper.deleteEmpInfo(empId);
		
		return result == 1 ? true : false;
	}
	
}
