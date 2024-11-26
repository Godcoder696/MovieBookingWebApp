package org.com.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String description;
	private String duration;
	private String rating;
	
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(int id, String title, String description, String duration, String rating) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", title=" + title + ", description=" + description + ", duration=" + duration
				+ ", rating=" + rating + "]";
	}
}
