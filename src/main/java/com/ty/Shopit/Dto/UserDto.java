package com.ty.Shopit.Dto;

import java.time.LocalDateTime;

import com.ty.Shopit.Enum.UserRole;
import com.ty.Shopit.Enum.Verification;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	private long userId;
	private String userFirstName;
	private String userLastName;
	private long userPhoneNumber;
	private String userEmail;
	private String userPassword;
	private LocalDateTime userCreatedDate;
	private UserRole userRole;
	private Verification verification;
}
