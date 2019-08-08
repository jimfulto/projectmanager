package com.projectmanager.projectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmanager.projectmanager.model.User;
import com.projectmanager.projectmanager.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUserbyId(Long userid) {
		userRepository.deleteById(userid);
	}
	
	public List<User> findAlluser() {
		return userRepository.findAll();
	}
	
	public User findUserById(Long userid) {
		return userRepository.findById(userid).get();
	}
	

}
