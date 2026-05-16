package com.portal.service;

import java.util.List;

import com.portal.entity.UserPreference;

public interface UserPreferenceService {

	public void saveUserPreferenceService(UserPreference userPreferece);

	public List<UserPreference> getUserPreference();

	public UserPreference getUserCast(int userId);

}
