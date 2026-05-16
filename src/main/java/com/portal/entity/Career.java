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
@Table(name = "Career")
public class Career {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long career_id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_id;

	@Column
	private String aboutJob;

	@Column
	private String employedIn;

	@Column
	private String occupation;

	@Column
	private String earnings;

	@Column
	private String jobLocatin;

	public String getJobLocatin() {
		return jobLocatin;
	}

	public void setJobLocatin(String jobLocatin) {
		this.jobLocatin = jobLocatin;
	}

	public String getEarnings() {
		return earnings;
	}

	public void setEarnings(String earnings) {
		this.earnings = earnings;
	}

	public Long getCareer_id() {
		return career_id;
	}

	public void setCareer_id(Long career_id) {
		this.career_id = career_id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public String getAboutJob() {
		return aboutJob;
	}

	public void setAboutJob(String aboutJob) {
		this.aboutJob = aboutJob;
	}

	public String getEmployedIn() {
		return employedIn;
	}

	public void setEmployedIn(String employedIn) {
		this.employedIn = employedIn;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "Career [user_id=" + user_id + ", aboutJob=" + aboutJob + ", employedIn=" + employedIn + ", occupation="
				+ occupation + "]";
	}

}
