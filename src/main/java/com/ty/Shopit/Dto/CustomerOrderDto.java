package com.ty.Shopit.Dto;

import java.time.LocalDateTime;

import com.ty.Shopit.Enum.OrderStatus;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CustomerOrderDto {
	private long customerOrderId;
	private LocalDateTime orderedDateTime;
	private OrderStatus orderStatus;
	private double totalMRP;
	private double totalSaved;
	private double finalPrice;
	
	private long productId;
	private String productName;
	private String productDescription;
	private double productMRP;
	private double productdiscountInPercentage;
	private double productFinalePrice;
	private int productQuantity;
	
	private long userId;
	private String userFirstName;
	private String userSecondName;
	private String UserEmail;
}
