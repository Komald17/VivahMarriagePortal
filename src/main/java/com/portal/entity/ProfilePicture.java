package com.portal.entity;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProfilePictures")
public class ProfilePicture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long picture_id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_id;

	@Lob
	private byte[] picture_url;

	private Date uploaded_at;
	

	public Long getpicture_id() {
		return picture_id;
	}

	public void setpicture_id(Long picture_id) {
		this.picture_id = picture_id;
	}

	public User getuser_id() {
		return user_id;
	}

	public void setuser_id(User user_id) {
		this.user_id = user_id;
	}

	public byte[] getPicture() {
		return picture_url;
	}

	public void setpicture_url(byte[] picture_url) {
		this.picture_url = picture_url;
	}

	public Date getuploaded_at() {
		return uploaded_at;
	}

	public void setuploaded_at(Date uploaded_at) {
		this.uploaded_at = uploaded_at;
	}

	@Override
	public String toString() {
		return "ProfilePicture [picture_id=" + picture_id + ", user_id=" + user_id + ", picture_url=" + Arrays.toString(picture_url)
				+ ", uploaded_at=" + uploaded_at + "]";
	}

	// Getters and Setters

}