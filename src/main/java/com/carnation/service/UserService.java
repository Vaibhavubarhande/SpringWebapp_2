package com.carnation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnation.Respository.UserRepository;
import com.carnation.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User getUser(int rollno) {

		List<User> users = userRepository.users();

		User u = new User();

		for (User user : users) {
			if (user.getRollno() == rollno) {
				u = user;
			}
		}
		return u;
	}

}
