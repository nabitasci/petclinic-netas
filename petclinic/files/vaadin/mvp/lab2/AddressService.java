package vaadin.mvp.lab2;

import java.util.Collection;

public interface AddressService {
	public Collection<Address> getAddresses();
	public Address getAddress(Long id);
	public void create(Address address);
	public void update(Address address);
	public void delete(Address address);
}
