package com.portal.service;

import com.portal.entity.Family;
import com.portal.entity.User;

public interface FamilyService {

	
	public void saveFamilyDetails(Family family);
	
	public Family getAllFamilyDetails(User userId);
}
