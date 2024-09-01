package com.SpringEmployee.EmployeeProject.EmpController;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.SpringEmployee.EmployeeProject.DAO.CustInfoService;
import com.SpringEmployee.EmployeeProject.DAO.EmployeeService;
import com.SpringEmployee.EmployeeProject.Module.Billing;
import com.SpringEmployee.EmployeeProject.Module.CustInfo;
import com.SpringEmployee.EmployeeProject.Module.Customer;
import com.SpringEmployee.EmployeeProject.Module.Login;

import ch.qos.logback.core.model.conditional.ThenModel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Controller
public class CustomerController {
	
	private EmployeeService employeeService;
	
	private CustInfoService custInfoService;
	
	@Value("${login.username}")
	private String userName;
	
	@Value("${login.password}")
	private String password;
	
	Billing theBilling = new Billing();
	CustInfo theCustInfo = new CustInfo(); 
	
	public CustomerController(EmployeeService employeeService, CustInfoService custInfoService) {
		super();
		
		this.employeeService=employeeService;
		this.custInfoService=custInfoService;
		
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
		CustInfo custInfo = new CustInfo();
		//System.out.println("Flight rate = "+theCustomer.getFlight_rate());
		theModel.addAttribute("theCustInfo",custInfo);
		theModel.addAttribute("cust",theCustomer);
		
		custInfo.setFlight_rate(theCustomer.getFlight_rate());
		custInfo.setHotel_rate(theCustomer.getHotel_rate());
		
		//System.out.println(custInfo.getFlight_rate());
		
		return "contact-form";
	}
	
	
	@PostMapping("/save")
	public String saveCustomerInfo(Model theModel,@ModelAttribute("theCustInfo") CustInfo theCustInfo ) {
		
		//save the customers
		System.out.println("Data to save is : "+theCustInfo);
		
		custInfoService.save(theCustInfo);
		
		float flightBill= theCustInfo.getFlight_rate()*theCustInfo.getNo_of_people();

		LocalDate checkin = LocalDate.parse(theCustInfo.getCheck_in());
		LocalDate checkout = LocalDate.parse(theCustInfo.getCheck_out());
		long days = ChronoUnit.DAYS.between(checkin, checkout);
		
		float hotelBill = days * theCustInfo.getHotel_rate() * theCustInfo.getNo_of_rooms();
		float totalBill = flightBill+hotelBill;
		
	
		theBilling.setFlightBill(flightBill);
		theBilling.setHotelBill(hotelBill);
		theBilling.setDays(days);
		theBilling.setTotalBill(totalBill);
		
		theModel.addAttribute("theCustInfo",theCustInfo);
		theModel.addAttribute("bill",theBilling);
	
		return "Invoice";
	}
	
	@RequestMapping("/final")
	public String finalInvoice(@RequestParam("id") int id ,Model theModel) {
		

		CustInfo theCustomer = custInfoService.findById(id);
		//Billing theBilling = new Billing();
		theBilling.getFlightBill();
		theBilling.getHotelBill();
		theBilling.getTotalBill();
		
		theModel.addAttribute("theCustInfo",theCustomer);
		theModel.addAttribute("bill",theBilling);
		System.out.println("Invoice:::::::::::::::::::::::");
		System.out.println(theCustInfo);
	   System.out.println(theBilling);
		return "finalInvoice";
	}
	
	
	@RequestMapping("/showLogin")
	
	public String showLogin(Model theModel) {
		theModel.addAttribute("login" ,new Login());
		return "loginForm";
	}
	
	@RequestMapping("/submitLogin")
	
	public String showList(@ModelAttribute("login") Login login, Model theModel) {
		
		System.out.println(login);
		System.out.println("username : "+userName + " Password:"+password);
		if(userName.equals(login.getUsername())) {
		
			List<CustInfo> customer=custInfoService.findAll();
			theModel.addAttribute("listing",customer);
			
			return "list";
		
		
		}
		else {
			return "loginForm";
		}
	}
	
	@RequestMapping("/custList")
	
	public String listDetails(Model theModel) {

		List<CustInfo> customer=custInfoService.findAll();
		theModel.addAttribute("listing",customer);
		
		return "list";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("id") int  theId) {
		// delete the customer
		custInfoService.deleteById(theId);

		return "redirect:/custList";   //custList name of endpoint which displays list
		

	}
	
	
	@RequestMapping("/updateData")
    public String showUpdateForm(@RequestParam("id") int Id, Model theModel) {
		CustInfo theCustInfo = custInfoService.findById(Id);
        theModel.addAttribute("MyBooking", theCustInfo);
        return "updateForm"; // Return the view name where the form is shown
    }

    @RequestMapping("/saveUpdate")
    public String updatedtheCustInfo(@ModelAttribute("MyBooking") CustInfo theCustInfo) {
    	custInfoService.updateCustInfo(theCustInfo.getId(), theCustInfo);
        return "redirect:/custList"; // Redirect to the list page after update
    }
    

}
	
	
	
	

