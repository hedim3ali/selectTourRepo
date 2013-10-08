package tn.edu.esprit.erpBiclientProject.TestCommentEvent;

import java.text.DateFormat;
import java.util.Date;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfCommentEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.CommentEvent;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;

public class TestAddComment {

	public static void main(String[] args) {
		
		
		DelegateOfCommentEventManagementServicesRemote delegateOfCommentEventManagementServicesRemote = new DelegateOfCommentEventManagementServicesRemote();

//		Event event = new Event();
//		event.setName_event("tedx carthage");
//		
		Date dateFormat=new Date(2013-10-10);

		CommentEvent commentEvent=new CommentEvent("bravoooo",dateFormat,4,"meed");
		
		delegateOfCommentEventManagementServicesRemote.DoaddCommentEvent(commentEvent);
		
	}
	
}
