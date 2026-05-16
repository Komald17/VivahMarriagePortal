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
@Table(name = "Lifestyle")
public class Lifestyle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "life_style_id", updatable = false, nullable = false)
	private Long life_style_id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user_id;

	@Column
	private String eatingHabit;

	@Column
	private String isDrink;

	@Column
	private String isSmoke;

	public Long getLife_style_id() {
		return life_style_id;
	}

	public void setLife_style_id(Long life_style_id) {
		this.life_style_id = life_style_id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public String getEatingHabit() {
		return eatingHabit;
	}

	public void setEatingHabit(String eatingHabit) {
		this.eatingHabit = eatingHabit;
	}

	public String getIsDrink() {
		return isDrink;
	}

	public void setIsDrink(String isDrink) {
		this.isDrink = isDrink;
	}

	public String getIsSmoke() {
		return isSmoke;
	}

	public void setIsSmoke(String isSmoke) {
		this.isSmoke = isSmoke;
	}

	@Override
	public String toString() {
		return "Lifestyle [user_id=" + user_id + ", eatingHabit=" + eatingHabit + ", isDrink=" + isDrink + ", isSmoke="
				+ isSmoke + "]";
	}

}
