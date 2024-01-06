package com.alpha.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.www.entity.User;
import com.alpha.www.entity.UserRepository;
import com.alpha.www.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User newUser = new User();
		newUser.setName(user.getName());
		newUser.setEmail(user.getEmail());
		User savedUser = userRepository.save(newUser);
		return savedUser;
	}

}
