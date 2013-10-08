package tn.edu.esprit.erpBiclientProject;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

public class TestFindEventById {
	
	public static void main(String[] args) {
		
		
	
//			Context context = new InitialContext();
//			EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
//	
//					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");
//	
			DelegateOfEventManagementServicesRemote delegateOfEventManagementServicesRemote= new DelegateOfEventManagementServicesRemote();

			
			
			Event eventFounded=delegateOfEventManagementServicesRemote.DofindEventById(2);
		
		System.out.println("voici la  description de cette evenement : "+eventFounded.getDescription());
		
	
	}
	
	

}
