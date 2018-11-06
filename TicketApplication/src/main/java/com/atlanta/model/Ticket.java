package com.atlanta.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Ticket_Id")
	private Long ticketId;
	
	private String description;
	
	@OneToMany(mappedBy="ticket",cascade=CascadeType.ALL)
	private List<Comment> comments=new ArrayList<>();

	public Ticket() {
		
	}
	
	public Ticket(Long ticketId, String description, List<Comment> comments) {
		this.ticketId = ticketId;
		this.description = description;
		this.comments = comments;
	}




	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Ticket Description: ").append(this.description).append("\n Comments:").append(comments.toArray());		
		return sb.toString();
	}
	
	
	
	

}
