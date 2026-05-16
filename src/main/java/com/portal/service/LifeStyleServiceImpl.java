package com.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.Lifestyle;
import com.portal.entity.User;
import com.portal.repo.LifeStyleRepo;


@Service
public class LifeStyleServiceImpl implements LifeStyleService {

	@Autowired
	private LifeStyleRepo lifeStyleRepo;
	
	@Override
	public void saveLifeStyle(Lifestyle userLifestyle) {
		lifeStyleRepo.save(userLifestyle);
	}

	@Override
	public Lifestyle getLifeStyle(User user) {
		return lifeStyleRepo.getLifeStyle(user);
	}
}
