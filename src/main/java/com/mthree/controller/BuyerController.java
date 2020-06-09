package com.mthree.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mthree.models.Buyer;
import com.mthree.models.Event;
import com.mthree.service.BuyerService;

@RestController

public class BuyerController {
	
	private BuyerService buyerservice;
	
	@Autowired
	public BuyerController(BuyerService buyerservice) {
		
		this.buyerservice = buyerservice;
	}
	
	@GetMapping("/event/{id}/buyer")
	public List<Buyer> buyerList(@PathVariable Integer id){
		
		return buyerservice.buyerList(id);
	}
	
	@PostMapping("/event/{evenId}/buyer")
	public Buyer addBuyer(@RequestBody Buyer buyer,@PathVariable Integer eventId) {
		buyer.setEvents(new Event(eventId,"",0.0d,"") );
		return buyerservice.addBuyer(buyer);
		
	}
	
	@GetMapping("/event/{evenId}/buyer/{id}")
	public Optional<Buyer> findOne(@PathVariable Integer id) {
		return buyerservice.findOne(id);
	}
	
	@DeleteMapping("/event/{evenId}/buyer/{id}")
	public String deletebuyer(@PathVariable Integer id) {
		return buyerservice.deleteBuyer(id);
		
	}
	
	@PutMapping("/event/{evenId}/buyer/{id}") 
	public void updateBuyer(@RequestBody Buyer buyer,@PathVariable Integer eventId,@PathVariable Integer Id) {
		buyer.setEvents(new Event(eventId,"",0.0d,""));
		buyerservice.updateBuyer(buyer);;
		
	}
		
	
}
