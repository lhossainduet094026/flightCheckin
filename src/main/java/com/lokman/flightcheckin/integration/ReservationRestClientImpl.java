package com.lokman.flightcheckin.integration;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lokman.flightcheckin.integration.dtos.Reservation;
import com.lokman.flightcheckin.integration.dtos.ReservationUpdateRequestDto;

/**
 * 
 * @author 4/2/2023
 *
 */
@Service
public class ReservationRestClientImpl implements ReservationRestClient {

	@Override
	public Reservation findReservaton(Long id) {
		RestTemplate template = new RestTemplate();
		URI uri;
		try {
			uri = new URI("http://localhost:8080/flightReservationsystem/reservations/"+ id);
			ResponseEntity<Reservation> responseEntity = template.getForEntity(uri, Reservation.class);
			return responseEntity.getBody();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequestDto reservationUpdateRequestDto) {
		return null;
	}

}
