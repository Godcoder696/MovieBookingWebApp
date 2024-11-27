package org.com.jpa.config;

import java.util.Collection;
import java.util.List;

import org.com.jpa.entities.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails{
	
	private Users user;

	public CustomUserDetails(Users user) {
		super();
		this.user = user;
	}

	public CustomUserDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority simpleGrantedAuthority= new SimpleGrantedAuthority(user.getRole());  
		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		
		return user.getUsername();
	}

}
