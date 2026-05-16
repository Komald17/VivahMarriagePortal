package com.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserPreferences")
public class UserPreference {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "preference_id")
	private Long preferenceId;

	@Column(name = "preferred_age_max")
	private Integer preferredAgeMax;

	@Column(name = "preferred_age_min")
	private Integer preferredAgeMin;

	@Column(name = "preferred_caste")
	private String preferredCaste;

	@Column(name = "preferred_location")
	private String preferredLocation;

	@Column(name = "preferred_sub_caste")
	private String preferredSubCaste;

	@Column(name = "version", nullable = false)
	private Integer version;

	@Column(name = "user_id", unique = true)
	private Long userId;

	public Long getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(Long preferenceId) {
		this.preferenceId = preferenceId;
	}

	public Integer getPreferredAgeMax() {
		return preferredAgeMax;
	}

	public void setPreferredAgeMax(Integer preferredAgeMax) {
		this.preferredAgeMax = preferredAgeMax;
	}

	public Integer getPreferredAgeMin() {
		return preferredAgeMin;
	}

	public void setPreferredAgeMin(Integer preferredAgeMin) {
		this.preferredAgeMin = preferredAgeMin;
	}

	public String getPreferredCaste() {
		return preferredCaste;
	}

	public void setPreferredCaste(String preferredCaste) {
		this.preferredCaste = preferredCaste;
	}

	public String getPreferredLocation() {
		return preferredLocation;
	}

	public void setPreferredLocation(String preferredLocation) {
		this.preferredLocation = preferredLocation;
	}

	public String getPreferredSubCaste() {
		return preferredSubCaste;
	}

	public void setPreferredSubCaste(String preferredSubCaste) {
		this.preferredSubCaste = preferredSubCaste;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserPreference [preferenceId=" + preferenceId + ", preferredAgeMax=" + preferredAgeMax
				+ ", preferredAgeMin=" + preferredAgeMin + ", preferredCaste=" + preferredCaste + ", preferredLocation="
				+ preferredLocation + ", preferredSubCaste=" + preferredSubCaste + ", version=" + version + ", userId="
				+ userId + "]";
	}

}
