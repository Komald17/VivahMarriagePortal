package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.portal.entity.UserPreference;

public interface UserPreferenceRepository extends JpaRepository<UserPreference, Integer> {

	@Query("SELECT u FROM UserPreference u WHERE u.userId = :userId")
	public UserPreference findByUsrId(@Param("userId") int userId);
}
