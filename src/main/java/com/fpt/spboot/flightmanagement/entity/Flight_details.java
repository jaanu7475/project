package com.fpt.spboot.flightmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name="flight_details")
public class Flight_details {

	@Id
	@JoinColumn(name = "Flight_Id")
	private String flightId;

	@Column(name = "Flight_Name")
	private String flightName;

	@Column(name = "Number_Rows")
	private int numberRows;

	@Column(name = "Number_Columns")
	private int numberColumns;

	public Flight_details () {}

	public Flight_details (String flightId, String flightName, int numberRows, int numberColumns) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.numberRows = numberRows;
		this.numberColumns = numberColumns;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getNumberRows() {
		return numberRows;
	}

	public void setNumberRows(int numberRows) {
		this.numberRows = numberRows;
	}

	public int getNumberColumns() {
		return numberColumns;
	}

	public void setNumberColumns(int numberColumns) {
		this.numberColumns = numberColumns;
	}

	
}
