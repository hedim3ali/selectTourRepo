package tn.edu.esprit.erpBi.ejbProject.services.domain;

import java.io.Serializable;
//import java.sql.Date;

import javax.persistence.*;

import org.jboss.resteasy.spi.touri.MappedBy;

import java.util.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity
public class Event implements Serializable {

	private int idEvent;
	private String name_event;
	private String category;
	private String country;
	private String city;
	private String adress;
	private String description;

	private Date start_date;
	private Date end_date;
	private int booking;
	private int fee;
	
	
	private List<CommentEvent> commentEvents;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getName_event() {
		return name_event;
	}

	public void setName_event(String name_event) {
		this.name_event = name_event;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getBooking() {
		return booking;
	}

	public void setBooking(int booking) {
		this.booking = booking;
	}

	

	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	
	
	
	
	/*public Event(String name_event, String category, String string, String string2, String string3, String string4, java.util.Date date2, java.util.Date date3, int booking2, int fee2) {
		super();
		this.name_event = name_event;
		this.category = category;
		this.country=string;
		this.city = string2;
		this.adress = string3;
		this.description = string4;
		this.start_date =  date2;
		this.end_date =  date3;
		this.booking = booking2;
		this.fee = fee2;
		
	}*/

	@OneToMany(mappedBy="event")
	public List<CommentEvent> getCommentEvents() {
		return commentEvents;
	}

	public void setCommentEvents(List<CommentEvent> commentEvents) {
		this.commentEvents = commentEvents;
	}

	public Event() {
		super();
	}

	public Event(String name_event, String category, String country,
			String city, String adress, String description, Date start_date,
			Date end_date, int booking, int fee) {
		super();
		this.name_event = name_event;
		this.category = category;
		this.country = country;
		this.city = city;
		this.adress = adress;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;
		this.booking = booking;
		this.fee = fee;
	}
	/*public Event(String string, String string2, String string3, String string4, String string5, String string6, java.sql.Date date2, java.sql.Date date3, int booking2, int fee2) {
		super();
		this.name_event=string;
		this.category =string2;
		this.country=string3;
		this.city = string4;
		this.adress = string5;
		this.description = string6;
		this.start_date = date2;
		this.end_date = date3;
		this.booking = booking2;
		this.fee = fee2;
		
		
	}*/

	
}
