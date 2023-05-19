package com.ty.Shopit.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.ty.Shopit.Enum.Verification;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter 
@Setter
public class Category {
	private long categoryId;
	private String categoryName;
	private Verification verification;
	
	@OneToMany
	private List<Product> products;
}	
