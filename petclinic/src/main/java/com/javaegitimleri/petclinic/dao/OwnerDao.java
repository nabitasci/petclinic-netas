package com.javaegitimleri.petclinic.dao;

import java.util.List;

import com.javaegitimleri.petclinic.model.Owner;

public interface OwnerDao {
	public List<Owner> findAll();
	public List<Owner> findByLastName(String lastName);
	public List<Owner> findByFirstNameAndLastName(String firstName, String lastName);
	public Owner findById(Long id);
	public Owner findByEmail(String email);
	public Owner create(Owner owner);
	public Owner update(Owner owner);
	public void delete(Long id);
}
