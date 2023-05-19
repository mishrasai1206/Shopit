package com.ty.Shopit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Shopit.Entity.Review;

public interface ReviewRepo extends JpaRepository<Review, Integer>{

}
