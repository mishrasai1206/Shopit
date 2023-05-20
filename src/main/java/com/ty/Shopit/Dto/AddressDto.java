package com.ty.Shopit.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.ty.Shopit.Entity.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AddressDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	private int addressFlatNo;
	private String addressArea;
	private String addressCity;
	private String addressLandmark;
	private String addressState;
	private String addressCountry;
	private int addressPostalCode;
	
	
	@ManyToOne
	private User user;
}
