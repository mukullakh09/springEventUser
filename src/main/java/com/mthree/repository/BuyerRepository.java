package com.mthree.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mthree.models.Buyer;
import com.mthree.models.Event;

public interface BuyerRepository extends JpaRepository<Buyer,Integer>{

	public List<Buyer> findByBuyerId(int buyerId);
	}
