package org.com.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {

	public MovieController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/api/movies")
	@ResponseBody
	public List<String> getMovies() {
		List<String> list= new ArrayList<>();
		list.add("Movies");
		list.add("Movies1");
		return list;
	}
	
	@GetMapping("/api/movies/{id}")
	@ResponseBody
	public String getMovie(@PathVariable("id") int id) {
		return "Movie_"+id;
	}
}
