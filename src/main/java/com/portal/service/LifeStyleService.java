package com.portal.service;

import com.portal.entity.Lifestyle;
import com.portal.entity.User;

public interface LifeStyleService {

	public void saveLifeStyle(Lifestyle userLifestyle);
	
	public Lifestyle getLifeStyle(User user);
}
