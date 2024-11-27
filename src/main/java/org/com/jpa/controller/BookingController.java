package org.com.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookingController {

	public BookingController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/api/bookings")
	@ResponseBody
	public String bookTicket() {
		return "Ticket1";
	}
}
