package com.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.portal.entity.Request;
import com.portal.repo.RequestRepository;

@Repository
public class RequestServiceImpl implements RequestService {

	@Autowired
	private RequestRepository requestRepository;

	@Override
	public List<Request> requestRecivedData() {

		return requestRepository.findAll();
	}

	@Override
	public List<Request> requestSendData() {

		return requestRepository.findAll();
	}

	@Override
	public void saveRequestData(Request data) {
		requestRepository.save(data);

	}

}
