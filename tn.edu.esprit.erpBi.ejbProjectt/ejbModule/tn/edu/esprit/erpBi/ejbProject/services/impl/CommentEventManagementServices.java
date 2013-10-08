package tn.edu.esprit.erpBi.ejbProject.services.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.erpBi.ejbProject.services.domain.CommentEvent;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.CommentEventManagementServicesLocal;
import tn.edu.esprit.erpBi.ejbProject.services.interf.CommentEventManagementServicesRemote;

/**
 * Session Bean implementation class CommentEventManagementServices
 */
@Stateless
@LocalBean
public class CommentEventManagementServices implements CommentEventManagementServicesRemote, CommentEventManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public CommentEventManagementServices() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void addCommentEvent(CommentEvent commentEvent) {
		entityManager.persist(commentEvent);
	}


	@Override
	public List<CommentEvent> findCommentEventById(int idEvent) {
		
		String jpql="select e from CommentEvent e where e.event.idEvent =:param";
		
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", idEvent);
		return query.getResultList();
	}
	
	@Override
	public CommentEvent findCommentById(int idcomment) {
		return entityManager.find(CommentEvent.class, idcomment);

	}
	
	@Override
	public void updateComment(CommentEvent commentEvent) {
		entityManager.merge(commentEvent);

	}

	@Override
	public void deletCommentById(int idcomment) {
		entityManager.remove(findCommentById(idcomment));
	
	}
	
	
	
	

}
