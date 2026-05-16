package com.portal.service;

import java.util.List;

import com.portal.entity.Admin;

public interface AdminService {

	public List<Admin> getAdminData();
	
	public void createAdmin(Admin admin);
}
