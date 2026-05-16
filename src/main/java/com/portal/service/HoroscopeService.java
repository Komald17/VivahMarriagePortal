package com.portal.service;

import com.portal.entity.Horoscope;
import com.portal.entity.User;

public interface HoroscopeService {

	public Horoscope getHoroscope(User user);

	public void saveHoroscope(Horoscope saveHoroscope);
}
