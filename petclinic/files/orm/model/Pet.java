package com.javaegitimleri.petclinic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="t_pet")
public class Pet extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Date birthDate;

	@ManyToOne
	@JoinColumn(name="type_id")
	private PetType type;

	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner owner;

	@OneToMany(orphanRemoval=true)
	@JoinColumn(name="pet_id")
	@OrderColumn
	private List<Visit> visits = new ArrayList<Visit>();
	
	@OneToMany(orphanRemoval=true)
	@JoinColumn(name="pet_id")
	@MapKey(name="name")
	private Map<String,Image> imagesByName = new HashMap<String, Image>();
	
	Pet() {
	}
	
	public Pet(String name, PetType type, Owner owner, Date birthDate) {
		super();
		this.name = name;
		this.type = type;
		this.owner = owner;
		this.birthDate = birthDate;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setType(PetType type) {
		this.type = type;
	}

	public PetType getType() {
		return this.type;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public List<Visit> getVisits() {
		return visits;
	}
	
	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

	public Map<String, Image> getImagesByName() {
		return imagesByName;
	}
	
	public void setImagesByName(Map<String, Image> imagesByName) {
		this.imagesByName = imagesByName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", birthDate=" + birthDate + ", type=" + type + ", owner=" + owner + ", getId()="
				+ getId() + ", getVersion()=" + getVersion() + "]";
	}
}
