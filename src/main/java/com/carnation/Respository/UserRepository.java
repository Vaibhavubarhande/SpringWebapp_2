package com.carnation.Respository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.carnation.model.User;

@Repository
public class UserRepository {
	
	public List<User> users() {
		
		
		User  u1 = new User(1, "Vaibhav","Pune",123);
		User  u2 = new User(2, "Rahul","Nagpur",003);
		User  u3 = new User(3, "Sham","Mumbai",133);
		User  u4 = new User(4, "Ram","Nagpur",189);
		User  u5 = new User(5, "Mahesh","Nashik",995);
		
		List<User> users = Arrays.asList(u1,u2,u3,u4,u5);
		
		return users;
	}
		
//		public User getUser() {
//			
//		}
	
	
}
