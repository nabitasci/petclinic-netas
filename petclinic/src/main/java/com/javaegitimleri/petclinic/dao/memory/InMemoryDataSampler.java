package com.javaegitimleri.petclinic.dao.memory;

import java.util.Date;

import com.javaegitimleri.petclinic.model.Owner;
import com.javaegitimleri.petclinic.model.Pet;
import com.javaegitimleri.petclinic.model.PetType;
import com.javaegitimleri.petclinic.model.Visit;

public class InMemoryDataSampler {
	public static final Owner owner1;
	public static final Owner owner2;
	public static final Owner owner3;
	public static final PetType petType1;
	public static final PetType petType2;
	public static final Pet pet1;
	public static final Pet pet2;
	public static final Pet pet3;
	public static final Visit visit1;
	public static final Visit visit2;


	static {
		owner1 = new Owner("Ali","Yücel","ayucel@gmail.com");
		owner1.setId(1L);
		
		owner2 = new Owner("Veli","Güçlü","guclu@yahoo.com");
		owner2.setId(2L);
		
		owner3 = new Owner("Ahmet","Güçlü","aguclu@gmail.com");
		owner3.setId(3L);
		
		petType1 = new PetType("Kedi");
		petType1.setId(1L);
		
		petType2 = new PetType("Köpek");
		petType2.setId(2L);
		
		pet1 = new Pet("Maviş",petType1,owner1,new Date());
		pet1.setId(1L);
		
		pet2 = new Pet("Cingöz", petType1, owner2, new Date());
		pet2.setId(2L);
		
		pet3 = new Pet("Karabaş",petType2,owner2,new Date());
		pet3.setId(3L);
		
		visit1 = new Visit(new Date(), pet1);
		visit1.setId(1L);
		visit1.setDescription("genel kontrol");

		visit2 = new Visit(new Date(), pet2);
		visit2.setId(2L);
		visit2.setDescription("aşı");		
	}
}