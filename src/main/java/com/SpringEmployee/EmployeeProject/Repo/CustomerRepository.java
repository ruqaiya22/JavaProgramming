package com.SpringEmployee.EmployeeProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringEmployee.EmployeeProject.Module.CustInfo;

public interface CustomerRepository extends JpaRepository<CustInfo, Integer> {
	
	

}
