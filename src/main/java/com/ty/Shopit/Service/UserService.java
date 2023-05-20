package com.ty.Shopit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.Shopit.Config.ResponseStructure;
import com.ty.Shopit.Dao.UserDao;
import com.ty.Shopit.Dto.UserDto;
import com.ty.Shopit.Entity.User;
import com.ty.Shopit.Enum.UserRole;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public ResponseEntity<ResponseStructure<UserDto>> addUser(User user,UserRole userRole){
		String message = null;
		UserDto userDto = null;
		if(userRole.equals(userRole.ADMIN)){
			List<User> users = userDao.getAllUserByRole(userRole);
			if(users.size()==0) {
			}
		}
		return null;
	}
}
