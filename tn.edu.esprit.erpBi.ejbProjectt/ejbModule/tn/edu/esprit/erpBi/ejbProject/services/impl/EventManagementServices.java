package tn.edu.esprit.erpBi.ejbProject.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesLocal;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

/**
 * Session Bean implementation class EventManagementServices
 */
@Stateless
public class EventManagementServices implements EventManagementServicesRemote, EventManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public EventManagementServices() {

	}

	

	@Override
	public Event findEventById(int idEvent) {
		return entityManager.find(Event.class, idEvent);

	}

	@Override
	public void deleteEventById(int idEvent) {
		entityManager.remove(findEventById(idEvent));

	}

	

	@Override
	public List<Event> findAllEvents() {

		return entityManager.createQuery("select e from Event e").getResultList();
	}
				

	@Override
	public void addEvent(Event event)
			 {
		entityManager.persist(event);

	}

	@Override
	public void updateEvent(Event event) {
		entityManager.merge(event);

	}

}
