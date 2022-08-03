package com.fpt.spboot.flightmanagement.entity;

import java.lang.reflect.Member;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="booking_table")
public class Booking_table {

	@Id
	@Column(name = "Booking_Id")
	private String bookingId;

	@Column(name = "Booking_Date")
	private Date bookingDate;

	@OneToOne
	@JoinColumn(name = "Member_Name")
	private Member_table member;

	@OneToOne
	@JoinColumn(name = "Schedule_Id")
	private Schedule_details schedule;

	@Column(name = "Booking_Status")
	private String bookingStatus;

	@OneToMany(mappedBy="bookingDetails")
	private List<Passengers> passengers;
	

	public Booking_table() {}


	public Booking_table(String bookingId, Date bookingDate, Member_table member, Schedule_details schedule,
			String bookingStatus, List<Passengers> passengers) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.member = member;
		this.schedule = schedule;
		this.bookingStatus = bookingStatus;
		this.passengers = passengers;
	}


	public String getBookingId() {
		return bookingId;
	}


	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}


	public Date getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public Member_table getMember() {
		return member;
	}


	public void setMember(Member_table member) {
		this.member = member;
	}


	public Schedule_details getSchedule() {
		return schedule;
	}


	public void setSchedule(Schedule_details schedule) {
		this.schedule = schedule;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public List<Passengers> getPassengers() {
		return passengers;
	}


	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}
	
	

}