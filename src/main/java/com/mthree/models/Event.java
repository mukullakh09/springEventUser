package com.mthree.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {
	
	
	@Id
	@GeneratedValue
	private int eventId;
	
	public Event(int eventId, String eventDesc, double amount, String eventName) {
		super();
		this.eventId = eventId;
		this.eventDesc = eventDesc;
		this.amount = amount;
		this.eventName = eventName;
	}

	

	

	public Event() {
		
	}


	private String eventDesc;
	
	private double amount;
	
	private String eventName;
	
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	}
	

