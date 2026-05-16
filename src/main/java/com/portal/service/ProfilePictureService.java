package com.portal.service;

import java.util.List;

import com.portal.entity.ProfilePicture;

public interface ProfilePictureService {

	public void saveProfilePic(ProfilePicture profilePicture);

	public List<ProfilePicture> getProfilePic();

}
