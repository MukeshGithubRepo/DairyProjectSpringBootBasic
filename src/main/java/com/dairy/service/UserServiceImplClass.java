package com.dairy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.entities.User;
import com.dairy.repositries.UserRepository;


@Service
public class UserServiceImplClass implements UserServiceInterface {

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
		userRepository.delete(user);

	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
