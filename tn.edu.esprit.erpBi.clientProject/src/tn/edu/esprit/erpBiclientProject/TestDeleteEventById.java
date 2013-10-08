package tn.edu.esprit.erpBiclientProject;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

public class TestDeleteEventById {

	public static void main(String[] args) throws NamingException {

		
//			Context context = new InitialContext();
//			EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
//					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");
//
//	proxy.deleteEventById(1);
			
		DelegateOfEventManagementServicesRemote delegateOfEventManagementServicesRemote= new DelegateOfEventManagementServicesRemote();

		
		delegateOfEventManagementServicesRemote.DodeleteEventById(1);
	}
	
}
