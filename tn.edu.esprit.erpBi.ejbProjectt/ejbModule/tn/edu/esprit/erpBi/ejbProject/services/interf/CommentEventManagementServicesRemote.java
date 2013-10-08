package tn.edu.esprit.erpBi.ejbProject.services.interf;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.ejbProject.services.domain.CommentEvent;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;

@Remote
public interface CommentEventManagementServicesRemote {
	
	public void addCommentEvent(CommentEvent commentEvent);
	
	public List<CommentEvent> findCommentEventById(int idEvent);
	
	public CommentEvent findCommentById(int idcomment);
	
	public void updateComment(CommentEvent commentEvent);
	
	public void deletCommentById(int idcomment);

}
