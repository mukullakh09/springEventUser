package com.mthree.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mthree.models.Event;
import com.mthree.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {

	private EventService eventservice;
	
	@Autowired
	public EventController(EventService evenyservice) {
		
		this.eventservice = evenyservice;
	}
	
	@GetMapping("/list")
	public List<Event> EventList(){
		
		return eventservice.eventList();
	}
	
	@PostMapping("/add")
	public Event addEvent(@RequestBody Event event) {
		return eventservice.addEvent(event);
		
	}
	
	@GetMapping("/find/{id}")
	public Optional<Event> findOne(@PathVariable Integer id) {
		return eventservice.findOne(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEvent(@PathVariable Integer id) {
		return eventservice.deleteEvent(id);
		
	}
	
}
