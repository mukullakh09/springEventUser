package com.mthree.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Buyer  {
	
	
	@Id
	@GeneratedValue
	private int buyerId;
	
	private String buyerName;
	
	private String email;
	
	private String buyeraddress;
	
	public String getBuyeraddress() {
		return buyeraddress;
	}


	public void setBuyeraddress(String buyeraddress) {
		this.buyeraddress = buyeraddress;
	}
	
	@ManyToOne()
	private Event events;
	


	public Buyer(int buyerId, String buyerName, String email, String buyeraddress, int eventId) {
		super();
		this.buyerId = buyerId;
		this.buyerName = buyerName;
		this.email = email;
		this.buyeraddress = buyeraddress;
		this.events = new Event(eventId,"",0.0d,"");
	}


	public Event getEvents() {
		return events;
	}


	public void setEvents(Event events) {
		this.events = events;
	}


	public Buyer() {}
	

	public String getBuyerName() {
		return buyerName;
	}


	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}



	public int getbuyerId() {
		return buyerId;
	}

	public void setbuyerId(int buyerId) {
		this.buyerId = buyerId;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
}
