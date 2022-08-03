package com.fpt.spboot.flightmanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passengers {

	@Id
	@Column(name = "Passenger_Name")
	private String passengerName;

	@Column(name = "Passenger_address")
	private String passengerAddress;

	@Column(name = "Phone_Number")
	private double phoneNumber;

	@Column(name = "Email")
	private String email;

	@Column(name = "Id_Proof")
	private double idProof;
	
	@ManyToOne
	@JoinColumn(name = "Booking_Id")
	private Booking_table bookingDetails;
	

	public Passengers() {}


	public Passengers(String passengerName, String passengerAddress, double phoneNumber, String email, double idProof,
			Booking_table bookingDetails) {
		super();
		this.passengerName = passengerName;
		this.passengerAddress = passengerAddress;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.idProof = idProof;
		this.bookingDetails = bookingDetails;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getPassengerAddress() {
		return passengerAddress;
	}


	public void setPassengerAddress(String passengerAddress) {
		this.passengerAddress = passengerAddress;
	}


	public double getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getIdProof() {
		return idProof;
	}


	public void setIdProof(double idProof) {
		this.idProof = idProof;
	}


	public Booking_table getBookingDetails() {
		return bookingDetails;
	}


	public void setBookingDetails(Booking_table bookingDetails) {
		this.bookingDetails = bookingDetails;
	}


	

}
