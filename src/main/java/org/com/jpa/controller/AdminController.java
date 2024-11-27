package org.com.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

	public AdminController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/api/admin/movies")
	@ResponseBody
	public String postMovie() {
		return "movie added";
	}
	
	@PutMapping("/api/admin/movies/{id}")
	@ResponseBody
	public String putMovie(@PathVariable("id") int id) {
		return "movie updated";
	}
	
	@DeleteMapping("/api/admin/movies/{id}")
	@ResponseBody
	public String deleteMovie() {
		return "movie deleted";
	}

}
