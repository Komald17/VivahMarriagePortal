package com.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.Horoscope;
import com.portal.entity.User;
import com.portal.repo.HoroscopeRepo;

@Service
public class HoroscopeServiceImpl implements HoroscopeService {

	@Autowired
	private HoroscopeRepo horoscope;

	@Override
	public Horoscope getHoroscope(User user) {
		return horoscope.getHoroscope(user);
	}

	@Override
	public void saveHoroscope(Horoscope saveHoroscope) {
		horoscope.save(saveHoroscope);
	}

}
