package com.javaegitimleri.petclinic.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javaegitimleri.petclinic.dao.OwnerDao;
import com.javaegitimleri.petclinic.dao.PetDao;
import com.javaegitimleri.petclinic.dao.PetTypeDao;
import com.javaegitimleri.petclinic.dao.VisitDao;
import com.javaegitimleri.petclinic.model.Owner;
import com.javaegitimleri.petclinic.model.Pet;
import com.javaegitimleri.petclinic.model.PetType;
import com.javaegitimleri.petclinic.model.Visit;

@Service("petClinicService")
public class PetClinicServiceImpl implements PetClinicService {
	
	private OwnerDao ownerDao;
	private PetDao petDao;
	private VisitDao visitDao;
	private PetTypeDao petTypeDao;
	
	@PostConstruct
	public void init() {
		System.out.println("pcs init called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("pcs destroy called");
	}
	
	public PetClinicServiceImpl() {
		System.out.println(getClass().getSimpleName() + " created");
	}
	
	@Autowired
	@Qualifier("ownerDao")
	public void setOwnerDao(OwnerDao ownerDao) {
		this.ownerDao = ownerDao;
	}
	
	@Autowired
	public void setPetDao(PetDao petDao) {
		this.petDao = petDao;
	}
	
	@Autowired
	public void setVisitDao(VisitDao visitDao) {
		this.visitDao = visitDao;
	}
	
	@Autowired
	public void setPetTypeDao(PetTypeDao petTypeDao) {
		this.petTypeDao = petTypeDao;
	}

	@Override
	public List<Owner> findOwners() {
		return ownerDao.findAll();
	}

	@Override
	public List<Owner> findOwners(String lastName) {
		return ownerDao.findByLastName(lastName);
	}

	@Override
	public List<Owner> findOwners(String firstName, String lastName) {
		return ownerDao.findByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public Owner findOwner(Long id) {
		return ownerDao.findById(id);
	}
	
	@Override
	public Owner findOwner(String email) {
		return ownerDao.findByEmail(email);
	}

	@Override
	public void create(Owner owner) {
		ownerDao.create(owner);
	}

	@Override
	public void update(Owner owner) {
		ownerDao.update(owner);
	}

	@Override
	public void deleteOwner(Long id) {
		ownerDao.delete(id);
	}
	
	@Override
	public List<Pet> findPets() {
		return petDao.findAll();
	}

	@Override
	public Pet findPet(Long id) {
		return petDao.findById(id);
	}

	@Override
	public void create(Pet pet) {
		petDao.create(pet);
	}

	@Override
	public void update(Pet pet) {
		petDao.update(pet);
	}

	@Override
	public void deletePet(Long id) {
		petDao.delete(id);
	}
	
	@Override
	public List<PetType> findPetTypes() {
		return petTypeDao.findAll();
	}

	@Override
	public List<Visit> findVisits(Long petId) {
		Pet pet = petDao.findById(petId);
		return visitDao.findByPet(pet);
	}

	@Override
	public void create(Visit visit) {
		visitDao.create(visit);
	}
}
