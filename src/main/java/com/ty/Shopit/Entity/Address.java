package com.ty.Shopit.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
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
	@JoinColumn
	private User user;
}
