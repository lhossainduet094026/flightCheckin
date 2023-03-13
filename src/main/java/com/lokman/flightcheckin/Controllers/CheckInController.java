package com.lokman.flightcheckin.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lokman.flightcheckin.integration.ReservationRestClient;
import com.lokman.flightcheckin.integration.dtos.Reservation;
/**
 * 
 * @author lokman 6/2/2023
 *
 */
@Controller
public class CheckInController {

	@Autowired
	private ReservationRestClient restClient;
	
	@RequestMapping("/showStartCheckin")
	public String showCheckin() {
		return "startCheckIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckin(@RequestParam("reservationId") Long reservationId, ModelMap map) {
		
		Reservation reservaton = restClient.findReservaton(reservationId);
		
		map.addAttribute("reservation", reservaton);
		
		return "displayReservationDetails";
	}
}
