package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.portal.entity.Education;
import com.portal.entity.User;

public interface EducationRepository extends JpaRepository<Education, Long> {

	
	@Query("SELECT u FROM Education u WHERE u.user_id = :user_id")
	public Education getAllEducation(@Param("user_id") User user_id);
}
