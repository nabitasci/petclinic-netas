package vaadin.mvp.lab2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddressServiceInMemoryImpl implements AddressService {
	
	private Set<Address> addresses = new LinkedHashSet<Address>();
	
	{
		addresses.add(new Address(1L, "Kenan", "Sevindik", "ODTÜ MET 1"));
		addresses.add(new Address(2L, "Muammer", "Yücel", "ODTÜ MET 2"));
		addresses.add(new Address(3L, "Murat", "Öksüzer", "ODTÜ MET 3"));
		
	}

	@Override
	public Collection<Address> getAddresses() {
		return Collections.unmodifiableCollection(addresses);
	}
	
	@Override
	public Address getAddress(Long id) {
		for(Address address:addresses) {
			if(id.equals(address.getId())) return address;
		}
		return null;
	}

	@Override
	public void create(Address address) {
		addresses.add(address);
	}

	@Override
	public void update(Address address) {
	}

	@Override
	public void delete(Address address) {
		addresses.remove(address);
	}
}
