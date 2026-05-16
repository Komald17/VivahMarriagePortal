package com.portal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.User;
import com.portal.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepository;

	@Override
	public User createUser(User user) {
		// Ensure the user entity is new and does not have an ID
		System.out.println(user.toString());
		user.setUser_id(user.getUser_id());
		if (user.getUser_id() != null) {
			throw new IllegalArgumentException("User must be new (ID should be null)");
		}
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsrs() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> isUserExist(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public String getMyCast(Long id) {
		Optional<User> userCast = userRepository.findById(id);

		return userCast.get().getCaste();
	}

	@Override
	public List<User> findAllCastList(String cast) {

		return userRepository.findAllCastList(cast);

	}

}