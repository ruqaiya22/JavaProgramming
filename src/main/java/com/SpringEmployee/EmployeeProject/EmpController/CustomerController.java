package com.SpringEmployee.EmployeeProject.EmpController;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringEmployee.EmployeeProject.DAO.EmployeeService;
import com.SpringEmployee.EmployeeProject.Module.Customer;


@Controller
public class CustomerController {
	
	private EmployeeService employeeService;
	
	public CustomerController(EmployeeService employeeService) {
		super();
		
		this.employeeService=employeeService;
		
	}
	
	
	@RequestMapping("/")
	
	public String showIndex(Model theModel) {
		theModel.addAttribute("Packages", new Customer());//Packages is name of attribute it can be anything
		
		return "EmployeeForm";
	}
	

	@RequestMapping("/listing")
	public String showList(Model theModel, @ModelAttribute("Packages") Customer c ) {
		
		//System.out.println("in listings"+customer.getDestination());
	
		List<Customer> customer=employeeService.findByDestinationAndFlag(c.getDestination(),1);
		theModel.addAttribute("listing",customer);
		return "list-customer";
	}
	
	@RequestMapping("/return")
	public String displayList(@ModelAttribute("Packages") Customer customer) {
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/booking")
	public String bookPackage(@RequestParam("id") int  id, Model theModel) {
		Customer theCustomer = employeeService.findById(id);
		System.out.println("Flight rate = "+theCustomer.getFlight_rate());
		theModel.addAttribute("cust",theCustomer);
		return "contact-form";
	}
	
	@RequestMapping("/booking_confirm")
	
	public String custInfo(@ModelAttribute("Package") Customer c) {
		System.out.println(c.getFlight_rate());
		return "customer-details";
	}
	
	
	
	@RequestMapping("/listingId")
	
	public String customerListId(Model theModel) {
		
		Customer theCustomers = employeeService.findById(1);
		
		theModel.addAttribute("Packages", theCustomers);
		
		return "list-customer";
				
	}
	
	@RequestMapping("/save")
	public String saveCustomer(@ModelAttribute("cust") Customer theCustomers) {
		
		//save the customers
		
		employeeService.save(theCustomers);
		
		return "list-customer";
		
		
	}
	
	
	
	

}
