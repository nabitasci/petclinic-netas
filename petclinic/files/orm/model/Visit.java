package com.javaegitimleri.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_visit")
public class Visit extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(name="visit_date")
	private Date visitDate;

	@Lob
	private String description;

	@ManyToOne
	@JoinColumn(name="pet_id",insertable=false,updatable=false)
	private Pet pet;
	
	Visit() {
	}

	public Visit(Date visitDate, Pet pet) {
		super();
		this.visitDate = visitDate;
		this.pet = pet;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return this.pet;
	}

	protected void setPet(Pet pet) {
		this.pet = pet;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pet == null) ? 0 : pet.hashCode());
		result = prime * result + ((visitDate == null) ? 0 : visitDate.hashCode());
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
		Visit other = (Visit) obj;
		if (pet == null) {
			if (other.pet != null)
				return false;
		} else if (!pet.equals(other.pet))
			return false;
		if (visitDate == null) {
			if (other.visitDate != null)
				return false;
		} else if (!visitDate.equals(other.visitDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Visit [visitDate=" + visitDate + ", description=" + description + ", pet=" + pet + ", getId()="
				+ getId() + ", getVersion()=" + getVersion() + "]";
	}
}
