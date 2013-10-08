package tn.edu.esprit.erpBi.clientProject.delegate;

import java.util.List;

import tn.edu.esprit.erpBi.clientProject.serviceLocator.ServiceLocator;
import tn.edu.esprit.erpBi.ejbProject.services.domain.CommentEvent;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.CommentEventManagementServicesRemote;

public class DelegateOfCommentEventManagementServicesRemote {

	private static final String jndiName = "ejb:/tn.edu.esprit.erpBi.ejbProjectt/CommentEventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.CommentEventManagementServicesRemote";

	private static CommentEventManagementServicesRemote getProxy() {
		return (CommentEventManagementServicesRemote) ServiceLocator
				.getInstance().getProxy(jndiName);
	}

	public static void DoaddCommentEvent(CommentEvent commentEvent) {
		getProxy().addCommentEvent(commentEvent);
	}

	public static List<CommentEvent> DofindCommentEventById(int idEvent) {

		return getProxy().findCommentEventById(idEvent);
	}

	public static void DoupdateEvent(CommentEvent commentEvent){
		
		getProxy().updateComment(commentEvent);

	}
	public static CommentEvent DofindCommentEventByIdComment(int idcomment){
		return getProxy().findCommentById(idcomment);
		
	}
	
public static void DodeleteComment(int idcomment ){
		
		getProxy().deletCommentById(idcomment);

	}
	
}
