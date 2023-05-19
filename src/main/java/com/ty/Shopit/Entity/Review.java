package com.ty.Shopit.Entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
	private long reviewId;
	private int rating;
	private String feedback;
}
