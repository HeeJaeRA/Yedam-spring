package com.yedam.app.emp.service;

import java.util.List;
import java.util.Map;

public interface EmpService {
	
	// 전체 조회
	public List<EmpVO> getEmpAll();
	
	// 단건 조회
	public EmpVO getEmpInfo(EmpVO empVO);
	
	// 등록
	public int insertEmpInfo(EmpVO empVO);

	// 수정
	public Map<String, Object> updateEmpInfo(EmpVO empVO);
	
	// 삭제
	public boolean deleteEmpInfo(int empId);
	
}
