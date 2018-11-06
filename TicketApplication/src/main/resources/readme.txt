
Steps running this project:
==============================
Do all post all the below request using postman.


1)  POST - http://localhost:8081/ticket-app/tickets ( Three independent POST requests)
     {
      "description":"First  Ticket"	
     }  
     
      {
      "description":"Second  Ticket"	
     } 
     
     {
      "description":"Third  Ticket"	
     }
     
     
 2) POST- http://localhost:8080/tickets/1/comments ( Three independent POST requests)
	    {
		"text":"First Ticket, first comment"		
	   }
	   
	    {
		"text":"First Ticket, Second comment"		
	   }
	   
	    {
		"text":"First Ticket, Third comment"		
	   }
	   
	   
	   
 3) 	POST - http://localhost:8080/tickets/2/comments (  Three independent POST requests )  
            {
		"text":"Second Ticket, first comment"		
	    }
	   
	    {
		"text":"Second Ticket, Second comment"		
	   }
	   
	    {
		"text":"Second Ticket, Third comment"		
	   }
	   
	   
4)  POST - http://localhost:8080/tickets/3/comments (  Three independent POST requests )  	
          {
          
           "text":"Third Ticket, first comment"		
	     }
	   
	    {
		"text":"Third Ticket, Second comment"		
	   }
	   
	    {
		"text":"Third Ticket, Third comment"		
	   }
	   
	   
5) open the H2 embeded database

  http://localhost:8081/ticket-app/h2
  NB: use JDBC URL==> jdbc:h2:mem:testdb
  then Apply
   => SELECT * from TICKET
  =>  SELECT * FROM COMMENT
  
  GET Requests:
  =============
  
   -- See all tickets ---
  http://localhost:8081/ticket-app/tickets/
  
  -- select Ticket By id ---
  http://localhost:8081/ticket-app/tickets/2
  
  
   -- Select Comments in specific Ticket ----
  http://localhost:8081/ticket-app/tickets/2/comments           
 
      