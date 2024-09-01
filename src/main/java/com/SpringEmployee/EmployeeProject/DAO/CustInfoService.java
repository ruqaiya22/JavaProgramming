package com.SpringEmployee.EmployeeProject.DAO;

import java.util.List;

import com.SpringEmployee.EmployeeProject.Module.CustInfo;


public interface CustInfoService {
	
	List <CustInfo> findAll();
	
	CustInfo findById(int theId);
	

	
	void save (CustInfo theCustInfo);
	
	void deleteById (int theId);

	CustInfo updateCustInfo(int Id, CustInfo theCustInfo);
}
