package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.portal.entity.Horoscope;
import com.portal.entity.User;

public interface HoroscopeRepo extends JpaRepository<Horoscope, Integer> {

	
	@Query("SELECT u FROM Horoscope u WHERE u.user_id = :user_id")
	public Horoscope getHoroscope(@Param("user_id") User user_id);
}
