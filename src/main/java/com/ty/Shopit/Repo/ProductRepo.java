package com.ty.Shopit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Shopit.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
