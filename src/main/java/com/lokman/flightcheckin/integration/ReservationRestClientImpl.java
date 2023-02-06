package com.lokman.flightcheckin.integration;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.lokman.flightcheckin.integration.dtos.Reservation;
import com.lokman.flightcheckin.integration.dtos.ReservationUpdateRequestDto;

/**
 * 
 * @author 4/2/2023
 *
 */
@Component
public class ReservationRestClientImpl implements ReservationRestClient {
	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightReservationsystem/reservations/";
	@Override
	public Reservation findReservaton(Long id) {
		if (id == null)
			return null;
		try {
			RestTemplate template = new RestTemplate();
			URI uri;
			uri = new URI(RESERVATION_REST_URL + id);
			ResponseEntity<Reservation> responseEntity = template.getForEntity(uri, Reservation.class);
			return responseEntity.getBody();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequestDto reservationUpdateRequestDto) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Reservation> reservationEntity = restTemplate.postForEntity(RESERVATION_REST_URL,
				reservationUpdateRequestDto, Reservation.class);

		return reservationEntity.getBody();
	}

}
