package com.javaegitimleri.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Clinic extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String name;

	private Set<Person> members = new HashSet<>();

	Clinic() {
	}

	public Clinic(String name) {
		super();
		this.name = name;
	}

	public Set<Person> getMembers() {
		return members;
	}

	public void setMembers(Set<Person> members) {
		this.members = members;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Clinic other = (Clinic) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clinic [name=" + name + ", getId()=" + getId() + ", getVersion()=" + getVersion() + "]";
	}
}
