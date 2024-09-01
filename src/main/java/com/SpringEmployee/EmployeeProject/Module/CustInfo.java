package com.SpringEmployee.EmployeeProject.Module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Info")


public class CustInfo {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="mobile_no")
	private long mobile_no;
	
	@Column(name="email")
	private String email;
	
	@Column(name="departure_day")
	private String departure_day;
	
	@Column(name="departure_time")
	private String departure_time;
	
	@Column(name="no_of_people")
	private int no_of_people;
	
	@Column(name="flight_rate")
	private int flight_rate;
	
	@Column(name="check_in")
	private String check_in;
	
	@Column(name="check_out")
	private String check_out;
	
	@Column(name="no_of_rooms")
	private int no_of_rooms;
	
	@Column(name="hotel_rate")
	private int hotel_rate;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDeparture_day() {
		return departure_day;
	}

	public void setDeparture_day(String departure_day) {
		this.departure_day = departure_day;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public int getNo_of_people() {
		return no_of_people;
	}

	public void setNo_of_people(int no_of_people) {
		this.no_of_people = no_of_people;
	}

	public int getFlight_rate() {
		return flight_rate;
	}

	public void setFlight_rate(int flight_rate) {
		this.flight_rate = flight_rate;
	}

	public String getCheck_in() {
		return check_in;
	}

	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}

	public String getCheck_out() {
		return check_out;
	}

	public void setCheck_out(String check_out) {
		this.check_out = check_out;
	}

	public int getNo_of_rooms() {
		return no_of_rooms;
	}

	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}

	public int getHotel_rate() {
		return hotel_rate;
	}

	public void setHotel_rate(int hotel_rate) {
		this.hotel_rate = hotel_rate;
	}
	
	
	public CustInfo() {
		
	}

	public CustInfo(String firstname, String lastname, long mobile_no, String email, String departure_day,
			String departure_time, int no_of_people, int flight_rate, String check_in, String check_out,
			int no_of_rooms, int hotel_rate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile_no = mobile_no;
		this.email = email;
		this.departure_day = departure_day;
		this.departure_time = departure_time;
		this.no_of_people = no_of_people;
		this.flight_rate = flight_rate;
		this.check_in = check_in;
		this.check_out = check_out;
		this.no_of_rooms = no_of_rooms;
		this.hotel_rate = hotel_rate;
	}

	public CustInfo(int id, String firstname, String lastname, long mobile_no, String email, String departure_day,
			String departure_time, int no_of_people, int flight_rate, String check_in, String check_out,
			int no_of_rooms, int hotel_rate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile_no = mobile_no;
		this.email = email;
		this.departure_day = departure_day;
		this.departure_time = departure_time;
		this.no_of_people = no_of_people;
		this.flight_rate = flight_rate;
		this.check_in = check_in;
		this.check_out = check_out;
		this.no_of_rooms = no_of_rooms;
		this.hotel_rate = hotel_rate;
	}

	@Override
	public String toString() {
		return "CustInfo [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mobile_no=" + mobile_no
				+ ", email=" + email + ", departure_day=" + departure_day + ", departure_time=" + departure_time
				+ ", no_of_people=" + no_of_people + ", flight_rate=" + flight_rate + ", check_in=" + check_in
				+ ", check_out=" + check_out + ", no_of_rooms=" + no_of_rooms + ", hotel_rate=" + hotel_rate + "]";
	}
	
	
	
	
}


	