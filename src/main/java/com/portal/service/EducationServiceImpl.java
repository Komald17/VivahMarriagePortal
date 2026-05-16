package com.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.Education;
import com.portal.entity.User;
import com.portal.repo.EducationRepository;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	private EducationRepository education;

	public void saveEducation(Education edu) {
		education.save(edu);
	}

	public Education getEducation(User user) {
		return education.getAllEducation(user);
	}
}
