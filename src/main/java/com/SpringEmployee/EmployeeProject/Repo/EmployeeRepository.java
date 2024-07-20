package com.SpringEmployee.EmployeeProject.Repo;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringEmployee.EmployeeProject.Module.Customer;


public interface EmployeeRepository extends JpaRepository <Customer, Integer>{

	
	java.util.List<Customer> findByDestinationAndFlag(String destination,int flag);

	java.util.List<Customer> findByDestinationAndId(String destination, int id);
	
	

}
