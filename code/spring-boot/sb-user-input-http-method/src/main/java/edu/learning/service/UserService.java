package edu.learning.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import edu.learning.dto.User;

@Service
public class UserService {

	ArrayList<User> userList = new ArrayList<User>();
	
	public boolean addUser(User user) {
		return userList.add(user);
	}
	
	public ArrayList<User> getUser() {
		return userList;
	}
	
}
