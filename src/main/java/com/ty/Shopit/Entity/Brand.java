package com.ty.Shopit.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ty.Shopit.Enum.BrandCategory;
import com.ty.Shopit.Enum.Verification;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long brandId;
	private String brandName;
	private BrandCategory brandCategory;
	private String brandDescription;
	private LocalDate brandEstablishmentDate;
	private Verification verification;
	
	@OneToMany(mappedBy = "brand")
	private List<Product> products; 
}
