package com.portal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.portal.entity.Match;
import com.portal.entity.User;
@Repository
public interface MatchRepository extends JpaRepository<Match, Integer>{

	@Query("SELECT u FROM Match u WHERE u.user_id = :user_id")
	public List<Match> getAllMatchs(@Param("user_id") User user_id);
}
