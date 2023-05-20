package com.ty.Shopit.Dto;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.ty.Shopit.Entity.Brand;
import com.ty.Shopit.Entity.Category;
import com.ty.Shopit.Entity.Review;
import com.ty.Shopit.Entity.User;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProductDto {
	private long productId;
	private String productName;
	private String productDescription;
	private double productMRP;
	private double productdiscountInPercentage;
	private double productFinalePrice;
	private int productQuantity;
	private float rating;
	
	@ManyToOne
	@JoinColumn
	private Brand brand;
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	@ManyToOne
	@JoinColumn
	private Category category;
	
	@OneToMany
	private List<Review> reviews;
}
