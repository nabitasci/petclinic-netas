package com.javaegitimleri.petclinic.model;

import java.util.HashSet;
import java.util.Set;


public class Vet extends Person {
	
	private static final long serialVersionUID = 1L;
	
	private Boolean worksFullTime;

	private Set<Specialty> specialties = new HashSet<Specialty>();
	
	Vet() {
	}

	public Vet(String firstName, String lastName, String email, Boolean worksFullTime) {
		super(firstName, lastName, email);
		setWorksFullTime(worksFullTime);
	}

	public Set<Specialty> getSpecialties() {
		return specialties;
	}
	
	public void setSpecialties(Set<Specialty> specialties) {
		this.specialties = specialties;
	}

	public Boolean getWorksFullTime() {
		return worksFullTime;
	}

	public void setWorksFullTime(Boolean worksFullTime) {
		this.worksFullTime = worksFullTime;
	}

	@Override
	public String toString() {
		return "Vet [worksFullTime=" + worksFullTime + ", toString()="
				+ super.toString() + "]";
	}
}
