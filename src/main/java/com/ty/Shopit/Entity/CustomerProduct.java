package com.ty.Shopit.Entity;

import java.util.List;

import javax.annotation.Priority;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.ty.Shopit.Enum.BuyStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CustomerProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerProductId;
	private Priority priority;
	private BuyStatus buyStatus;
	
	@ManyToMany
	private List<Product> products;
	
	@ManyToOne
	private User user;
}
