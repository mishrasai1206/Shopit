package com.ty.Shopit.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Shopit.Entity.Brand;
import com.ty.Shopit.Repo.BrandRepo;

@Repository
public class BrandDao {
	@Autowired
	private BrandRepo brandRepo;

	public Brand addBrand(Brand brand) {
		return brandRepo.save(brand);
	}

	public Brand findBrandById(long brandId) {
		Optional<Brand> optional = brandRepo.findById(brandId);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public Brand updateBrand(Brand brand) {
		return brandRepo.save(brand);
	}

	public Brand deleteBrandById(long brandId) {
		Optional<Brand> optional = brandRepo.findById(brandId);
		if (optional.isEmpty()) {
			return null;
		} else {
			Brand brand = optional.get();
			brandRepo.delete(brand);
			return brand;
		}
	}
}
