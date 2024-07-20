package com.SpringEmployee.EmployeeProject.DAO;

import java.util.List;

import javax.management.RuntimeErrorException;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringEmployee.EmployeeProject.Module.Customer;
import com.SpringEmployee.EmployeeProject.Module.Employee;
import com.SpringEmployee.EmployeeProject.Repo.EmployeeRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	 private EmployeeRepository employeeRepository;
	 EntityManager entityManager;

	    @Autowired
	    public EmployeeServiceImplementation(EmployeeRepository theEmployeeRepository, EntityManager entityManager) {
	        employeeRepository = theEmployeeRepository;
	        entityManager=this.entityManager;
	    }

	    @Override
	    public List<Customer> findAll() {
	    	
	    	
	        return employeeRepository.findAll();
	    }

	    @Override
	    public Customer findById(int theId) {
	        Optional<Customer> result = employeeRepository.findById(theId);

	        Customer theCustomer = null;

	        if (result.isPresent()) {
	            theCustomer = result.get();
	        }
	        else {
	            // we didn't find the employee
	            throw new RuntimeException("Did not find employee id - " + theId);
	        }
	    

	        return theCustomer;
	    }

	    @Override
	    public Customer save(Customer theCustomer) {
	        return employeeRepository.save(theCustomer);
	    }

	    @Override
	    public void deleteById(int theId) {
	        employeeRepository.deleteById(theId);
	    }

		@Override
		public List<Customer> findByDestinationAndFlag(String destination,int flag) {
			return employeeRepository.findByDestinationAndFlag(destination, flag);
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Customer> findByDestinationAndId(String destination, int id) {
			// TODO Auto-generated method stub
			return employeeRepository.findByDestinationAndId(destination, id);
		}

	
	    
	   


}
