package com.ty.Shopit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Shopit.Entity.CustomerProduct;

public interface CustomerProductRepo extends JpaRepository<CustomerProduct, Integer>{

}
