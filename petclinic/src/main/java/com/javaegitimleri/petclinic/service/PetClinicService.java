package com.javaegitimleri.petclinic.service;

import java.util.List;

import com.javaegitimleri.petclinic.model.Owner;
import com.javaegitimleri.petclinic.model.Pet;
import com.javaegitimleri.petclinic.model.PetType;
import com.javaegitimleri.petclinic.model.Visit;


public interface PetClinicService {

	public List<Owner> findOwners();
	public List<Owner> findOwners(String lastName);
	public List<Owner> findOwners(String firstName, String lastName);
	public Owner findOwner(Long id);
	public Owner findOwner(String email);
	public void create(Owner owner);
	public void update(Owner owner);
	public void deleteOwner(Long id);
	
	public List<Pet> findPets();
	public Pet findPet(Long id);
	public void create(Pet pet);
	public void update(Pet pet);
	public void deletePet(Long id);
	
	public List<PetType> findPetTypes();
	
	public List<Visit> findVisits(Long petId);
	public void create(Visit visit);
}
