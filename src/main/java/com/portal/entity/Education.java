package com.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Education")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "education_id", updatable = false, nullable = false)
	private Long education_id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user_id;

	@Column
	private String aboutEducation;

	@Column
	private String postGraduation;

	@Column
	private String underGraduation;

	public Long getEducation_id() {
		return education_id;
	}

	public void setEducation_id(Long education_id) {
		this.education_id = education_id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public String getAboutEducation() {
		return aboutEducation;
	}

	public void setAboutEducation(String aboutEducation) {
		this.aboutEducation = aboutEducation;
	}

	public String getPostGraduation() {
		return postGraduation;
	}

	public void setPostGraduation(String postGraduation) {
		this.postGraduation = postGraduation;
	}

	public String getUnderGraduation() {
		return underGraduation;
	}

	public void setUnderGraduation(String underGraduation) {
		this.underGraduation = underGraduation;
	}

	@Override
	public String toString() {
		return "Education [user_id=" + user_id + ", aboutEducation=" + aboutEducation + ", postGraduation="
				+ postGraduation + ", underGraduation=" + underGraduation + "]";
	}

}
