package com.SpringEmployee.EmployeeProject.EmpController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringEmployee.EmployeeProject.DAO.EmployeeService;


@Controller
//@RequestMapping("/api")
public class EmployeeController {

	
	/*private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService=theEmployeeService;
	}
	
	//Expose "/employees" and return a list of employees
	
	@GetMapping("/employees")
	public List <Employee> findAll(){
		return employeeService.findAll();
	}
	
	
	//Add mapping for GET /employees/{Id}
	
	@GetMapping("/employees/{Id}")
	
	public Employee getEmployee(@PathVariable int Id) {
		
		Employee theEmployee= employeeService.findById(Id);
		
		if(theEmployee==null) {
			throw new RuntimeException("Id not found: "+ Id);
		}
		
		else {
			return theEmployee;
		}
		
	}
	
	
	//Add mapping for POST /employees -add new employee
	
	@PostMapping("/employees")
	
	public Employee addEmployee(@RequestBody Employee theEmployee) {
	// also just in case they pass an id in JSON ... set id to 0
    // this is to force a save of new item ... instead of update
	
	theEmployee.setId(0);
	
	Employee dbEmployee = employeeService.save(theEmployee);
	
	return dbEmployee;
	}
	
	
	//Add mapping for PUT /employees - update existing employee
	@PutMapping("/employees")
	
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		Employee dbEmployee= employeeService.save(theEmployee);
		
		return dbEmployee;
		
	}
	
	//Add mapping for DELETE /employees/{Id} - delete employee
	
	@DeleteMapping("/employees/{Id}")
	
	public String deleteEmployee(@PathVariable int Id) {
		
		Employee theEmployee= employeeService.findById(Id);
		
		//Throw exception if null
		
		
		if(tempEmployee == null) {
			 
			throw new RuntimeException("Id not found: "+ Id);
			
		}
		
		employeeService.deleteById(Id);
		
		return "Deleted Id: "+ Id;
		
	}*/
	
	
	//Refer below code
	/*private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@RequestMapping("/")
	
	public String showTable(Model theModel) {
		theModel.addAttribute("Employee2", new Employee());  //Employee1 is table name and Employee is the class created
		return "EmployeeForm";
		
		
	}
	
	@RequestMapping("/list")
	
	public String showList(Model theModel) {
		 
		
		List<Employee> theEmployees = employeeService.findAll();
		
		theModel.addAttribute("Employee2", theEmployees);
		
		return "List-Employee";
		
	}
	  @GetMapping("/listId")
	    public String listEmployeesById(Model theModel) {

	        // get the employees from db
	        Employee theEmployees = employeeService.findById(2);

	        // add to the spring model
	        theModel.addAttribute("Employee1", theEmployees);
System.out.println(theEmployees);
	        return "List-Employee";
	    }*/
		
	
	
}
