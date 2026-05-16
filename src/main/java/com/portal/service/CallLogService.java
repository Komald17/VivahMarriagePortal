package com.portal.service;

import java.util.List;

import com.portal.entity.CallLog;
import com.portal.entity.User;

public interface CallLogService {

	public List<CallLog> getCallLogs(User userId);

	public void saveCallLogs(CallLog callLog);
}
