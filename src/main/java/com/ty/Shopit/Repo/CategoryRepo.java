package com.ty.Shopit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Shopit.Entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
