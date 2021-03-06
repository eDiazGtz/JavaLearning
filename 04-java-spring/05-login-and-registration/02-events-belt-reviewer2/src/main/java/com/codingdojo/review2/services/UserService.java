package com.codingdojo.review2.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.review2.models.User;
import com.codingdojo.review2.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public List<User> getAllUsers() {
		return this.uRepo.findAll();
	}
	
	public User getOneUser(Long id) {
		User user = this.uRepo.findById(id).orElse(null);
		return user;
	}
	
	public User registerUser(User newUser) {
		//Generate Hash
		String hash = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		//Set HashPW on user's PW field
		newUser.setPassword(hash);
		//Save new user with Salted PW to DB
		return this.uRepo.save(newUser);
	}
	
	public boolean authenticateUser(String email, String password) {
		//Make sure the user logging in the who they say they are
		//1: try and query
		User user = this.uRepo.findByEmail(email);
		if(user == null) {
			return false;
		}
		//step 2 check provided email has email in DB for User
		return BCrypt.checkpw(password, user.getPassword());
	}
	
	public User getUserByEmail(String email) {
		User user = this.uRepo.findByEmail(email);
		return user;
	}
	
	
	
}
