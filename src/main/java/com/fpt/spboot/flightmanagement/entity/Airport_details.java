package com.fpt.spboot.flightmanagement.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name="airport_details")
public class Airport_details {

	@Id
	@Column(name = "Airport_Id")
	private String airportId;

	@Column(name = "Airport_Name")
	private String airportName;

	@Column(name = "Airport_Area")
	private String airportArea;

	public Airport_details() {}

	public Airport_details(String airportId, String airportName, String airportArea) {
		super();
		this.airportId = airportId;
		this.airportName = airportName;
		this.airportArea = airportArea;
	}

	public String getAirportId() {
		return airportId;
	}

	public void setAirportId(String airportId) {
		this.airportId = airportId;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportArea() {
		return airportArea;
	}

	public void setAirportArea(String airportArea) {
		this.airportArea = airportArea;
	}
	
	
	
}