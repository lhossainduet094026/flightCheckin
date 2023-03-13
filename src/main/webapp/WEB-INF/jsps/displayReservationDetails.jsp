<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation details</title>
</head>
<body>
	<h2>Flight details</h2>
	Airlines:${reservation.flight.operatingAirlines}<br/> 
	Flight No:${reservation.flight.flightNumber}<br/> 
	Departure city:${reservation.flight.departureCity}<br/> 
	Arrival city:${reservation.flight.arrivalCity}<br/> 
	Date of departure:${reservation.flight.dateOfDeparture}<br/>
	

	<h2>Passenger Details</h2>
	First name: ${reservation.passenger.firstName}<br/>
	Lastname:${reservation.passenger.lastName}<br/> 
	Email:${reservation.passenger.email}<br/> 
	Phone: ${reservation.passenger.phone}<br/>

	<form action="completeCheckIn" method="post">
		Enter the number of bags you want to check in <input type="text" name="numberOfBags" /> 
		<input type="hidden" value=${reservation.id} name="reservationId"/>
		<input type="submit" value="checkIn" />
	</form>
</body>
</html>