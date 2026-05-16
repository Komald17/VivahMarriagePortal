package com.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.portal.entity.UserPreference;
import com.portal.repo.UserPreferenceRepository;

@Repository
public class UserPreferenceServiceImpl implements UserPreferenceService {

	@Autowired
	private UserPreferenceRepository userPrefereceRepo;

	@Override
	public void saveUserPreferenceService(UserPreference userPreferece) {
		userPrefereceRepo.save(userPreferece);

	}

	@Override
	public List<UserPreference> getUserPreference() {
		return userPrefereceRepo.findAll();
	}
	
	@Override
	public UserPreference getUserCast(int userId) {
		return userPrefereceRepo.findByUsrId(userId);
	}

}
