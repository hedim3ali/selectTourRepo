package tn.edu.esprit.erpBiclientProject;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;

public class TestUpdateEvent {
	
	public static void main(String[] args) {
		
		
		try {
			
//			Context context = new InitialContext();
//			EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
//					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");

			DelegateOfEventManagementServicesRemote delegateOfEventManagementServicesRemote= new DelegateOfEventManagementServicesRemote();

			
			Event eventfounded = delegateOfEventManagementServicesRemote.DofindEventById(2);
			
			eventfounded.setAdress("insat");
			
			delegateOfEventManagementServicesRemote.DoupdateEvent(eventfounded);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
