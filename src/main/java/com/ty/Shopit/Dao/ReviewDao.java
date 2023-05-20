package com.ty.Shopit.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Shopit.Entity.Review;
import com.ty.Shopit.Repo.ReviewRepo;

@Repository
public class ReviewDao {
	@Autowired
	private ReviewRepo reviewRepo;
	
	public Review addReview(Review review) {
		return reviewRepo.save(review);
	}
	
	public Review findReviewById(long reviewId) {
		Optional<Review> optional = reviewRepo.findById(reviewId);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}
	public Review updateReview(Review review) {
		return reviewRepo.save(review);
	}
	
	public Review deleteReviewById(long reviewId) {
		Optional<Review> optional = reviewRepo.findById(reviewId);
		if(optional.isEmpty()) {
			return null;
		}else {
			Review review = optional.get();
			reviewRepo.delete(review);
			return review;
		}
	}
}
