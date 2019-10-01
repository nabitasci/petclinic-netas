package com.javaegitimleri.petclinic.dao;

import java.util.List;

import com.javaegitimleri.petclinic.model.Pet;

public interface PetDao {
	public List<Pet> findAll();
	public Pet findById(Long id);
	public Pet create(Pet pet);
	public Pet update(Pet pet);
	public void delete(Long id);
}
