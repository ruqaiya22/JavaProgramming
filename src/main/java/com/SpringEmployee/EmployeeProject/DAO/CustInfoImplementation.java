package com.SpringEmployee.EmployeeProject.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringEmployee.EmployeeProject.Module.CustInfo;
import com.SpringEmployee.EmployeeProject.Repo.CustomerRepository;


import jakarta.persistence.EntityManager;

@Service
public class CustInfoImplementation implements CustInfoService{
	
	private CustomerRepository customerRepository;
	EntityManager entityManager;    //This line declares an instance of EntityManager named entityManager.
									//The EntityManager is used to perform CRUD (Create, Read, Update, Delete) operations on entities.
	
	
	@Autowired
	public CustInfoImplementation (CustomerRepository theCustomerRepository, EntityManager entityManager) {
		customerRepository = theCustomerRepository;
		entityManager= this.entityManager;
	}

	@Override
	public List<CustInfo> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void save(CustInfo theCustInfo) {
		// TODO Auto-generated method stub
		customerRepository.save(theCustInfo);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(theId);
	}

	@Override
	public CustInfo findById(int theId) {
		// TODO Auto-generated method stub
		Optional <CustInfo> result =customerRepository.findById(theId);
		
		CustInfo theCustInfo= null;
		
		if (result.isPresent()) {
			theCustInfo = result.get();
		}
		
		else {
			// we didn't find the customer
			throw new RuntimeException("Did not find customer id - " + theId);
		}
		
		return theCustInfo;
	}
	
	
	@Override
	public CustInfo updateCustInfo(int id, CustInfo updatedCustInfo) {
	    Optional<CustInfo> optionalCustInfo = customerRepository.findById(id);
	    if (optionalCustInfo.isPresent()) {
	        CustInfo existingCustInfo = optionalCustInfo.get();
	        // Update fields
	        existingCustInfo.setFirstname(updatedCustInfo.getFirstname());
	        existingCustInfo.setLastname(updatedCustInfo.getLastname());
	        existingCustInfo.setMobile_no(updatedCustInfo.getMobile_no());
	        existingCustInfo.setEmail(updatedCustInfo.getEmail());
	        existingCustInfo.setDeparture_day(updatedCustInfo.getDeparture_day());
	        existingCustInfo.setDeparture_time(updatedCustInfo.getDeparture_time());
	        existingCustInfo.setNo_of_people(updatedCustInfo.getNo_of_people());
	        existingCustInfo.setFlight_rate(updatedCustInfo.getFlight_rate());
	        existingCustInfo.setCheck_in(updatedCustInfo.getCheck_in());
	        existingCustInfo.setCheck_out(updatedCustInfo.getCheck_out());
	        existingCustInfo.setNo_of_rooms(updatedCustInfo.getNo_of_rooms());
	        existingCustInfo.setHotel_rate(updatedCustInfo.getHotel_rate());
	        return customerRepository.save(existingCustInfo);
	    } else {
	        throw new RuntimeException("Customer not found with ID: " + id);
	    }
	}
	
    }
	



