package com.yedam.java.emp.service;

import java.util.List;

public interface EmpService {
	public EmpVO getEmp(EmpVO vo);
	public List<EmpVO> getEmpList(EmpReqVO vo);
	public List<EmpVO> getEmpByDept(String[] dept);
	int insert(EmpVO vo);
}

