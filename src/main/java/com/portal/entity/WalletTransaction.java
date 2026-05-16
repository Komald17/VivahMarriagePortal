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
@Table(name = "WalletTransactions")
public class WalletTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transaction_id;


	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_id;
	@Column
	private String transaction_type; 
	@Column
	private double amount;
	@Column
	private Date transaction_date;
	@Column
	private String description;

	

	public Long gettransaction_id() {
		return transaction_id;
	}

	public void setId(Long transaction_id) {
		this.transaction_id = transaction_id;
	}

	public User getUser() {
		return user_id;
	}

	public void setUser(User user_id) {
		this.user_id = user_id;
	}

	public Date getTransactionDate() {
		return transaction_date;
	}

	public void setTransactionDate(Date transaction_date) {
		this.transaction_date = transaction_date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transaction_type;
	}

	public void setTransactionType(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	
	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "WalletTransaction [transaction_id=" + transaction_id + ", user_id=" + user_id + ", transaction_date=" + transaction_date + ", amount="
				+ amount + ", transaction_type=" + transaction_type + "description=" + description +"]";
	}

	// Getters and Setters

}