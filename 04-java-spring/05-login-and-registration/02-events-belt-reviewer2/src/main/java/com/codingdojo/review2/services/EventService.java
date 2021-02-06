package com.codingdojo.review2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.review2.models.Event;
import com.codingdojo.review2.repositories.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eRepo;

	//find all events
	public List<Event> findAllEvents() {
		List<Event> allEvents = this.eRepo.findAll();
		return allEvents;
	}
	
	//fnid 1 event
	public Event findOneEvent(Long id) {
		Event event = this.eRepo.findById(id).orElse(null);
		return event;
	}
	
	//save event
	public Event saveEvent(Event updatedEvent) {
		return this.eRepo.save(updatedEvent);
	}
	
	//fiond event by state
	public List<Event> findEventsByState(String state) {
		List<Event> inState = this.eRepo.findByStateContaining(state);
		return inState;
	}
	
	//find event by not state
	public List<Event> findEventsByNotInState(String state) {
		List<Event> notInState = this.eRepo.findByStateNot(state);
		return notInState;
	}
}
