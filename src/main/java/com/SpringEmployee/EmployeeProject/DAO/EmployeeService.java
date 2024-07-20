package com.SpringEmployee.EmployeeProject.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.SpringEmployee.EmployeeProject.Module.Customer;
import com.SpringEmployee.EmployeeProject.Module.Employee;

public interface EmployeeService {
	
	List<Customer> findAll();

	Customer findById(int theId);
	
    List<Customer> findByDestinationAndFlag(String destination, int flag);
    
    List <Customer> findByDestinationAndId(String destination, int id);
    
	Customer save (Customer theCustomer);

	void deleteById (int theId);

}
