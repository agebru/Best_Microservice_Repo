insert into Ticket(Ticket_Id,description) values(11,'First  Ticket');
insert into Ticket(Ticket_Id,description) values(12,'Second  Ticket');
insert into Ticket(Ticket_Id,description) values(13,'Third  Ticket');


INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 11, 1ST comment',11);
INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 11, 2ND comment',11);
INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 11, 3RD comment',11);


INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 12, 1ST comment',12);
INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 12, 2ND comment',12);
INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 12, 3RD comment',12);


INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 13, 1ST comment',13);
INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 13, 2ND comment',13);
INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 13, 3RD comment',13);
INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 13, 4TH comment',13);
INSERT INTO COMMENT(TEXT,Ticket_Id) VALUES('Ticket 13, 5TH comment',13);
COMMIT;