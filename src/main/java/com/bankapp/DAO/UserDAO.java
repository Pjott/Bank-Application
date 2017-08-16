package com.bankapp.DAO;

import org.springframework.data.repository.CrudRepository;

import com.bankapp.domain.User;

public interface UserDAO extends CrudRepository<User, Long> {

	User findByUsername(String username);
	User findByEmail(String email);
}
