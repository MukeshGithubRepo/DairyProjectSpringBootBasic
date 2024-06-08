package com.dairy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.entities.Entry;
import com.dairy.entities.User;
import com.dairy.service.UserServiceInterface;

@RestController
public class HomeController {

	@Autowired
	UserServiceInterface userServiceInterface;
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable("id") int id)
	{
		User user=userServiceInterface.findById(id);
		
		return user;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		List<User> users=userServiceInterface.findAllUsers();
		
		return users;
	}
	
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user)
	{
		User savedUsed=userServiceInterface.saveUser(user);
		return savedUsed;
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user)
	{
		User savedUsed=userServiceInterface.saveUser(user);
		return savedUsed;
	}
	
	@PutMapping("/users/{id}")
	public User updateUser2(@PathVariable("id") int id,@RequestBody User user)
	{
		User user1=userServiceInterface.findById(id);
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
		
		User usersave=userServiceInterface.updateUser(user1);
		
		return usersave;
	}
	
	
	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable("id") int id )
	{
		
		User userdet=userServiceInterface.findById(id);
		
		userServiceInterface.deleteUser(userdet);
	}
	
	
	
	
	
}
