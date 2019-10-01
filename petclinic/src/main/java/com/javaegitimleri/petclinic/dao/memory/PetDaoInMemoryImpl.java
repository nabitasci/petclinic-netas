package com.javaegitimleri.petclinic.dao.memory;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javaegitimleri.petclinic.dao.PetDao;
import com.javaegitimleri.petclinic.model.Pet;

@Repository
public class PetDaoInMemoryImpl implements PetDao {

	private Map<Long, Pet> petsByIdMap = new HashMap<>();
	
	public PetDaoInMemoryImpl() {
		petsByIdMap.put(InMemoryDataSampler.pet1.getId(), InMemoryDataSampler.pet1);
		petsByIdMap.put(InMemoryDataSampler.pet2.getId(), InMemoryDataSampler.pet2);
		petsByIdMap.put(InMemoryDataSampler.pet3.getId(), InMemoryDataSampler.pet3);
		System.out.println(getClass().getSimpleName() + " created");
	}
	
	public void setPetsByIdMap(Map<Long, Pet> petsByIdMap) {
		this.petsByIdMap = petsByIdMap;
	}
	
	@Override
	public List<Pet> findAll() {
		return new ArrayList<>(petsByIdMap.values());
	}

	@Override
	public Pet findById(Long id) {
		return petsByIdMap.get(id);
	}

	@Override
	public Pet create(Pet pet) {
		if (petsByIdMap.containsValue(pet))
			throw new RuntimeException("Already exists a pet with same business key :" + pet);
		pet.setId(new Date().getTime());
		petsByIdMap.put(pet.getId(), pet);
		return pet;
	}

	@Override
	public Pet update(Pet pet) {
		petsByIdMap.replace(pet.getId(), pet);
		return pet;
	}

	@Override
	public void delete(Long id) {
		petsByIdMap.remove(id);
	}
}
