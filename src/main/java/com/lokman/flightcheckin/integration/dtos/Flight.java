package com.lokman.flightcheckin.integration.dtos;

import java.sql.Timestamp;
import java.util.Date;
/**
 * 
 * @author lokman 4/2/2023
 *
 */
public class Flight {
	
	private Long id;
	private int flightNumber;
	private String operatingAirlines;
	private String departureCity;
	
	private String arrivalCity;
	
	private Date dateOfDeparture;
	
	private Timestamp estimatedDepatureTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepatureTime() {
		return estimatedDepatureTime;
	}

	public void setEstimatedDepatureTime(Timestamp estimatedDepatureTime) {
		this.estimatedDepatureTime = estimatedDepatureTime;
	}

}
