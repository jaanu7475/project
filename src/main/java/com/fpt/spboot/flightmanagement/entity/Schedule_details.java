package com.fpt.spboot.flightmanagement.entity;

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
//@Table(name="schedule_details")
public class Schedule_details {

	@Id
	@Column(name = "schedule_Id")
	private String scheduleId;

	@OneToOne
	@JoinColumn(name = "Airport_Id")
	Airport_details airportDetails;

	@Column(name = "Sch_Arrival")
	private String scheduleArrival;

	@Column(name = "Sch_Departure")
	private String scheduleDeparture;

	@Column(name = "Sch_From")
	private String scheduleFrom;

	@Column(name = "Sch_To")
	private String scheduleTo;

	@Column(name = "Sch_Date")
	private Date scheduleDate;

	@Column(name = "Sch_Duration")
	private String scheduleDuration;

	@Column(name = "Fare")
	private int fare;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<Flight_details > flightdetails;

	public Schedule_details() {
	}

	public Schedule_details(String scheduleId, Airport_details airportDetails, String scheduleArrival, String scheduleDeparture,
			String scheduleFrom, String scheduleTo, Date scheduleDate, String scheduleDuration, int fare,
			List<Flight_details > flightdetails) {
		super();
		this.scheduleId = scheduleId;
		this.airportDetails = airportDetails;
		this.scheduleArrival = scheduleArrival;
		this.scheduleDeparture = scheduleDeparture;
		this.scheduleFrom = scheduleFrom;
		this.scheduleTo = scheduleTo;
		this.scheduleDate = scheduleDate;
		this.scheduleDuration = scheduleDuration;
		this.fare = fare;
		this.flightdetails = flightdetails;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Airport_details getAirportDetails() {
		return airportDetails;
	}

	public void setAirportDetails(Airport_details airportDetails) {
		this.airportDetails = airportDetails;
	}

	public String getScheduleArrival() {
		return scheduleArrival;
	}

	public void setScheduleArrival(String scheduleArrival) {
		this.scheduleArrival = scheduleArrival;
	}

	public String getScheduleDeparture() {
		return scheduleDeparture;
	}

	public void setScheduleDeparture(String scheduleDeparture) {
		this.scheduleDeparture = scheduleDeparture;
	}

	public String getScheduleFrom() {
		return scheduleFrom;
	}

	public void setScheduleFrom(String scheduleFrom) {
		this.scheduleFrom = scheduleFrom;
	}

	public String getScheduleTo() {
		return scheduleTo;
	}

	public void setScheduleTo(String scheduleTo) {
		this.scheduleTo = scheduleTo;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getScheduleDuration() {
		return scheduleDuration;
	}

	public void setScheduleDuration(String scheduleDuration) {
		this.scheduleDuration = scheduleDuration;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public List<Flight_details > getFlightdetails() {
		return flightdetails;
	}

	public void setFlightdetails(List<Flight_details > flightdetails) {
		this.flightdetails = flightdetails;
	}

}
