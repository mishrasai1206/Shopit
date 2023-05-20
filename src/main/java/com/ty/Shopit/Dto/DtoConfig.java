package com.ty.Shopit.Dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.Shopit.Entity.Address;
import com.ty.Shopit.Entity.Brand;
import com.ty.Shopit.Entity.Category;
import com.ty.Shopit.Entity.CustomerOrder;
import com.ty.Shopit.Entity.CustomerProduct;
import com.ty.Shopit.Entity.Product;

@Component
public class DtoConfig {
	@Autowired
	AddressDto addressDto;
	@Autowired
	BrandDto brandDto;
	@Autowired
	CategoryDto categoryDto;
	@Autowired
	ProductDto productDto;
	@Autowired
	CustomerProductDto customerProductDto;
	@Autowired
	CustomerOrderDto customerOrderDto;
	@Autowired
	UserDto userDto;
	@Autowired
	ReviewDto reviewDto;
	
	public AddressDto setAddressDtoAttributes(Address address) {
		addressDto.setAddressId(address.getAddressId());
		addressDto.setAddressFlatNo(address.getAddressFlatNo());
		addressDto.setAddressArea(address.getAddressArea());
		addressDto.setAddressCity(address.getAddressCity());
		addressDto.setAddressState(address.getAddressState());
		addressDto.setAddressCountry(address.getAddressCountry());
		addressDto.setAddressLandmark(address.getAddressLandmark());
		addressDto.setAddressPostalCode(address.getAddressPostalCode());
		return addressDto;
	}
	
	public BrandDto setBrandDtoAttributes(Brand brand) {
		brandDto.setBrandId(brand.getBrandId());
		brandDto.setBrandName(brand.getBrandName());
		brandDto.setBrandCategory(brand.getBrandCategory());
		brandDto.setBrandDescription(brand.getBrandDescription());
		brandDto.setBrandEstablishmentDate(brand.getBrandEstablishmentDate());
		brandDto.setVerification(brand.getVerification());
		return brandDto;
		
	}
	
	public CategoryDto setCategoryDtoAttributes(Category category) {
		categoryDto.setCategoryId(category.getCategoryId());
		categoryDto.setCategoryName(category.getCategoryName());
		categoryDto.setVerification(category.getVerification());
		return categoryDto;
	}
	
	public ProductDto setProductDtoAttributes(Product product) {
		productDto.setProductId(product.getProductId());
		productDto.setProductName(product.getProductName());
		productDto.setProductDescription(product.getProductDescription());
		productDto.setProductMRP(product.getProductMRP());
		productDto.setProductdiscountInPercentage(product.getProductdiscountInPercentage());
		productDto.setProductFinalePrice(product.getProductFinalePrice());
		productDto.setProductQuantity(product.getProductQuantity());
		productDto.setRating(product.getRating());
		return productDto;
	}
	
	public CustomerProductDto setCustomerProductDtoAttributes(CustomerProduct customerProduct) {
		customerProductDto.setCustomerProductId(customerProduct.getCustomerProductId());
		customerProductDto.setPriority(customerProduct.getPriority());
		customerProductDto.setBuyStatus(customerProduct.getBuyStatus());
		return customerProductDto;
	}
	
	
}
