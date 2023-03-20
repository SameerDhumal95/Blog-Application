package com.codewithsameer.blog.services;


import java.util.List;

import com.codewithsameer.blog.payloads.UserDto;

public interface UserServices {

	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
}
