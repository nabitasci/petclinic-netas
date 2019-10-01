package com.javaegitimleri.petclinic.dao;

import java.util.List;

import com.javaegitimleri.petclinic.model.Pet;
import com.javaegitimleri.petclinic.model.Visit;

public interface VisitDao {
	public List<Visit> findByPet(Pet pet);
	public Visit create(Visit visit);
}
