package com.ty.Shopit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Shopit.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
