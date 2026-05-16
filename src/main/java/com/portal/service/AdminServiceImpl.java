package com.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.portal.entity.Admin;
import com.portal.repo.AdminRepository;

@Repository
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;

	@Override
	public List<Admin> getAdminData() {

		return adminRepo.findAll();
	}

	@Override
	public void createAdmin(Admin admin) {
		adminRepo.save(admin);

	}

}
