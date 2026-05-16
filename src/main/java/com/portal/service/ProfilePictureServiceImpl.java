package com.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.portal.entity.ProfilePicture;
import com.portal.repo.ProfilePictureRepository;
@Repository
public class ProfilePictureServiceImpl implements ProfilePictureService{

	
	@Autowired
	private ProfilePictureRepository  profilePicRepo;
	
	@Override
	public void saveProfilePic(ProfilePicture profilePicture) {
		// TODO Auto-generated method stub
		profilePicRepo.save(profilePicture);
	}

	@Override
	public List<ProfilePicture> getProfilePic() {
		// TODO Auto-generated method stub
		return null;
	}

}
