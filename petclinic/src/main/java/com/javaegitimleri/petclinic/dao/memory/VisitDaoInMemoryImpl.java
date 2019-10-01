package com.javaegitimleri.petclinic.dao.memory;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javaegitimleri.petclinic.dao.VisitDao;
import com.javaegitimleri.petclinic.model.Pet;
import com.javaegitimleri.petclinic.model.Visit;

@Repository
public class VisitDaoInMemoryImpl implements VisitDao {
	
	private Map<Long, Visit> visitsByIdMap = new HashMap<>();
	
	public VisitDaoInMemoryImpl() {
		visitsByIdMap.put(InMemoryDataSampler.visit1.getId(), InMemoryDataSampler.visit1);
		visitsByIdMap.put(InMemoryDataSampler.visit2.getId(), InMemoryDataSampler.visit2);
		System.out.println(getClass().getSimpleName() + " created");
	}
	
	public void setVisitsByIdMap(Map<Long, Visit> visitsByIdMap) {
		this.visitsByIdMap = visitsByIdMap;
	}

	@Override
	public List<Visit> findByPet(Pet pet) {
		List<Visit> result = new ArrayList<>();
		for(Visit visit:visitsByIdMap.values()) {
			if(visit.getPet().equals(pet)) {
				result.add(visit);
			}
		}
		return result;
	}

	@Override
	public Visit create(Visit visit) {
		if(visitsByIdMap.containsValue(visit)) throw new RuntimeException("Already exists a visit with same business key :" + visit);
		visit.setId(new Date().getTime());
		visitsByIdMap.put(visit.getId(), visit);
		return visit;
	}	
}
