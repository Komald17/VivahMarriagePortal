package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.portal.entity.Lifestyle;
import com.portal.entity.User;

public interface LifeStyleRepo extends JpaRepository<Lifestyle, Long>{

	
	@Query("SELECT u FROM Lifestyle u WHERE u.user_id = :user_id")
	public Lifestyle getLifeStyle(@Param("user_id") User user_id);
}
