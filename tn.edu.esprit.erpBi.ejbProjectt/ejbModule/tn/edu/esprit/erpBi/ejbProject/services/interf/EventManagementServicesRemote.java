package tn.edu.esprit.erpBi.ejbProject.services.interf;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;

@Remote
public interface EventManagementServicesRemote {

	
	
	public void addEvent(Event event);

	public Event findEventById(int idEvent);

	public void deleteEventById(int idEvent);

	public void updateEvent(Event event);

	public List<Event> findAllEvents();
	
	
}
