package com.portal.service;

import com.portal.entity.Education;
import com.portal.entity.User;

public interface EducationService {

	
	public void saveEducation(Education edu);
	public Education getEducation(User user);
}
