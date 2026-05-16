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
@Table(name = "Family")
public class Family {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer family_id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_id;
	@Column
	private String familyBackground;
	@Column
	private String fathersOccupation;
	@Column
	private String mothersOccupation;
	@Column
	private String noOfBrothers;
	@Column
	private String noOfSisters;
	@Column
	private String familyBase;

	

	public Integer getFamily_id() {
		return family_id;
	}

	public void setFamily_id(Integer family_id) {
		this.family_id = family_id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public String getFamilyBackground() {
		return familyBackground;
	}

	public void setFamilyBackground(String familyBackground) {
		this.familyBackground = familyBackground;
	}

	public String getFathersOccupation() {
		return fathersOccupation;
	}

	public void setFathersOccupation(String fathersOccupation) {
		this.fathersOccupation = fathersOccupation;
	}

	public String getMothersOccupation() {
		return mothersOccupation;
	}

	public void setMothersOccupation(String mothersOccupation) {
		this.mothersOccupation = mothersOccupation;
	}

	public String getNoOfBrothers() {
		return noOfBrothers;
	}

	public void setNoOfBrothers(String noOfBrothers) {
		this.noOfBrothers = noOfBrothers;
	}

	public String getNoOfSisters() {
		return noOfSisters;
	}

	public void setNoOfSisters(String noOfSisters) {
		this.noOfSisters = noOfSisters;
	}

	public String getFamilyBase() {
		return familyBase;
	}

	public void setFamilyBase(String familyBase) {
		this.familyBase = familyBase;
	}

	@Override
	public String toString() {
		return "Family [user_id=" + user_id + ", familyBackground=" + familyBackground + ", fathersOccupation="
				+ fathersOccupation + ", mothersOccupation=" + mothersOccupation + ", noOfBrothers=" + noOfBrothers
				+ ", noOfSisters=" + noOfSisters + ", familyBase=" + familyBase + "]";
	}

}
