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
import jakarta.persistence.Version;

@Entity
@Table(name = "CallLogs")
public class CallLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long call_id;

	@ManyToOne
	@JoinColumn(name = "caller_id")
	private User caller;


	@ManyToOne
	@JoinColumn(name = "receiver_id")
	private User receiver;
	@Column
	private Date call_start;
	@Column 
	private Date call_end;
	@Column
	private Date duration_seconds; 
	@Column
	private double cost; 
	
	@Version
    private Long version;

	public Long getcall_id() {
		return call_id;
	}

	public void setcall_id(Long call_id) {
		this.call_id = call_id;
	}

	public User getCaller() {
		return caller;
	}

	public void setCaller(User caller) {
		this.caller = caller;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public Date getcall_start() {
		return call_start;
	}

	public void setcall_start(Date call_start) {
		this.call_start = call_start;
	}

	public Date getcall_end() {
		return call_end;
	}

	public void setcall_end(Date call_end) {
		this.call_end = call_end;
	}

	public Date getduration_seconds() {
		return duration_seconds;
	}

	public void setduration_seconds(Date duration_seconds) {
		this.duration_seconds = duration_seconds;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "CallLog [call_id=" + call_id + ", caller=" + caller + ", receiver=" + receiver + ", call_start=" + call_start
				+ ", call_end=" + call_end + ",duration_seconds=" + duration_seconds + ", cost=" + cost + "]";
	}

	// Getters and Setters

}
