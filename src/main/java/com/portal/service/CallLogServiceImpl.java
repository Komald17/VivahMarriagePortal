package com.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.entity.CallLog;
import com.portal.entity.User;
import com.portal.repo.CallLogRepository;

@Service
public class CallLogServiceImpl implements CallLogService {

	@Autowired
	private CallLogRepository callLogRepo;

	@Override
	public List<CallLog> getCallLogs(User userId) {

		return callLogRepo.getAllCallLogs(userId);
	}

	@Override
	public void saveCallLogs(CallLog callLog) {
		callLogRepo.save(callLog);

	}

}
