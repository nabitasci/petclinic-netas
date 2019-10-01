package com.javaegitimleri.petclinic.dao.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javaegitimleri.petclinic.dao.PetTypeDao;
import com.javaegitimleri.petclinic.model.PetType;

@Repository
public class PetTypeDaoInMemoryImpl implements PetTypeDao {
	
	private Map<Long, PetType> petTypesByIdMap = new HashMap<>();
	
	public PetTypeDaoInMemoryImpl() {
		petTypesByIdMap.put(InMemoryDataSampler.petType1.getId(), InMemoryDataSampler.petType1);
		petTypesByIdMap.put(InMemoryDataSampler.petType2.getId(), InMemoryDataSampler.petType2);
		System.out.println(getClass().getSimpleName() + " created");
	}
	
	public void setPetTypesByIdMap(Map<Long, PetType> petTypesByIdMap) {
		this.petTypesByIdMap = petTypesByIdMap;
	}

	@Override
	public List<PetType> findAll() {
		return new ArrayList<>(petTypesByIdMap.values());
	}
}
