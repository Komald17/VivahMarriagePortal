package com.portal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.portal.entity.CallLog;
import com.portal.entity.User;

@Repository
public interface CallLogRepository extends JpaRepository<CallLog, Integer> {

	
	@Query("SELECT u FROM CallLog u WHERE u.caller = :caller")
	public List<CallLog> getAllCallLogs(@Param("caller") User caller);
}
