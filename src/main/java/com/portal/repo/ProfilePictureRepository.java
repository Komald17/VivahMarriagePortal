package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.entity.ProfilePicture;

public interface ProfilePictureRepository extends JpaRepository<ProfilePicture, Integer> {

}
