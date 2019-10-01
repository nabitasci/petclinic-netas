package com.javaegitimleri.petclinic.model;

import java.util.HashSet;
import java.util.Set;


public class Owner extends Person {
	
	private static final long serialVersionUID = 1L;
	
	private Rating rating = Rating.STANDART;

	private Set<Pet> pets = new HashSet<Pet>();
	
	Owner() {
	}
	
	public Owner(String firstName, String lastName, String email) {
		super(firstName, lastName, email);
	}

	public Rating getRating() {
		return rating;
	}
	
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	public Set<Pet> getPets() {
		return pets;
	}
	
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
}
