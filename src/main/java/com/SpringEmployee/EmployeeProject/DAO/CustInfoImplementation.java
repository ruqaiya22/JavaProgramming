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
	EntityManager entityManager;
	
	
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
	public CustInfo updateCustInfo(int Id, CustInfo updatedtheCustInfo) {
        Optional<CustInfo> optionalCustInfo = customerRepository.findById(Id);
        if (optionalCustInfo.isPresent()) {
        	CustInfo existingCustInfo = optionalCustInfo.get();
        	existingCustInfo.setId(updatedtheCustInfo.getId());
        	existingCustInfo.setFirstname(updatedtheCustInfo.getFirstname());
        	existingCustInfo.setLastname(updatedtheCustInfo.getLastname());
        	existingCustInfo.setMobile_no(updatedtheCustInfo.getMobile_no());
        	existingCustInfo.setEmail(updatedtheCustInfo.getEmail());
        	existingCustInfo.setDeparture_day(updatedtheCustInfo.getDeparture_day());
        	existingCustInfo.setDeparture_time(updatedtheCustInfo.getDeparture_time());
        	existingCustInfo.setNo_of_people(updatedtheCustInfo.getNo_of_people());
        	existingCustInfo.setFlight_rate(updatedtheCustInfo.getFlight_rate());
        	existingCustInfo.setCheck_in(updatedtheCustInfo.getCheck_in());
        	existingCustInfo.setCheck_out(updatedtheCustInfo.getCheck_out());
        	existingCustInfo.setNo_of_rooms(updatedtheCustInfo.getNo_of_rooms());
        	existingCustInfo.setHotel_rate(updatedtheCustInfo.getHotel_rate());
            return customerRepository.save(existingCustInfo);  // This will update the existing entity
        } else {
            // Handle the case where the Customer with the given ID is not found
            throw new RuntimeException("Customer not found with id: " + Id);
        }
    }
	


}
