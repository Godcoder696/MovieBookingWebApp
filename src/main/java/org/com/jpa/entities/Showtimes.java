package org.com.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Showtimes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int movie_id;
	private String show_time;
	private String available_seats;
	private int bookings;
	
	public Showtimes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Showtimes(int id, int movie_id, String show_time, String available_seats, int bookings) {
		super();
		this.id = id;
		this.movie_id = movie_id;
		this.show_time = show_time;
		this.available_seats = available_seats;
		this.bookings = bookings;
	}


	@Override
	public String toString() {
		return "Showtimes [id=" + id + ", movie_id=" + movie_id + ", show_time=" + show_time + ", available_seats="
				+ available_seats + ", bookings=" + bookings + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getShow_time() {
		return show_time;
	}

	public void setShow_time(String show_time) {
		this.show_time = show_time;
	}

	public String getAvailable_seats() {
		return available_seats;
	}

	public void setAvailable_seats(String available_seats) {
		this.available_seats = available_seats;
	}

	public int getBookings() {
		return bookings;
	}

	public void setBookings(int bookings) {
		this.bookings = bookings;
	}
	
}
