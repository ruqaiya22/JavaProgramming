package com.SpringEmployee.EmployeeProject.Module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import jakarta.persistence.Version;


@Entity  //An entity represents a table stored in a database.
@Table(name="Packages")
@SecondaryTable(name="CustomerInfo", pkJoinColumns= @PrimaryKeyJoinColumn(name="id", referencedColumnName= "id" ))
public class Customer {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	
	@Column(name="id")
	private int id;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="flag")
	private int flag;
	
	@Column(name="flight_no")
	private String flight_no;
	
	@Column(name="flight_rate")
	private int flight_rate;
	
	@Column(name="hotel_name")
	private String hotel_name;
	
	@Column(name="hotel_rate")
	private int hotel_rate;
	
	//Second table fields
	
	@Column(table="CustomerInfo")
	private String firstname;
	
	@Column(table="CustomerInfo")
	private String lastname;
	
	@Column(table="CustomerInfo")
	private long mobile_no;
	
	@Column(table="CustomerInfo")
	private String email;
	
	@Column(table="CustomerInfo")
	private int no_of_people;
	
	@Column(table="CustomerInfo")
	private int no_of_rooms;
	
//	private Integer num;
//
//	  public void setNum(Integer i) {
//	    this.num = i;
//	  }
//
//	  public int getNum() {
//	    return this.num;
//	  }

public Customer() {
		
	}

//	public Customer(String destination, int flag, String flight_no, int flight_rate, String hotel_name, int hotel_rate) {
//
//		this.destination = destination;
//		this.flag = flag;
//		this.flight_no = flight_no;
//		this.flight_rate = flight_rate;
//		this.hotel_name = hotel_name;
//		this.hotel_rate = hotel_rate;
//	}
//
//	
//	public Customer(int id, String destination, int flag, String flight_no, int flight_rate, String hotel_name,
//			int hotel_rate) {
//	
//		this.id = id;
//		this.destination = destination;
//		this.flag = flag;
//		this.flight_no = flight_no;
//		this.flight_rate = flight_rate;
//		this.hotel_name = hotel_name;
//		this.hotel_rate = hotel_rate;
//	}
	
	public Customer(int id, String destination, int flag, String flight_no, int flight_rate, String hotel_name,
			int hotel_rate, String firstname, String lastname, long mobile_no, String email, int no_of_people,
			int no_of_rooms) {
	
		this.id = id;
		this.destination = destination;
		this.flag = flag;
		this.flight_no = flight_no;
		this.flight_rate = flight_rate;
		this.hotel_name = hotel_name;
		this.hotel_rate = hotel_rate;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile_no = mobile_no;
		this.email = email;
		this.no_of_people = no_of_people;
		this.no_of_rooms = no_of_rooms;
	}
	
	

	

	public Customer(String destination, int flag, String flight_no, int flight_rate, String hotel_name, int hotel_rate,
			String firstname, String lastname, long mobile_no, String email, int no_of_people, int no_of_rooms) {
		this.destination = destination;
		this.flag = flag;
		this.flight_no = flight_no;
		this.flight_rate = flight_rate;
		this.hotel_name = hotel_name;
		this.hotel_rate = hotel_rate;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile_no = mobile_no;
		this.email = email;
		this.no_of_people = no_of_people;
		this.no_of_rooms = no_of_rooms;
	}

//	@Override
//	public String toString() {
//		return "Customer [id=" + id + ", destination=" + destination + ", flag=" + flag + ", flight_no=" + flight_no
//				+ ", flight_rate=" + flight_rate + ", hotel_name=" + hotel_name + ", hotel_rate=" + hotel_rate + "]";
//	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", destination=" + destination + ", flag=" + flag + ", flight_no=" + flight_no
				+ ", flight_rate=" + flight_rate + ", hotel_name=" + hotel_name + ", hotel_rate=" + hotel_rate
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", mobile_no=" + mobile_no + ", email="
				+ email + ", no_of_people=" + no_of_people + ", no_of_rooms=" + no_of_rooms + "]";
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

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}

	public int getFlight_rate() {
		return flight_rate;
	}

	public void setFlight_rate(int flight_rate) {
		this.flight_rate = flight_rate;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public int getHotel_rate() {
		return hotel_rate;
	}

	public void setHotel_rate(int hotel_rate) {
		this.hotel_rate = hotel_rate;
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

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNo_of_people() {
		return no_of_people;
	}

	public void setNo_of_people(int no_of_people) {
		this.no_of_people = no_of_people;
	}

	public int getNo_of_rooms() {
		return no_of_rooms;
	}

	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}

	
	

	

}
