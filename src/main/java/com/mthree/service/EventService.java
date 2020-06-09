package com.mthree.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mthree.models.Event;
import com.mthree.repository.EventRepository;

@Service
public class EventService {

	
	private EventRepository eventrepository;
	
	
	@Autowired
	public EventService(EventRepository eventrepository) {
		this.eventrepository = eventrepository;
	}
	
	public List<Event> eventList(){
		
		return eventrepository.findAll();
	}
	
	
	public Optional<Event> findOne(Integer id) {
		return eventrepository.findById(id);
	}
	
	public Event addEvent(Event event) {
		
		return eventrepository.save(event);
	}
	
	public String deleteEvent(Integer id) {
		eventrepository.deleteById(id);
		return "{'message':'address deleted successfully'}";
	}
}
