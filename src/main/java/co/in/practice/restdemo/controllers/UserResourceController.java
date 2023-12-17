package co.in.practice.restdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.in.practice.restdemo.payload.request.UserDto;
import co.in.practice.restdemo.service.Userservice;

@RestController
public class UserResourceController  {
	@Autowired
	private Userservice userservice;

	@GetMapping("/users")
	public List<UserDto> getAllUsers() {
		return userservice.getAllUsers();
	}

	// Update operation
	@PutMapping("/users/{id}")
	public UserDto updateDepartment(@RequestBody UserDto user, @PathVariable("id") Long userId) {
		return userservice.updateUser(user, userId);
	}

	// Delete operation
	@DeleteMapping("/users/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long userId) {
		userservice.deleteUser(userId);

		return "Deleted Successfully";
	}

}
