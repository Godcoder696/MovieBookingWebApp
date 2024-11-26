package org.com.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bookings {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private int user_id;
	private int showtime_id;
	private int seats_booked;
	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bookings(int id, int user_id, int showtime_id, int seats_booked) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.showtime_id = showtime_id;
		this.seats_booked = seats_booked;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getShowtime_id() {
		return showtime_id;
	}
	public void setShowtime_id(int showtime_id) {
		this.showtime_id = showtime_id;
	}
	public int getSeats_booked() {
		return seats_booked;
	}
	public void setSeats_booked(int seats_booked) {
		this.seats_booked = seats_booked;
	}
	@Override
	public String toString() {
		return "Bookings [id=" + id + ", user_id=" + user_id + ", showtime_id=" + showtime_id + ", seats_booked="
				+ seats_booked + "]";
	}
}
