package co.in.practice.restdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.in.practice.restdemo.models.User;
import co.in.practice.restdemo.payload.request.UserDto;
import co.in.practice.restdemo.repository.UserRepository;
import co.in.practice.restdemo.service.Userservice;

@Service(value = "userservice")
public class UserserviceImpl implements Userservice {
	@Autowired
	UserRepository repository;

	@Override
	public UserDto save(UserDto user) {
		User savedUser = repository.save(user.createPersistanceUSer());
		return savedUser.createDtoUser();
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<UserDto> users = new ArrayList<>();
		repository.findAll().stream().forEach(u -> users.add(u.createDtoUser()));
		return users;
	}

	@Override
	public UserDto updateUser(UserDto user, Long userId) {
		User findUser = repository.findById(userId).get();
		if(user.getUsername() != null) findUser.setUsername(user.getUsername());
		if(user.getEmail() != null) findUser.setEmail(user.getEmail());
		User savedUser = repository.save(findUser);
		return savedUser.createDtoUser();
	}

	@Override
	public void deleteUser(Long userId) {
		User findUser = repository.findById(userId).get();
		if(findUser != null) repository.delete(findUser);

	}

}
