package com.portal.service;

import java.util.List;

import com.portal.entity.Request;

public interface RequestService {

	public List<Request> requestRecivedData();
	public List<Request> requestSendData();
	public void saveRequestData(Request data);


}
