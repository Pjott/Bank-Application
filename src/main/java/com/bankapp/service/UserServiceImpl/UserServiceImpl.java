package com.bankapp.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.DAO.UserDAO;
import com.bankapp.domain.User;
import com.bankapp.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	public void save(User user) {
		userDAO.save(user);
	}
	
	public User findByUsername(String username) {
		return userDAO.findByUsername(username);
	}
	
	public User findByEmail(String email) {
		return userDAO.findByEmail(email);
	}
	
	public boolean checkUserExists(String username, String email) {
		if (checkUsernameExists(username) || checkEmailExists(username)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkEmailExists(String username) {
		if (null != findByEmail(username)) {
			return true;
		}
		return false;
	}

	public boolean checkUsernameExists(String username) {
		if (null != findByUsername(username)) {
			return true;
		}
		return false;
	}
}
