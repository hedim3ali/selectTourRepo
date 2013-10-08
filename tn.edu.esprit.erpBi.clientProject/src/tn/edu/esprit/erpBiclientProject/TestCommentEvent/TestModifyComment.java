package tn.edu.esprit.erpBiclientProject.TestCommentEvent;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfCommentEventManagementServicesRemote;
import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.CommentEvent;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;

public class TestModifyComment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DelegateOfCommentEventManagementServicesRemote delegateOfCommentEventManagementServicesRemote = new DelegateOfCommentEventManagementServicesRemote();

		
	CommentEvent commentEvent = delegateOfCommentEventManagementServicesRemote.DofindCommentEventByIdComment(2);
		
		commentEvent.setContent("je n'aime plus ");
		delegateOfCommentEventManagementServicesRemote.DoupdateEvent(commentEvent);
	}

}
