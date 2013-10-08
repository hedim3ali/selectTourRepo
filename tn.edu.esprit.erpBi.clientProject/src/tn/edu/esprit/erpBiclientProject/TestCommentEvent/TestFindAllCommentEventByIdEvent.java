package tn.edu.esprit.erpBiclientProject.TestCommentEvent;

import java.util.Iterator;
import java.util.List;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfCommentEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.CommentEvent;

public class TestFindAllCommentEventByIdEvent {

	public static void main(String[] args) {

		// Context context = new InitialContext();
		// EventManagementServicesRemote proxy = (EventManagementServicesRemote)
		// context
		//
		// .lookup("ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");
		//
		DelegateOfCommentEventManagementServicesRemote delegateOfCommentEventManagementServicesRemote = new DelegateOfCommentEventManagementServicesRemote();

		List<CommentEvent> commentEvents;

		commentEvents = delegateOfCommentEventManagementServicesRemote
				.DofindCommentEventById(2);

		

//		for (Iterator iter = commentEvents.iterator(); iter.hasNext();) {
//			String ch2 = (String) iter.next();
//			System.out.println(ch2);
//		}
		for (CommentEvent commentEvent : commentEvents) {
			System.out.println("for this event "+commentEvent.getContent()+" by mr "+commentEvent.getName()+" date is"+commentEvent.getDateCom());
		}
		
	}

}
