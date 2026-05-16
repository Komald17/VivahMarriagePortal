package com.portal.service;

import com.portal.entity.Career;
import com.portal.entity.User;

public interface CareerService {
	
	
	public void saveCareer(Career career);
	public Career getCareer(User userId);

}
