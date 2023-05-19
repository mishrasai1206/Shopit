package com.ty.Shopit.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Shopit.Entity.User;
import com.ty.Shopit.Repo.UserRepo;

@Repository
public class UserDao {
	@Autowired
	private UserRepo userRepo;
	
	public User addUser(User user) {
		return userRepo.save(user);
	}
	
	public User findUserById(long userId) {
		Optional<User> optional = userRepo.findById(userId);
		if (optional.isEmpty()) {
			return null;
		}
		else {
			return optional.get();
		}
	}
	
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	
	public User deleteUserById(long userId) {
		Optional<User> optional = userRepo.findById(userId);
		if(optional.isEmpty()) {
			return null;
		}
		else {
			User user = optional.get();
			userRepo.delete(user);
			return user;
		}
	}
}
