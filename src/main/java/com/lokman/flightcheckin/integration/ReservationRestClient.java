package com.lokman.flightcheckin.integration;

import com.lokman.flightcheckin.integration.dtos.Reservation;
import com.lokman.flightcheckin.integration.dtos.ReservationUpdateRequestDto;

/**
 * 
 * @author lokman 4/2/2023
 *
 */
public interface ReservationRestClient {

	Reservation findReservaton(Long id);
	
	Reservation updateReservation(ReservationUpdateRequestDto reservationUpdateRequestDto);
}
