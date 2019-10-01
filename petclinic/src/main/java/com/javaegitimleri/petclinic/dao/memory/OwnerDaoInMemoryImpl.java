package com.javaegitimleri.petclinic.dao.memory;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javaegitimleri.petclinic.dao.OwnerDao;
import com.javaegitimleri.petclinic.model.Owner;

@Repository
public class OwnerDaoInMemoryImpl implements OwnerDao {
	
	private Map<Long, Owner> ownersByIdMap = new HashMap<>();
	
	public OwnerDaoInMemoryImpl() {
		ownersByIdMap.put(InMemoryDataSampler.owner1.getId(), InMemoryDataSampler.owner1);
		ownersByIdMap.put(InMemoryDataSampler.owner2.getId(), InMemoryDataSampler.owner2);
		ownersByIdMap.put(InMemoryDataSampler.owner3.getId(), InMemoryDataSampler.owner3);
		System.out.println(getClass().getSimpleName() + " created");
	}
	
	public void setOwnersByIdMap(Map<Long, Owner> ownersByIdMap) {
		this.ownersByIdMap = ownersByIdMap;
	}

	@Override
	public List<Owner> findAll() {
		return new ArrayList<>(ownersByIdMap.values());
	}

	@Override
	public List<Owner> findByLastName(String lastName) {
		List<Owner> result = new ArrayList<>();
		for (Owner owner : ownersByIdMap.values()) {
			if (owner.getLastName().equals(lastName)) {
				result.add(owner);
			}
		}
		return result;
	}

	@Override
	public List<Owner> findByFirstNameAndLastName(String firstName, String lastName) {
		List<Owner> result = new ArrayList<>();
		for (Owner owner : ownersByIdMap.values()) {
			if (owner.getLastName().equals(lastName) && owner.getFirstName().equals(firstName)) {
				result.add(owner);
			}
		}
		return result;
	}

	@Override
	public Owner findById(Long id) {
		return ownersByIdMap.get(id);
	}
	
	@Override
	public Owner findByEmail(String email) {
		for(Owner owner:ownersByIdMap.values()) {
			if(owner.getEmail().equals(email)) return owner;
		}
		return null;
	}

	@Override
	public Owner create(Owner owner) {
		if (ownersByIdMap.containsValue(owner))
			throw new RuntimeException("Already exists an owner with same business key:" + owner);
		
		owner.setId(new Date().getTime());
		ownersByIdMap.put(owner.getId(), owner);
		return owner;
	}

	@Override
	public Owner update(Owner owner) {
		ownersByIdMap.replace(owner.getId(), owner);
		return owner;
	}

	@Override
	public void delete(Long id) {
		ownersByIdMap.remove(id);
	}
}
