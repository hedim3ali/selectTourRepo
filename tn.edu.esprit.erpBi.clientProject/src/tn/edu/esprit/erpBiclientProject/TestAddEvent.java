package tn.edu.esprit.erpBiclientProject;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

public class TestAddEvent {
	public static void main(String[] args) {

		
			DelegateOfEventManagementServicesRemote delegateOfEventManagementServicesRemote= new DelegateOfEventManagementServicesRemote();


			Event event = new Event();
			event.setName_event("tedx carthage");

			 delegateOfEventManagementServicesRemote.DoaddEvent(event);

		

	}
}