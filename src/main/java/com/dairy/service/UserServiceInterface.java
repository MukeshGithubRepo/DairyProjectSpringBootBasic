package com.dairy.service;

import java.util.List;

import com.dairy.entities.User;

public interface UserServiceInterface {

	
	public User saveUser(User user);
	public User updateUser(User user);
	public void deleteUser(User user);
	public User findById(long id);
	public List<User> findAllUsers();
	
}
