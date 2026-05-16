package com.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.Career;
import com.portal.entity.User;
import com.portal.repo.CareerRepo;

@Service
public class CareerServiceImpl implements CareerService {

	@Autowired
	private CareerRepo career;

	@Override
	public void saveCareer(Career saveCareer) {

		career.save(saveCareer);

	}

	@Override
	public Career getCareer(User userId) {

		return career.getAllCarrer(userId);
	}

}
