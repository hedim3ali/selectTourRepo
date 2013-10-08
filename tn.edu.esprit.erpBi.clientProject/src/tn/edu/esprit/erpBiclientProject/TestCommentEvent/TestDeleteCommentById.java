package tn.edu.esprit.erpBiclientProject.TestCommentEvent;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfCommentEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.CommentEvent;

public class TestDeleteCommentById {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DelegateOfCommentEventManagementServicesRemote delegateOfCommentEventManagementServicesRemote = new DelegateOfCommentEventManagementServicesRemote();

		
		CommentEvent commentEvent = delegateOfCommentEventManagementServicesRemote.DofindCommentEventByIdComment(2);
			
			
			delegateOfCommentEventManagementServicesRemote.DodeleteComment(1);

	}

}
