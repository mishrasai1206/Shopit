package com.ty.Shopit.Dao;

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
	
}
