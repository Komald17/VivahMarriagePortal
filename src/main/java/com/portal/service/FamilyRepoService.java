package com.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.Family;
import com.portal.entity.User;
import com.portal.repo.FamilyRepo;

@Service
public class FamilyRepoService implements FamilyService {

	@Autowired
	private FamilyRepo familyRepo;

	@Override
	public void saveFamilyDetails(Family family) {

		familyRepo.save(family);
	}

	@Override
	public Family getAllFamilyDetails(User userId) {

		return familyRepo.getFamilyDetails(userId);
	}

}
