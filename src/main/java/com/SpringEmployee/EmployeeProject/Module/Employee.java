package com.SpringEmployee.EmployeeProject.Module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Employee1")

public class Employee {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Id")
	@Id
	private int Id;
	
	@Column(name="FullName")
	private String FullName;
	
	
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="Destination")
	private String Destination;
	
	@Column(name="Check_in")
	private String Check_in;
	
	@Column(name="Check_out")
	private String Check_out;
	
	
	@Column(name="No_of_People")
	private int No_of_People;
	
	@Column(name="Subject")
	private String Subject;
	
	@Column(name="Message")
	private String Message;
	
	public Employee(){
		
	}
	
	

	public Employee(String fullName, String email, String destination, String check_in, String check_out,
			int no_of_People, String subject, String message) {
	
		FullName = fullName;
		Email = email;
		Destination = destination;
		Check_in = check_in;
		Check_out = check_out;
		No_of_People = no_of_People;
		Subject = subject;
		Message = message;
	}
	



	public Employee(int id, String fullName, String email, String destination, String check_in, String check_out,
			int no_of_People, String subject, String message) {
	
		Id = id;
		FullName = fullName;
		Email = email;
		Destination = destination;
		Check_in = check_in;
		Check_out = check_out;
		No_of_People = no_of_People;
		Subject = subject;
		Message = message;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getCheck_in() {
		return Check_in;
	}

	public void setCheck_in(String check_in) {
		Check_in = check_in;
	}

	public String getCheck_out() {
		return Check_out;
	}

	public void setCheck_out(String check_out) {
		Check_out = check_out;
	}

	public int getNo_of_People() {
		return No_of_People;
	}

	public void setNo_of_People(int no_of_People) {
		No_of_People = no_of_People;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", FullName=" + FullName + ", Email=" + Email + ", Destination=" + Destination
				+ ", Check_in=" + Check_in + ", Check_out=" + Check_out + ", No_of_People=" + No_of_People
				+ ", Subject=" + Subject + ", Message=" + Message + "]";
	}
	
	
	
	
	
	
}

	