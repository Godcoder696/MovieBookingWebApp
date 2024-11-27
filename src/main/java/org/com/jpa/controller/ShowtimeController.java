package org.com.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShowtimeController {

	public ShowtimeController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/api/movies/{id}/showtimes")
	@ResponseBody
	public String getShowtime(@PathVariable("id") int id) {
		return "Movie_"+id+"_Showtiming";
	}
}
