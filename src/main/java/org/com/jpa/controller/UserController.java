package org.com.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/api/login")
	@ResponseBody
	public String LoginUser() {
		return "Loging User";	
	}
	
	@PostMapping("/api/register")
	@ResponseBody
	public String ResgisterUser() {
		return "Registering User";
	}
}
