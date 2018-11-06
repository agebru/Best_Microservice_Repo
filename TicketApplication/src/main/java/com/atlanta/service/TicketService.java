package com.atlanta.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atlanta.model.Comment;
import com.atlanta.model.Ticket;
import com.atlanta.repository.CommentRepository;
import com.atlanta.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private CommentRepository commentRepository;

	
	// CRUD OPERATIONS FOR PARENT RECORDS (TICKETS)
	
	
	public Ticket createTicket(Ticket ticket) {
		if (ticket != null) {
			return ticketRepository.save(ticket);
		}
		else throw new IllegalArgumentException("Can't save null Ticket");

	}
	
	
	public List<Ticket> findAll(){
		return ticketRepository.findAll();
	}
	
	public Ticket findTicket(long id) {
		return ticketRepository.findById(id).get();
	}
	
	public Ticket updateTicket(long id,Ticket ticket) {
		Ticket updatedTicket=findTicket(id);
		
		if (!ticket.getDescription().equals(updatedTicket.getDescription())) {
			 updatedTicket.setDescription(ticket.getDescription());
			 return ticketRepository.save(updatedTicket);
		}
		
		else throw new IllegalArgumentException("No Ticket to Update");
	}
	
	
	public void deleteById(long id) {
		ticketRepository.deleteById(id);
		
	}
	
	// CRUD OPERATIONS FOR CHILD RECORDS (COMMENTS)
	
	
	public Ticket createComment(long ticketId,Comment comment) {
		Ticket ticket=findTicket(ticketId);
		comment.setTicket(ticket);
		if(ticket.getComments()!=null) {
			ticket.getComments().add(comment);	
		}
		else {
			ticket.setComments(new ArrayList<Comment>() {{
			add(comment);	
			}});
		}
		
		return ticketRepository.save(ticket);
		
	}
	
	public List<Comment> findAllComments(long ticketId){
		return findTicket(ticketId).getComments();
	}
	
	public Comment findComment(long id) {
		return commentRepository.findById(id).get();
	}
	
	public Comment updateComment(long commentId, Comment comment) {
		Comment savedComment = commentRepository.findById(commentId).get();
		 savedComment.setText(comment.getText());
		 commentRepository.save(savedComment);
		 return savedComment;
		
	}
	
	public void deleteCommentById(long id) {
		commentRepository.deleteById(id);
	}
	
	
	
	
	
	
	
	

}
