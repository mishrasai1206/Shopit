package com.ty.Shopit.Dto;

import java.util.List;

import javax.annotation.Priority;
import javax.persistence.ManyToMany;

import com.ty.Shopit.Entity.Product;
import com.ty.Shopit.Enum.BuyStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerProductDto {
	private long customerProductId;
	private Priority priority;
	private BuyStatus buyStatus;

	@ManyToMany
	private List<Product> products;
}
