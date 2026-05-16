package com.portal.service;

import java.util.List;
import java.util.Optional;

import com.portal.entity.User;

public interface UserService {

	public User createUser(User user);

	public List<User> getAllUsrs();

	public Optional<User> isUserExist(Long id);

	public String getMyCast(Long id);
	
	public List<User> findAllCastList(String cast);

}
