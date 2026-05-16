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
@Table(name = "Horoscope")
public class Horoscope {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long horoscope_id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user_id;

	@Column
	private String birthPlace;

	@Column
	private String dateAndTimeOfBirth;

	@Column
	private String rashi;

	public Long getHoroscope_id() {
		return horoscope_id;
	}

	public void setHoroscope_id(Long horoscope_id) {
		this.horoscope_id = horoscope_id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getDateAndTimeOfBirth() {
		return dateAndTimeOfBirth;
	}

	public void setDateAndTimeOfBirth(String dateAndTimeOfBirth) {
		this.dateAndTimeOfBirth = dateAndTimeOfBirth;
	}

	public String getRashi() {
		return rashi;
	}

	public void setRashi(String rashi) {
		this.rashi = rashi;
	}

	@Override
	public String toString() {
		return "Horoscope [horoscope_id=" + horoscope_id + ", user_id=" + user_id + ", birthPlace=" + birthPlace
				+ ", dateAndTimeOfBirth=" + dateAndTimeOfBirth + ", rashi=" + rashi + "]";
	}

}
