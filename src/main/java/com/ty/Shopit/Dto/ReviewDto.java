package com.ty.Shopit.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ReviewDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reviewId;
	private int rating;
	private String feedback;
}
