package com.atlanta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Comment_Id")
	private Long commentId;
	
	private String text;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Ticket_Id")
	@JsonIgnore //try commenting the @JsonIgnore!
	private Ticket ticket;

	
	public Comment() {
		
	}
	
	public Comment(Long commentId, String text, Ticket ticket) {
		this.commentId = commentId;
		this.text = text;
		this.ticket = ticket;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Comment ID: ").append(this.commentId).append(" \nComment Text: ").append(this.text).append("\n Ticket: ").append(this.ticket);
		return sb.toString();
	}
	
	
	
	

}
