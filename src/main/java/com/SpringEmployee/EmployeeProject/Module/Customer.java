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
	
	
	public Customer() {
		
	}

	public Customer(String destination, int flag, String flight_no, int flight_rate, String hotel_name, int hotel_rate) {

		this.destination = destination;
		this.flag = flag;
		this.flight_no = flight_no;
		this.flight_rate = flight_rate;
		this.hotel_name = hotel_name;
		this.hotel_rate = hotel_rate;
	}

	
	public Customer(int id, String destination, int flag, String flight_no, int flight_rate, String hotel_name,
			int hotel_rate) {
	
		this.id = id;
		this.destination = destination;
		this.flag = flag;
		this.flight_no = flight_no;
		this.flight_rate = flight_rate;
		this.hotel_name = hotel_name;
		this.hotel_rate = hotel_rate;
	}
	
	
	@Override  //Indicates that the toString method is overridden from the object class
	public String toString() {
		return "Customer [id=" + id + ", destination=" + destination + ", flag=" + flag + ", flight_no=" + flight_no
				+ ", flight_rate=" + flight_rate + ", hotel_name=" + hotel_name + ", hotel_rate=" + hotel_rate + "]";
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
	

}
