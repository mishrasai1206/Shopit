package com.ty.Shopit.Entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ty.Shopit.Enum.UserRole;
import com.ty.Shopit.Enum.Verification;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String userFirstName;
	private String userLastName;
	private long userPhoneNumber;
	private String userEmail;
	private String userPassword;
	private LocalDateTime userCreatedDate;
	private UserRole userRole;
	private Verification verification;

	@OneToMany(mappedBy = "user")
	private List<Address> addresses;

	@OneToMany(mappedBy = "user")
	private List<Product> products;

	@OneToMany(mappedBy = "user")
	private List<CustomerProduct> customerProducts;

	@OneToMany(mappedBy = "user")
	private List<CustomerOrder> customerOrders;
}
