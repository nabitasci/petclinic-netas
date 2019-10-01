package com.javaegitimleri.petclinic.dao;

import java.util.List;

import com.javaegitimleri.petclinic.model.PetType;

public interface PetTypeDao {
	public List<PetType> findAll();
}
