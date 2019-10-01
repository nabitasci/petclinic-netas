package com.javaegitimleri.petclinic.service;

import org.springframework.beans.factory.FactoryBean;

import com.javaegitimleri.petclinic.dao.OwnerDao;
import com.javaegitimleri.petclinic.dao.PetDao;
import com.javaegitimleri.petclinic.dao.PetTypeDao;
import com.javaegitimleri.petclinic.dao.VisitDao;

public class PetClinicServiceFactoryBean implements FactoryBean<PetClinicService> {

	private OwnerDao ownerDao;
	private PetDao petDao;
	private PetTypeDao petTypeDao;
	private VisitDao visitDao;
	
	

	public void setOwnerDao(OwnerDao ownerDao) {
		this.ownerDao = ownerDao;
	}

	public void setPetDao(PetDao petDao) {
		this.petDao = petDao;
	}

	public void setPetTypeDao(PetTypeDao petTypeDao) {
		this.petTypeDao = petTypeDao;
	}

	public void setVisitDao(VisitDao visitDao) {
		this.visitDao = visitDao;
	}

	@Override
	public PetClinicService getObject() throws Exception {
		PetClinicServiceImpl pcs = new PetClinicServiceImpl();
		pcs.setOwnerDao(ownerDao);
		pcs.setPetDao(petDao);
		pcs.setPetTypeDao(petTypeDao);
		pcs.setVisitDao(visitDao);
		return pcs;
	}

	@Override
	public Class<?> getObjectType() {
		return PetClinicService.class;
	}

}
