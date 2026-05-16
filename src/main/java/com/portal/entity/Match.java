package com.portal.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "matches")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long match_id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_id;


	@ManyToOne
	@JoinColumn(name = "matched_user_id")
	private User matched_user_id;

	@Column
	private String match_status; 
	
	 
	@Column
	private Date matched_at;

	
	/*
	 * @Version private Long version;
	 */	
	
	public Long getmatch_id() {
		return match_id;
	}

	public void setmatch_id(Long match_id) {
		this.match_id = match_id;
	}

	public User getuser_id() {
		return user_id;
	}

	public void setuser_id(User user_id) {
		this.user_id = user_id;
	}

	public User getmatched_user_id() {
		return matched_user_id;
	}

	public void setmatched_user_id(User matched_user_id) {
		this.matched_user_id = matched_user_id;
	}

	public String getmatch_status() {
		return match_status;
	}

	public void setmatch_status(String match_status) {
		this.match_status = match_status;
	}

	public Date getmatched_at() {
		return matched_at;
	}

	public void setmatched_at(Date matched_at) {
		this.matched_at = matched_at;
	}

	@Override
	public String toString() {
		return "Match [match_id=" + match_id + ", user_id=" + user_id + ", matched_user_id=" + matched_user_id + ", match_status=" + match_status + ", matched_at="
				+ matched_at + "]";
	}

	// Getters and Setters

}