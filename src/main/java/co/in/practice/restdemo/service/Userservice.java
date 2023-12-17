package co.in.practice.restdemo.service;

import java.util.List;

import co.in.practice.restdemo.payload.request.UserDto;

public interface Userservice {
	// Save operation
	UserDto save(UserDto user);

	// Read operation
	List<UserDto> getAllUsers();

	// Update operation
	UserDto updateUser(UserDto user, Long userId);

	// Delete operation
	void deleteUser(Long userId);
	
}
