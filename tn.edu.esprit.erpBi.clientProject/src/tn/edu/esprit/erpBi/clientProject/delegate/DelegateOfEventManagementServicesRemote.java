package tn.edu.esprit.erpBi.clientProject.delegate;

import java.util.List;

import org.hibernate.loader.custom.Return;

import tn.edu.esprit.erpBi.clientProject.serviceLocator.ServiceLocator;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

public class DelegateOfEventManagementServicesRemote {

	private static final String jndiName = "ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote";

	private static EventManagementServicesRemote getProxy() {
		return (EventManagementServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
    }

	public static void DoaddEvent(Event event){
		
		getProxy().addEvent(event);
	}
	
	public static Event DofindEventById(int idEvent){
		return getProxy().findEventById(idEvent);
		
	}

	public static void DodeleteEventById(int idEvent){
		
		 getProxy().deleteEventById(idEvent);
	}

	public static void DoupdateEvent(Event event){
		
		getProxy().updateEvent(event);
	}

	public static List<Event> DofindAllEvents(){
		
		return getProxy().findAllEvents();
	}
   
	
}
