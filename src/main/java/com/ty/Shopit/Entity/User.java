package com.ty.Shopit.Entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.ty.Shopit.Enum.UserRole;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	private long userId;
	private String userFirstName;
	private String userLastName;
	private long userPhoneNumber;
	private String userEmail;
	private String userPassword;
	private LocalDateTime userCreatedDate;
	private UserRole userRole;

	@OneToMany(mappedBy = "user")
	private List<Address> addresses;

	@OneToMany(mappedBy = "user")
	private List<Product> products;

	@OneToMany(mappedBy = "user")
	private List<CustomerProduct> customerProducts;

	@OneToMany(mappedBy = "user")
	private List<CustomerOrder> customerOrders;
}
