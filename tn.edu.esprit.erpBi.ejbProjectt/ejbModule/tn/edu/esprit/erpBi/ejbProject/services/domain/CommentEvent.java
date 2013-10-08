package tn.edu.esprit.erpBi.ejbProject.services.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CommentEvent
 *
 */
@Entity

public class CommentEvent implements Serializable {

	
	private int idCommentEvent;
	private String content;
	private Date dateCom;
	private int nbrLike;
	private String name;
	private static final long serialVersionUID = 1L;
	
	private Event event;

	public CommentEvent() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdCommentEvent() {
		return this.idCommentEvent;
	}

	public void setIdCommentEvent(int idCommentEvent) {
		this.idCommentEvent = idCommentEvent;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}   
	public Date getDateCom() {
		return this.dateCom;
	}

	public void setDateCom(Date dateCom) {
		this.dateCom = dateCom;
	}   
	public int getNbrLike() {
		return this.nbrLike;
	}

	public void setNbrLike(int nbrLike) {
		this.nbrLike = nbrLike;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public CommentEvent(String content, Date dateCom, int nbrLike, String name) {
		super();
		this.content = content;
		this.dateCom = dateCom;
		this.nbrLike = nbrLike;
		this.name = name;
	}
	
	@ManyToOne
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public CommentEvent(String content, Date dateCom, int nbrLike, String name,
			Event event) {
		super();
		this.content = content;
		this.dateCom = dateCom;
		this.nbrLike = nbrLike;
		this.name = name;
		this.event = event;
	}
   
	
	
}
