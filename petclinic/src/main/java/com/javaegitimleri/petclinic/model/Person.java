package com.javaegitimleri.petclinic.model;

public abstract class Person extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;
	
	private String email;
	
	private Address address;
	
	Person() {
	}

	public Person(String firstName, String lastName, String email) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", getId()=" + getId() + ", getVersion()="
				+ getVersion() + "]";
	}
}
