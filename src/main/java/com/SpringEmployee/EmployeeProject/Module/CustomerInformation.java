package com.SpringEmployee.EmployeeProject.Module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CustomerInfo")
public class CustomerInformation {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="mobile_no")
	private int mobile_no;
	
	@Column(name="email")
	private String email;
	
	@Column(name="flight_no")
	private String flight_no;
	
	@Column(name="no_of_people")
	private int no_of_people;
	
	
	@Column(name="flight_bill")
	private int flight_bill;
	
	@Column(name="hotel_name")
	private String hotel_name;
	
	
	@Column(name="no_of_rooms")
	private int no_of_rooms;
	
	
	@Column(name="hotel_bill")
	private int hotel_bill;
	
	
	public CustomerInformation() {
		
	}
	

	public CustomerInformation(String destination, String firstname, String lastname, int mobile_no, String email,
			String flight_no, int no_of_people, int flight_bill, String hotel_name, int no_of_rooms, int hotel_bill) {
		super();
		this.destination = destination;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile_no = mobile_no;
		this.email = email;
		this.flight_no = flight_no;
		this.no_of_people = no_of_people;
		this.flight_bill = flight_bill;
		this.hotel_name = hotel_name;
		this.no_of_rooms = no_of_rooms;
		this.hotel_bill = hotel_bill;
	}


	public CustomerInformation(int id, String destination, String firstname, String lastname, int mobile_no,
			String email, String flight_no, int no_of_people, int flight_bill, String hotel_name, int no_of_rooms,
			int hotel_bill) {
		super();
		this.id = id;
		this.destination = destination;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile_no = mobile_no;
		this.email = email;
		this.flight_no = flight_no;
		this.no_of_people = no_of_people;
		this.flight_bill = flight_bill;
		this.hotel_name = hotel_name;
		this.no_of_rooms = no_of_rooms;
		this.hotel_bill = hotel_bill;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFlight_no() {
		return flight_no;
	}


	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}


	public int getNo_of_people() {
		return no_of_people;
	}


	public void setNo_of_people(int no_of_people) {
		this.no_of_people = no_of_people;
	}


	public int getFlight_bill() {
		return flight_bill;
	}


	public void setFlight_bill(int flight_bill) {
		this.flight_bill = flight_bill;
	}


	public String getHotel_name() {
		return hotel_name;
	}


	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}


	public int getNo_of_rooms() {
		return no_of_rooms;
	}


	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}


	public int getHotel_bill() {
		return hotel_bill;
	}


	public void setHotel_bill(int hotel_bill) {
		this.hotel_bill = hotel_bill;
	}


	@Override
	public String toString() {
		return "CustomerInformation [id=" + id + ", destination=" + destination + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", mobile_no=" + mobile_no + ", email=" + email + ", flight_no="
				+ flight_no + ", no_of_people=" + no_of_people + ", flight_bill=" + flight_bill + ", hotel_name="
				+ hotel_name + ", no_of_rooms=" + no_of_rooms + ", hotel_bill=" + hotel_bill + "]";
	}


	
	
	
	

}
