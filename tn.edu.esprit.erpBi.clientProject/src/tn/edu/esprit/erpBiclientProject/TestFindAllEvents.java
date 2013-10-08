package tn.edu.esprit.erpBiclientProject;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

public class TestFindAllEvents {
	
	public static void main(String[] args) {
		
		
		try {
			Context context = new InitialContext();
			EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
	
					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");
	
			
			
		List<Event>events = proxy.findAllEvents();
		
		System.out.println("the size of the list is:"+ events.size());
   	
   for (Event event : events) {
    	System.out.println("name of event is "+event.getName_event()+" "+"the description is "+event.getDescription()+""+"the category is "+event.getCategory()+"date start "+event.getStart_date()+"end date "+event.getEnd_date());
		
	}
		
		
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	

}
