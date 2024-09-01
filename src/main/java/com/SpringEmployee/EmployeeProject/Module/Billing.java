package com.SpringEmployee.EmployeeProject.Module;

public class Billing {
	
	private long days;
	
	private float flightBill;
	
	private float hotelBill;
	
	private float totalBill;

	
	public float getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(float totalBill) {
		this.totalBill = totalBill;
	}

	public long getDays() {
		return days;
	}

	public void setDays(long days) {
		this.days = days;
	}

	public float getFlightBill() {
		return flightBill;
	}

	public void setFlightBill(float flightBill) {
		this.flightBill = flightBill;
	}

	public float getHotelBill() {
		return hotelBill;
	}

	public void setHotelBill(float hotelBill) {
		this.hotelBill = hotelBill;
	}
	
	

}
