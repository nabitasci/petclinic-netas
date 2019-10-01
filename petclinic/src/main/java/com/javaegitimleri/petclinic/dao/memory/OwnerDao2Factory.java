package com.javaegitimleri.petclinic.dao.memory;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.javaegitimleri.petclinic.dao.OwnerDao;

@Component
public class OwnerDao2Factory {
	@Bean
	public OwnerDao ownerDao2() {
		return new OwnerDaoInMemoryImpl();
	}
}
