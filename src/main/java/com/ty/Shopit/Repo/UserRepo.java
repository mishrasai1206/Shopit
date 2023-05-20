package com.ty.Shopit.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Shopit.Entity.User;
import com.ty.Shopit.Enum.UserRole;

public interface UserRepo extends JpaRepository<User, Long> {

	Optional<List<User>> getAllUserByRole(UserRole userRole);

}
