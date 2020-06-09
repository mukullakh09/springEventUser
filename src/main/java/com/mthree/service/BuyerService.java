package com.mthree.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mthree.models.Buyer;
import com.mthree.models.Event;
import com.mthree.repository.BuyerRepository;

@Service
public class BuyerService {
	
	@Autowired
    private BuyerRepository buyerrepository;
	
	
	
	
	public List<Buyer> buyerList(Integer eventId){
		List<Buyer> buyers =  new ArrayList<>();
		buyerrepository.findByBuyerId(eventId)
		.forEach(buyers::add);
		return buyers;
		
	}
	
	
	public Optional<Buyer> findOne(Integer id) {
		return buyerrepository.findById(id);
	}
	
	public Buyer addBuyer(Buyer buyer) {
		
		return buyerrepository.save(buyer);
	}
	
	public String deleteBuyer(Integer id) {
		buyerrepository.deleteById(id);
		return "{'message':'address deleted successfully'}";
	}
	
	public void updateBuyer(Buyer buyer) {
		buyerrepository.save(buyer);
	}
}
