package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.portal.entity.Career;
import com.portal.entity.User;

public interface CareerRepo extends JpaRepository<Career, Long>{

	
	@Query("SELECT u FROM Career u WHERE u.user_id = :user_id")
	public Career getAllCarrer(@Param("user_id") User user_id);
}
