package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.portal.entity.Family;
import com.portal.entity.User;
@Repository
public interface FamilyRepo extends JpaRepository<Family, Integer> {

	@Query("SELECT u FROM Family u WHERE u.user_id = :user_id")
	public Family getFamilyDetails(@Param("user_id") User user_id);
}
