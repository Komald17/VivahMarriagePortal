package com.portal.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", updatable = false, nullable = false)
	private Long user_id;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	@JsonIgnore
	private String email;
	@JsonIgnore
	@Column
	private String password_hash;
	@Column
	@JsonIgnore
	private String phone_number;
	@Column
	private String gender;
	@Column
	private LocalDate date_of_birth;
	@Column(name = "caste")
	private String caste;
	@Column
	private String sub_caste;
	@Column
	@Lob
	private byte[] profile_picture;
	@Column
	@JsonIgnore
	private double wallet_balance;
	@Column
	private String created_at;
	@Column
	private String career;
	@Column
	private String height;

	public User() {

	}

	public User(Long user_id) {
		this.user_id = user_id;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Long getUser_id() {
		return user_id;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword_hash() {
		return password_hash;
	}

	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getSub_caste() {
		return sub_caste;
	}

	public void setSub_caste(String sub_caste) {
		this.sub_caste = sub_caste;
	}

	public byte[] getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(byte[] profile_picture) {
		this.profile_picture = profile_picture;
	}

	public double getWallet_balance() {
		return wallet_balance;
	}

	public void setWallet_balance(double wallet_balance) {
		this.wallet_balance = wallet_balance;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", password_hash=" + password_hash + ", phone_number=" + phone_number + ", gender=" + gender
				+ ",date_of_birth=" + date_of_birth + ",caste=" + caste + ",sub_caste=" + sub_caste
				+ ",profile_picture=" + profile_picture + ",wallet_balance=" + wallet_balance + ", created_at="
				+ created_at + "]";
	}

}