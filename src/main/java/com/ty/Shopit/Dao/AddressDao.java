package com.ty.Shopit.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Shopit.Entity.Address;
import com.ty.Shopit.Repo.AddressRepo;

@Repository
public class AddressDao {
	@Autowired
	private AddressRepo addressRepo;

	public Address addAddress(Address address) {
		return addressRepo.save(address);
	}

	public Address findAddressById(long addressId) {
		Optional<Address> optional = addressRepo.findById(addressId);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public Address updateAddress(Address address) {
		return addressRepo.save(address);
	}

	public Address deleteAddressById(long addressId) {
		Optional<Address> optional = addressRepo.findById(addressId);
		if (optional.isEmpty()) {
			return null;
		} else {
			Address address = optional.get();
			addressRepo.delete(address);
			return address;
		}
	}
}
